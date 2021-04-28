package main.javadziewiec;

import java.io.IOException;

public class Z01_03 {
    public static void main(String[] args)
            throws IOException {

        int key = System.in.read();
        int key1 = System.in.read();
        int key2 = System.in.read();

        int[] array = new int[3];
        array[0] = key;
        array[1]= key1;
        array[2]= key2;

        int max= getMax(array);

        System.out.println(max);

    }

    static int getMax(int[] array) {

        int max = array[0];

        for (int num : array) {

            if (num > max)
                max = num;

        }
        return max;
    }


}


