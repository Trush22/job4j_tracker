package ru.job4j.cast;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Двигается по скоростным трассам");
    }

    @Override
    public void engine() {
        System.out.println("Имеет дизельный двигатель внутреннего сгорания");
    }
}
