package com.pluralsight;

public class BreakDancing {

    public static void main(String[] args) {

        int day = 2;
        String description;

        switch(day) {
            case 1 -> {
                description = "Monday";
                System.out.println("Ughh.. freakin' Monday");
            }
            case 2 -> {
                description = "Tuesday";
            }
            case 3 -> {
                description = "Wednesday";
            }
            default -> {
                description = "unknown";
                System.out.println("uh... not an option.");
            }
        }

        System.out.println("The day is: " + description);
    }

}
