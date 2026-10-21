package com.pluralsight;

public class BananaSplit {
    public static void main(String[] args) {
        String userInput;
        userInput = "";
        userInput = "  David Dykes  ";
        userInput.trim();

        String[] nameParts;
        nameParts = userInput.split(" ");

        String firstName = nameParts[0];
        System.out.println("first name: " + firstName);

        String middleName;
        if(nameParts.length == 3) {
//            middleName =
        }
    }
}
