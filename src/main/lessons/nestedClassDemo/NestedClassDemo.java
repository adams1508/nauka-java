package main.lessons.nestedClassDemo;

public class NestedClassDemo {
    public static void main(String[] args){
        int[] x={3,5,6,1,8,4,0,8};
        Outer outOb=new Outer(x);

        outOb.analyze();

    }
}
