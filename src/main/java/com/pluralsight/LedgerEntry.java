package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
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
        while (true)
    }
}

