package main.lessons;

class ChkNum {

//    metoda isEven z jedym parametrem "int x", wyświetla tylko true
    boolean isEven(int x) {
        if ((x % 2) == 0) return true;
        else return false;
    }
}

class ParmDemo {
    public static void main(String[] args) {
        ChkNum e = new ChkNum();

        if (e.isEven(10)) System.out.println("10 jest parzyste.");

        if (e.isEven(9)) System.out.println("9 jest nieparzyste");
//        powyższe false

        if (e.isEven(8)) System.out.println("8 jest parzyste");

        if (e.isEven(7)) System.out.println("7 jest nieparzyste");
//        powyższe false

    }
}

