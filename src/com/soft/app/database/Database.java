package com.soft.app.database;

import com.soft.app.beans.Booking;
import com.soft.app.beans.Car;
import com.soft.app.beans.Customer;
import com.soft.app.util.CarTypes;

public class Database {

  private Customer[] customers = new Customer[5];
  private Car[] cars = new Car[2];
  private Booking[] bookings = new Booking[5];
  private static int trackIndex = 0;

  public Database() {
    populateCars();
  }

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

  /**
   * Populate car array
   */
  public void populateCars() {
    cars[0] = new Car("Toyota", CarTypes.ELECTRIC, "123456", 3, 0);
    cars[1] = new Car("BMW", CarTypes.PETROL, "654321", 4, 0);
  }

  //returns customers
  public Customer[] getCustomers() {
    return customers;
  }

  //return Cars
  public Car[] getCars() {
    return cars;
  }
}
