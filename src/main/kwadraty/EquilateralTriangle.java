package main.kwadraty;

//trójkąt równoboczny
public class EquilateralTriangle {

    private double sideLength;

    public EquilateralTriangle(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return this.sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getHeight(){
        return this.sideLength*Math.sqrt(3)/2;
    }

    public double getField() {
        return (sideLength * getHeight()) / 2;
    }

}
