import java.util.Scanner;

/* In the cash register we will calculate the amount of change returned 
 * to a customer based on the purchase price and the amount tendered. 
 * We will also notify the attendant how many of each piece of currency 
 * ($20 ,$10 ,$5 ,$1, .25c, .10c, .05c, .01c) is needed to make the change 
 * for the customer. Change should be provided using the largest bill and 
 * coin denominations as possible. Denominations that are not used should 
 * not be displayed.*/

// side note the way i'm thinking right now is that i'm going to convert total - paid = change
// i'm going to have separate methods for each denominations. so change will be checked against the 20s method 
//total is 20 user gets 50 from the customer therefore checkTwenties(50) will give back 2 twenties. 50 / 20 ==2.5 chop that off round down.
//50 mod 20 is going to be 10 there fore change will = 10 and i will check checkTens(10); which 10/10 = 1 and that will go to the tens variable.
// the the left overs

public class MakeChangeProject {

	private static double price;
	private static double paid;
	private static float totalChange;
	private static int twenties, tens, fives, ones, quarters, dimes, nickles, pennies;

	public static void main(String[] args) {

		// Prompt user for the price of the item
		Scanner kb = new Scanner(System.in);
		System.out.print("Price: ");
		price = kb.nextDouble();

		// ask user how much money was paid by the customer
		System.out.print("Paid: ");
		paid = kb.nextDouble();

		// display an appropriate message if the customer provided too
		// little money or the exact amount
		if (checkAmount(price, paid)) {
			System.out.println("The customer paid the exact amount.");
		} else {
			System.out.println("The customer did not give you enough money.");
		}

		// if the amount paid is more than the cost of the item,
		// display the number of bills and coins that should be
		// given to the customer.

		makeChange(price, paid);
		System.out.println("The customer's change is: " + totalChange);
		System.out.print("Twenties: " + twenties + "\nTens: " + tens + "\nFives: " + fives + "\nOnes: " + ones
				+ "\nQuarters: " + quarters + "\nDimes: " + dimes + "\nNickles: " + nickles + "\nPennies: " + pennies);

	}

	private static void makeChange(double price2, double paid2) {
		//this method will tell the user how much change to give back
	}

	private static boolean checkAmount(double price2, double tendered2) {
		// this method is meant to see how much the customer paid versus the total price
		//if they give exact change return true if they did not give enough money return false
		if (price2 == tendered2) {
			return true;
		} else {
			return false;
		}
	}

}
