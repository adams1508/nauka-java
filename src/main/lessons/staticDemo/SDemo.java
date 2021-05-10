package main.lessons.staticDemo;

public class SDemo {
    public static void main(String[] args) {
        StaticDemo ob1 = new StaticDemo();
        StaticDemo ob2 = new StaticDemo();

        ob1.x = 10;
        ob2.x = 20;
        System.out.println("Oczywiśćie składowe ob.1.x oraz ob2.x są niezależne.");
        System.out.println("ob1.x: " + ob1.x + "\nob2.x: " + ob2.x);
        System.out.println();

        System.out.println("Zmienna y jest zadeklarowana jako static i tym samym współdzielona.");
        StaticDemo.y = 19;
        System.out.println("Nadaje StaticDemo.y wartość: 19.");

        System.out.println("ob1.sum: "+ ob1.sum());
        System.out.println("ob2.sum: "+ ob2.sum());
        System.out.println();

        StaticDemo.y= 100;
        System.out.println("Nadaję StaticDemo.y wartość: 100.");

        System.out.println("ob1.sum: " + ob1.sum());
        System.out.println("ob2.sum: " + ob2.sum());
        System.out.println();


    }
}
