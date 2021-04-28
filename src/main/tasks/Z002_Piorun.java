package main.tasks;

public class Z002_Piorun {
    public static void main(String[] args) {
//    jak daleko jebnął piorun? prędkość dźwięku wynosi 330m/s, piorun jebnął 5,5 s temu
        int soundSpeed = 330;
        double time = 5.5;
        double distance = soundSpeed * time;
        System.out.println("Piorun jebnal " + distance + " metrow od nas.");
        if (distance > 1500) {
            System.out.println("to w chuj daleko");
        }

    }
}
