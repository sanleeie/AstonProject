package org.example;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.nameFIO = "Иванов Иван Иванович";
        employee.position = "Тестировщик";
        employee.email = "qwert@gmail.com";
        employee.phoneNumber = "89123456789";
        employee.salary = 30000;
        employee.age = 20;

        employee.infoEmployee();
    }

}