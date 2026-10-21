package com.pluralsight;

public class CharacterAt {
    public static void main(String[] args) {

        String startString = "Nate's brain melt";

        String name = startString.substring(0, 4);
        System.out.println(name);

        String brainMelt = startString.substring(7);
        System.out.println(brainMelt);

    }
}
