package main.kwadraty;

public class Square {

    //    pola- właściwości klasy
    private double side;

    //    konstruktor- sposób tworzenia obiektu danej klasy
    public Square(double side) {
        this.side = side;
    }

    //    metody- dostępne operacje na danej klasie
    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getField() {
        return side * side;
    }
}
