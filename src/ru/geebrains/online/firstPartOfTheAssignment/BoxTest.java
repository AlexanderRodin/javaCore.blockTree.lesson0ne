package ru.geebrains.online.firstPartOfTheAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoxTest<T> {
    List<T> boxTest;

    public BoxTest(T[] boxTest) {
        this.boxTest = Arrays.asList(boxTest);
    }

    public List<T> getBoxTest() {
        return boxTest;
    }

    public void elementReplacement(int index1, int index2){
        T elementOne = this.boxTest.get(index1);
        T elementTwo = this.boxTest.get(index2);
        boxTest.set(index1, (T) elementTwo);
        boxTest.set(index2, (T) elementOne);

    }

    public static  <T> List<T> arrayListReturn (T[] arr){
        return new ArrayList<>(Arrays.asList(arr));
    }


}
