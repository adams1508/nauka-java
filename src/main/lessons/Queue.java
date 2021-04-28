package main.lessons;

public class Queue {
    char q[];
    int putloc, getloc;

    Queue(int size){
        q=new char[size + 1];
        putloc= getloc=0;
    }

    void put(char ch){
        if (putloc==q.length-1){
            System.out.print(" -- Kolejka pełna.");
            return;
        }

        putloc++;
        q[putloc]= ch;
    }

    char get() {
        if (getloc==putloc){
            System.out.print(" --Kolejka pusta.");
            return (char) 0;
        }

        getloc++;
        return q[getloc];
    }
}
