package main.lessons.quicksortDemo;

public class QsDemo {
    public static void main(String[] args){
        char[] array={'r','t','w','a','y','b','m','z','l'};
        int i;

        System.out.print("Tablica przed posortowaniem: ");
        for (i=0; i< array.length; i++){
            System.out.print(array[i]+ " ");

        }

        System.out.println();
        Quicksort.qsort(array);

        System.out.print("Tablica posortowana: ");
        for (i=0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
