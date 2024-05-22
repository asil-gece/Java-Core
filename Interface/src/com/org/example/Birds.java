package com.org.example;

public interface Birds extends  Animal {
    void fly();

    @Override
    void breath();

    @Override
    void eat();
}
