package main.lessons;

public class VarArgs3 {
    public static void vaTest(int... v) {
        System.out.println("vaTest(int...): " + "Liczba argumentów: " + v.length);
        System.out.println("Zawartość: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println(" Argument " + i + ": " + v[i]);
        }
        System.out.println();
    }

    public static void vaTest(boolean... v) {
        System.out.println("vaTest(boolean...): " + "Liczba argumentów: " + v.length);
        System.out.println("Zawartość: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println(" Argument " + i + ": " + v[i]);
        }
        System.out.println();
    }

    public static void vaTest(String msg, int... v) {
        System.out.println("vaTest(String msg, int...): " + msg + v.length);
        System.out.println("Zawartość: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println(" Argument " + i + ": " + v[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 4, 2);
        vaTest(true, false, false);
        vaTest("Testuję: ", 2, 5);
    }
}
