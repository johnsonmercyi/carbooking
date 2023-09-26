package com.soft.app;

import java.util.Scanner;

import com.soft.app.beans.Car;
import com.soft.app.beans.Customer;
import com.soft.app.database.Database;

public class App {

  private Database db;

  // Constructor
  public App() {
    db = new Database();// initialize the database object
  }

  public void welcome() {

    Scanner scan = new Scanner(System.in);
    int choice;

    while (true) {
      try {

        // Dislays options
        displayWelcomeOptions();

        // Prompt for input
        System.out.print("Enter Option: ");

        if (scan.hasNextInt()) {
          // The choice is an integer
          choice = scan.nextInt();

          // Run validation on choice
          boolean isValid = Validations.validateOption(choice);
          if (isValid) {
            // rest of the implementation
            if (choice != 7) {
              System.out.print("Enter customer code: ");
              String customerCode = scan.next();

              boolean isUserAuth = authenticateCustomer(customerCode);
              if (isUserAuth) {
                // Continue
                // Process user choice
                processUserChoice(choice, db.fetchCustomer(customerCode));
              } else {
                // Do customer registration
                Customer customer = registerCustomer();
                db.saveCustomer(customer);

                // Process user choice
                processUserChoice(choice, customer);
              }

              break;
            } else {
              // If choice is 7 then exit program
              System.exit(0);
            }

          } else {
            System.out.println(choice + " is not valid");
          }

        } else {
          System.out.println("Invalid input. Please enter a number.");
          scan.nextLine();// consume the input
          continue; // This resumes the loop
        }

      } catch (Exception e) {
        // TODO: handle exception
        System.out.println("Exception: " + e.getMessage());
        continue;
      }

    }

  }

  private void processUserChoice(int choice, Customer customer) {
    if (choice == 1) {
      System.out.println(
          "\nYour registration was successful " + customer.getName() + "(" + customer.getCustomerCode() + ")!");
      bookACar(customer);
    } else if (choice == 2) {
      //implementation of when user choice is 2...
    }
  }

  private void displayWelcomeOptions() {
    // Welcome message and options for user to select
    System.out.println("\nWelcome to CarBook car booking service.");
    System.out.println("\nPlease enter your preferred option to continue:");
    System.out.println("1 - Book a car");
    System.out.println("2 - View all users");
    System.out.println("3 - View all bookings");
    System.out.println("4 - View available cars");
    System.out.println("5 - View available electric cars");
    System.out.println("6 - View user booked cars");
    System.out.println("7 - Exit program\n");
  }

  private int displayCarOptions() {
    System.out.println("Welcome to the Car booking terminal");
    System.out.println("\nPlease select your preferred car:");
    int count = 0;
    for (Car car : db.getCars()) {
      if (car != null) {
        System.out.println(
            ++count + " - " + car.getBrand() + " " + car.getType() + " Car (" + car.getNoOfSeats() + " seaters)");
      }
    }
    return count;
  }

  private void bookACar(Customer customer) {
    Scanner scan = new Scanner(System.in);
    while (true) {
      int carCount = displayCarOptions();
      System.out.print("Enter option: ");
      int choice;

      if (scan.hasNextInt()) {
        choice = scan.nextInt();

        if (choice > 1 && choice <= carCount) {
          if (choice == 1) {
            //book car 1
          } else if (choice == 2) {

          }
        } else {
          System.out.println("Sorry! Your input is out of range.");
          scan.nextInt();// consume the input
          continue;
        }
      } else {
        System.out.println("Invalid input. Please select a number!");
        scan.nextLine();//consume the input
        continue;
      }
    }
  }

  public boolean login(String id) {
    return true;
  }

  private boolean authenticateCustomer(String customerCode) {
    // check that input is valid
    if (customerCode.trim().isEmpty() || customerCode == null) {
      return false;
    }

    // Do authentication
    for (Customer customer : db.getCustomers()) {
      if (customer == null) {
        return false;
      } else {
        if (customer.getCustomerCode().trim().equals(customerCode)) {
          return true;
        }
      }
    }

    return false;
  }

  private Customer registerCustomer() {
    Scanner scan = new Scanner(System.in);
    String customerCode, name, address, phone, gender, email;

    while (true) {

      System.out.println("\nCustomer registration terminal.\nPlease provide your customer registration information");

      System.out.print("Enter name: ");
      name = scan.nextLine();
      if (!Validations.validateField("name", name)) {
        System.out.println("Invalid input. Please try again.");
        continue;
      }

      System.out.print("Enter address: ");
      address = scan.nextLine();
      if (!Validations.validateField("address", address)) {
        System.out.println("Invalid input. Please try again.");
        continue;
      }

      System.out.print("Enter phone: ");
      phone = scan.nextLine();
      if (!Validations.validateField("phone", phone)) {
        System.out.println("Invalid input. Please try again.");
        continue;
      }

      System.out.print("Enter gender: ");
      gender = scan.nextLine();
      if (!Validations.validateField("gender", gender)) {
        System.out.println("Invalid input. Please try again.");
        continue;
      }

      System.out.print("Enter email: ");
      email = scan.nextLine();
      if (!Validations.validateField("email", email)) {
        System.out.println("Invalid input. Please try again.");
        continue;
      }

      // Generate the customer code in the following format
      // CST001
      // CST002
      // ...
      customerCode = Customer.generateCustomerCode();

      if (!name.isEmpty() && !address.isEmpty() && !phone.isEmpty() && !gender.isEmpty() && !email.isEmpty()) {
        return new Customer(customerCode, name, address, phone, gender, email);
      }
    }
  }

  private class Validations {
    public static boolean validateOption(int choice) {
      // check if option falls into valid range
      if (choice < 1 || choice > 7) {
        return false;
      }
      return true;
    }

    public static boolean validateField(String field, String value) {
      if (value.trim().isEmpty() || value == null) {
        return false;
      }

      // trim user input
      value = value.trim();

      if (field.equals("phone")) {
        if (value.length() < 10 || value.length() > 10) {
          return false;
        }
      } else if (field.equals("gender")) {
        if (value.length() > 1 || (!value.equalsIgnoreCase("M") && !value.equalsIgnoreCase("F"))) {
          return false;
        }
      } else if (field.equals("email")) {
        // example@gmail.com
        String[] emailParts = value.split("@");
        if (emailParts.length == 2) {
          System.out.println("Splitted!");
          if (emailParts[0].length() == 0 || emailParts[1].length() == 0) {
            System.out.println("Bad!");
            // E.g. @gmail.com
            return false;
          }

          if (!emailParts[1].contains(".")) {
            return false;
          }

        } else {
          System.out.println("No splitted!");
          return false;
        }
      }

      return true;
    }
  }

  public static void main(String[] args) {
    App app = new App();

    app.welcome();
  }
}