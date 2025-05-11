# java-instrumentation
simple hello world java instrumentation example


# building the sample jar (that will be instrumented)
```
# builds the jar
make
```


```
# run the application jar
java -jar java-app/target/java-app-1.0-SNAPSHOT.jar
```


```
# application with agent
java -javaagent:java-agent/target/java-agent-1.0-SNAPSHOT.jar -jar java-app/target/java-app-1.0-SNAPSHOT.jar
```
