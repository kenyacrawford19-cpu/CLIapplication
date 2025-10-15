package com.pluralsight;

import jdk.jfr.Description;

import java.awt.*;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FinancialLedger {
  public void showMainScreen(){
      System.out.println("This is the home screen");
      //show menu options
      public static void display() {
          boolean running = true;

          while (running) {
              System.out.println("===============");
              System.out.println("Welcome to DDSG Financial Ledger");
              System.out.println("===============");
              System.out.println("D) Add Deposit");
              System.out.println("P) Make Payment (Debit) ");
              System.out.println("L) Ledger");
              System.out.println("X) Exit");
              System.out.println("---------------");
              System.out.println("Enter your choice: ");
              String choice = scanner.nextLine().trim().toUpperCase();

      //user selects one of the options (requires the scanner)
      public class FinancialLedger{
          private static Scanner scanner = new Scanner(System.in);
          private static TransactionService transactionService = new Transacation();
      }
      //use switch statement to run the user choice
      switch (choice) {
          case "D":
              transactionService.addDeposit();
              break;
          case "P":
              transactionService.makePayment();
              break;
          case "L":
              LedgerEntry.display();
              break;
          case "X":
              System.out.println("Exiting...Goodbye");
              break;
      }
  }

    //DateTime Formatter
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-DD : mm:ss");

}