
package ATM_Management_system;


public class Accounts {
    private double accountNo;
    private double pin;
    private double balance=0;
    
    
    Accounts(double account_no,double pin){
        this.accountNo=account_no;
        this.pin=pin;
    }

    public double getAccount_no() {
        return accountNo;
    }

    public double getPin() {
        return pin;
    }

    
    public void setPin(double pin){
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }
    
     public void withdraw(double amount){
         if(getBalance()>=amount){
            balance=balance-amount;
            System.out.println("Please collect your money\n");  
         }
         else {
            System.out.println("Insufficient Funds\n \t Please try again\n");
         }
        
    }
    public void deposit(double amount){
        balance=balance+amount;
        System.out.println("Your Money has been successfully deposited\n");  
    }
    
    
}
