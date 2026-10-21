package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Prompt for First Name
        System.out.print("Please enter your name\nFirst name: ");
        String firstName = scanner.nextLine();
        firstName = firstName.trim();

        // 2. Prompt for Middle Name (Optional)
        System.out.print("Middle name: ");
        String middleName = scanner.nextLine().trim();

        // 3. Prompt for Last Name
        System.out.print("Last name: ");
        String lastName = scanner.nextLine().trim();

        // 4. Prompt for Suffix (Optional)
        System.out.print("Suffix: ");
        String suffix = scanner.nextLine().trim();

        // 5. Construct the Full Name
        // Start with First Name
        String fullName = firstName;

        // Add Middle Name if it is not empty
        boolean hasMiddleName = !middleName.isEmpty();
        if (hasMiddleName) {
            fullName = fullName +  " " + middleName;
        }

        // Add Last Name
        fullName += " " + lastName;

        // Add Suffix if it is not empty
        // Requirement: If suffix is present, include a comma before it [1]
        if (!suffix.isEmpty()) {
            fullName += ", " + suffix;
        }

        // 6. Display the Result
        System.out.println("Full name: " + fullName);
    }
}
