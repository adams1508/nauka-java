package main.tasks;

public class Z014_ArgsWspak {
    public static void main(String[] args) {

        for (String argument : args) {

            for (int i = args.length - 1; i >= 0; i--)
                System.out.print(argument.charAt(i));
            System.out.println();

        }
    }
}
