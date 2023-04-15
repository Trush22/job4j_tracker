package ru.job4j.cast;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Летит по воздуху");
    }

    @Override
    public void engine() {
        System.out.println("Имеет реактивный двигатель");
    }
}
