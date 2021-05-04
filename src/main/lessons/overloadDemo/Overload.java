package main.lessons.overloadDemo;

public class Overload {
    public void ovlDemo() {
        System.out.println("Bez parametrów");
    }

    public void ovlDemo(int a) {
        System.out.println("Jeden parametr " + a);
    }

    public int ovlDemo(int a, int b) {
        System.out.println("Dwa parametry: " + a + " " + b);
        return a + b;
    }

    public double ovlDemo(double a, double b) {
        System.out.println("Dwa parametry typu double " + a + " " + b);
        return a+b;
    }
}
