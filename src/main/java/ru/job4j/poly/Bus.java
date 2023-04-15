package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Автобус едет");
    }

    @Override
    public void passengers(int quantity) {
        System.out.println("Количество пассажиров " + quantity);
    }

    @Override
    public double refill(double fuel) {
        double price1L = 49.95;
        return price1L * fuel;
    }
}
