// Java program demonstrating the working of ATM(Automatic Teller Machine)
import java.util.*;
class ATM{
    private double amount;  //hold the amount in the account
    void Account(double data){
    amount = data;
    }
    void Checkbalance(){            // method to initialize account balance to the user input
        System.out.println(amount); 
    }
    void Withdraw(double data){      //method to perform withdraw operation
        double w_amt = data;
        if(amount >= w_amt){
            amount -= w_amt;
            System.out.println("Remaining amount:"+amount);
        }
        else{
            System.out.println("Insufficient balance");
            System.out.println("Amount available:"+amount);
        }
    }
    void Deposit(double data){     // method for deposit operation
      double d_amt = data;
      amount += d_amt;
      System.out.println("Total amount available:"+amount);
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the initial amount:");
    double amt = sc.nextDouble();
    ATM atm = new ATM();
    atm.Account(amt);
    while(true){
    System.out.println("1.Check Balance\n2.Withdraw amount\n3.Deposit\n4.To exit\nEnter your choice:");
    int choice = sc.nextInt();
    switch(choice){        //switch case to navigate to different operations
        case 1:atm.Checkbalance();
               break;
        case 2:System.out.println("Enter the amount to withdraw:");
               double wa = sc.nextInt();
               atm.Withdraw(wa);
               break;
        case 3:System.out.println("Enter the amount to Deposit:");
               double da = sc.nextInt();
               atm.Deposit(da);
               break;
        case 4:System.out.println("Thank you for using the ATM. Goodbye!");
               System.exit(0);
               break;
        default:System.out.println("Please enter the valid option");
                break;
    }
    }
    }
}
