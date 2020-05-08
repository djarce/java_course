package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String arg[]){

        // Ask the user for a season of the year.
        System.out.println("Which is your favourite season?");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();

        // Ask the user to give a whole number.
        System.out.println("Give me a number.");
        String number = scanner.nextLine();

        // Ask the user to give you an adjective.
        System.out.println("Give me an adjective.");
        String adjective = scanner.nextLine();
        scanner.close();

        /*
        Use the input to complete and print this sentence: "On a [adjective] [season of the year] day, I drink
        a minimum of [whole number] cups of coffee."
        */
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee.");
    }
}
