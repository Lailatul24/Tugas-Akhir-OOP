/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NoAccess;

/**
 *
 * @author MASTER-PC
 */
// abstract class
abstract class Person {
  public String fname = "lailatul";
  public String lname = "Afidah";
  public String email = "tull27493@gmail.com";
  public int age = 12;
  public abstract void study(); // abstract method 
}

// Subclass (inherit from Person)
class Student extends Person {
  public int graduationYear = 2018;
  public void study() {
    System.out.println("Studying all day long");
  }
}
public class Myclass {
 public static void main(String[] args) {
    // create an object of the Student class (which inherits attributes and methods from Person)
    Student myObj = new Student(); 
    
    System.out.println("Name           : " + myObj.fname + " " + myObj.lname);
    System.out.println("Email          : " + myObj.email);
    System.out.println("Age            : " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
    myObj.study(); // call abstract method
  }
}
