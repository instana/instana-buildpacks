# Sample Node.js

Run Locally with Buildpacks & Docker:

```sh
pack build sample-nodejs-gradle --buildpack from=builder --buildpack containers.instana.io/instana/release/google/buildpack --builder gcr.io/buildpacks/builder
docker run -it -ePORT=8080 -p8080:8080 sample-nodejs-gradle
```

Run on Cloud Run (without Instana tracing!):

[![Run on Google Cloud](https://deploy.cloud.run/button.svg)](https://deploy.cloud.run)
