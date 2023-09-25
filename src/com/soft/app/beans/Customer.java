package com.soft.app.beans;

import java.util.UUID;

/**
 * Customer class
 */
public class Customer {
  private UUID id;
  private String customerCode;
  private String name;
  private String address;
  private String phone;
  private String gender;
  private String email;
  private String demo = "demo here nothing more...";

  public Customer(String customerCode, String name, String address, String phone, String gender, String email) {
    
    this.id = UUID.randomUUID();
    this.customerCode = customerCode;
    this.name = name;
    this.address = address;
    this.address = address;
    this.phone = phone;
    this.gender = gender;
    this.email = email;
  }


  /**
   * @param customerCode the customerCode to set
   */
  public void setCustomerCode(String customerCode) {
    this.customerCode = customerCode;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }



  /**
   * @param address the address to set
   */
  public void setAddress(String address) {
    this.address = address;
  }



  /**
   * @param phone the phone to set
   */
  public void setPhone(String phone) {
    this.phone = phone;
  }



  /**
   * @param gender the gender to set
   */
  public void setGender(String gender) {
    this.gender = gender;
  }



  /**
   * @param email the email to set
   */
  public void setEmail(String email) {
    this.email = email;
  }



  /**
   * @return the id
   */
  public UUID getId() {
    return id;
  }

  /**
   * @return the customerCode
   */
  public String getCustomerCode() {
    return customerCode;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @return the address
   */
  public String getAddress() {
    return address;
  }

  /**
   * @return the phone
   */
  public String getPhone() {
    return phone;
  }

  /**
   * @return the gender
   */
  public String getGender() {
    return gender;
  }

  /**
   * @return the email
   */
  public String getEmail() {
    return email;
  }
}
