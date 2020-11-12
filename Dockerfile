FROM openjdk:11.0.2

ENV MY_NAME=icarus

WORKDIR /tmp/work

COPY ./target/simple-0.0.1-SNAPSHOT.jar /tmp/work/app.jar

ENTRYPOINT ["java", "-jar", "app.jar", "--my.name=${MY_NAME}"]