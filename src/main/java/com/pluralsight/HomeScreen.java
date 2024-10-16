package com.pluralsight;
import java.util.Scanner;
public class HomeScreen {
    Scanner reader = new Scanner(System.in);
    //Create Loop for Home Screen Options
    //Watch video for switch case instead of if and else statement.
    //Add Error Message if Wrong Input is Added! look at demos from Thursday's and Friday's class
    boolean running = true;

    public HomeScreen(){
        while(running) {
            System.out.println("Welcome to Home Screen" );
            System.out.println("1. Add Deposit: \n");
            System.out.println("2. Make Payment (DEBIT ONLY): \n");
            System.out.println("3. Ledger: \n");
            System.out.println("4. Exit: \n");

            //User's choice
            System.out.println("Please Select One of the Following Options using the PinPad (1-4): ");
            int choice = reader.nextInt();

            switch (choice){
                case 1:
                    addDeposit();
                    break;
                case 2:
                    makePayment();
                    break;
                case 3:
                    ledger();
                    break;
                case 4:
                    exit();
                    break;
                case 5:
                    running = false;
                    System.out.println("ERROR. ");
                    break;
                default:
                    System.out.println("Please select new Option: ");

            }
        }
        reader.close();
    }

    //Defining the switch variables with Methods
    public static void addDeposit(){
        System.out.println("Deposit Screen: ");
    }
    public static void makePayment() {
        System.out.println("Payment Screen: " );
    }
    public static void ledger(){
        System.out.println("Ledger Screen:\n Choose One of the Following Options: ");
    }
    public static void exit(){
        System.out.println("Exit Screen: RETURN TO HOME SCREEN");
    }
}
