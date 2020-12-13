# Sample Java Maven

Run Locally (with Java 11 installed):

```sh
./mvnw exec:java
```

Run Locally with Buildpacks & Docker:

```sh
pack build sample-java-mvn --builder gcr.io/buildpacks/builder --descriptor project.toml
docker run -it -ePORT=8080 -p8080:8080 sample-java-mvn
```

Run on Cloud Run:

[![Run on Google Cloud](https://deploy.cloud.run/button.svg)](https://deploy.cloud.run)
