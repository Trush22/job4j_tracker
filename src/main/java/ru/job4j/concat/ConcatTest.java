package ru.job4j.concat;

public class ConcatTest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder str1 = new StringBuilder("Job4j");
        for (int index = 0; index < 9999; index++) {
            str1.append(index);
        }
        System.out.println("Миллисекунд: " + (System.currentTimeMillis() - startTime));
        String str = "Job4j";
        for (int index = 0; index < 9999; index++) {
            str = str + index;
        }
        System.out.println("Миллисекунд: " + (System.currentTimeMillis() - startTime));
    }
}
