package com.pluralsight;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Transactions {
    static Scanner reader = new Scanner(System.in);
    //Atributes
    private LocalDate Date;
    private LocalTime Time;
    private String descriptionTransaction;
    private String Vendor;
    private double amount;


    //Constructor
    public Transactions(LocalDate Date, LocalTime Time, String DescriptionTransaction, String Vendor, double amount){
        this.Date = Date;
        this.Time = Time;
        this.descriptionTransaction = DescriptionTransaction;
        this.Vendor = Vendor;
        this.amount = amount;
    }
    //Getters
    public LocalDate getDate(){
        return Date;
    }

    public LocalTime getTime(){
        return Time;
    }

    public String getDescriptionTransaction(){
        return descriptionTransaction;
    }

    public String getVendor(){
        return Vendor;
    }

    public double getAmount(){
        return amount;
    }


    //Setters
    public void setDate(LocalDate date) {
        Date = date;
    }

    public void setTime(LocalTime time) {
        Time = time;
    }

    public void setDescriptionTransaction(String descriptionTransaction) {
        this.descriptionTransaction = descriptionTransaction;
    }

    public void setVendor(String vendor) {
        Vendor = vendor;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    //Functionality(Remove other class/ integrate it. delete bank info)
    public static void addDeposit() {
        //Prompting user for deposit info
        System.out.println("Enter Description:\n ");

        System.out.println("Enter Vendor:\n ");

        System.out.println("Enter Amount wished for Deposit:\n ");

    }

}
