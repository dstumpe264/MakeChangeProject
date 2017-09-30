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
	private static int penniesDue;
	private static double amountOwed;
	private static boolean owe;


	public static void main(String[] args) {

		// Prompt user for the price of the item
		Scanner kb = new Scanner(System.in);
		System.out.print("Price: ");
		price = kb.nextDouble();

		// ask user how much money was paid by the customer
		System.out.print("Paid: ");
		paid = kb.nextDouble();
		amountOwed = paid - price;

		// display an appropriate message if the customer provided too
		// little money or the exact amount
		do {
			if (price == paid) {
				System.out.println("The customer paid the exact amount.");
			} else if(paid < price){
				System.out.println("The customer still owes you: ");
			} else {
				System.out.println("You owe the customer " + amountOwed);
				owe = true;
			}
		} while (paid < price);

		// if the amount paid is more than the cost of the item,
		// display the number of bills and coins that should be
		// given to the customer.
		
		if (owe) {
			penniesDue = convert(amountOwed);
			makeChange(penniesDue);
			System.out.println("The customer's change is: " + totalChange);
			System.out.print("Twenties: " + twenties + "\nTens: " + tens + "\nFives: " + fives + "\nOnes: " + ones
					+ "\nQuarters: " + quarters + "\nDimes: " + dimes + "\nNickles: " + nickles + "\nPennies: "
					+ pennies);

		}
	}

	private static int convert(double amountOwed) {
		// method will convert the amount due into pennies to make it easier to do math with.
		int pennies = (int) (amountOwed * 100);
		return pennies;

	}

	private static void makeChange(int due) {
		// this method will take the total amount of pennies and convert it into the the
		// different amounts of each currency to return.
		twenties = make20(due);
		tens = make10(due);
		fives = make5(due);
		ones = make1(due);
		quarters = makeQ(due);
		dimes = makeD(due);
		nickles = makeN(due);
		pennies = due;
		
		
	}

	private static int makeN(int due) {
		return 0;
	}

	private static int makeD(int due) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int make1(int due) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int makeQ(int due) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int make5(int due) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int make10(int due) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int make20(int due) {
		// returns number of 20's to give customer
		int x = due / 20;
		due = due % 20;
		return x;
	}

}
