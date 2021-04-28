package main.kwadraty;

public class Rhombus {

    private double side;
    private double height;

    public Rhombus(double side, double height) {
        this.side = side;
        this.height = height;
    }

    public double getSide() {
        return this.side;
    }

    public double getHeight() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getField() {
        return side * height;
    }
}
