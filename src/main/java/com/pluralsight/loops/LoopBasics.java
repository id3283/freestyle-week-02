package com.pluralsight.loops;

public class LoopBasics {

    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        do {
            sum += i;
            i++;
        } while (i <= 3);
//        System.out.println("Sum = " + sum);

        i = 0;
        while (i <= 3) {
            System.out.println(i);
            i++;
        }
        System.out.println();

        for (int j = 0; j <= 4; j++) {
            System.out.println(j);
        }

    }
}
