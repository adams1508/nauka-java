package main.lessons.typeConv;

public class Overload2 {
    public void f(int x) {
        System.out.println("Wewnątrz f(int): " + x);
    }

    public void f(double x) {
        System.out.println("Wewnątrz f(double): " + x);
    }
}
