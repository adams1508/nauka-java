package main.lessons;

public class DwuwymiariowyArray {
    public static void main(String[] args) {
        int t;
        int i;
        int[][] array = new int[3][4];
//                nowa tablica, o dwóch wymiarach- 3 i 4

        for (t = 0; t < 3; t++) {
            for (i = 0; i < 4; i++) {
                array[t][i] = (t * 4) + i + 1;
                System.out.print(array[t][i] + " ");
            }

            System.out.println();
        }
    }
}
