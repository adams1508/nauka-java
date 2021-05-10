package main.lessons.d20210505;

public class PodR6Z3_Stack {
    char[] array = new char[1];


    public PodR6Z3_Stack() {
    }

    public void pop() {
        char[] newArray = new char[array.length - 1];
        for (int i = 0; i < array.length - 1; i++) {
            newArray[i] = array[i];
        }
        this.array = newArray;
    }

    public void push(char ch) {
        char[] newArray = new char[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = ch;
        this.array = newArray;
    }

    public char[] getArray(){
        return this.array;
    }
}
