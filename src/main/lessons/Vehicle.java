package main.lessons;

public class Vehicle {
    int passengers;
    int fuelcap;
    double one_km;

//    konstruktor Vehicle z parametrami
    Vehicle(int p, int f, double o){
        passengers=p;
        fuelcap=f;
        one_km=o;
    }

    int range() {
        return (int) (fuelcap / one_km*100);
    }

    double fuelneeded(int km) {
        return (double) km/100 * one_km;
    }
}

class CompFuel {
    public static void main(String[] args) {
        Vehicle minivan= new Vehicle(7, 65, 9.1);
        Vehicle sportscar= new Vehicle(2,55,12.5);
        double liters;
        int dist= 252;

//        minivan.passengers= 7;
//        minivan.fuelcap= 65;
//        minivan.one_km= 9.1;
//
//        sportscar.passengers=2;
//        sportscar.fuelcap= 55;
//        sportscar.one_km= 12.5;

        liters= minivan.fuelneeded(dist);

        System.out.println("Aby przejechać " + dist + " kilometrów, minivan potrzebuje " +liters + " litrów paliwa");

        liters= sportscar.fuelneeded(dist);

        System.out.println("Aby przejechać " + dist + " kilometrów, auto sportowe potrzebuje " +liters + " litrów paliwa");

    }
}


