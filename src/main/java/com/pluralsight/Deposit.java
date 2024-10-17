package com.pluralsight;
import java.util.Scanner;

public class Deposit{
    static Scanner reader = new Scanner(System.in);
    //Look through Notes. Figure out how to let user add deposit info and save it to file!!!!!!!!!!
    //Look through demos for refresh on Constructors.
    //Can I add Object to SCOUT??? Find out.... NOPE JST ADD OBJECT
    //Add the file writing here!!Look at Work BOOK 3!


    //Attributes
    //DEPOSIT/ACCOUNT INFO
    double accountNumber;
    double routingNumber;
    double amountDeposited;

    //Parameterless Constructor
    public Deposit() {
        System.out.println("Enter Account Number:\n ");
        this.accountNumber = reader.nextInt();
        System.out.println("Enter Routing Number: \n");
        this.routingNumber = reader.nextInt();
        System.out.println("Account Found. \n" + "Enter Amount wished for Deposit:\n ");
        this.amountDeposited = reader.nextInt();
    }

}






