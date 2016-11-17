// Yedoh Kang
// Accelerated -- LAB #1
// 10/1/16

import java.util.Scanner;

public class CashierChange {
    
    //create method to print change for pennies received and due

    public static void printChange (int received, int due) {
				
		// constants
		final int PENNIES_PER_DOLLAR = 100;
		final int NICKELS_PER_DOLLAR = 20;
		final int DIMES_PER_DOLLAR = 10;
		final int QUARTERS_PER_DOLLAR = 4;
		final int DOLLARS_PER_DOLLAR = 1;
		
		// variables
		int pennies = 0;
		int nickels = 0;
		int dimes = 0;
		int quarters = 0;
		int dollars = 0;
		int totalamount = received - due;
	
		// compute change due
		
		// dollars
		if (totalamount / 100 > 0) {
			int amountdollars = totalamount / 100;
			dollars += amountdollars;
			totalamount -= 100 * dollars;
		}
		else {
			dollars = 0;
		}
		
		// quarters
		if (totalamount / 25 > 0) {
			int amountquarters = totalamount / 25;
			quarters += amountquarters;
			totalamount -= 25 * quarters;
		}
		else {
			quarters = 0;
		}
		
		// dimes
		if (totalamount / 10 > 0) {
			int amountdimes = totalamount / 10;
			dimes += amountdimes;
			totalamount -= 10 * dimes;
		}
		else {
			dimes = 0;
		}
		
		// nickels
		if (totalamount / 5 > 0) {
			int amountnickels = totalamount / 5;
			nickels += amountnickels;
			totalamount -= 5 * nickels;
		}
		else {
			nickels = 0;
		}
		
		// pennies
		if (totalamount / 1 > 0) {
			int amountpennies = totalamount / 5;
			pennies += amountpennies;
			totalamount -= 5 * pennies;
		}
		else {
			pennies = 0;
		}

		//Print change due
		System.out.println("Dollars: " + dollars);
		System.out.println("Quarters: " + quarters);
		System.out.println("Dimes: " + dimes);
		System.out.println("Nickels: " + nickels);
		System.out.println("Pennies: " + pennies);
    }

    public static void main (String[] args){
		
		Scanner input = new Scanner (System.in);
		
		// use Scanner to get pennies due
		System.out.println("Enter amount due in pennies: ");
		int due = input.nextInt();
		//System.out.println(due);
		
		// use Scanner to get pennies received
        System.out.println("Enter amount received in pennies: ");
		int received = input.nextInt();
		//printChange(received);
		
		// Call printChange method
		if (due > received) {
			System.out.println("ERROR: Amount due cannot be greater than the amount received.");
		}
		else {
			printChange(received,due);
		}
    }
}
