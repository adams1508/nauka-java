package main.lessons.d20210608;

public class SumDemo {
    public static void main(String[] args){

        SumIt siObj= new SumIt();

        int total= siObj.sum(1,2,3);
        System.out.println("Suma wynosi: "+ total);

        total= siObj.sum(1,2,3,4,5);
        System.out.println("Suma wynosi: " + total);
    }
}
