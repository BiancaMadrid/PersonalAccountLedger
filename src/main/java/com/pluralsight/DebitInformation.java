package com.pluralsight;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
public class DebitInformation {
    //Parameterless Constructor
    static Scanner reader = new Scanner(System.in);
    String cardHolderNamer;
    float cardNumber;
    String expirationDate;
    float cvv;


    public DebitInformation() {

        System.out.println("Enter Debit Card Information:\n " + "What is the Card Holder's Full Name?\n ");
        this.cardHolderNamer = reader.next();
        System.out.println("Enter the 12 digit Card Number:\n ");
        this.cardNumber = reader.nextFloat();
        System.out.println("Enter Expiration Date: ");
        this.expirationDate = reader.next();
        System.out.println("Enter the CVV Security Code: \n");
        this.cvv = reader.nextFloat();


    }


}

