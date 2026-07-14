package day2;

import java.util.Scanner;

/**
 * Demonstrates that Java is pass-by-value for primitive types: when a
 * primitive is passed into a method, the method receives a copy of the
 * value. Reassigning the parameter inside the method only affects that
 * local copy - the caller's original variable is left unchanged.
 */
public class Challenge_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Before: " + number1);
        changeValue(number1);
        System.out.println("After: " + number1);
    }

    /**
     * Reassigns the local parameter to demonstrate that this change does
     * not propagate back to the caller's variable, since primitives are
     * passed by value (a copy), not by reference.
     */
    public static void changeValue(int number) {
        number = number * number;
        System.out.println("Inside method, number is now: " + number);
    }
}