package Multiple;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MASTER-PC
 */
interface FirstInterface {
  public void Kewajiban();
  public void Hak();
  
}

interface SecondInterface {
    public void Ayah();
    public void Ibu();
}
class DemoClass implements FirstInterface,SecondInterface {
  public void Kewajiban() {
    System.out.println("Setiap Anggota Keluarga Wajib Mematuhi Peraturan ");
  }
  public void Hak() {
    System.out.println("Setipa Anggota Kelurga wajib Mendapatkan Hak nya");
  }
  public void Ayah(){
      System.out.println("Nama Ayah     :   Muahmmmad Yusuf");
  }
  public void Ibu(){
      System.out.println("Nama Ibu      :   Husnul Humadiyah");
  }
}

class MyMainClass {
  public static void main(String[] args) {
    DemoClass myObj = new DemoClass();
    myObj.Kewajiban();
    myObj.Hak();
    myObj.Ayah();
    myObj.Ibu();
  }
}