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
public class Siswa {
    private class Nilai_UN{
        private double Matematika =95 ,IPA = 88 , Bahasa = 85;
        private void Hasil(){
            
            System.out.println("Nilai  MTK        :   " +Matematika);            
            System.out.println("Nilai  IPA        :   " +IPA);            
            System.out.println("Nilai  Bahasa     :   " +Bahasa); 
          
        } 
    }
    private class Nama{
        private String Nama_Siswa = "Lailatul Afidah";
        private int No_Induk = 2200;
        private void Tampilkan(){
            System.out.println("Nama        :   " +Nama_Siswa);
            System.out.println("No Induk    :   " +No_Induk);
        
    }
        
    }
    
    public static void main(String[]args){
        Siswa MyData = new Siswa();
        Siswa.Nilai_UN data1 = MyData.new Nilai_UN();
        Siswa.Nama data2 = MyData.new Nama(); 
        
        System.out.println("=========== Nilai Ujian Nasioanl ==========");
        data1.Hasil();
        System.out.println("==========  Nama Siswa ============");
        data2.Tampilkan();
        
        
    }
        }
        

    

