package main.tasks;

public class Z015_Operatory_Logiczne {
    public static void main(String[] args) {

        boolean[] bool = {false, true};

        System.out.println("Operator negacji (NOT) - !");
        System.out.println(" p\t !p");
        for (boolean p : bool)
            System.out.println(p + "\t" + !p);
        System.out.println();

        System.out.println("Operator koniunkcji (AND) - & lub &&");
        System.out.println(" p\t q\tp & q");
        for (boolean p : bool) {
            for (boolean q : bool)
                System.out.println(p + "\t" + q + "\t" + (p & q));
            System.out.println();
        }
        System.out.println("Operator alternatywy (OR)- | lub ||");
        System.out.println(" p\t q\tp | q");
        for (boolean p : bool) {
            for (boolean q : bool)
                System.out.println(p + "\t" + q + "\t" + (p | q));
            System.out.println();
        }
        System.out.println("Operator wykluczający (XOR)- ^ lub ^^");
        System.out.println(" p\t q\tp ^ q");
        for (boolean p : bool) {
            for (boolean q : bool)
                System.out.println(p + "\t" + q + "\t" + (p ^ q));
            System.out.println();
        }
        System.out.println("Operator nie jest równe- !=");
        System.out.println(" p\t q\tp !=q");
        for (boolean p : bool) {
            for (boolean q : bool)
                System.out.println(p + "\t" + q + "\t" + (p != q));
            System.out.println();
        }
        System.out.println("Prawo wyłączonego środka- p || !p ");
        System.out.println(" p\t !p\tp || !p");
        for (boolean p : bool)
            System.out.println(p + "\t" + !p + "\t" + (p || !p));
        System.out.println();

        System.out.println("Prawo niesprzeczności- !(p && !p)");
        System.out.println(" p\t !p\tp && !p\t!(p && !p)");
        for (boolean p:bool)
            System.out.println(p + "\t" + !p + "\t" + (p && !p) + "\t" + !(p && !p));
        System.out.println();

        System.out.println("Prawo podwójnego przeczenia- !(!p)==p");
        System.out.println("p\t !p\t!(!p)\t!(!p)==p");
        for (boolean p:bool)
            System.out.println(p + "\t" + !p + "\t" + !(!p) + "\t" + (!(!p)==p));
        System.out.println();
    }
}
