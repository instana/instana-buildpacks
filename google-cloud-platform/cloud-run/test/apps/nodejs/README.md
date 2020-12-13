# Sample Node.js

Run Locally with Buildpacks & Docker:

```sh
pack build sample-nodejs --builder gcr.io/buildpacks/builder --descriptor project.toml
docker run -it -ePORT=8080 -p8080:8080 sample-nodejs
```

Run on Cloud Run:

[![Run on Google Cloud](https://deploy.cloud.run/button.svg)](https://deploy.cloud.run)
