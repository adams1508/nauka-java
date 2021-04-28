package main.lessons;

public class D002_Warunki {
    public static void main(String[] args) {
        int cenaZaMargharite= 18;
        int cenaZaCappriccioze= 21;
        boolean isCapricciosaMoreExpensive = cenaZaCappriccioze > cenaZaMargharite;

        if (isCapricciosaMoreExpensive) {
            System.out.println("Cappriccioza jest droższa");
        } else {
            System.out.println("Margharita jest droższa");
        }


    }
}
