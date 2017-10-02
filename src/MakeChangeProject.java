import java.util.Scanner;

/* In the cash register we will calculate the amount of change returned 
 * to a customer based on the purchase price and the amount tendered. 
 * We will also notify the attendant how many of each piece of currency 
 * ($20 ,$10 ,$5 ,$1, .25c, .10c, .05c, .01c) is needed to make the change 
 * for the customer. Change should be provided using the largest bill and 
 * coin denominations as possible. Denominations that are not used should 
 * not be displayed.*/

public class MakeChangeProject {

	private static int twenties, tens, fives, ones, quarters, dimes, nickles, pennies;

	public static void main(String[] args) {
		
		double price;
		double tender;
		double amountOwed;
		boolean exact = false;
		int billsOwed;
		int coinsOwed;

		// Prompt user for the price of the item
		Scanner kb = new Scanner(System.in);
		System.out.print("Price: ");
		price = kb.nextDouble();

		// ask user how much money was paid by the customer
		System.out.print("Tendered: ");
		tender = kb.nextDouble();

		// display an appropriate message if the customer provided too
		// little money or the exact amount
		do {
			if (price == tender) {
				System.out.println("The customer paid the exact amount.");
				exact = true;
			} else if (tender < price) {
				System.out.println("The customer still owes you $" + (float) (price - tender));
				// how much the customer owes and add it
				System.out.print("The customer gave you how much more?");
				tender = tender + kb.nextDouble();
			}
		} while (tender < price);

		// if the amount paid is more than the cost of the item,
		// display the number of bills and coins that should be
		// given to the customer.
		amountOwed = tender - price;
		if (!(exact)) {
			System.out.println("You owe the customer $" + (float) (amountOwed));
			billsOwed = (int) (amountOwed);
			float x = (float) ((amountOwed - billsOwed) * 100);
			coinsOwed = (int) (x);
			makeChange(billsOwed, coinsOwed);
			System.out.print("Twenties: " + twenties + "\nTens: " + tens + "\nFives: " + fives + "\nOnes: " + ones
					+ "\nQuarters: " + quarters + "\nDimes: " + dimes + "\nNickles: " + nickles + "\nPennies: "
					+ pennies);
		}
	}

	private static void makeChange(int due, int coins) {
		// this method will take the total amount of pennies and convert it into the the
		// different amounts of each currency to return.
		twenties = due / 20;
		due = due % 20;
		tens = due / 10;
		due = due % 10;
		fives = due / 5;
		due = due % 5;
		ones = due;
		quarters = coins / 25;
		coins = coins % 25;
		dimes = coins / 10;
		coins = coins % 10;
		nickles = coins / 5;
		coins = coins % 5;
		pennies = coins;

	}

}
