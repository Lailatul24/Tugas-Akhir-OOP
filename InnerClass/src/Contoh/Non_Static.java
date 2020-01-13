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
public class Non_Static {
    private class Mobile{
        private String merk = "Honda";
        private float kecepatan = 231.0f;
        private void jalankan(){
            System.out.println("nama merk : "  +merk);
            System.out.println("Kecepatan Mobil : " + kecepatan);
        }
        
    }
    private class Pengguna {
        private String Nama = "lailatul Afidah " ;
        private int umur  = 12;
        private void identitas(){
            System.out.println("Nama Pengguna : " +Nama);
            System.out.println("Umur          : " +umur);
        }
    }
    public static void main (String[]args){
        Non_Static Identitas = new Non_Static();
        Non_Static.Mobile data1 = Identitas.new Mobile();
        Non_Static.Pengguna data2 = Identitas.new Pengguna();
        
        System.out.println("======= DATA DARI KELAS MOBIL  ==========");
        data1.jalankan();
        System.out.println("======== DATA DARI PENGGUNA   ============");
        data2.identitas();
        
        
        
        
    }
    
}
