package day2;

import java.util.Scanner;

/**
 * Demonstrates the three common loop styles in Java by solving the same
 * "sum of numbers" problem with each one, to compare when each is the
 * right tool:
 *
 * - while loop: best when the number of iterations isn't known in advance
 *   (e.g. reading user input until a sentinel value is entered).
 * - for loop: best when the number of iterations is known, and the actual
 *   index value is needed for the loop's logic (e.g. tracking position,
 *   comparing neighboring elements).
 * - for-each loop: best when iterating over every element of a collection
 *   or array and the index itself isn't needed.
 */
public class Challenge_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // while loop: number of inputs is unknown ahead of time,
        // loop continues until the user enters a sentinel value (0)
        int sumFromWhileLoop = 0;
        while (true) {
            System.out.println("Enter a number (press 0 to quit):");
            int num = Integer.parseInt(scanner.nextLine());

            if (num == 0) {
                break;
            }
            sumFromWhileLoop += num;
        }
        System.out.println("Sum calculated by while loop: " + sumFromWhileLoop);

        int[] numbers = {2, 4, 6, 7, 89, 8, 3};

        // for loop: array size is known, and the index is used to access
        // each element by position
        int sumFromForLoop = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumFromForLoop += numbers[i];
        }
        System.out.println("Sum calculated by for loop: " + sumFromForLoop);

        // for-each loop: array size is known, but the index itself isn't
        // needed - only each value matters
        int sumFromForEachLoop = 0;
        for (int number : numbers) {
            sumFromForEachLoop += number;
        }
        System.out.println("Sum calculated by for-each loop: " + sumFromForEachLoop);
    }
}