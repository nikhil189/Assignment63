/**
 * 
 */
package acadglidassignment;



/**
 * @author nikhil
 *
 */
class ClassOne extends Thread
{
	BankAccount objBankAccount;
	double depositAmount;
	
	public ClassOne(BankAccount objBankAccount,double depositAmount)
	{
		this.objBankAccount = objBankAccount;
		this.depositAmount = depositAmount;
	}
	
	public void run()
	{
		try
		{
			
			objBankAccount.deposit(depositAmount);	// deposit thousand rupees to account
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		
	}
}
