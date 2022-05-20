public class Account {
	String name;
	String password;
	double balance_usd;
	double balance_azn;

	public Account(String name, String password, double balance_usd, double balance_azn) {
		this.name = name;
		this.password = password;
		this.balance_usd = balance_usd;
		this.balance_azn = balance_azn;
	}


	// *** Name and Password

	String getName() {
		return name;
	}

	String getPassword() {
		return password;
	}

	// *** USD ***

	double getBalanceUSD() {
		return balance_usd;
	}

	void depositUSD(double dep) {
		if (dep < 0) {
			System.out.println("This is not proper amount.\n");
		} else {
			balance_usd += dep;
			System.out.println("Money has been successfully deposited!");
			System.out.println("\nYour balance is now: " + this.balance_usd + "$\n");
		}
	}

	void withdrawUSD(double wit) {
		if (wit > balance_usd) {
			System.out.println("Your balance is not enough.\n");
		} else {
			balance_usd -= wit;
			System.out.println("\nYour balance is now: " + this.balance_usd + "$\n");
			System.out.println("Please take your money\n");
		}
	}

	// *** AZN ***

	double getBalanceAZN() {
		return balance_azn;
	}

	void depositAZN(double dep) {
		if (dep < 0) {
			System.out.println("This is not proper amount.\n");
		} else {
			balance_azn += dep;
			System.out.println("Money has been successfully deposited!");
			System.out.println("\nYour balance is now: " + this.balance_azn + " AZN\n");
		}
	}

	void withdrawAZN(double wit) {
		if (wit > balance_azn) {
			System.out.println("Your balance is not enough.\n");
		} else {
			balance_azn -= wit;
			System.out.println("\nYour balance is now: " + this.balance_azn + " AZN\n");
			System.out.println("Please take your money\n");
		}
	}
}
