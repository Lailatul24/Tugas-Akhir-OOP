/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access;

/**
 *
 * @author MASTER-PC
 */
public class person1 {
    private String fname = "lailatul ";
    private String lname = "Afidah";
    private String email = "tull27493@gmail.com";
    private int age = 19;
    
public static void main (String[]args){
    person1 data = new person1();
    System.out.println ("name  = " + data.fname +" "+ data.lname);
    System.out.println ("email = " + data.email );
    System.out.println ("age   = " + data.age);
}
    
}
