/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaEnum;

/**
 *
 * @author MASTER-PC
 */
enum level{
  LOW,
  MEDIUM,
  HIGH
}

public class MyClass2 { 
  public static void main(String[] args) { 
    for (level myVar : level.values()) {
      System.out.println(myVar);
    }
  } 
}