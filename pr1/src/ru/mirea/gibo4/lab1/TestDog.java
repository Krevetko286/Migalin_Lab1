package ru.mirea.gibo4.lab1;
import java.lang.System;
public class TestDog {
    public static void main(String[] args) {
        System.out.println("hello \nworld");
        Dog d1 = new Dog("Ignat", 3);
        Dog d2 = new Dog("Misha", 2);
        Dog d3 = new Dog("Braga", 1);
        d2.setAge(10);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
