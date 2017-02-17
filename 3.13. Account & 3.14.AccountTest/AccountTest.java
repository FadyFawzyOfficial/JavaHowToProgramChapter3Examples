// Fig. 3.14: AccountTest.java	Author: Eng.Fady Fawzi	Created: 13/9/2016
// Inputting and outputting floating-point numbers with Account objects.
import java.util.Scanner;

public class AccountTest
{
	// main method begins execution of Java application
	public static void main( String[] args )
	{
		Account account1 = new Account( 50.00 ); // create Account object
		Account account2 = new Account( -7.53 ); // create Account object
		
		// display initial balance of each object
		System.out.printf( "account1 balance: $%.2f \n",
		account1.getBalance() );
		System.out.printf( "account2 balance: $%.2f \n\n",
		account2.getBalance() );
		
		// create Scanner to obtain input from command window
		Scanner input = new Scanner( System.in );
		double depositAmount; // depositAmount read from user
		
		System.out.print( "Please, Enter deposit amount for account1: " ); // prompt
		depositAmount = input.nextDouble(); // obtain user input
		System.out.printf( "\nadding %.2f to account1 balance\n\n",
		depositAmount );
		account1.credit( depositAmount ); // add to account1 balance
		
		// display balances
		System.out.printf( "account1 balance: $%.2f\n",
		account1.getBalance() );
		System.out.printf( "account2 balance: $%.2f\n\n",
		account2.getBalance() );
		
		System.out.print( "Please, Enter deposit amount for account2: " ); // prompt
		depositAmount = input.nextDouble(); // obtain user input
		System.out.printf( "\nadding %.2f to account2 balance\n\n",
		depositAmount );
		account2.credit( depositAmount ); // add to account2 balance
		
		// display balances
		System.out.printf( "account1 balance: $%.2f\n",
		account1.getBalance() );
		System.out.printf( "account2 balance: $%.2f\n\n",
		account2.getBalance() );
	} // end main
} // end class AccountTest