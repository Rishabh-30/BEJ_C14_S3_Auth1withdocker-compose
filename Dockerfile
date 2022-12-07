FROM openjdk
WORKDIR usr/lib
ADD ./target/BEJ_C14_S1_Auth1-0.0.1-SNAPSHOT.jar /usr/lib/BEJ_C14_S1_Auth1-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","BEJ_C14_S1_Auth1-0.0.1-SNAPSHOT.jar"]