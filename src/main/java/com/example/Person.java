package com.example;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.printf("name= %s; age=%d\n", this.name, this.age);
    }

    public static void main(String[] args) {
        Person person = new Person("name", 30);
        person.sayHello();
    }
}