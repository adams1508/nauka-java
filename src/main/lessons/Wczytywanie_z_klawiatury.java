package main.lessons;

public class Wczytywanie_z_klawiatury {
    public static void main(String args[])
            throws java.io.IOException {

        char ch, answer = 'R';

        System.out.println("Pomyślałem literę z przedziału od A do Z");
        System.out.println("Spróbuj ją odgadnąć");

        ch = (char) System.in.read();

        if (ch == answer) System.out.println("** Dobrze **");
        else {
            System.out.print("...Niestety,");

            if (ch < answer) System.out.println("zbyt nisko");
            else System.out.println("za wysoko");
        }
    }
}
