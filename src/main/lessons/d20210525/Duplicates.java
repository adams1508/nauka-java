package main.lessons.d20210525;

public class Duplicates {
    public static void main(String[] args) {

        int[] array = {1, 3, 2, 5, 7, 1, 2};

        array = addToArray(array, 9);

        int[] duplicates = getDuplicates(array);


    }

    private static int[] addToArray(int[] array, int integerToAdd) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = integerToAdd;
        return newArray;
    }

    private static boolean arrayContains(int[] array, int integer) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == integer) {
                return true;
            }
        }
        return false;
    }

    private static int[] getDuplicates(int[] array) {
        int[] duplicates = new int[0];
        for (int currentInt : array) {
            int timesOccurred = 0;
            for (int otherInt : array) {
                if (currentInt == otherInt) {
                    timesOccurred++;
                }
            }
            if (timesOccurred > 1 && !arrayContains(duplicates,currentInt)) {
                duplicates = addToArray(duplicates, currentInt);
            }
        }

        return duplicates;
    }
}
