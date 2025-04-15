FROM openjdk:17
ENV PORT 9090
COPY target/knote-java*.jar /opt/knote-java.jar
WORKDIR /opt
ENTRYPOINT exec java $JAVA_OPTS -jar knote-java.jar