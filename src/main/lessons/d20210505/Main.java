package main.lessons.d20210505;

public class Main {
    public static void main(String[] args) {

        PodR6Z3_Stack stack=new PodR6Z3_Stack();
        stack.push('k');
        System.out.println(stack.getArray());

        stack.push('y');
        stack.push('l');
        stack.push('q');
        System.out.println(stack.getArray());

        stack.pop();
        stack.pop();
        System.out.println(stack.getArray());
    }
}
