package main.lessons.overloadDemo;

public class OverloadDemo {
    public static void main(String[] args){
        Overload ob= new Overload();
        int resI;
        double resD;

        ob.ovlDemo();
        System.out.println();

        ob.ovlDemo(2);
        System.out.println();

        resI=ob.ovlDemo(2,3);
        System.out.println("Wynik wywołania ob.ovlDemo(2,3): " + resI);
        System.out.println();

        resD=ob.ovlDemo(1.1, 2.2);
        System.out.println("Wynik wywołania ob.ovlDemo(1.1, 2.2): " + resD);
    }
}
