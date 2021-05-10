package main.lessons.staticBlock;

public class SDemo3 {
    public static void main(String[] args){
        StaticBlock ob= new StaticBlock("Wewnątrz konstruktora");

        System.out.println("\nPierwiastek kwadratowy z 2: " + StaticBlock.root0f2);
        System.out.println("\nPierwiastek kwadratowy z 3: " + StaticBlock.root0f3);
    }
}
