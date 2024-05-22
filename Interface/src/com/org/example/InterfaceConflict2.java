package com.org.example;

public interface InterfaceConflict2 {
    default void run(){
        System.out.println("He is running");
    }
}
