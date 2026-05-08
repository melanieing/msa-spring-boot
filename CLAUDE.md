# Market Service MSA — 작업 원칙

이 문서는 Market Service MSA 프로젝트(이 레포 + `msa-provisioning` 레포)에서 작업할 때
반드시 지켜야 할 원칙을 기록한다. 새로운 제약이나 결정사항이 생기면 이 파일에
**추가/수정**한다.

---

## 0. 프로젝트의 본질

- **목적**: DevOps 엔지니어 취업 포트폴리오. 인프라/GitOps/관측성 완성도가 평가 핵심.
  애플리케이션 코드 완성도는 부차적.
- **세 레포지토리가 함께 쓰인다**:
  - `msa-spring-boot` — Kotlin/Spring Boot 멀티모듈, 마이크로서비스 5개 예정 (현재 4/5 골격).
    Phase B에서 `charts/services/{서비스명}/` Helm 차트가 추가될 예정.
  - `msa-provisioning` — Terraform + Ansible로 AWS EC2 위에 self-managed K8s 구축
    (kubeadm + Calico). 현재 ~80% 완성, 실제로 동작 검증된 상태 (README의 `kubectl get nodes` 출력).
  - `msa-argocd-manifest` — Argo CD 매니페스트 SSOT. `bootstrap/` 진입점에 root
    Application이 가리키며, App-of-Apps(platform/) + ApplicationSet(apps) 두 패턴 혼용.
    원래 PDF가 한 레포만 가정했지만, 코드 레포와 매니페스트 레포를 분리하는 게
    GitOps 관용이고 ApplicationSet의 Git Generator도 자연스럽게 동작한다.

## 1. 하드 제약 (협상 불가)

- **마감일**: 2026-05-20 — 오늘부터 약 13일.
- **AWS 비용 상한**: 66,000 KRW. 운영 비용은 계산하지 않고 **구축 비용만** 계산.
  자세한 계산은 §6 참조.
- **기술스택은 PDF에 고정**:
  Java 21 / Spring Boot 3.5.x / Spring Cloud Gateway / PostgreSQL 16 /
  Redis Cluster + Redisson / Kafka KRaft / Resilience4j / Spring Cloud Gateway /
  kubeadm self-managed K8s on EC2 / Calico CNI / Argo CD GitOps / Terraform / Ansible /
  Helm 또는 Kustomize / OpenTelemetry + LGTM(Loki/Grafana/Tempo/Mimir) / Istio (심화) /
  GitHub Actions CI / k6 / JUnit5 + Testcontainers + Postman/Newman.
  → **이 목록의 도구를 다른 것으로 교체하지 않는다.** EKS로 바꾸지 않는다, MySQL로 바꾸지
  않는다, Helm 대신 raw kubectl로 끝내지 않는다, 관측성 스택을 CloudWatch로 바꾸지 않는다.
- **PDF의 구현 방법(아키텍처 패턴)도 지킨다**:
  Database per Service / Transactional Outbox / Event Sourcing(inventory) /
  Orchestration Saga / Redis Lua atomic ops + Redisson 분산락 / Argo CD App-of-Apps +
  ApplicationSet / Terraform → Ansible → kubectl apply argocd → root sync 4단계 부트스트랩.

## 2. 유연성 (필요하면 변경 가능, 단 명시할 것)

- 기능 범위, Epic 순서, 백로그 구성은 변경 가능. 단 **PDF와 다른 결정은 항상 명시적으로 기록**.
- 현재 코드의 마이크로서비스 내부 통신은 gRPC인데, PDF는 "동기 REST + 동기 gRPC(선택)"이라
  허용 범위. **현재 gRPC 구현을 유지**하기로 결정 (재작성 비용 회피).
- 프론트엔드는 React 풀앱이 아니라 **S3+CloudFront에 정적 placeholder 페이지** 수준만.
  PDF는 React를 명시하지만, DevOps 포트폴리오 관점에서 React 구현은 우선순위가 낮고
  사용자 측에서도 프론트가 없다는 점을 인지함.
- notification-service는 **최소 구현** (Kafka consumer + 로그/SES 발송). PDF의 알림 모든
  채널을 다 만들지 않는다.
- Service Mesh(Istio)와 LGTM 풀스택은 **시간 남으면**. Must는 OTel + Grafana + Loki + Prometheus
  까지로 잡고, Tempo/Mimir/Istio는 Should/Could로 강등.

## 3. 작업 우선순위 (descope 순서)

시간이 부족하면 다음 순서로 자른다 (먼저 자르는 것이 위, 절대 자르지 않는 것이 아래):

1. ✂︎ React 풀 프론트엔드
2. ✂︎ notification-service의 다채널 알림 (이메일만 남기고 SMS/푸시 컷)
3. ✂︎ Saga의 보상 트랜잭션 깊이 (성공 경로 + 단순 실패 처리만)
4. ✂︎ 애플리케이션 단위 테스트 커버리지 (스모크 + Newman 통합 테스트만)
5. ✂︎ Istio Service Mesh, Tempo, Mimir
6. ─── 여기 위로는 자를 수 있음, 아래는 자르지 않는다 ───
7. 🛡 IaC 품질 (Terraform 변수화, KMS 암호화, S3 백엔드)
8. 🛡 Argo CD GitOps 흐름 (App-of-Apps + ApplicationSet)
9. 🛡 GitHub Actions CI 파이프라인
10. 🛡 OTel + Grafana + Loki + Prometheus 기본 관측성
11. 🛡 Helm 차트 (5개 서비스 + 플랫폼 컴포넌트)
12. 🛡 Resilience4j Circuit Breaker (게이트웨이 ↔ 서비스)
13. 🛡 JWT 필터 + Rate Limit (게이트웨이)

## 4. 작업 방식

### 4-A. BACKLOG.md 갱신 루틴 (필수)

**모든 작업이 BACKLOG.md 와 함께 움직인다.** 누락하면 진행 상황 파악 불가능 → 다음 세션에서 혼란.

- **작업 시작 전**: `msa-provisioning/BACKLOG.md` 의 "다음 우선순위" 에서 항목 선택 →
  해당 항목의 상태를 `⏳` → **`🟡 진행 중`** 으로 변경.
- **작업 완료 직후**:
  1. 해당 항목 상태를 `🟡` → **`✅ 완료`** 로 변경
  2. **"완료 (역순)"** 섹션 맨 위에 한 줄 추가 (오늘 일자로)
  3. **"변경 이력"** 표에 한 줄 추가
  4. "스냅샷" 의 **진행률 % 갱신**
  5. 새 위험/차단요소 발견 시 "위험" 섹션 갱신
- **새 발견 사항**: Phase C/D 표에 새 행 추가 또는 Won't 로 분류.
- **AWS 부트스트랩 시점 이후**: "비용 진행" 표에 일자별 누적 추가.

CLAUDE.md (원칙) ↔ STACK.md (버전) ↔ BACKLOG.md (진행 상황) — **세 파일이 SSOT 트리오**.

### 4-B. 일반 작업 규칙

- **PR/커밋 단위로 작업**한다. 한 번에 여러 개의 큰 변경을 섞지 않는다.
- **Argo CD에 직접 kubectl apply하지 않는다**. PDF 5.5절 원칙: 클러스터에 직접 손대는
  명령은 `kubectl apply -f argocd-install.yaml` **딱 한 번**. 그 이후 모든 변경은
  매니페스트 리포의 Git push → Argo CD sync로만 발생.
- **Argo CD의 매니페스트 리포는 별도 레포로 분리**. 현재 `msa-provisioning/ansible/argocd-setup.yaml`이
  외부인의 레포 `kanei0415/ktcloud-k8s-argocd-manifest.git`을 참조하고 있는데, 이를
  본인 소유의 레포로 교체해야 함.
- **PDF와 다른 결정을 내릴 때마다 그 사실을 명시**: PR 설명, CLAUDE.md, 또는 발표 자료에
  적어 둔다 ("PDF는 X, 본 구현은 Y, 이유는 Z").
- **SSH key path 영구 원칙** (2026-05-09 + 2026-05-10 두 번 트랩 후 영구 fix):
  - 키 파일은 항상 `~/.ssh/ktcloud-bastion-node-key{,.pub}` (Windows 와 WSL 양쪽에 둠).
  - terraform 변수에 **Windows 절대경로 (`C:/Users/...`) 절대 override 금지** —
    terraform.exe (Windows side) 는 통과하지만 WSL ansible 이 키 못 찾아 silently fail.
  - `ssh_private_key_path` 변수는 의도적으로 **제거됨**. `inventory.tftpl` 이
    `ssh_key_name` 에서 `~/.ssh/${ssh_key_name}` 자동 derive.
  - `ssh_public_key_path` 는 살아있지만 `file(pathexpand(...))` 로 wrap 되어
    `~/...` default 가 Windows + Linux 양쪽에서 작동.
  - `cluster-bootstrap.ps1` 의 Step 0 pre-flight check 가 회귀 차단.
  - 자세한 background 는 `msa-provisioning/terraform/variables.tf` 의
    ssh_public_key_path 위 주석 참조.

## 5. 비용 디시플린

- 클러스터 전체 시간당 비용 ≈ **$0.38/hr (~510 KRW/hr)** — t3.medium ×6 + t3.nano ×2 +
  NAT ×2 + NLB + EFS + EBS 4×20GB.
- 13일 × 24h 풀가동 = 312h × 510 = **159,000 KRW (예산 초과 2.4배)**.
- **실제 가동 가능 시간**: 66,000 / 510 ≈ **129 시간** (≈ 5.4일 풀가동, 또는 13일 ×
  10h/일).
- 따라서 **반드시 클러스터 라이프사이클 스크립트**를 만들어 작업 안 할 때 인프라 중단/삭제:
  - **2026-05-07 작성 완료**: `msa-provisioning/scripts/cluster-*.ps1` 5종
    - `cluster-bootstrap.ps1` : 0 → 운영 클러스터 (terraform apply + ansible-playbook, ~15분)
    - `cluster-teardown.ps1`  : 운영 클러스터 → 0 (terraform destroy, ~5분)
    - `cluster-stop.ps1` / `cluster-start.ps1` : EC2 만 일시 정지 (~1~2분, 짧은 휴식용)
    - `cluster-status.ps1` : 현재 상태 표 출력
  - **운영 정책**: 짧은 휴식(<2h)은 stop/start, 저녁/주말/하루 이상은 **destroy/bootstrap**.
    destroy 가 stop 보다 시간당 ~180원 더 절약 (NAT/NLB/EBS 까지 0).
  - NAT Gateway는 stop 불가능, destroy 시에만 0 됨. 그래서 destroy 가 압도적 절약.
  - **13일 4h/일 destroy 운영 시 ~31,200원 (예산의 절반)** → stop/start 단독은 예산 살짝 초과.
  - bootstrap 은 WSL 안의 ansible-playbook 을 자동 호출. 사용자가 처음이면 WSL Ubuntu 에
    `sudo apt install ansible` 한 번만 하면 됨. 자세한 가이드는 `scripts/README.md`.
  - inventory.tftpl 의 ProxyCommand 에 `StrictHostKeyChecking=no` 추가됨 (자동화 위해
    bastion fingerprint 묻기 끔, 2026-05-07).
- 새로운 AWS 리소스를 추가할 때는 **시간당 비용을 추정**하고 백로그 항목에 적는다.
- Terraform `terraform apply`/`terraform destroy`를 자유롭게 반복하는 **재구축 가능한
  상태**를 유지한다 (DR 시연 + 비용 절감 둘 다 만족).

## 6. 보안/암호화

- 모든 EBS / EFS / S3는 **AWS KMS Customer Managed Key로 SSE 암호화** (PDF 5.3절). 현재 미적용.
- VPC Endpoint(S3, KMS)로 사설 경로 통신 (PDF 5.1절). 현재 미적용.
- 시크릿은 **Git에 절대 평문 커밋 금지**. JWT secret이 현재 `application.yaml`에 하드코딩
  되어 있는데 K8s Secret + Sealed Secret 또는 AWS Secrets Manager로 옮긴다.

## 7. 명시해야 할 PDF 대비 변경 사항 (현재까지)

- Spring Boot 3.3.0 → **3.5.x로 업그레이드 필요** (PDF 4.1절 명시 버전).
- 마이크로서비스 내부 통신: PDF는 "REST 기본 + gRPC 선택", 본 프로젝트는 **gRPC 채택**
  (이미 구현됨). PDF 허용 범위 내.
- 프론트엔드: PDF는 React+Vite+TS, 본 프로젝트는 **정적 placeholder 페이지**로 축소.
- notification-service: PDF는 4개 토픽 구독 + 다채널 발송, 본 프로젝트는 **단일 채널
  스텁** (이메일 또는 로그)로 축소.
- 관측성: PDF는 OTel + Mimir + Tempo + Loki + Grafana 풀스택, 본 프로젝트는 **OTel +
  Prometheus + Loki + Grafana**까지 Must, Tempo/Mimir/Istio는 Should.
- Argo CD 매니페스트 리포: **본인 소유 `melanieing/msa-argocd-manifest`로 교체 완료**
  (2026-05-07). 이전엔 외부 사용자 `kanei0415/ktcloud-k8s-argocd-manifest`를 참조 중이었음.
- 매니페스트 리포 root path: `Setup` → **`bootstrap`** 으로 변경 (Argo CD 관용 명칭).
- 매니페스트 리포 구조: `bootstrap/` (진입점) + `projects/` (AppProject) +
  `platform/` (operators / data / observability) + `applications/` (비어있음 — Helm 차트는
  msa-spring-boot 레포의 `charts/services/*`에 거주, ApplicationSet의 Git Generator가 자동
  발견).
- Phase B-1 완료 (2026-05-08): 매니페스트 리포의 platform/ 빈 공간 채움 + 전체 tech
  stack 을 2026-05 기준 최신 안정 버전으로 정합성 맞춤.
  - 6개 platform Application 차트 버전: CNPG 0.28.0, **Strimzi 1.0.0** (메이저 — Kafka
    4.x 만 지원), Redis Operator 0.24.0, kube-prometheus-stack 84.5.0, Loki 7.0.0,
    OTel 0.153.0. (모두 GitHub releases API 로 직접 확인.)
  - `platform/data/_postgres/` : namespace `data` + CNPG Cluster ×5 (각 PG16, 2 instances, 5Gi)
  - `platform/data/_kafka/` : Strimzi KRaft (controller 3 + broker 3) + KafkaTopic ×5
    (PDF 부록 A). Kafka 버전 **4.2.0** (Strimzi 1.0.0 강제).
  - `platform/data/_redis/` : RedisCluster (3 master + 3 replica), Redis 이미지 7.4.8,
    redis-exporter 1.83.0. 평문 Secret (학습용).
- 인프라 런타임 버전 정합성도 같이 맞춤 (2026-05-08):
  - Kubernetes: 1.30 → **1.35** (latest-1, 안정 선택). k8s-pkg-install + kubeadm-config 동시.
  - Calico: 3.27.0 → **3.32.0** (2026-04-30).
  - Helm CLI: 3.14.0 → **3.20.2** (Helm 3.x 마지막 안정. Helm 4.x 도 release 됐지만 차트
    호환성 미검증이라 보수적으로 3.x 유지).
- Terraform 변수화 완료 (2026-05-07): `provider.tf` 신규(region, AWS provider ~> 5.60),
  `variables.tf` 13개 변수, `terraform.tfvars.example` 추가. 모든 default 값이 원래 하드
  코딩 값과 동일하게 렌더되어 plan 시 zero drift. `default_tags`는 기본 `{}`로 두어 옵트인.
- Terraform module 화 완료 (2026-05-08): flat 한 .tf 파일들을 5개 모듈로 재구성.
  `modules/{network,security,compute,loadbalancer,storage}` + 루트 `main.tf` 가 모듈
  인스턴스화/연결만 담당. for_each 까지는 안 갔고 EC2 6개 블록은 모듈 안에 그대로.
  state 비어있는 상태에서 작업해서 드리프트 0. terraform validate 통과.
  알려진 한계: 리소스 이름표에 `ap-northeast-2a/2b`가 여전히 하드코딩 — 진정한 region
  portability 또는 노드 수 변경에는 후속 for_each 리팩터가 필요.

## 8. 자주 잊는 것

- **CLAUDE.md를 매 작업마다 갱신**한다 (사용자 명시 요구).
- 백로그 진행 상황은 **`msa-provisioning/BACKLOG.md`** 가 SSOT. 작업 시작/완료 시
  거기 표 + 변경 이력 갱신. CLAUDE.md 에는 원칙만, 진행 상황은 BACKLOG.md.
- `msa-spring-boot`와 `msa-provisioning`은 **별도 git 레포**. 두 레포에 걸친 변경은
  PR 두 개로 나뉜다.
- 비용 추정 단위는 **시간당 KRW**. 일/월 단위로 환산하면 직관이 무뎌진다.
- **기술 스택 + 버전의 단일 진실 원천(SSOT) 은 `msa-provisioning/STACK.md`**.
  버전 변경 시 거기 표 + 변경 이력 갱신. 다른 곳(CLAUDE.md, READMEs)은 STACK.md 참조.
