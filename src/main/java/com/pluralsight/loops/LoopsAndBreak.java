package com.pluralsight.loops;

public class LoopsAndBreak {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                System.out.println("now i'm going to restart loop");
                continue;
            }
            System.out.println(i);
        }

        System.out.println("loop done");
    }
}
