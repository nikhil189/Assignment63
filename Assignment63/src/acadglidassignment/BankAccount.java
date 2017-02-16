/**
 * 
 */
package acadglidassignment;

import java.util.Scanner;

/**
 * nikhil
 * implemetn basic functions of Bank Account
 */
/**
 * @author nikhil13686
 *
 */
public class BankAccount
{
	private double balance; // variable to keep check on Balance
	
	
	/**
	 * initialize value of variables
	 */
	public BankAccount(double balance) 
	{
		this.balance = balance;
	}
	
	public static void main(String ...K) // main implementation
	{
		try
		{
			Scanner objScanner = new Scanner(System.in);
			System.out.println("Enter initial balance for Account 1 to check synchronized withdraw and deposit");
			BankAccount objBankAccount1 = new BankAccount(objScanner.nextDouble());
			System.out.println("Enter amount you want to deposit");
			ClassOne objClassOne = new ClassOne(objBankAccount1, objScanner.nextDouble());
			System.out.println("Please enter amount you want to withdraw");
			ClassTwo objClassTwo = new ClassTwo(objBankAccount1,objScanner.nextDouble());
			objClassOne.start(); // deposit
			objClassTwo.start(); // withdraw
			objScanner.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
	
	
	synchronized void withdraw(double withdraw) // method to withdraw amount from account balance and update account balance
	{
		if (this.balance < withdraw || withdraw <= 0) // check if balance in// account is more than the amount requested for withdrawl
		{
			System.out.println("Sorry!!! You do not have sufficient balance in your account");
		} 
		else 
		{
			this.balance = this.balance - withdraw; // update balance variable
			System.out.println("Amount " + withdraw + "withdrawn from your acount XYZzzz and updated balance is" + this.balance);
		}
	}
	
	synchronized void deposit(double deposit) // method to deposit amount in to account and update account balance
	{
		if (deposit <= 0) // if user tries to deposit 0 or negative value notify user for the same
		{
			System.out.println("Please enter a valid amount");
		} 
		else
		{
			this.balance = this.balance + deposit; // update balance and notify user
			System.out.println("Amount " + deposit + "has been deposited in your acount XYZzzz and updated balance is"+ this.balance);
		}
	}
	
}
