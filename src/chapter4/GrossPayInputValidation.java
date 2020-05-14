package chapter4;

/*
 * WHILE LOOP
 *
 * Each store employee makes $15 an hour. Write a program that allows a manager
 * to enter the number of weekly hours worked for each employee and calculate their pay.
 * Do not allow overtime.
 */

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String arg[]){

        //Initialize the values we know.
        int rate = 15;
        int maxHours = 40;

        //Get values we don't know.
        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        //Validate input.
        while(hoursWorked > maxHours){
            System.out.println("Invalid entry. Yours hours must be between 1 and 40. Try again.");
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();

        //Make the calculation and inform it.
        System.out.println("Gross pay: $" + (rate * hoursWorked) + ".");
    }
}
