package ATM_Management_system;
import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        Accounts [] accounts= new Accounts[100];
        AccountManager login;
        login = new AccountManager();
        int i=0;
        System.out.println("Welcome to ATM Management System");
        int choice;
        while(true){  
        System.out.println("\n\t1.Admin Login\n\t2.User Login\n\t3.Exit");
            System.out.print("Enter your choice : ");
            choice=input.nextInt();
            
            switch(choice){
                 case 1: 
                     login.adminLogin(accounts);
                     break;
                 case 2:
                     login.userLogin(accounts);
                     break;
                 
                 case 3:
                     return;
                 default: 
                 System.out.println("Invalid choice\n");
                 
            }
        
        }
    }
    
}
