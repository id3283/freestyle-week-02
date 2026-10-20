package com.pluralsight;

public class CarRental {
    public static void main(String[] args) {
        String pickupDate = "Tuesday";
        int rentalDays = 2;
        boolean tollTag = true; // extra 3.95/day
        int age = 58;

        double rentalCharge = 29.99 * rentalDays;

        if (age < 25) {
            rentalCharge = rentalCharge + (rentalCharge * .30);
        }

        if(tollTag) {
            rentalCharge = rentalCharge + (rentalDays * 3.95);
        }

        System.out.println("age: " + age);
        System.out.println("rental charge: " + rentalCharge);

    }
}
