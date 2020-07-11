package chapter5;

import java.util.Scanner;

/*
 * PHONE BILL CALCULATOR:
 * Calculate the final total of someone's cellphone bill.
 * Allow the operator to input the plan fee and the number of overage minutes.
 * Charge the user 0.25 for every minute they were over their plan, and 15% tax on
 * the subtotal.
 * Create separate methods to calculate the tax, overage fees and final total.
 * Print the itemized bill.
 */
public class PhoneBillCalculator {
    // Declare overage minute fee and tax percentage
    static double minuteCost = 0.25;
    static double rate = 0.15;
    static Scanner scanner= new Scanner(System.in);



    public static void main(String [] args){
// Ask for the plan fee and the overage minutes
        double base = getBase();
        double overage = getOverage();
        scanner.close();

// Apply tax to the subtotal
        double overageCost = overage*minuteCost;
        double subtotal = base + overageCost;
        double tax = subtotal*rate;

//Calculate bill and print it
        calculateBill(base, overageCost, tax);
    }

    public static double getBase(){
        System.out.println("Enter base cost of the plan:");
        double base = scanner.nextDouble();
        return base;
    }

    public static double getOverage(){
        System.out.println("Enter overage minutes:");
        double overage = scanner.nextDouble();
        return overage;
    }

    public static void calculateBill(double base, double overageCost, double tax){
        double total = base + overageCost + tax;

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + String.format("%.2f", base));
        System.out.println("Overage: $" + String.format("%.2f", overageCost));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", total));
    }

}
