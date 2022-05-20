import java.util.Scanner;

public class ATM 
{
    public static Scanner scanner = new Scanner(System.in);
    static int cur;

    public static void main(String args[]) 
    {
        // *** Accounts ***
        Account shams = new Account("Shams", "shams1234", 100.00, 80.00);
        Account daniel = new Account("Daniel", "daniel1357", 40.00, 60.00);
        Account[] accounts = new Account[] { shams, daniel };

        while (true) 
        {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();
            System.out.println();
            System.out.println();

            for (Account item : accounts) 
            {
                if (name.equals(item.getName()) && password.equals(item.getPassword())) 
                {
                    ATM_MACHINE(item);
                }
            }
            System.out.println("!!! Enter right name and password !!!\n");
        }
    }

    public static void ATM_MACHINE(Account name) 
    {
        while (true) 
        {
            System.out.println("***ATM***\n");
            System.out.println("*** Hello " + name.getName() + " ***\n");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT\n");
            System.out.print("Choose the operation you want to perform: ");
            int n = scanner.nextInt();
            System.out.println();

            switch (n) 
            {
                // ***WITHDRAW***
                case 1:

                    getCurrency();

                    if (cur == 1) 
                    {
                        System.out.println("\nYour current balance is: " + name.getBalanceAZN() + " AZN\n");
                        System.out.print("Enter money to be withdrawn:");
                        double withdraw = scanner.nextDouble();
                        System.out.println();
                        name.withdrawAZN(withdraw);
                    }

                    else if (cur == 2) 
                    {
                        System.out.println("\nYour current balance is: " + name.getBalanceUSD() + "$\n");
                        System.out.print("Enter money to be withdrawn:");
                        double withdraw = scanner.nextDouble();
                        System.out.println();
                        name.withdrawUSD(withdraw);
                    }

                    break;

                // ***DEPOSIT***
                case 2:

                    getCurrency();

                    if (cur == 1) 
                    {
                        System.out.println("\nYour current balance is: " + name.getBalanceAZN() + " AZN\n");
                        System.out.print("Enter money to be deposited:");
                        double deposit = scanner.nextDouble();
                        System.out.println();
                        name.depositAZN(deposit);
                    }

                    else if (cur == 2) 
                    {
                        System.out.println("\nYour current balance is: " + name.getBalanceUSD() + "$\n");
                        System.out.print("Enter money to be deposited:");
                        double deposit = scanner.nextDouble();
                        System.out.println();
                        name.depositUSD(deposit);
                    }

                    break;

                // ***CHECK BALANCE***
                case 3:

                    getCurrency();

                    if (cur == 1) 
                    {
                        System.out.println("\nYour balance is: " + name.getBalanceAZN()  + " AZN\n");
                    }

                    else if (cur == 2) 
                    {
                        System.out.println("\nYour balance is: " + name.getBalanceUSD() + "$\n");
                    }

                    break;

                // ***EXIT***
                case 4:
                    System.out.println("\nThank you for banking with us!\n");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Please enter right format.\n");
                    break;
            }
        }
    }

    public static void getCurrency() 
    {
        System.out.println("Choose the currency");
        System.out.print("Type 1 for AZN 2 for USD: ");
        cur = scanner.nextInt();
    }
}
