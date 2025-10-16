package com.pluralsight;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.classfile.constantpool.StringEntry;
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
    double amount;

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
    String filename = LedgerEntry;
    //csv header
    String = "Date,Time, description, vendor, amount";
    //ledger Entries
    String[]entries = {
            "2025-09-25, 13:15:20, Custom Basketball, DDSG, 120.00",
            "2025-09-25, 17:30:45, Light bill paid, Duke Energy, -347.75"
    };
        try (FileWriter writer = new FileWriter(filename)){
            // Write header
        writer.write(header);
        //Write each entry
        for (StringEntry : entries) {
            writer.write(entry + "\n");
        }
        System.out.println("Ledger saved successfully to " + filename){
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }




