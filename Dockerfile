FROM ubuntu:24.04

ENV DEBIAN_FRONTEND=noninteractive

RUN apt-get update && apt-get install -y \
    build-essential \
    gdb \
    openjdk-21-jdk \
    git \
    nano \
    vim \
    && apt-get clean

# Create a normal user
RUN useradd -ms /bin/bash vini

# Set working directory
WORKDIR /workspace

# Switch to non-root user
USER vini

CMD ["/bin/bash"]
