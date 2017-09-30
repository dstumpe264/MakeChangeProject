import java.util.Scanner;

/* In the cash register we will calculate the amount of change returned 
 * to a customer based on the purchase price and the amount tendered. 
 * We will also notify the attendant how many of each piece of currency 
 * ($20 ,$10 ,$5 ,$1, .25c, .10c, .05c, .01c) is needed to make the change 
 * for the customer. Change should be provided using the largest bill and 
 * coin denominations as possible. Denominations that are not used should 
 * not be displayed.*/

public class MakeChangeProject {

	private static double price;
	private static double tendered;

	public static void main(String[] args) {
	
		// Prompt user for the price of the item
		Scanner kb = new Scanner(System.in);
		System.out.print("Price: ");
		price = kb.nextDouble();

		// ask user how much money was tendered by the customer
		System.out.println("Tendered: ");
		tendered = kb.nextDouble();

		// display an appropriate message if the customer provided too little money or
		// the exact amount
		System.out.println("The customer did not give you enough money.");
		System.out.println("The customer paid the exact amount.");

		// if the amount tendered is more than the cost of the item,
		// display the number of bills and coins that should be given to the customer.
	}

}
