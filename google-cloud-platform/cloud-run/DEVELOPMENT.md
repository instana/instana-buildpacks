# Developing the Instana Cloud Run Buildpack

## Setup

1. Install [`pack`](https://buildpacks.io/docs/tools/pack/)
2. Download the latest [nodejs-cloud-run-dependencies](https://artifact-public.instana.io/artifactory/shared/com/instana/nodejs-cloud-run-dependencies/) package and save it under `google-cloud-platform/cloud-run/src/instrumentation/nodejs/nodejs-instrumentation.tgz`
3. Download the latest [core-clr-extension](https://artifact-public.instana.io/artifactory/shared/com/instana/core-clr-extension/) package and save it under `google-cloud-platform/cloud-run/src/instrumentation/netcore/core-clr-extension.zip`
4. Download the latest [JVM standalone collector](https://artifact-public.instana.io/artifactory/shared/com/instana/standalone-collector-jvm/) package and save it under `google-cloud-platform/cloud-run/src/instrumentation/java/standalone-collector-jvm.jar`

## Local buildpack packaging

```sh
(cd google-cloud-platform/cloud-run && pack package-buildpack containers.instana.io/instana/release/buildpacks/cloudrun --config ./package.toml)
```
