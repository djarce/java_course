package chapter3;

/*
 *OBJECTIVE: Enough change to equal exactly $1!
 *
 * The program has to ask the user to enter the quantities for the following coin:
 * pennies, nickels, dimes and quarters. The program will count up the value of all the change.
 * If it's exactly $1, they win :)
 * If it's more than $1, tell them by how much they went over.
 * If it's less than $1, tell them by how much they went under.
 */

import java.util.Scanner;

public class ChangeForADollarGame {
    public static void main(String arg[]){

        //Welcoming. Explains the game.
        System.out.println("Welcome to 'Change for a Dollar! Your goal is to get exactly $1.");

        //Initializes the values of the coins.
        double penny = 0.01;
        double nickel = 0.05;
        double dime = 0.10;
        double quarter = 0.25;
        double dollar = 1;

        //Gets the quantities for each coin from the user.
        System.out.println("How many pennies would you like?");
        Scanner scanner = new Scanner(System.in);
        int pennies = scanner.nextInt();

        System.out.println("How many nickels would you like?");
        int nickels = scanner.nextInt();

        System.out.println("How many dimes would you like?");
        int dimes = scanner.nextInt();

        System.out.println("How many quarters would you like?");
        int quarters = scanner.nextInt();

        //Sum up the coins.
        double pen = penny * pennies;
        double nic = nickel * nickels;
        double dim = dime * dimes;
        double qua = quarter * quarters;

        double guess = pen + nic + dim + qua;

        //Checks if the user won. If not, tells the user why.
        if(guess == dollar){
            System.out.println("You won! You got exactly $1.");
        }
        else if(guess < dollar){
           System.out.println("Sorry, you were short by " + String.format("%.2f", (dollar - guess)) + ".");
        }
        else{
            System.out.println("Sorry, you went up by " + String.format("%.2f", (guess - dollar)) + ".");
        }

    }
}
