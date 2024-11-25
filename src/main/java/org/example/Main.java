package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        printThreeWords();
        System.out.println("Задание 2:");
        checkSumSign(1,2);
        System.out.println("Задание 3");
        printColor(13);
        System.out.println("Задание 4");
        compareNumbers(10, 2);
        System.out.println("Задание 5");
        result(5,7);
        System.out.println("Задание 6");
        printOr(10);
        System.out.println("Задание 7");
        System.out.println(printBool(10));
        System.out.println("Задание 8");
        printStringInt("Lemon", 3);
        System.out.println("Задание 9");
        System.out.println(printYear(2024));
        System.out.println("Задание 10");
        array(new int[]{1,0,0,1,0,0,1,0,1});
        System.out.println("Задание 11");
        arrayHundred(new int[100]);
        System.out.println("Задание 12");
        arrayLessMultiply(new int[]{1,5,3,2,11,4,5,2,4,8,9,1});
        System.out.println("Задание 13");
        tableDiagonal(new int[5][5]);
        System.out.println("Задание 14");
        System.out.println(Arrays.toString(lenArrVal(10, 5)));
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(int a, int b) {
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(int value) {

        if (value <= 0) {
            System.out.println("Красный");
        }
        if (0 < value && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(int a, int b) {

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void result(int a, int b) {
        int c = a + b;

        boolean result = (c >= 10) && (c <= 20);
        System.out.println(result);
    }

    public static void printOr(int a) {

        if (a >= 0) {
            System.out.println("Положительное");
        }

        if (a < 0) {
            System.out.println("Отрицательное");
        }
    }

    public static boolean printBool(int a) {
        return a < 0;
    }

    public static void printStringInt(String a, int b) {
        for (int i = 0; i < 3; i++) {
            System.out.println(a);
        }
    }

    public static boolean printYear(int year) {
        if (year % 4 != 0) {
            return false;
        }
        else if (year % 400 == 0) {
            return true;
        }
        else return year % 100 != 0;
    }

    public static void array(int[] arrSwap) {
        for (int i = 0; i < arrSwap.length; i++) {
            if(arrSwap[i] == 0) {
                arrSwap[i]++;
            } else {
                arrSwap[i]--;
            }
        }
        System.out.println(Arrays.toString(arrSwap));
    }

    public static void arrayHundred(int[] arrHun) {
        for (int i = 0; i < 100; i++) {
            arrHun[i] = i+1;
            //System.out.println(arrHun[i]);
        }
    }

    public static void arrayLessMultiply(int[] arrLM) {
        for (int i = 0; i < arrLM.length; i++) {
            if(arrLM[i] < 6) {
                arrLM[i] = arrLM[i] * 2;
            }

            System.out.println(arrLM[i]);
        }
    }

    public static void tableDiagonal(int[][] tableDia) {
        int z = 4;
        for (int i = 0; i < tableDia.length; i++) {
            for (int j = 0; j < tableDia.length; z=tableDia[i].length, j++, z--) {
                if (i == j || i == z-j) {
                    tableDia[i][j] = 1;
                }

                System.out.print(tableDia[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] lenArrVal(int initialValue, int len) {
        int[] arrLen = new int[len];
        for (int i = 0; i < arrLen.length; i++) {
            arrLen[i] = initialValue;
        }
        return arrLen;
    }
}