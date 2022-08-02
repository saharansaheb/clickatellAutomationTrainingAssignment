package helloworld;

/*
Now it’s your turn!
In your Hello.java:
   1) Create a new method printHardCodedUserData() that prints “Data for user 1” and call it from your main() method
   2) Create a new method printVariableUserData() that takes a name and an age as arguments and uses that to print “User <name> is <age> years old”. Call it from your main() method
      Think about variable data types!
   3) Change the name of the method created in 2) to returnUserData() and instead of printing the text, have it return it. Call it from your main() method and print the return value from there
*/

public class Rec1Task2 {
    public static void main(String[] args)
    {
        printHardCodedUserData();
        printVariableUserData("Rishabh",38);
        String returnValue = returnUserData("rishabh",38);
        System.out.println("The return values are "+returnValue);
    }

    // Create a new method printHardCodedUserData() that prints “Data for user 1” and call it from your main() method
    public static void printHardCodedUserData(){
        System.out.println("Data for User 1");
    }

    // Create a new method printVariableUserData() that takes a name and an age as arguments and uses that to print “User <name> is <age> years old”. Call it from your main() method
    //      Think about variable data types!
    public static void printVariableUserData(String name,int age){
        System.out.format("User %s is %d old",name ,age);
        System.out.println("\nUser %S "+ name +" is %d old "+age);
    }

    // Change the name of the method created in 2) to returnUserData() and instead of printing the text, have it return it. Call it from your main() method and print the return value from there
    public static String returnUserData(String name,int age){
        return String.format("User %s is %d old",name ,age);
    }
}

