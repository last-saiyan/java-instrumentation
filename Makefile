.PHONY: all clean build run

all: build

build:
	mvn clean package

clean:
	mvn clean


run:
	java -jar target/java-instrumentation-1.0-SNAPSHOT.jar
