# msa-spring-boot

Market Service MSA 프로젝트의 마이크로서비스 5개 (Kotlin + Spring Boot 멀티모듈).

> 📋 **기술 스택 + 버전**: [`msa-provisioning/STACK.md`](https://github.com/melanieing/msa-provisioning/blob/main/STACK.md)
> 📌 **백로그 / 진행 상황**: [`msa-provisioning/BACKLOG.md`](https://github.com/melanieing/msa-provisioning/blob/main/BACKLOG.md)
>
> 관련 레포:
> - 인프라/플랫폼 부트스트랩: [msa-provisioning](https://github.com/melanieing/msa-provisioning)
> - GitOps 매니페스트: [msa-argocd-manifest](https://github.com/melanieing/msa-argocd-manifest)

---

### Ready to Run

- gRPC ProtoBuff IDL 생성
```terminaloutput
➜  msa-spring-boot git:(main) ./gradlew generateProto
```

- QueryDSL kapt QClass 생성
```terminaloutput
➜  msa-spring-boot git:(main) ✗ ./gradlew kaptKotlin
```

- Local Middleware Dependency
```terminaloutput
➜  msa-spring-boot git:(main) ✗ docker-compose up -d -f container-compose.yaml
```

- order-service 시작
```terminaloutput
➜  msa-spring-boot git:(main) ✗ ./gradlew :order-service:bootRun
```

- product-service 시작
```terminaloutput
➜  msa-spring-boot git:(main) ✗ ./gradlew :product-service:bootRun
```

- inventory-service 시작
```terminaloutput
➜  msa-spring-boot git:(main) ✗ ./gradlew :inventory-service:bootRun
```