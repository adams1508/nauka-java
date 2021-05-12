package main.lessons.nestedClassDemo;

import java.util.Arrays;

public class Outer {
    int[] nums;

    public Outer(int[] n) {
        nums = n;
    }

    public void analyze() {
        Inner inOb = new Inner();
        System.out.println("Min równa się: " + inOb.min());
        System.out.println("Max równa się: " + inOb.max());
        System.out.println("Srednia równa się: " + inOb.avg());
    }

    public class Inner {

        int min() {
            int m = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < m) {
                    m = nums[i];
                }
            }
            return m;
        }

        int max() {
            int m = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > m) {
                    m = nums[i];
                }
            }
            return m;
        }

        int avg() {
            int a = 0;
            for (int i = 0; i < nums.length; i++) {
                a += nums[i];
            }
            return a / nums.length;
        }
    }
}
