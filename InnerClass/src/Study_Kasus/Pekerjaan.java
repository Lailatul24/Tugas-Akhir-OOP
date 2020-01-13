/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Study_Kasus;

/**
 *
 * @author MASTER-PC
 */
public class Pekerjaan {
        private static class kerja{
        private String Bagian;
        
        private void Setbagian(String bagian){
        this.Bagian = bagian;
           
        }
        private String getBagian(){
        return Bagian;   
        }
    }    
public static void main (String[]args){
    Pekerjaan.kerja myLanguange = new Pekerjaan.kerja();
    Pekerjaan.kerja myLanguange1 = new Pekerjaan.kerja();
    myLanguange.Setbagian ("PT.Berkah");
    myLanguange1.Setbagian (" Stiching");
    
    System.out.println ("Saya Sedang Bekerja di :  " + myLanguange .getBagian());
    System.out.println ("Bagian                 :  " + myLanguange1 .getBagian());
}
    
}
