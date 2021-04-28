package main.tasks;

public class Z018_min_max {
    public static void main(String[] args) {

        int[] array = {12, 34, 21, 11, 76, 45, 98, 23, 9, 100};
//        int[] array= new int[];

        int min, max;

        min = max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
            if (array[i] > max)
                max = array[i];
        }

        System.out.println("Min wynosi " + min);
        System.out.println("Max wynosi " + max);
    }

}
