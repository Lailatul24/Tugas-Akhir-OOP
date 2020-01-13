/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author MASTER-PC
 */
public class Myclass {
    static void MyStaticMethod(){
        System.out.println ("Static methods can be called without creating objects");
    }
    public void MyPublicMethod(){
        System.out.println ("Public methods must be called by creating objects");
        
    }

public static void main(String[]args){
    MyStaticMethod();
        
    Myclass Public = new Myclass();
    Public.MyPublicMethod();
}
}
