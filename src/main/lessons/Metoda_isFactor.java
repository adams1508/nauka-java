package main.lessons;

class Factor {
//    metoda isFactor, z dwoma parametrami (mogą mieć różne typy), wyświetli tylko true
    boolean isFactor (int a, int b) {
        if ((b%a)==0) return true;
        else return false;
    }
}
class isFact {
    public static void main(String[] args){
        Factor x= new Factor();

        if (x.isFactor(2,20)) System.out.println("2 jest dzielnikiem 20.");

        if (x.isFactor(3,20)) System.out.println("3 jest dzielnikiem 20");
//        powyższe jest false więc się nie wyświetli

        if (x.isFactor(4,20)) System.out.println("4 jest dzielnikiem 20.");

        if (x.isFactor(5,20)) System.out.println("5 jest dzielnikiem 20");
    }
}
