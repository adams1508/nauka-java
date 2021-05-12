package main.lessons.d20210512;

public class UniqueInt {
    int[] uniques = new int[0];
    int[] duplicates = new int[0];

    public UniqueInt() {
    }

    public void setDuplicates(int[] array) {
        if (array.length <= 1) {
            return;
        }

        int[] newDuplicates = new int[0];
        for (int currentNum : array) {
//                if (currentNum ==
        }


        // 1. jezeli przekazany array jest pusty
        //      to konczymy metode
        // 2. else {
        //      robimy pusty array, np. o nazwie newDuplicates, do ktorego bedziemy wsadzac ewentualne duplikaty
        //     robimy for-each na arrayu
        //          jezeli znaleziono duplikat
        //          dodajemy go do newDuplicates
        //              TODO: jak dodac element do arraya?
        //      konczymy for-eacha
        //  this.duplicates = newDuplicates

        // 1. jezeli przek
        // 2. sprawdzam czy któryś z elementów się powtarza
        // 3. pozostawiam tylko duplikaty
        // 4. unikaty zamieniam na zera
        // 5. usuwam zera z tablicy i ją ucinam
//            jeżeli znajdę duplikat to trzeba powiększyć obecną tablicę duplikatów o 1
    }

//    public int[] getUnique(int[] array) {
//        int[] newArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            newArray[i] = array[i];
//            uniques = duplicates = newArray[0];
//            if (newArray[i] != uniques) {
//                uniques = newArray[i];
//            }
//        }
//        return newArray;
//    }

    public static int[] findDuplicates(int[] array) {
        if (array.length == 0) {
            return new int[0];
        }

        // 1. stworzyc pusta tablice do ktorej bedziem dodawac
        // 2. przeiterowac po kazdym elemencie tablicy
        // 3. jezeli wystepuje wiecej niz raz to go dodac

        int[] duplicatesArray = new int[0];

        for (int currentInt : array) {
            int occurencies = 0; // liczymy ilosc wystapien danego integera w arrayu
            for (int secondInt : array) { // przechodzimy po raz kolejny po tym samym arrayu
                if (secondInt == currentInt) {
                    occurencies++;
                }
                if (occurencies > 1) {
                    // stworzyc nowego arraya
                    // przekopiowac wartosci duplicate array + jedno miejsce
                    // do ostatniego miejsca wsadzic currentInta

                    int[] tempArray = new int[duplicatesArray.length + 1];
                    for (int i = 0; i < duplicatesArray.length; i++) {
                        tempArray[i] = duplicatesArray[i];
                    }
                    tempArray[tempArray.length - 1] = currentInt;
                    duplicatesArray = tempArray;
                }
                if (occurencies < 2) { // sprawdzamy, czy array wystapil mniej niz dwa razy
                    if (secondInt == currentInt) { // jezeli tak, to czy znowu sie powtorzyl
                        occurencies++;
                    }
                }
            }
        }

        return duplicatesArray;
    }
}
