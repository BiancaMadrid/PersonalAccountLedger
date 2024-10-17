package com.pluralsight;
import java.util.Scanner;

public class Payment {
    static Scanner reader = new Scanner(System.in);

    //Attributes
    String cardHolderNamer;
    float cardNumber;
    String expirationDate;
    float cvv;
    String Vendor;
    String description;
    double amount;

    public Payment() {

    }

    //Prompting user Data for payement
    public static void Payment() {

        System.out.println("Enter Debit Card Information:\n " + "What is the Card Holder's Full Name?\n ");

        System.out.println("Enter the 12 digit Card Number:\n ");

        System.out.println("Enter Expiration Date: ");

        System.out.println("Enter the CVV Security Code: \n");

        System.out.println("");



    }


}

