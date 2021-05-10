package main.lessons.staticMeth;

public class SDemo2 {
    public static void main(String[] args){
        System.out.println("Wartość składowej val: " + StaticMeth.val);
        System.out.println("StaticMeth.valDiv2: "+ StaticMeth.valDiv2());
        System.out.println();

        StaticMeth.val= 4;
        System.out.println("Wartość składowej val: " + StaticMeth.val);
        System.out.println("StaticMeth.valDiv2: "+ StaticMeth.valDiv2());
    }
}
