package chapter4;

/*
 *DO WHILE LOOP:
 * Write a program that allows a user to enter two numbers,
 * and then sums up the two numbers. The user should be able to
 * repeat this action until they indicate they are done.
 */

import java.util.Scanner;

public class AddNumbers {
    public static void main(String arg[]){

        Scanner scanner = new Scanner(System.in);

        boolean again;
        do{
            //Prompt the user to add the first number.
            System.out.println("Enter the first number:");
            double num1 = scanner.nextDouble();

            //Prompt the user to add the second number.
            System.out.println("Enter the second number:");
            double num2 = scanner.nextDouble();

            //Make the calculation and print the result.
            double sum = num1 + num2;
            System.out.println("The sum of " + num1 + " " + num2 + " is " + sum + ".");

            //Ask the user if wants to make another calculation.
            System.out.println("Would you like make a new addition?");
            again = scanner.nextBoolean();

        } while(again);

        scanner.close();

    }
}
