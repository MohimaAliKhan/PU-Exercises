package ATM_Management_system;
import java.util.Scanner;

public class AccountManager {

    private String adminAccount = "admin";
    private double pin = 5555;
    private int i = 0;
    Scanner input = new Scanner(System.in);

    public AccountManager() {
    }

    public void adminLogin(Accounts[] accounts) {
        int choice;

        try {
            System.out.print("Enter your Admin Account name and pin :");
            String enteredAccount = input.nextLine();  
            double enteredPin = input.nextDouble();

            if (enteredAccount.equals(adminAccount) && enteredPin == pin) {
                while (true) {
                    System.out.println("\n\t1. Add Account!\n\t2. Exit");
                    System.out.print("Enter your choice : ");
                    choice = input.nextInt();

                    switch (choice) {
                        case 1:
                            try {
                                System.out.print("Enter Account No. And Pin :");
                                double accountNo = input.nextDouble();
                                 
                                boolean accountExisted=false;
                                 for (int j = 0; j < i; j++) {
                                    if (accountNo == accounts[j].getAccount_no()) {
                                       accountExisted = true;
                                       System.out.println("This account already exist.Please try again.");
                                    }
                                 }
                                if(accountExisted){
                                    System.out.print("Enter new account No. and pin:");
                                    accountNo = input.nextDouble();
                                }
                                double accountPin = input.nextDouble();
                                input.nextLine();
                                accounts[i] = new Accounts(accountNo, accountPin);
                                i++;
                            } catch (Exception e) {
                                System.out.println("Invalid account number or pin. Please try again.\n");
                                input.nextLine();  
                            }
                            break;
                        case 2:
                            return;
                        default:
                            System.out.println("Invalid choice!\n");
                    }
                }
            } 
            else {
                System.out.println("Invalid account or pin!\n");
              }
        }
        catch (Exception e) {
            System.out.println("Invalid account number and pin.Please try again.\n");
            input.nextLine(); 
        }
    }

    public void userLogin(Accounts[] accounts) {
        try {
            System.out.print("Enter your Account No. and pin :");
            double enteredAccount = input.nextDouble();
            double enteredPin = input.nextDouble();

            boolean loginSuccessful = false;
            outerLoop:
            for (int j = 0; j < i; j++) {
                if (enteredAccount == accounts[j].getAccount_no() && accounts[j].getPin() == enteredPin) {
                    loginSuccessful = true;
                    while (true) {
                        System.out.println("\n\t1.Check Balance");
                        System.out.println("\t2.Deposit");
                        System.out.println("\t3.Withdraw");
                        System.out.println("\t4.Change pin");
                        System.out.println("\t5.Exit");
                        System.out.print("Enter your choice : ");
                        int choice = input.nextInt();

                        switch (choice) {
                            case 1:
                                System.out.println("Your current balance is " + accounts[j].getBalance() + "$\n");
                                break;
                            case 2:
                                try {
                                    System.out.print("Enter amount : ");
                                    accounts[j].deposit(input.nextDouble());
                                } catch (Exception e) {
                                    System.out.println("Invalid amount. Please try again.\n");
                                    input.nextLine();  
                                }
                                break;
                            case 3:
                                try {
                                    System.out.print("Enter amount : ");
                                    accounts[j].withdraw(input.nextDouble());
                                } catch (Exception e) {
                                    System.out.println("Invalid amount. Please try again.\n");
                                    input.nextLine();  
                                }
                                break;
                            case 4:
                                try {
                                    System.out.print("Enter new pin number : ");
                                    accounts[j].setPin(input.nextDouble());
                                    System.out.println("Your pin have changed Succesfully.");
                                } catch (Exception e) {
                                    System.out.println("Invalid Pin number. Please try again.\n");
                                    input.nextLine();  
                                }
                                break;
                            case 5:
                                break outerLoop;
                            default:
                                System.out.println("Invalid choice.\n");
                        }
                    }
                }
            }
            if(loginSuccessful!=true){
                    System.out.println("Invalid account or pin.");       
            }
        } 
        catch (Exception e) {
            System.out.println("Invalid account number and pin.\n");
            input.nextLine();  
        }
    }
}
