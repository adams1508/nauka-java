package main.lessons.d20210512;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){
        int[] array={1,2,3,4,2,6,7,4};
        int[] empty = {};

        UniqueInt nothing= new UniqueInt();
//        nothing.setDuplicates(array);
        nothing.setDuplicates(array);

        UniqueInt.findDuplicates(array);

//        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 4, 3, 7, 9, 1);
//
//        integers.stream()
//                .filter(integer -> Collections.frequency(integers, integer) > 1)
//                .forEach(System.out::println);
    }
}
