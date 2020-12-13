# Sample .NET Core

Run Locally with Buildpacks & Docker:

```sh
pack build sample-netcore --builder gcr.io/buildpacks/builder --descriptor project.toml
docker run -it -ePORT=8080 -p8080:8080 sample-netcore
```

Run on Cloud Run:

[![Run on Google Cloud](https://deploy.cloud.run/button.svg)](https://deploy.cloud.run)
