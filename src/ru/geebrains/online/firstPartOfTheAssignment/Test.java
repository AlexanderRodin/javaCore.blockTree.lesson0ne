package ru.geebrains.online.firstPartOfTheAssignment;

import java.util.ArrayList;

public class Test {
    public static  void main(String[] args) {

        BoxTest<Integer> box1 = new BoxTest(new Integer[]{1, 2, 4, 5, 6, 7});

        System.out.println(box1.getBoxTest());
        box1.elementReplacement(2, 5);
        System.out.println(box1.getBoxTest());
        System.out.println(BoxTest.arrayListReturn(new Integer[]{1, 2, 4, 5, 6, 7}));
    }


}
