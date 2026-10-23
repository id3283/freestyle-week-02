package com.pluralsight;

public class INeedArrays {
    public static void main(String[] args) {
        String[] names = {"Afnan", "Behlul", "Emad"};

        for (int i = 0; i < names.length; i++) {
            String currentName = names[i];
            System.out.println(currentName);
        }

        System.out.println("---------------");
        int[] numbers = {5, 6, 7};

        for (int currentNumber : numbers) {
            System.out.print(currentNumber + " ");
        }
        System.out.println("\n");

    }

    public static void stringArrayExample() {
        String student1;
        student1 = "Tai";
        String student2 = "Samin";
        String student3 = "Yahir";
//        String[] students = {"Tai", "Samin", "Yahir"};
        String[] students = new String[3];
        students[0] = "Tai";

        System.out.println(students[0]);
    }

}
