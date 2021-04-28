package main.obiekty;

public class EquilateralTriangle {

    private double sideLength;

    public EquilateralTriangle(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return this.sideLength;
    }

    void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getField() {
        return sideLength * getHeight() / 2;
    }

    private double getHeight() {
        return this.sideLength * Math.sqrt(3) / 2;
    }
}
