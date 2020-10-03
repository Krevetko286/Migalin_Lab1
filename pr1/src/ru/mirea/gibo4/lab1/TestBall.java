package ru.mirea.gibo4.lab1;
import java.lang.System;
public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(25, "black", "football", 2750);
        Ball b2 = new Ball(24, "red", "football", 3999);
        Ball b3 = new Ball(23.5, "green", "football", 4999);
        b3.setColor("blue");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}

