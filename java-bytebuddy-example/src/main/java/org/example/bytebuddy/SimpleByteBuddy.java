package org.example.bytebuddy;

import net.bytebuddy.agent.ByteBuddyAgent;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.dynamic.loading.ClassReloadingStrategy;
import net.bytebuddy.matcher.ElementMatchers;
import net.bytebuddy.implementation.FixedValue;
import org.example.Person;

public class SimpleByteBuddy {


    public static void main(String[] args) {
        ByteBuddyAgent.install();

        try {
            // Transform the sayHello method to always return "Hi, Byte Buddy!"
            new ByteBuddy()
                    .redefine(Person.class)
                    .method(ElementMatchers.named("sayHello"))
                    .intercept(FixedValue.value("Hi, Byte Buddy!"))
                    .make()
                    .load(Person.class.getClassLoader(), ClassReloadingStrategy.fromInstalledAgent());

            // Test the transformation
            Person person = new Person("sdf", 1);
            System.out.println(person.sayHello2("SimpleByteBuddy"));  // Prints: Hi, Byte Buddy!

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
