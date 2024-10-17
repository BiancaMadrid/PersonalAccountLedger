package com.pluralsight;
import java.util.Scanner;
public class DebitInfo {
    static Scanner reader = new Scanner(System.in);
    //DEBIT INFORMATION:
    //Attributes
    String cardHolderNamer;
    float cardNumber;
    String expirationDate;
    float cvv;

    //Parameterless Constructor
    public void DebitInfo() {
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
