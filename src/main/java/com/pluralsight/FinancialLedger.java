package com.pluralsight;

import jdk.jfr.Description;

import java.awt.*;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FinancialLedger {
    public void showMainScreen(){
      Scanner scanner = new Scanner(System.in);

      System.out.println("This is the home screen");
      //show menu options
      //public static void display() {
      boolean running = true;

      while (running) {
          System.out.println("===============");
          System.out.println("Welcome to DDSG Financial Ledger");
          System.out.println("===============");
          System.out.println("D) Add Deposit");
          System.out.println("P) Make Payment (Debit) ");
          System.out.println("L) Ledger");
          System.out.println("X) Exiting DDSG Financial Ledger");
          System.out.println("---------------");

          //user selects one of the options (requires the scanner)
          System.out.println("Enter your choice: ");
          String choice = scanner.nextLine().trim().toUpperCase();

          //public class FinancialLedger{

          //use switch statement to run the user choice
          switch (choice) {
              case "D":
                  addDeposit();
                  break;
              case "P":
                  makePayment();
                  break;
              case "L":
                  showLedgerScreen();
                  break;
              case "X":
                  System.out.println("Exiting...Goodbye");
                  break;
          }
      }
  }

    public void addDeposit(){
        Scanner scanner = new Scanner(System.in);
        //LocalDate Date, LocalTime Time, String description, String Vendor, double amount
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        System.out.println("Description: ");
        String description = scanner.nextLine();
        System.out.println("Vendor: ");
        String vendor = scanner.nextLine();
        System.out.println("Amount: ");
        double amount = Double.parseDouble(scanner.nextLine());
        LedgerEntry ledger = new LedgerEntry(date, time, description, vendor, amount);
        String ledgerEntry = ledger.toString();
        // write the ledgerEntry into your CSV
    }

    public void makePayment(){
        Scanner scanner = new Scanner(System.in);
        //LocalDate Date, LocalTime Time, String description, String Vendor, double amount
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        System.out.println("Description: ");
        String description = scanner.nextLine();
        System.out.println("Vendor: ");
        String vendor = scanner.nextLine();
        System.out.println("Amount: ");
        double amount = -1 * Double.parseDouble(scanner.nextLine());
        LedgerEntry ledger = new LedgerEntry(date, time, description, vendor, amount);
        String ledgerEntry = ledger.toString();
        // write the ledgerEntry into your CSV
    }

    public void showLedgerScreen() {
        String File_Name = "transactions.csv";
        DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Scanner scanner = new Scanner(System.in);
        //LedgerEntry ledgerEntry = new LedgerEntry();

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

                String choice = scanner.nextLine().trim().toUpperCase();

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
        List<Financial>payments = readFinancial().stream()

    }
    private static void showReportsMenu() {
        while (true) {
            System.out.println("\nReports");
            System.out.println("--------------------");
            System.out.println("1) Month To Date");
            System.out.println("2) Previous Month");
            System.out.println("3) Year To Date");
            System.out.println("4) Previous Year");
            System.out.println("5) Search by Vendor");
            System.out.println("0) Back to Ledger");
            System.out.println("--------------------");
            System.out.println("Select an option: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1" -> reportMonthToDate();
                case "2" -> reportPreviousMonth();
                case "3" -> reportYearToDate();
                case "4" -> reporPreviousYear();
                case "5" -> searchByVendor();
                case "0" -> {return; }
                default -> System.out.println("Invalid option. Try again");
            }
        }
    }

    private static void reportPreviousMonth() {
        LocalDate now = LocalDate.now();
        List<FinancialLedger> results = readFinancialLedger().stream()

    }

    private static void showAllEntries() {

    }

    private static void showDeposits() {
    }

    public void showReportScreen(){

    }
}

