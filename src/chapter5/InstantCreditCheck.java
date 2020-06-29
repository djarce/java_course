package chapter5;

import java.util.Scanner;

/*
 * VARIABLE SCOPE:
 * Write an 'instant credit check' program that approves
 * anyone who makes more than $25000 and has a credit score
 * of 700 or better. Reject all others.
 */
public class InstantCreditCheck {
    //Initialize what we know.
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = Scanner(System.in);

    public static void main(String [] args){

        //Get what we don't.
        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();

        //Check if the user is qualified.
        isUserQualified(creditScore, salary);

        //Notify the user.
    }

    public static double getSalary(){
        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();
        return salary;
    }

    public static int getCreditScore(){
        System.out.println("Enter your credit score:");
        int creditScore = scanner.nextInt();
        return creditScore;

    }

    public static boolean isUserQualified(int creditScore, double salary){
        if(creditScore >= requiredCreditScore && salary >= requiredSalary){
            return true;
        }else{
            return false;
        }
    }
}
