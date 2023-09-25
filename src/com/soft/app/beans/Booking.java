package com.soft.app.beans;

import java.util.UUID;

public class Booking {
  private UUID refNo;
  private Customer customer;
  private Car car;

  public Booking(Customer customer, Car car) {
    this.refNo = UUID.randomUUID();
    this.customer = customer;
    this.car = car;
  }

}
