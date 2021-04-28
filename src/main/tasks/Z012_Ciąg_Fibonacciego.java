package main.tasks;

public class Z012_Ciąg_Fibonacciego {
    public static void main(String[] args) {

        int[] integers = new int[32];
        for (int i = 0; i < integers.length; i++) {
            if (i==0) {
                integers[i]=0;
            } else if (i<=2) {
                integers[i]= 1;
            } else {
                integers[i]= integers[i-2] + integers[i-1];
            }
        }
        for (int integer : integers) {
            System.out.println(integer);
        }
    }
}
