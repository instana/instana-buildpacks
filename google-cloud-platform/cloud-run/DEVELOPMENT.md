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

## Automated Build

The build resides in Instana's Concourse.

### New releases

The Concourse pipeline will automatically build, end-to-end test and release new versions when a change merged in `main` and unless there is a `[semver:skip]` tag in the latest commit message subject.

### Instrumentation updates

The versions of the instrumentation dependencies are kept under `google-cloud-platform/cloud-run/src/instrumentation/*/VERSION` files.
The build pipeline will automatically push git commits modifying those `VERSION` files when a dependency is updated, and that will automatically trigger a new buildpack release.

### Changelog

The GitHub releases will have a changelog visible in their body, which will contain the subject of all Git commits since the last release (based on the closest git tag), that have `[changelog]` in the subject.
The git commits automatically generated due to dependency updates will contain the `[changelog]` tag and will therefore automatically be represented in the release changelog.
