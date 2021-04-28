package main.tasks;

import java.util.Locale;

public class Z013_Osoba {
    public static void main (String[] args) {
        String surname= "kowalska";
        String name= "maria";

        System.out.print("Nazwisko: ");
        System.out.println(surname.substring(0,1).toUpperCase() + surname.substring(1).toLowerCase());
        System.out.print("Imię: ");
        System.out.println(name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase());
        System.out.print("Nazwisko i imię: ");
        System.out.println(surname.toUpperCase() + " " + Character.toUpperCase(name.charAt(0)) + name.substring(1).toLowerCase());
        System.out.print("Inicjały: ");
        System.out.print(Character.toUpperCase(name.charAt(0)));
        System.out.println(Character.toUpperCase(surname.charAt(0)));
        System.out.print("Login: ");
        System.out.print(surname.substring(0,2).toUpperCase());
        System.out.println(name.substring(0,3).toLowerCase());


    }
}