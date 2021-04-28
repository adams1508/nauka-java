package main.lessons;

public class Do_while {
    public static void main(String args[])
            throws java.io.IOException {
        char ch, ignore, answer = 'K';

        do {
            System.out.println("Pomyślałem literę z przedziału od A do Z.");
            System.out.print("Spróbuj ją odgadnąć:\n ");

            ch = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (ch == answer) System.out.println("**Dobrze**");
            else {
                System.out.print("Niestety , trafiłeś");
                if (ch < answer) System.out.println(" za nisko");
                else System.out.println(" za wysoko");
                System.out.println("Spróbuj jeszcze raz");
            }
        } while (answer != ch);

    }
}

