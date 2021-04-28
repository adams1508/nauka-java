package main.tasks;

public class Z004_Zif {
    public static void main(String args[]) {
        int a, b, c, d;
        a = 10;
        b = 15;
        c = a-b;
        if (c < 0) System.out.println("c jest ujemne");
        if (c >= 0) System.out.println("c nie jest ujemne");
        System.out.println();
        c= b-a;
        if (c > 0) System.out.println("c jest dodatnie");
        if (c <= 0) System.out.println(" c nie jest dodatnie");

    }

}
