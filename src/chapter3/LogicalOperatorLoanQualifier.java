package chapter3;

import java.util.Scanner;

/*
 *LOGICAL OPERATORS:
 *To qualify for a loan, a person must make at least $30,000 and
 * have been working at their current job for at least 2 years.
 */
public class LogicalOperatorLoanQualifier {
    public static void main(String arg[]){

        //Initialize what we know.
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        //Get what we don't.
        System.out.println("Enter your salary:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer:");
        double years = scanner.nextDouble();

        scanner.close();

        //Make and inform decision.
        if(salary >= requiredSalary && years >= requiredYearsEmployed){
            System.out.println("Congrats! You qualify for the loan.");
        }
        else{
            System.out.println("Sorry, you don't qualify for the loan. Please check the conditions.");
        }

    }

}
