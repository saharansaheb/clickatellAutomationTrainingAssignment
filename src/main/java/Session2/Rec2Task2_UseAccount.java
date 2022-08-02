package Session2;

/*
Now it’s your turn!
Add two constructors to your Account class
One without arguments, add useful default values
        One that allows you to specify each property as a parameter of the constructor
        Create a new UseAccount class in the same package
        Add a public static void main(String[] args) method to the UseAccount class
Create two new variables of type Account, one using the no-argument constructor, the other using the all-arguments constructor

Continuation with Rec2Task2_Account
*/

public class Rec2Task2_UseAccount {
    public static void main(String[] args){
        Rec2Task2_Account account = new Rec2Task2_Account();
      //  account.getInfo();
       System.out.println("\n"+ account.getInfo());

        Rec2Task2_Account anotherAccount = new Rec2Task2_Account(987654321,"Saving",50000);
        System.out.println("\n"+ anotherAccount.getInfo());
    }
}
