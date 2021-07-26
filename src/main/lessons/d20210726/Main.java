package main.lessons.d20210726;

public class Main {
    public static void main(String[] args) {
        Men boyOne = new Men("Antek", 176, false);
        Men boyTwo = new Men("Chris", 190, true);


        System.out.println(boyOne.getHeight());
        System.out.println(boyTwo.getName());

    }

}

