package main.kwadraty;

public class Trapeze {

    private double basisA;
    private double basisB;
    private double height;

    public Trapeze(double basisA, double basisB, double height) {
        this.basisA = basisA;
        this.basisB = basisB;
        this.height = height;
    }

    public double getBasisA() {
        return this.basisA;
    }

    public double getBasisB() {
        return this.basisB;
    }

    public double getHeight() {
        return this.height;
    }

    public void setBasisA(double basisA) {
        this.basisA = basisA;
    }

    public void setBasisB(double basisB) {
        this.basisB = basisB;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getField() {
        return 0.5 * (basisA + basisB) * height;
    }
}
