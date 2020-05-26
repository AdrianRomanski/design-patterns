package adrianromanski.structural.adapter;

import java.util.Arrays;
import java.util.List;

public class AdapterEverydayDemo {

    public static void main(String[] args) {

        Integer[] arraysOfInts = new Integer[] {42, 43, 44};

        List<Integer> integerList = Arrays.asList(arraysOfInts);

        System.out.println(Arrays.toString(arraysOfInts));

        System.out.println(integerList);
    }
}
