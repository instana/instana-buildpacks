# Sample Java Gradle

Run Locally (with Java 11 installed):

```sh
./gradlew run
```

Run Locally with Buildpacks & Docker:

```sh
pack build sample-java-gradle --builder gcr.io/buildpacks/builder --descriptor project.toml
docker run -it -ePORT=8080 -p8080:8080 sample-java-gradle
```

Run on Cloud Run:

[![Run on Google Cloud](https://deploy.cloud.run/button.svg)](https://deploy.cloud.run)
