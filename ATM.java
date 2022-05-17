import java.util.Scanner;
import java.text.NumberFormat;

public class ATM 
{
    public static void main(String args[] )
    { 
        Scanner scanner = new Scanner(System.in);
		NumberFormat formatter = NumberFormat.getCurrencyInstance(); // Creates the formatter object for currency


        Account person01 = new Account();
		person01.setBalance(0.00);


        while(true)
        {
            System.out.println("***ATM***");
            System.out.println();
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.println();
            System.out.print("Choose the operation you want to perform:");
            int n = scanner.nextInt();


            switch(n)
            {
                //***WITHDRAW***
                case 1:
                System.out.println("\nYour current balance is: " + formatter.format(person01.getBalance()) + "\n");
                System.out.print("Enter money to be withdrawn:");
                double withdraw = scanner.nextDouble();
                person01.withdraw(withdraw);
                System.out.println("\nYour balance is now: " + formatter.format(person01.getBalance()) + "\n");
                System.out.println("Please take your money");
                System.out.println("");
                break;



                //***DEPOSIT***
                case 2:
                System.out.println("\nYour current balance is: " + formatter.format(person01.getBalance()) + "\n");
                System.out.print("Enter money to be deposited:");
                double deposit = scanner.nextDouble();
				person01.deposit(deposit);

                System.out.println("Money has been successfully deposited!");
				System.out.println("\nYour balance is now: " + formatter.format(person01.getBalance()) + "\n");
                break;
 


                //***CHECK BALANCE***
                case 3:
				System.out.println("\nYour balance is: " + formatter.format(person01.getBalance()) + "\n");
                System.out.println("");
                break;
 


                //***EXIT***
                case 4:
		        System.out.println("\nThank you for banking with us!\n");
                System.exit(0);
            }
        }
    }
}
