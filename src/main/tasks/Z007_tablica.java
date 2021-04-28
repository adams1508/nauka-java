package main.tasks;

import java.util.Arrays;

public class Z007_tablica {
    public static void main(String[] args) {
        // 1. wszystkie znaki pionowo
        // indeks- pokazuje miejsce elementu, pierwszy ma wartość 0
        char[] array = {'I', 'n', 'f', 'o', 'r', 'm', 'a', 't', 'y', 'k', 'a'};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // 2. co drugi
        System.out.println();
        for (int i = 0; i < array.length; i += 2) {
            System.out.println(array[i]);
        }
//        3.


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

//        Character.toUpperCase(ch);
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(Character.toUpperCase(array[i]));
        }

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(Character.toLowerCase(array[i]));
        }

        for (char ch : array) {
            System.out.println(ch);
        }

        System.out.println();
        int[] intArray = new int[10];
        // 1. w forze uzupelnic wszystkie 10 elementow o x*3
        // 2. zliczyc z tego sume
//        intArray[0] = 2;
        for (int i = 0; i < intArray.length; i++) {
            int valueToSet = i * 3;
            intArray[i] = valueToSet;
        }

        System.out.println(intArray);
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(sum);
            sum += intArray[i];
        }
        System.out.println(sum);
    }
}
