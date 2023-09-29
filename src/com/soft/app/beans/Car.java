package com.soft.app.beans;

import java.util.UUID;

import com.soft.app.util.CarTypes;

public class Car {
  private UUID id;
  private String brand;
  private CarTypes type;
  private String numberPlate;
  private int noOfSeats;
  private int status;

  public Car(String brand, CarTypes type, String numberPlate, int noOfSeats, int status) {
    this.id = UUID.randomUUID();
    this.brand = brand;
    this.type = type;
    this.numberPlate = numberPlate;
    this.noOfSeats = noOfSeats;
    this.status = status;
  }

  /**
   * @return the id
   */
  public UUID getId() {
    return id;
  }

  /**
   * @return the brand
   */
  public String getBrand() {
    return brand;
  }

  /**
   * @param brand the brand to set
   */
  public void setBrand(String brand) {
    this.brand = brand;
  }

  /**
   * @return the numberPlate
   */
  public String getNumberPlate() {
    return numberPlate;
  }

  /**
   * @param numberPlate the numberPlate to set
   */
  public void setNumberPlate(String numberPlate) {
    this.numberPlate = numberPlate;
  }

  /**
   * @return the noOfSeats
   */
  public int getNoOfSeats() {
    return noOfSeats;
  }

  /**
   * @param noOfSeats the noOfSeats to set
   */
  public void setNoOfSeats(int noOfSeats) {
    this.noOfSeats = noOfSeats;
  }

  /**
   * @return the type
   */
  public CarTypes getType() {
    return type;
  }

  /**
   * @param type the type to set
   */
  public void setType(CarTypes type) {
    this.type = type;
  }
  
  /**
   * @param status the status to set
   */
  public void setStatus(int status) {
    this.status = status;
  }
  
  @Override
  public String toString() {
    return String.format("%s Car - %s - %s", brand, type, numberPlate);
  }

  /**
   * @return the status
   */
  public int getStatus() {
    return status;
  }


  
}
