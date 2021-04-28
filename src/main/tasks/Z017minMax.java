package main.tasks;

public class Z017minMax {

    public static double getMin(double[] array){

        double min;

        if (array.length==0){
            return 0;
        } else {
            min= array[0];
        }

        for (double currentNum: array){
            if (currentNum< min){
                min= currentNum;
            }
        }
        return min;
    }

    public static double getMax(double[] array){

        double max;

        if (array.length==0){
            return 0;
        } else {
            max=array[0];
        }

        for (double currentNum: array){
            if (currentNum>max){
                max= currentNum;
            }
        }
        return max;
    }

    public static void main(String[] args){

        double min;
        double max;

        double[] array= {2.2, 1.4, 4.3, 5.7, 4d, 7d, 1., 9.4};

        min=getMin(array);
        max=getMax(array);
        System.out.println("Min  wynosi: " + min);
        System.out.println("Max wynosi: " + max);
    }
}

