package main.lessons.d20210525;

public class Uniques {
    public static void main(String[] args) {

        int[] array = {1, 1, 2, 3, 5, 6, 2, 4, 6};

        int[] uniques = getUniques(array);

    }

    private static int[] addToArray(int[] array, int integerToAdd) {
        int[] updatedArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            updatedArray[i] = array[i];
        }
        updatedArray[updatedArray.length - 1] = integerToAdd;
        return updatedArray;
    }

    private static boolean arrayContains(int[] array, int integer) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == integer) {
                return true;
            }
        }
        return false;
    }

    private static int[] getUniques(int[] array) {
        int[] uniques = new int[0];
        for (int currentInt : array) {
            int timesOccurred = 0;
            for (int otherInt : array) {
                if (currentInt == otherInt) {
                    timesOccurred++;
                }
            }
            if (timesOccurred == 1 && !arrayContains(uniques, currentInt)) {
                uniques = addToArray(uniques, currentInt);
            }
        }
        return uniques;
    }
}
