package com.pluralsight;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {

        //Displaying HomeScreen
        //Create Loop for Home Screen Options
        //Watch video for switch case instead of if and else statement.
        //Add Error Message if Wrong Input is Added! look at demos from Thursday's and Friday's class
        String display;
        boolean running = true;
        int choice;
        while (running) {
            System.out.println("Welcome to Home Screen");
            System.out.println("1. Add Deposit: \n");
            System.out.println("2. Make Payment (DEBIT ONLY): \n");
            System.out.println("3. Ledger: \n");
            System.out.println("4. Exit: \n");

            //User's choice
            System.out.println("Please Select One of the Following Options using the PinPad (1-4): ");
            choice = reader.nextInt();

            switch (choice) {
                case 1:
                    addDepositPage();
                    break;
                case 2:
                    makePaymentPage();
                    break;
                case 3:
                    ledgerPage();
                    break;
                case 4:
                    exitPage();
                    break;
                default:
                    System.out.println("Please select new Option: ");

            }
            //Output
            System.out.println("Deposit Screen: ");
            System.out.println("Payment Screen: ");
            System.out.println("Ledger Screen:\n Choose One of the Following Options: ");
            System.out.println("Exit Screen: RETURN TO HOME SCREEN");
        }
        reader.close();
    }
}


       //Defining the switch variables with Methods
        public static void addDepositPage(){
            System.out.println("Deposit Screen: " );
        }
        public static void makePaymentPage() {
            System.out.println("Payment Screen: " );
        }
        public static void ledgerPage(){
            System.out.println("Ledger Screen:\n Choose One of the Following Options: ");
        }
        public static void exitPage(){
            System.out.println("Exit Screen: RETURN TO HOME SCREEN");
        }



        //Displaying Ledger Object
       // Ledger myLedger = new Ledger();


