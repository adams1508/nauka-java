package main.lessons.d20210624;

public class AddNumbers {
    public static void main(String[] args) {

        String number = "123445678";
        byte[] code = number.getBytes();
        int sum = 0;
        for (byte c : code) {
            sum += c - 48;
        }
        System.out.println("Liczba naturalna: " + number);
        System.out.println("Suma cyfr: " + sum);

    }

}
