FROM springci/spring-boot-jdk11-ci-image:2.3.x

RUN apt-get update && apt-get install -y curl build-essential python3-pip

RUN curl -sL https://deb.nodesource.com/setup_lts.x | bash - && \
    apt-get install -y nodejs

RUN curl -sSL "https://github.com/buildpacks/pack/releases/download/v0.15.0/pack-v0.15.0-linux.tgz" | tar -C /usr/local/bin/ --no-same-owner -xzv pack
