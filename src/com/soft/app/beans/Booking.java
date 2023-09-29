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

  public UUID getRefNo() {
    return refNo;
  }

  public void setRefNo(UUID refNo) {
    this.refNo = refNo;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public Car getCar() {
    return car;
  }

  public void setCar(Car car) {
    this.car = car;
  }

  @Override
  public String toString() {
    return "Booking [refNo=" + refNo + ", customer=" + customer + ", car=" + car + "]";
  }

  

}
