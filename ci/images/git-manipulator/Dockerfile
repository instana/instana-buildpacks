FROM debian:buster-slim

RUN apt-get update && apt-get install -y curl jq apt-transport-https ca-certificates gnupg git

RUN curl --silent --fail --show-error -L https://github.com/mikefarah/yq/releases/download/3.4.0/yq_linux_amd64 -o /usr/local/bin/yq && \
    chmod u+x /usr/local/bin/yq
