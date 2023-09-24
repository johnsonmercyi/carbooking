package com.soft.app;

import java.util.Scanner;

public class App {

  public void welcome() {
    try {
      Scanner scan = new Scanner(System.in);

      System.out.println("\nWelcome to CarBook car booking service.");
      System.out.println("\nPlease enter your preferred option to continue:");
      System.out.println("1 - Book a car");
      System.out.println("2 - View all users");
      System.out.println("3 - View all bookings");
      System.out.println("4 - View available cars");
      System.out.println("5 - View available electric cars");
      System.out.println("6 - View user booked cars");
      System.out.println("7 - Exit program\n");

      System.out.print("Enter Option: ");
      String option = scan.nextLine();
      boolean validInput = Validations.validateOption(option);

      if (validInput) {
        System.out.println(option + " is valid");
      } else {
        System.out.println(option + " is not valid");
      }

      // get the name
      // get the address
      // get the phone
      // get the gender
      // get the email

    } catch (Exception e) {
      // TODO: handle exception
      System.out.println("Exception: " + e.getMessage());
    }

  }

  public boolean login(String id) {
    return true;
  }

  private boolean authenticateCustomer(String id) {
    return true;
  }

  private class Validations {
    public static boolean validateOption(String option) {
      if (option.trim().isEmpty() || option == null || option.matches(".*[a-zA-Z].*")) {
        return false;
      }

      int validOption = Integer.parseInt(option.trim());

      //check if option falls into valid range
      if (validOption < 1 || validOption > 7) {
        return false;
      }

      return true;
    }
  }

  public static void main(String[] args) throws Exception {
    App app = new App();
    app.welcome();
  }
}
