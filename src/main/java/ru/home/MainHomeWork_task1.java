package ru.home;

//Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);

public class MainHomeWork_task1 {
    public static void main(String[] args) {

        String[] arrayStr = {"abc", "adc", "123"};
        changeElementArr(arrayStr, 1, 2);
        for (int i = 0; i < arrayStr.length; i++) {
            System.out.println(arrayStr[i]);
        }


    }

    public static <T> void changeElementArr(T[] array, int i, int j) {
        T temp;

        if (array.length >= 2 && i < array.length && j < array.length) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;

        }
    }
}
