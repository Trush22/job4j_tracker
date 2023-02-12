package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int d) {
        return d / x;
    }

    public int sumAllOperation(int s) {
        return sum(s) + multiply(s) + minus(s) + divide(s);
    }

    public  static int minus(int z) {
        return  z - x;
    }

    public static int sum(int y) {
        return x + y;
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println("Sum " + result);
        int result1 = Calculator.minus(10);
        System.out.println("Minus " + result1);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(10);
        System.out.println("Multiply " + rsl);
        Calculator div = new Calculator();
        int rsl1 = div.divide(10);
        System.out.println("Divide " + rsl1);
        Calculator sumAlloper = new Calculator();
        int rsl2 = sumAlloper.sumAllOperation(10);
        System.out.println("SumAllOperations " + rsl2);
    }
}
