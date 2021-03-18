package ru.geebrains.online;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit & SpecificFruit> {
    private final List<T> box;
    private float boxCapacity;

    public Box (float boxCapacity, T ...fruits) {
        this.box = new ArrayList<>(Arrays.asList(fruits));
        this.boxCapacity = boxCapacity;
    }

// Возвращает количество фруктов в коробке

    public float getWeight(){
        float weightBox = 0.0f;
        if(this.box.size() > 0) {
            float weightFruits = this.box.get(0).getWeight();
            for (T obj: this.box){
                weightBox = weightBox + weightFruits;
            }
        }
        return weightBox;
    }
// Сравнение веса коробок

    public boolean compare (Box<?> boxTwo){
        float weightBox = 0.0f;
        float weightBoxTwo = 0.0f;
        if(this.box.size() > 0) {
            float weightFruitsBox = this.box.get(0).getWeight();
            for (T obj: this.box){
                weightBox = weightBox + weightFruitsBox;
            }
        }
        float weightFruitsBoxTwo = boxTwo.getWeight();
        return Math.abs(weightBox-weightFruitsBoxTwo) < 0.01;
    }
// Добавление фрукта в коробку

    public void addInBox(T fruit){
        if(this.boxCapacity-this.box.size()-1>0){
            this.box.add(fruit);
        }else return;
    }
// перемешение фруктов из одной коробки в другую

    public void movingFruit(Box<T> newBox){
        if(newBox == this) return;
        float amountOfFruit = this.boxCapacity - this.box.size();
        List<T> fruits = newBox.box.subList(0, (int) amountOfFruit);
        this.box.addAll(fruits);
        newBox.box.removeAll(fruits);
    }


}
