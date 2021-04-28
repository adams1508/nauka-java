package main.tasks;

public class Z010_Witaj_String {
    public static void main(String[] args) {
        String hello = "Dzień dobry";
        System.out.println("a) pionowo:");
        for (int i = 0; i < hello.length(); i++) {
            System.out.println(hello.charAt(i));
        }
        System.out.println("\nb) poziomo, ze spacjami:");
        for (int i = 0; i < hello.length(); i++) {
            System.out.print(hello.charAt(i) + " ");
        }
        System.out.println("\nc) poziomo, wielkie litery:");
        System.out.println(hello.toUpperCase());

        System.out.println("\nd) poziomo, małe litery:");
        System.out.print(hello.toLowerCase());
        System.out.println();

        String text= "programowanie";
        System.out.println("\nNapis: " + text);

        text= Character.toUpperCase(text.charAt(0)) + text.substring(1);
        System.out.println("Pierwsza wielka: " + text);

        text= text.toUpperCase();
        System.out.println("Wszystkie wielkie: " + text);

        {
            System.out.print("Wspak: ");
            text = text.toLowerCase();
            for (int i = text.length() - 1; i >= 0; i--)
                System.out.print(text.charAt(i));
        }
        System.out.print("\nTeż wspak: ");
        char [] elementy= text.toCharArray();
        for (int i= 0, j= text.length()-1; i<j; i++, j--) {
            char tmp = elementy[i];
            elementy[i] = elementy[j];
            elementy[j] = tmp;
        }
            text = new String(elementy);
            System.out.println(text);
    }
}
