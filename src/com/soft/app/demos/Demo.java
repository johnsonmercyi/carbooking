package com.soft.app.demos;

import java.util.Arrays;

import com.soft.app.beans.Car;
import com.soft.app.beans.Customer;
import com.soft.app.database.Database;

public class Demo {
  static int number = 1;

  //declaration part and the assignment part
  private int num;
  private static int num1;

  /**
   * Class attributes
   *  > instance variables: Every object of this class has a copy of the instance variables
   *    E.g. private String name;
   * 
   *  > class variables: Every object of this class shares a class variable
   *    E.g. private static String name;
   */

   /**
    * E.g. String name = "value";
    *
    * Delaration part: String name
    *   Parts: Type = `String` and identifier = `name`

    * Assignment part: = "value";
    *  Parts: assignment operator `=` and the assigned value = `"value"`
    */

    private Customer[] customers;

  static void doLoop() {
    while (number <= 10) {
      if (number == 5 || number == 6) {
        number++;
        break;//skip over
      }

      System.out.println("> " + number);
      number++;
    }
  }

  public static void main(String[] args) {
    // doLoop();

    //access num and num1
    // Demo obj1 = new Demo();
    // Demo obj2 = new Demo();
    // Demo.num1 = 20;

    // obj1.num = 5;
    // obj2.num = 10;

    // System.out.println("> Object 1 num: " + obj1.num);
    // System.out.println("> Object 2 num: " + obj2.num);

    // System.out.println("\n> Object 1 num1: " + obj1.num1);
    // System.out.println("> Object 2 num1: " + obj2.num1);

    //Test customer code generation
    // int count = 0;
    // while (count < 5) {
    //   String code = Customer.generateCustomerCode();
    //   System.out.println("Generated code: " + code);
    //   count ++;
    // }

    Database db = new Database();

    for (Car car : db.getCars()) {
      System.out.println(car);
    }

  }
}
