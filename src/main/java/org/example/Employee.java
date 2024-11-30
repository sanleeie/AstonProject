package org.example;

public class Employee {

    String nameFIO;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;

    public void infoEmployee() {
        System.out.println("Информация о сотруднике:");
        System.out.println("ФИО: " + nameFIO);
        System.out.println("Должность: " + position);
        System.out.println("Поста: " + email);
        System.out.println("Телефон: " + phoneNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }
}