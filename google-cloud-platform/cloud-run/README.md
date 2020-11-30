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
