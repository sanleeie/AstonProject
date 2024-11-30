package org.example;

public class Main {
    public static void main(String[] args) {

        Employee[] empArr = new Employee[5];
        empArr[0] = new Employee("Вадимов Вадим Вадимович", "Тестировщик", "vadim1@gmail.com", "8998765432", 30000, 30);
        empArr[1] = new Employee("Сидоров Борис Иванович", "Тестировщик", "boris1@gmail.com", "81928374627", 30000, 27);
        empArr[2] = new Employee("Глебов Глеб Глебович", "Тестировщик", "gleb2@gmail.com", "86245868344", 25000, 30);
        empArr[3] = new Employee("Иванов Иван Иванович", "Тестировщик", "ivan53@gmail.com", "6367577222", 40000, 30);
        empArr[4] = new Employee("Тимуров Тимур Тимурович", "Тестировщик", "timur546@gmail.com", "458957897437", 45000, 30);

    }

}