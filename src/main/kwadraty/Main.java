package main.kwadraty;

public class Main {
    public static void main(String[] args) {

//        Square square= new Square();
        Square square = new Square(5d);
        System.out.println(square.getSide());

        Square square1 = new Square(11.4);
        System.out.println(square1.getSide());

        square.setSide(14d);
        System.out.println(square.getSide());

        System.out.println(square.getField());
        System.out.println(square1.getField());

        EquilateralTriangle równoboczny1 = new EquilateralTriangle(4);
        System.out.println(równoboczny1.getField());

        Trapeze trapeze = new Trapeze(7.2, 5d, 3.5);
        System.out.println("Pole trapezu wynosi:  " + trapeze.getField() + " cm2");

        Rhombus romb = new Rhombus(9d, 5.6);
        System.out.println("Pole rombu wynosi: " + romb.getField() + " cm2");

        Rectangle prostokąt = new Rectangle(2, 5);
        System.out.println("Pole prostokąta wynosi: " + prostokąt.getField() + " cm2");
        System.out.println(prostokąt.getSideA());
        System.out.println(prostokąt.getSideB());
        prostokąt.setSideA(3);
        prostokąt.setSideB(8);
        System.out.println("Pole prostokąta (po zmianach) wynosi: " + prostokąt.getField() + " cm2");

    }
}
