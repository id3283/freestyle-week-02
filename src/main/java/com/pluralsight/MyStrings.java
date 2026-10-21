package com.pluralsight;

import java.util.Locale;

public class MyStrings {
    public static void main(String[] args) {

//        String formattedNumber = String.format("%.2f", 3.1415);
//        System.out.println(formattedNumber);

        String name = "   yahir"; // we want: "YAHIR"
        System.out.println("original string: " + name);

        name = name.trim();
        name = name.toUpperCase();

        if (name.startsWith("YA")) {
            System.out.println("starts with YA");
        }

        System.out.println("modified string: " + name);
    }

    public static int doNothing() {
        return 55;
    }

}
