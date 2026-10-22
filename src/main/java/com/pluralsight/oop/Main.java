package com.pluralsight.oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Person pDawg = new Person();

        // user enters Alexis and 23
        pDawg.setName("Alexis");
        pDawg.setAge(23);

        System.out.println("here's both: " + pDawg.getName() + " " + pDawg.getAge());
    }

}
