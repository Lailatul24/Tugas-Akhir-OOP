/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User_Input;
import java.util.Scanner;
/**
 *
 * @author MASTER-PC
 */
public class Mine {
      public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("\n My Name : Afidah "
            + "\n My age    : 19 "
            + "\n ipk       : 4.00");


    String name = myObj.nextLine();
    int age = myObj.nextInt();
    double Ipk = myObj.nextDouble();

    // Output input by user
    System.out.println("Name: " + name);
    System.out.println("Age : " + age);
    System.out.println("IPK : " + Ipk);
  }
}
    

