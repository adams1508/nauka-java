package main.javadziewiec;

import java.sql.PreparedStatement;

public class Z01_06 {
    public static void main(String[] args) {
        int integer = 5;

        long factorial = getFactorialWithRecursion(integer);

        System.out.println(factorial);

        long factorial2= getFactorialWithIteration(integer);

        System.out.println(factorial2);


    }

    // silnia za pomoca rekurencji
    static long getFactorialWithRecursion(int integer) {
        long factorial = 0L;
        if (integer == 1) {
            return 1;
        }

        for (int num = 1; num <= integer; num++) {
            factorial = getFactorialWithRecursion(integer - 1) * integer;
        }
        return factorial;
    }

    //silnia za pomoca iteracji
    static long getFactorialWithIteration(int integer) {
        long factorial;

        factorial = 1;
        for (int num = 1; num <= integer; num++) {
            factorial *= num;
        }

        return factorial;

    }
}
