package com.pluralsight;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
public class Main {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("transactions.csv"));
            writer.write("2022-03-15||08:45:00||Coffee||Starbucks||$3.95,\n" +
                    "2022-05-21||13:00:45||Lunch||Chipotle||$10.50,\n" +
                    "2023-07-30||17:30:36||Gas||Chevron||$42.80,\n" +
                    "2023-11-12||19:20:22||Groceries||Target||$93.50,\n" +
                    "2024-12-05||13:00:25||Deposit||Paychex||$2,500,\n" +
                    "2024-01-18||09:10:01||Gym Membership||Planet Fitness||$25.00,\n" +
                    "2024-04-22||20:45:31||Dinner||Olive Garden||$32.75,\n" +
                    "2024-06-05||10:00:25||Online Subscription||Spotify||$9.99,\n" +
                    "2024-06-05||13:00:25||Deposit||Paychex||$2,500,\n" +
                    "2024-07-05||13:00:25||Deposit||Paychex||$2,500,\n" +
                    "2024-09-28||16:15:06||Shoes||Nike Store||$79.99,\n" +
                    "2024-10-14||11:50:19||Taxi Ride||Lyft||$18.65,\n" +
                    "2024-10-16||07:20:35||Breakfast||IHOP||$14.30");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);

        }

        //Display HomeScreen
        //Create Loop for Home Screen Options
        //Watch video for switch case instead of if and else statement.
        //Add Error Message if Wrong Input is Added! look at demos from Thursday's and Friday's class

        int choice;
        //HOME SCREEN Display

        while(true) {
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
                    System.out.println("Deposit Screen:\n ");
                    System.out.println("Input Deposit Information:\n ");
                    break;
                case 2:
                    System.out.println("Payment Screen: ");
                    System.out.println("Input Debit Card Information: \n");
                    break;
                case 3:
                    System.out.println("Ledger Screen:\n Choose One of the Following Options: ");
                    break;
                case 4:
                    System.out.println("Exit Screen: RETURN TO HOME SCREEN");
                    break;
                default:
                    System.out.println("ERROR. GoodBye. ");
                    System.exit(0);
                    reader.close();//closing scanner
            }

            System.out.println("Press Enter to Return to Home Screen: ");
            reader.nextLine();
            reader.nextLine();

        }
    }

}


