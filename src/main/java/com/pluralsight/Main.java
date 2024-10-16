package com.pluralsight;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        //Creating New File(find a way not using the scanner)
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("transactions.csv"));
            writer.write("2022-03-15||08:45:00||Coffee||Starbucks||$3.95,\n" +
                    "2022-05-21||13:00:45||Lunch||Chipotle||$10.50,\n" +
                    "2023-07-30||17:30:36||Gas||Chevron||$42.80,\n" +
                    "2023-11-12||19:20:22||Groceries||Target||$93.50,\n" +
                    "2024-01-18||09:10:01||Gym Membership||Planet Fitness||$25.00,\n" +
                    "2024-04-22||20:45:31||Dinner||Olive Garden||$32.75,\n" +
                    "2024-06-05||10:00:25||Online Subscription||Spotify||$9.99,\n" +
                    "2024-09-28||16:15:06||Shoes||Nike Store||$79.99,\n" +
                    "2024-10-14||11:50:19||Taxi Ride||Lyft||$18.65,\n" +
                    "2024-10-16||07:20:35||Breakfast||IHOP||$14.30");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);

            
