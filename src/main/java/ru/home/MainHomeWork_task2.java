package ru.home;
import java.util.ArrayList;
import java.util.Collections;

//Написать метод, который преобразует массив в ArrayList;

public class MainHomeWork_task2 {
    public static void main(String[] args) {
        String[] arrayStr = {"abc", "adc", "123"};
        for (int i = 0; i < arrayStr.length; i++) {
            System.out.println(arrayStr[i]);
        }
        System.out.println(fromArrToArrList(arrayStr));

    }

    public static <T> ArrayList<T> fromArrToArrList(T[] array) {
        ArrayList<T> arrayList = new ArrayList<>();
        if(array.length != 0) {
            for (int i = 0; i < array.length ; i++) {
               arrayList.add(array[i]);
            }
        } return arrayList;
    }

    //или так

    public static <T> ArrayList<T> fromArrToArrList2(T[] array) {
        ArrayList<T> arrayList = new ArrayList<>();
        if(array.length != 0) {
            Collections.addAll(arrayList, array);
        }
            return arrayList;
    }
}
