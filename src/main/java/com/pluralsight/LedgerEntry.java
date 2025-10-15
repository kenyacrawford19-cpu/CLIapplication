package com.pluralsight;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class LedgerEntry {
    //Property Variable
    //Date:String
    LocalDate Date;
    //Time:String
    LocalTime Time;
    //Description:String
    String Description;
    //Vendor:String
    String Vendor;
    //Price:Double
    Double amount;

    // Constructors
    public LedgerEntry(LocalDate Date, LocalTime Time, String description, String Vendor, double amount) {
        this.Date = Date;
        this.Time = Time;
        this.Description = description;
        this.Vendor = Vendor;
        this.amount = amount;
    }

    //getters/setters
    public LocalDate getDate()
    {return Date ;}
    public LocalTime getTime()
    {return Time ;}
    public String getDescription()
    {return Description ;}
    public String getVendor()
    {return Vendor ;}
    public double getPrice()
    {return amount ;}

    @Override
    public String toString() {
        return String.format("%s | %s | %-20s | %-15s | %10.2f",
                Date,Time,Description, Vendor, amount);






    }
}

public class LedgerEntry{
    private static final String File_Name = "transactions.csv";
    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static final Scanner scanner = new Scanner(System.in);


    private static void showLedgerEntry() {
        while (true) {
            System.out.println("\nLedger");
            System.out.println("--------------------");
            System.out.println("A) All Entries");
            System.out.println("D) Deposits Only");
            System.out.println("P) Payments Only");
            System.out.println("R) Reports");
            System.out.println("0) Back To Home");
            System.out.println("-------------------");
            System.out.println("Please select an option: ");

            String choice = scanner.nextInt().trim().toUpperCase();
            switch (choice) {
                case "A" -> showAllEntries();
                case "D" -> showDeposits();
                case "P" -> showPayments();
                case "R" -> showReportsMenu();
                case "0" -> {
                    System.out.println("Returning to FinancialLedger Screen...");
                    return;

                }
                default -> System.out.println("Invalid choice. Try again.");

            }

        }
    }

    private static void showPayments() {

    }

    private static void showReportsMenu() {
    }

    private static void showAllEntries() {
    }

    private static void showDeposits() {
    }
}


