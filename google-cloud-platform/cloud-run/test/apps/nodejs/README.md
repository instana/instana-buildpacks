# Sample Node.js

## Run Locally, Buildpacks & Docker

```sh
pack build sample-nodejs --builder gcr.io/buildpacks/builder --descriptor project.toml
docker run -it -ePORT=8080 -p8080:8080 sample-nodejs
```

## Run on Cloud Run

[![Run on Google Cloud](https://deploy.cloud.run/button.svg)](https://deploy.cloud.run)

When asked for the `INSTANA_AGENT_KEY` and `INSTANA_ENDPOINT_URL` values, refer to the ones provided in your Instana dashboard in the `Installing Agents screen`.

If you do not already have an Instana dashboard, there is the [free trial of Instana](https://www.instana.com/trial/), no string attached, just a click away.

**Note:** For best results, you should also have installed a [Google Cloud Agent](https://www.instana.com/docs/ecosystem/google-cloud-run#gcp-agent-setup) to monitor your Google Cloud Platform account.
