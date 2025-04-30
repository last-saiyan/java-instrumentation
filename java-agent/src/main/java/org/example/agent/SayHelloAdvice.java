package org.example.agent;

import net.bytebuddy.asm.Advice;

public class SayHelloAdvice {
    @Advice.OnMethodEnter
    public static void onEnter() {
        System.out.println(">> Intercepted sayHello call");
    }
}