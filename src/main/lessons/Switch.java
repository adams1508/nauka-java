package main.lessons;

public class Switch {
    public static void main(String args[]) {
        int i;
        for (i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    System.out.println("i równe 0");
                case 1:
                    System.out.println("i równe 1");
                case 2:
                    System.out.println("i równe 2");
                case 3:
                    System.out.println("i równe 3");
                case 4:
                    System.out.println("i równe 4");
            }

            System.out.println("i równe 5 lub więcej\n");

        }
    }
}
