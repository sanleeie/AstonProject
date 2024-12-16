package org.example;

public class Main {
    public static int sumArrayElements(String[][] array) throws MyArraySizeException, MyArrayDataException {

        int rows = array.length;
        if (rows != 4) {
            throw new MyArraySizeException("Массив должен быть 4x4. Строк сейчас: " + rows);
        }

        for (String[] row : array) {
            if (row.length != 4) {
                throw new MyArraySizeException("Массив должен быть 4x4. В строке: " + row + " - столбцов не 4");
            }
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                String element = array[i][j];

                try {
                    int number = Integer.parseInt(element);
                    sum += number;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "] (" + element + ") не является числом");
                }
            }
        }
        return sum;
    }


    public static void main(String[] args) {

        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] incorrectSizeArray = {
                {"1", "1"},
                {"1", "1"},
                {"1"}
        };

        String[][] incorrectDataArray = {
                {"1", "2", "3", "4"},
                {"5", "a", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };


        try {
            int sum = sumArrayElements(correctArray);
            System.out.println("Сумма элементов: " + sum);

            sum = sumArrayElements(incorrectSizeArray);
            System.out.println("Сумма элементов(неправильный размер): " + sum);

            sum = sumArrayElements(incorrectDataArray);
            System.out.println("Сумма элементов(неправильные данные): " + sum);


        } catch (MyArraySizeException e) {
            System.err.println("Ошибка размера: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.err.println("Ошибка в данных: " + e.getMessage());
        }
    }
}