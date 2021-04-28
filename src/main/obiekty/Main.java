package main.obiekty;

public class Main {
    public static void main(String[] args) {

        Rectangle prostokat= new Rectangle(10, 20);
        Rectangle prostokat2= new Rectangle(10, 20);

        // to sprawdza czy to dokladnie ten sam obiekt
        if (prostokat == prostokat2) {
            System.out.println("sa rowne");
        } else {
            System.out.println("nie sa rowne");
        }

    }
}