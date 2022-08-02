package helloworld;

/*
Now it’s your turn!
In your Hello.java:
        1) Declare a new String variable myPlace and initialize it with the value “Clickatell”
        2) Print “Hello, Clickatell!” to the console, using your variable
        3) Add a second variable of type int and initialize it with the value 2022 (without double quotes)
        4) Print “Hello Clickatell, it is now 2022” to the console
*/

import org.omg.Messaging.SyncScopeHelper;

public class Rec1Task1 {
    public static void main(String[] args){
       printInfo();
       printInfo("Clickatell",2022);
    }

    // Declare a new String variable myPlace and initialize it with the value “Clickatell”
    // Print “Hello, Clickatell!” to the console, using your variable

    // Simple method
    public static void printInfo(){

        String myPlace = "Clickatell";
        System.out.println("Hello, "+myPlace+"!");

        int year = 2022;
        System.out.println("Hello "+myPlace + " it is now " + year);
    }

    // Add a second variable of type int and initialize it with the value 2022 (without double quotes)
    // Print “Hello Clickatell, it is now 2022” to the console

    //Method with arguments
    public static void printInfo(String myPlace, int year){
        System.out.println("\nHello");
        System.out.format("Hello %S, it is now %d", myPlace, year);   // printing to console using format command
    }
}
