package ru.geebrains.online;


public class Main {


    public static void main(String[] args) {

        Box<Apple> appleBox1 = new Box<>(7.0f,
                new Apple(), new Apple(), new Apple(), new Apple(), new Apple());

        Box<Orange> orangeBox1 = new Box<>(7.0f,
                new Orange(), new Orange(), new Orange(), new Orange());

        Box<Orange> orangeBox2 = new Box<>(7.0f,
                new Orange(), new Orange(), new Orange(), new Orange(), new Orange());

        Box<Apple> appleBox3 = new Box<>(8.0f,
                new Apple(), new Apple(), new Apple(), new Apple());

        Box<Apple> appleBox4 = new Box<>(7.0f,
                new Apple(), new Apple(), new Apple(), new Apple(),new Apple(), new Apple(), new Apple());

        System.out.println("Вес коробки с Яблоками: "+appleBox1.getWeight()+ " кг");// Вес коробки
        System.out.println("Вес коробки с Апельсинами: " + orangeBox1.getWeight() + " кг");
        System.out.println("Вес коробки с Апельсинами: " + orangeBox2.getWeight() + " кг");
        System.out.println(appleBox1.compare(orangeBox1));
        System.out.println(appleBox1.compare(orangeBox2));
        appleBox1.addInBox(new Apple());
        System.out.println("Вес коробки с Яблоками: "+appleBox1.getWeight()+ " кг");
        orangeBox2.addInBox(new Orange());
        System.out.println("Вес коробки с Апельсинами: " + orangeBox2.getWeight() + " кг");
        System.out.println(appleBox3.getWeight());
        System.out.println(appleBox4.getWeight());
        appleBox3.movingFruit(appleBox4);
        System.out.println(appleBox3.getWeight());
        System.out.println(appleBox4.getWeight());


    }
}

