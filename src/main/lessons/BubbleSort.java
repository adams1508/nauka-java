package main.lessons;

public class BubbleSort {
    public static void main(String[] args) {

        int[] array = {12, 21, -12, 75, 34, -34, 107, -2, 57, 0};

        int a, b, t;

        System.out.print("Tablica array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();

//        sortowanie pęcherzykowe
        for (a = 1; a < array.length; a++)
            for (b = array.length - 1; b >= a; b--) {
                if (array[b - 1] > array[b]) {
                    t = array[b - 1];
                    array[b - 1] = array[b];
                    array[b] = t;
                }
            }

        System.out.print("Uporządkowana tablica array: ");
        for (int i=0; i< array.length; i++)
            System.out.print(array[i] + ", ");

    }
}
