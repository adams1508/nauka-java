package main.tasks;

public class Z011_Franki {
    public static void main(String[] args) {
        double kursFranka = 4.17;

        for (int franki = 1; franki <= 100; franki++) {
            double ilośćZłotych = franki * kursFranka;

            if (franki == 1) {
                System.out.println(String.format("%d frank równa się %f złotych", franki, ilośćZłotych));
            } else if (franki <= 4) {
                System.out.println(String.format("%d franki równa się %f złotych", franki, ilośćZłotych));
            } else {
                System.out.println(String.format("%d franków równa się %f złotych", franki, ilośćZłotych));
            }

            if (franki % 5 == 0) {
                System.out.println();
            }
        }
    }
}
