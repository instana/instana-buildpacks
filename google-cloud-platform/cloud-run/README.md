# Instana Buildpack for Google Cloud Run

## Usage

Log into `containers.instana.io`:

```sh
echo <download_key> | docker login containers.instana.io -u _ --password-stdin
```

From the root folder of a test app:

```sh
pack build <image-name> --buildpack from=builder --buildpack containers.instana.io/instana/release/google/buildpack --builder gcr.io/buildpacks/builder
```

The `--buildpack from=builder` means "use all the buildpacks in the builder", so that we can just "append" the Instana buildpack without overriding the detection process of the other buildpacks.

## See it in action on Google Cloud Run

With your Instana dashboard at hand, you can see the Instana Buildpack for Google Cloud Run in action with one click:

* [Java + Gradle](test/apps/java/gradle)
* [Java + Maven](test/apps/java/mvn)
* [.NET Core](test/apps/netcore)
* [Node.js](test/apps/nodejs)

And if you do not already have an Instana dashboard, there is the [free trial of Instana](https://www.instana.com/trial/#instana-cnb-buildpacks), no string attached, just a click away.

## There is more!

Instana's support of Google Cloud Run using this Cloud Native Buildpack is one of the things that Instana does great on Google Cloud Platform.
Head over the [Instana on Google Cloud Platform](https://www.instana.com/google-cloud-application-monitoring/) page to learn what else Instana works great with!

![Instana free trial!](assets/stan-gcp.png)
