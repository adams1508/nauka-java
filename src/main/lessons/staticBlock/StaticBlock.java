package main.lessons.staticBlock;

public class StaticBlock {
    static double root0f2;
    static double root0f3;

    static {
        System.out.println("Wewnątrz bloku static");
        root0f2 = Math.sqrt(2.0);
        root0f3 = Math.sqrt(3.0);
    }

    public StaticBlock(String mgs){
        System.out.println(mgs);
    }
}
