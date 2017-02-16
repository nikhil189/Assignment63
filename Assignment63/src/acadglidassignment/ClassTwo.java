/**
 * 
 */
package acadglidassignment;

/**
 * @author nikhil13686
 *
 */
public class ClassTwo  extends Thread
{
	BankAccount objBankAccount;
	double withdrawlAmount;
	public ClassTwo(BankAccount objBankAccount,double withdrawlAmount)
	{
		this.objBankAccount = objBankAccount;
		this.withdrawlAmount = withdrawlAmount;
	}
	
	public void run()
	{
		try
		{
			
			objBankAccount.withdraw(withdrawlAmount);	// withdraw thousan rupees from account
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		
	}
}
