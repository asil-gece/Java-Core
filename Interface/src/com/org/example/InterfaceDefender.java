package com.org.example;

public interface InterfaceDefender {
    default void defaultMethod() {
        System.out.println("This is a default defender method came with Java 8");
        privateMethod();
    }

    private void privateMethod() {
        System.out.println("This is a private defender method came with Java 9 ");
    }

    static void staticMethod() {
        System.out.println("This is a static defender method came with Java 8");
        privateStaticMethod();
    }

    private static void privateStaticMethod() {
        System.out.println("This is private static defender method came with Java 9");
    }
}
