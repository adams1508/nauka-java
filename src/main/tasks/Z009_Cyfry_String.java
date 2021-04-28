package main.tasks;

public class Z009_Cyfry_String {
    public static void main(String[] args) {
        {
            String num = "";

            for (int i = 0; i < 16; i++)
                num += Character.forDigit(i, 16);
            System.out.println("Cyfry układu szesnastkowego:");
            num = num.toUpperCase();
            System.out.println(num);
        }
        {
            String num = "";
            for (int i = 0; i < 10; i++)
                num += (char) (i + 48);
            System.out.println("\nCyfry układu dziesiątkowego:");
            System.out.println(num);
        }
    }

}


