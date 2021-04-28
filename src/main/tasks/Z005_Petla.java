package main.tasks;

public class Z005_Petla {
    public static void main(String args[]) {
        int count;
        for (count = 0; count < 5; count++) ;
        System.out.println("count wynosi: " + count);
//        zapytać Jarka czemu nie wyszła pętla :("

        double gallons, liters;
        int counter;

        counter = 0;
        for (gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854;
            System.out.println(gallons + " galonów to " + liters+ " litrów.");

            counter++;
            if (counter == 10) {
                System.out.println();
                counter= 0;
            }
        }
    }
}
