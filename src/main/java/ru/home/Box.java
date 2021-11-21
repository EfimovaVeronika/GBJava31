package ru.home;

import java.util.ArrayList;

public class Box<T extends Fruit> {

   private final ArrayList<T> fruitList;

    public Box() {
        this.fruitList = new ArrayList<>();
    }

    public double getWeight() {
        double boxWeight = 0;
        for (Fruit fruit : fruitList) {
            boxWeight += fruit.getWeight();
        }
        return boxWeight;
    }

    public boolean compare(Box<?> box) {
        return Math.abs(getWeight() - box.getWeight()) < 0.00001f;
    }

    public void addFruit(T fruit) {
        fruitList.add(fruit);
    }

    public void replaceAll(Box<T> box) {
        box.fruitList.addAll(fruitList);
        fruitList.clear();
    }
}




