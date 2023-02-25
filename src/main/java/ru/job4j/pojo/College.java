package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullname("Patrushev Anton Valerievich");
        student.setGroup(5);
        student.setDateEnter("01.09.2022");

        System.out.println(student.getFullname() + " entered college at " + student.getDateEnter()
                + ". His group is  " + student.getGroup());
    }
}
