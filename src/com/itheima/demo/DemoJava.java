package com.itheima.demo;

public class DemoJava {

    public static void main(String[] args) {

        System.out.println("hello world");

        eat("json");
        int i = add(1, 2);
        System.out.println(i);

    }

    public static void eat(String name) {

        System.out.println(name + "吃饭");

    }

    public static int add(int a, int b) {
        int i = a + b;
        return i;
    }
}