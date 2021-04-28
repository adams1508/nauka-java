package main.lessons.d20210428;

public class Main {
    public static void main(String[] args) {
        Country france = new Country("France", 62_240_000, 643_801.0);
        Country greatBritain = new Country("Great Britain", 59_500_000, 242_495.0);
        Country germany = new Country("Germany", 81_540_000, 357_386.0);
        Country italy = new Country("Italy", 57_130_000, 301_340.0);
        Country poland = new Country("Poland", 38_190_000, 312_679.0);

        Country[] euCountries = {france, greatBritain, germany, italy};

        Country[] euCountries2004 = new Country[euCountries.length + 1];
        for (int i = 0; i < euCountries.length; i++) {
            euCountries2004[i] = euCountries[i];
        }

        euCountries2004[euCountries2004.length - 1] = poland;

        Country[] countries = {france, germany};
        countries = addCountry(countries, poland);
        System.out.println(countries[0].getName());
        System.out.println(countries[1].getName());
        System.out.println(countries[2].getName());

        removeCountry(countries, germany);
        System.err.println(countries[0]);
        System.err.println(countries[1]);
        System.err.println(countries[2]);

    }

    public static Country[] addCountry(Country[] countries, Country countryToAdd) {

        Country[] newCountries = new Country[countries.length + 1];
        for (int i = 0; i < countries.length; i++) {
            newCountries[i] = countries[i];
        }

        newCountries[newCountries.length - 1] = countryToAdd;
        return newCountries;
    }

    public static void removeCountry(Country[] countries, Country countryToRemove) {

        for (int i = 0; i < countries.length; i++) {
            if (countries[i].getName().equals(countryToRemove.getName())) {
                countries[i] = null;
            }
        }
    }
}
