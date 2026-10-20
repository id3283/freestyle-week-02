package com.pluralsight;

public class Returning {

    public static void main(String[] args) {

        int j = Returning.myMax(7,2);
//        String result = greet("nate");
//        System.out.println(result);
    }

    public static int myMax(int firstNumber, int secondNumber) {
        if(firstNumber > secondNumber) {
            return firstNumber;
        }
        else {
            return secondNumber;
        }
    }

    public static String greet(String name) {
        String greeting = "hi " + name;
        return greeting;
    }


}
