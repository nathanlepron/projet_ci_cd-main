FROM openjdk:15-alpine
VOLUME /tmp

# Download dockerize and cache that layer
RUN wget -O dockerize.tar.gz https://github.com/jwilder/dockerize/releases/download/v0.6.1/dockerize-alpine-linux-amd64-v0.6.1.tar.gz
RUN tar xzf dockerize.tar.gz
RUN chmod +x dockerize

# This is the first layer that won't be cached
ARG ARTIFACT_NAME
ADD monapp.jar /app.jar


ENV SPRING_PROFILES_ACTIVE docker

ENTRYPOINT ["java", "-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap", "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
