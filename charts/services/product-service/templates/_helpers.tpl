{{/* ───────────────────────────────────────────────────────────── */}}
{{/* _helpers.tpl — 다른 template 에서 재사용할 함수들                  */}}
{{/* ───────────────────────────────────────────────────────────── */}}
{{/* 'helm template' 시 처리되는 텍스트 함수들. 다른 yaml 에서        */}}
{{/* '{{ include "service.fullname" . }}' 같이 호출.                  */}}
{{/* ───────────────────────────────────────────────────────────── */}}


{{/* 차트 기본 이름 — values 에서 override 가능 */}}
{{- define "service.name" -}}
{{- default .Chart.Name .Values.nameOverride | trunc 63 | trimSuffix "-" }}
{{- end }}


{{/* 정식 이름 — release 이름 + 차트 이름. K8s 리소스 이름에 사용 */}}
{{- define "service.fullname" -}}
{{- if .Values.fullnameOverride }}
{{- .Values.fullnameOverride | trunc 63 | trimSuffix "-" }}
{{- else }}
{{- $name := default .Chart.Name .Values.nameOverride }}
{{- if contains $name .Release.Name }}
{{- .Release.Name | trunc 63 | trimSuffix "-" }}
{{- else }}
{{- printf "%s-%s" .Release.Name $name | trunc 63 | trimSuffix "-" }}
{{- end }}
{{- end }}
{{- end }}


{{/* 차트 라벨 — 모든 K8s 리소스에 일관성 있게 부착 */}}
{{- define "service.labels" -}}
helm.sh/chart: {{ printf "%s-%s" .Chart.Name .Chart.Version | replace "+" "_" | trunc 63 | trimSuffix "-" }}
{{ include "service.selectorLabels" . }}
{{- if .Chart.AppVersion }}
app.kubernetes.io/version: {{ .Chart.AppVersion | quote }}
{{- end }}
app.kubernetes.io/managed-by: {{ .Release.Service }}
{{- end }}


{{/* selector 라벨 — Deployment 가 Pod 를 매칭할 때 사용 */}}
{{/* selectorLabels 는 immutable (Deployment 만든 후 못 바꿈) 이라 별도 정의 */}}
{{- define "service.selectorLabels" -}}
app.kubernetes.io/name: {{ include "service.name" . }}
app.kubernetes.io/instance: {{ .Release.Name }}
{{- end }}


{{/* ServiceAccount 이름 결정 — values 에서 create 옵션 따라 */}}
{{- define "service.serviceAccountName" -}}
{{- if .Values.serviceAccount.create }}
{{- default (printf "%s-sa" (include "service.fullname" .)) .Values.serviceAccount.name }}
{{- else }}
{{- default "default" .Values.serviceAccount.name }}
{{- end }}
{{- end }}
