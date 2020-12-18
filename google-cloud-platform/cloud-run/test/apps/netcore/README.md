# Sample .NET Core

## Run Locally, Buildpacks & Docker

```sh
echo ${INSTANA_AGENT_KEY} | docker login containers.instana.io -u '_' --password-stdin
pack build sample-netcore --buildpack from=builder --buildpack containers.instana.io/instana/release/google/buildpack --builder gcr.io/buildpacks/builder
docker run -it -ePORT=8080 -p8080:8080 sample-netcore
```

## Run on Cloud Run

[![Run on Google Cloud](https://deploy.cloud.run/button.svg)](https://deploy.cloud.run)

When asked for the `INSTANA_AGENT_KEY` and `INSTANA_ENDPOINT_URL` values, refer to the ones provided in your Instana dashboard in the `Installing Agents screen`.

![Instana free trial!](../../../assets/stan-gcp.png)

If you do not already have an Instana dashboard, there is the [free trial of Instana](https://www.instana.com/trial/#instana-cnb-buildpacks), no string attached, just a click away.

**Note:** For best results, you should also have installed a [Google Cloud Agent](https://www.instana.com/docs/ecosystem/google-cloud-run#gcp-agent-setup) to monitor your Google Cloud Platform account.
