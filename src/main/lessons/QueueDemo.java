package main.lessons;

public class QueueDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Używam kolejki bigQ do przechowywania alfabetu.");
        for (i = 0; i < 26; i++)
        bigQ.put((char) ('A' + 1));

        System.out.print("Zawartość kolejki bigQ: ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }

        System.out.println();

        System.out.println("\nUżywam kolejki smallQ do wygenerowania błędów.");
        for (i = 0; i < 5; i++) {
            System.out.print("Próbuję umieśćić w kolejce znak " + (char) ('Z' - 1));

            smallQ.put((char) ('Z' - 1));
            System.out.println();
        }

        System.out.println();

        System.out.print("Zawartość kolejki smallQ: ");
        for (i = 0; i < 5; i++) {
            ch = smallQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
    }
}
