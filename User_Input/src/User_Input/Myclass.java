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
class Myclass {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    String userName;
    
    System.out.println("Yudharta"); 
    userName = myObj.nextLine();   
       
    System.out.println("Username is: " + userName);        
  }
}