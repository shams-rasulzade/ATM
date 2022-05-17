public class Account 
{
    String name;
    String password;
    double balance;

	void setBalance(double accBal) 
    {
		balance = accBal;
	}

    double getBalance() 
    {
		return balance;
	}

	void deposit(double dep) 
    {
		balance += dep;
	}

	void withdraw(double wit) 
    {
	    balance -= wit;
	}
}