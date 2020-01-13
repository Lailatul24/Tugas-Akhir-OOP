/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contoh;

/**
 *
 * @author MASTER-PC
 */
public class KelasLuarStatic {
    private static class Programming{
        private String languange;
        private void Setlanguange(String languange){
            this.languange = languange;
        }
        private String getlanguange(){
        return languange;
        
        }
    }

       
public static void main (String[]args){
    KelasLuarStatic.Programming myLanguange = new KelasLuarStatic.Programming();
    
    myLanguange.Setlanguange ("Pemograman java");
    System.out.println ("Saya Sedang Mempelajari :  " + myLanguange .getlanguange());
}
}
    

