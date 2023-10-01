package com.soft.app.demos;

import java.util.Arrays;

public class ArrayDemo {
  
  int row = 3;
  int col = 2;
  String[][] fruitsStores = new String[row][col];

  int rowIndex = 0;

  public void storeFlower(String firstFruit, String secondFruit) {
    fruitsStores[rowIndex][0] = firstFruit;
    fruitsStores[rowIndex][1] = secondFruit;
    rowIndex++; // increment row index for next assignment
  }
  

  @Override
  public String toString() {
    return "ArrayDemo [fruitsStores=" + Arrays.toString(fruitsStores) + "]";
  }


  public static void main(String[] args) {
    
    /**
     * ----------------
     * row index 0: [col: index 0] [col: index 1]
     * ----------------
     * ----------------
     * row index 1: [col: index 0] [col: index 1]
     * ----------------
     * ----------------
     * row index 2: [col: index 0] [col: index 1]
     * ----------------
     */

     ArrayDemo ad = new ArrayDemo();

     ad.storeFlower("Apple", "Orange");
     ad.storeFlower("Lemon", "Watermelon");
     ad.storeFlower("Grape", "Mango");

     String[] fruitsStore = ad.fruitsStores[1];
     String fruit = ad.fruitsStores[0][1];

     System.out.println("Fruit: " + Arrays.toString(fruitsStore));

     for(int i=0; i < ad.fruitsStores.length; i++){
      ad.fruitsStores[i][0] = "Apple";
      ad.fruitsStores[i][1] = "Orange";
     }
     
    System.out.println("fruitstore = "+ ad.fruitsStores[0][0]);
  }
}
