/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biodata;
import java.io.Console;
/**
 *
 * @author MASTER-PC
 */
public class input_example {
    public static void main(String[]args){
        
      Console con = System.console();
      
      String nama;
      int age;
           
      System.out.print("Siapa nama kamu   :");
      nama = con.readLine();
      System.out.print("Berapa umur mu     :");
      age = Integer.parseInt(con.readLine());
      
      System.out.println("nama    :  " + nama);
      System.out.println("Umur    :  " + age);
      
    } 
    
}
