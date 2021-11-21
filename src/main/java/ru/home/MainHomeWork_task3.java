package ru.home;
//Задача:
//1.Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
//2.Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
//3.Для хранения фруктов внутри коробки можно использовать ArrayList;
//4.Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
// вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
//5.Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра.
// true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
//6.Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
// Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
// Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
//7.Не забываем про метод добавления фрукта в коробку.

import java.util.ArrayList;

//+ pull request!!!!!!!!!!!!!!

public class MainHomeWork_task3 {

    public static void main(String[] args) {

        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();

        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());

        appleBox2.addFruit(new Apple());
        appleBox2.addFruit(new Apple());
        appleBox2.addFruit(new Apple());

        orangeBox1.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());

        orangeBox2.addFruit(new Orange());
        orangeBox2.addFruit(new Orange());

        System.out.println(appleBox1.getWeight());
        System.out.println(appleBox1.compare(appleBox2));
        System.out.println(appleBox2.compare(orangeBox1));
        System.out.println(appleBox2.compare(orangeBox2));


        appleBox1.replaceAll(appleBox2);
        System.out.println(appleBox1.getWeight());
        System.out.println(appleBox2.getWeight());
    }




}
