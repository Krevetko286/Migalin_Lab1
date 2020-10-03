package ru.mirea.gibo4.lab1;
import java.lang.*;
public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Полное руководство Java", "Г. Шилдт", 1093, "учебник");
        Book b2 = new Book("Собака Баскервилей", "А. Конан-Дойль", 230, "Детектив");
        Book b3 = new Book("Игры, в которые играют люди", "Э. Бёрн", 251, "Эссе");
        b2.setPagesCount(167);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}




