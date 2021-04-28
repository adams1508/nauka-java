package main.tasks;

public class Z016_MinMax {
    public static void main(String[] args) {

        int min, max;

        int[] array = {1, 4, 5, 2, 7, 4};

        min = getMin(array);
        max = getMax(array);
        System.out.println("Min wynosi " + min);
        System.out.println("Max wynosi " + max);
    }

    static int getMin(int[] array) {

        int min;

        if (array.length == 0) {
            return 0;
        } else {
            min = array[0];
        }

        for (int currentInt : array) {
            if (currentInt < min) {
                min = currentInt;
            }
        }
        return min;
    }

    static int getMax(int[] array) {

        int max;

        if (array.length == 0) {
            return 0;
        } else {
            max = array[0];
        }

        for (int currentInt : array) {
            if (currentInt > max) {
                max = currentInt;
            }
        }
        return max;
    }
}