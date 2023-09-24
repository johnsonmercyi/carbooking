package com.soft.app.database;

import com.soft.app.beans.Customer;

public class Database {

  private Customer[] customers = new Customer[5];
  private static int trackIndex = 0;

  public Customer saveCustomer(Customer customer) {
    //implementation
    if (trackIndex < customers.length) {
      customers[trackIndex] = customer;
      trackIndex ++;
      return customer;
    }

    System.out.println("We ran out of space to save Customer!");
    return null;
    
  }

  //returns customers
  public Customer[] getCustomers() {
    return customers;
  }
}
