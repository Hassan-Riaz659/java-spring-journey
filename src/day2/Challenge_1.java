package day2;

import java.util.Scanner;

/**
 * Reads three numbers from user input, calculates their average as a double
 * (avoiding integer division truncation via casting), and demonstrates how
 * the '+' operator behaves differently for string concatenation versus
 * numeric addition depending on operand order.
 */
public class Challenge_1 {

    public static void main(String[] args)
    {

          System.out.println("Enter three numbers:");
          Scanner scanner = new Scanner(System.in);
          int num1  = Integer.parseInt(scanner.nextLine());
          int num2  = Integer.parseInt(scanner.nextLine());
          int num3  = Integer.parseInt(scanner.nextLine());

        // Cast to double before dividing to avoid integer division truncation
          double average = (double) (num1 + num2 + num3) / 3;
          System.out.println("Average:" + average);
          System.out.println("Sum:" + num1 + num2 + num3);
          System.out.println("Sum:" + (num1 + num2 + num3));
    }

}

