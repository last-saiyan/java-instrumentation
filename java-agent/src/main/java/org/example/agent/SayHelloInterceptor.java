package org.example.agent;


public class SayHelloInterceptor {
    public static String intercept(String originalParam) {
        System.out.println("Intercepted call to sayHello2 -> " + originalParam);
        return "Hi, from interceptor" ;
    }
}