package main.lessons.typeConv;

public class TypeConv {
    public static void main(String[] args){
        Overload2 ob= new Overload2();

        int i=10;
        double d= 10.1;

        byte b= 99;
        short s= 10;
        float f= 11.5F;

    //program sam wybierze której metody przeciążonej wybrać na podstawie typu, do którego zostanie wykonana automatyczna konwersja
        ob.f(i);
        ob.f(d);
        ob.f(b);
        ob.f(s);
        ob.f(f);
    }
}