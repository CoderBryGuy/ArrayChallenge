package com.company;

import java.util.Scanner;


public class Main {

    static private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here

        int[] array = getIntegers(5);
        reverse(array);

        printArray(array);

        //int[] newArray = sortIntegers(array);
        //printArray(newArray);
    }

    private static void reverse(int[] array) {
        int saver;

        for (int i = 0; i < array.length / 2; i++) {
            saver = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = saver;
        }

    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Slot #" + i + " contains :" + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {

        int saver = 0;
        //System.out.println("is this running");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0 + i; j < array.length; j++) {
                // System.out.println("is this running");
                if (array[i] < array[j]) {
                    saver = array[j];
                    array[j] = array[i];
                    array[i] = saver;
                }
            }
        }
        return array;
    }


    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values. \r");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return values;
    }
}
