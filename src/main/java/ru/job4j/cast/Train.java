package ru.job4j.cast;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Передвигается по рельсам");
    }

    @Override
    public void engine() {
        System.out.println("Имеет электрический двигатель");
    }
}
