FROM jenkins/jenkins:lts

USER root

# Install Java 17
RUN apt-get update && \
    apt-get install -y openjdk-17-jdk && \
    rm -rf /var/lib/apt/lists/*

# Set JAVA_HOME for Java 17
ENV JAVA_HOME /usr/lib/jvm/java-17-openjdk-amd64

# Ensure Java 17 is the default
RUN update-alternatives --set java /usr/lib/jvm/java-17-openjdk-amd64/bin/java

# Install Maven
RUN apt-get update && \
    apt-get install -y maven && \
    rm -rf /var/lib/apt/lists/*

USER jenkins
