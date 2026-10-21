package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeStuff {
    public static void main(String[] args) {
//        LocalDate localDate;

//        // ISO date, no formatter needed (it's the default)
//        String isoDateText = "2026-10-21";
//        localDate = LocalDate.parse(isoDateText);
//        System.out.println("Converted ISO " + isoDateText +" to LocalDate: " + localDate.getMonth() + " " + localDate.getDayOfMonth() + " " + localDate.getYear());

        // US format, we need a formatter

        int i = Integer.parseInt("3");

        DateTimeFormatter formatter;
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate myDate = LocalDate.parse("2026-10-26", formatter);
        System.out.println("Converted US  "  +" to LocalDate: " + myDate.getMonth() + " " + myDate.getDayOfMonth() + " " + myDate.getYear());
//
//        // EURO format also needs a formatter
//        String euroDate = "21/10/2026";
//        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        localDate = LocalDate.parse(euroDate, formatter);
//        System.out.println("Converted EURO " + euroDate +" to LocalDate: " + localDate.getMonth() + " " + localDate.getDayOfMonth() + " " + localDate.getYear());
    }
}
