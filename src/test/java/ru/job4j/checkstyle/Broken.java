package ru.job4j.checkstyle;

public class Broken {
    private static final String NEWVALUE = "";

    private String surname;

    private int sizeOfEmpty = 10;

    private String name;

    public void echo() { }

    public Broken() { }

    public void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    public void method(int a, int b, int c, int d, int e, int f) {
    }
}