package com.soft.app.beans;

public class Car {
  private String id;
  private String brand;
  private String type;
  private String numberPlate;
  private String noOfSeats;

  public Car(String id, String brand, String type, String numberPlate, String noOfSeats) {
    this.id = id;
    this.brand = brand;
    this.type = type;
    this.numberPlate = numberPlate;
    this.noOfSeats = noOfSeats;
  }

  /**
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(String id) {
    this.id = id;
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
  public String getNoOfSeats() {
    return noOfSeats;
  }

  /**
   * @param noOfSeats the noOfSeats to set
   */
  public void setNoOfSeats(String noOfSeats) {
    this.noOfSeats = noOfSeats;
  }

  /**
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * @param type the type to set
   */
  public void setType(String type) {
    this.type = type;
  }

  
}
