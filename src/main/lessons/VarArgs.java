package main.lessons;

public class VarArgs {
    public static void vaTest(int... v) {
        System.out.println("Liczba argumentów: " + v.length);
        System.out.println("Zawartość: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println(" Argument " + i + ": " + v[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(10);
        vaTest(1,2,3);
        vaTest();
    }
}
