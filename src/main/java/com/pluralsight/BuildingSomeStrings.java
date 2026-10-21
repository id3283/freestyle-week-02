package com.pluralsight;

public class BuildingSomeStrings {

    public static void main(String[] args) {
        String title = "Mr.";
        String fullName = title;
        String firstName = " Dave  ";
        String lastName = "Dykes";
        boolean late = true;
        Boolean overdue = true;  // 🤯

        fullName = fullName + " " + firstName;
        fullName = fullName + " " + lastName;
        StringBuilder stringBuilder = new StringBuilder();

        firstName = firstName.trim();

        stringBuilder.append(title + " ");
        stringBuilder.append(firstName + " ");
        stringBuilder.append(lastName + " ");

        String builtString = stringBuilder.toString();

        System.out.println(builtString);
    }
}
