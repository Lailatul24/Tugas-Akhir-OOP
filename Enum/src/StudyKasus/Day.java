/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudyKasus;

/**
 *
 * @author MASTER-PC
 */
public class Day {
      enum Hari{
      SENIN,SELASA,RABU,KAMIS,JUMAT,SABTU,MINGGU,
    }
     
    public static void main(String[]args){
        Hari MyVar = Hari.SENIN;
        
        switch(MyVar){
            case SENIN:
                System.out.println("==========TODAY IS MONDAY=========");
                break;
            case SELASA:
                System.out.println("==========TODAY IS TUESDAY=======");
                break;
            case RABU:
                System.out.println("=========TODAY IS WEDNESDAY==========");
                break;
            }    
        }
}
