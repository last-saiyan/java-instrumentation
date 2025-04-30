.PHONY: all clean build run

all: build

build:
	mvn clean package

clean:
	mvn clean


run-app:
	java -jar java-app/target/java-app-1.0-SNAPSHOT.jar


run-app-with-agent:
	java -javaagent:java-agent/target/java-agent-1.0-SNAPSHOT.jar -jar java-app/target/java-app-1.0-SNAPSHOT.jar
