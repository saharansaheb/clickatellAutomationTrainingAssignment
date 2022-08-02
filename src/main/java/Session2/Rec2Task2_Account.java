package Session2;

/*
Now it’s your turn!
Add two constructors to your Account class
One without arguments, add useful default values
        One that allows you to specify each property as a parameter of the constructor
        Create a new UseAccount class in the same package
        Add a public static void main(String[] args) method to the UseAccount class
Create two new variables of type Account, one using the no-argument constructor, the other using the all-arguments constructor

Continued with Rec2Task2_UseAccount
*/

import org.omg.Messaging.SyncScopeHelper;

public class Rec2Task2_Account {

    private int accountNumber;
    private String accountType;
    private int balance;


    public Rec2Task2_Account(){
         this.accountNumber=1234567890;
        this.accountType="Checking";
        this.balance=4000;
    }

    public Rec2Task2_Account(int accountNumber,String accountType,int balance){
        this.accountNumber=accountNumber;
        this.accountType=accountType;
        this.balance=balance;
    }

    public String getInfo(){
        String accountDetails = String.format("Your account number %d and type %s is having a balance of %d",accountNumber,accountType,balance);
     //   System.out.format("Your account number %d and type %s is having a balance of %d",accountNumber,accountType,balance);
        return accountDetails;
    }

}
