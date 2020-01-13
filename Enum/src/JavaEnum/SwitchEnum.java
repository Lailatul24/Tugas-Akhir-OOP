/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaEnum;

/**
 *
 * @author MASTER-PC
 */
public class SwitchEnum {
    enum Level{
        LOW,
        MEDIUM,
        HIGH,
    }
     
    public static void main(String[]args){
        Level MyVar = Level.HIGH;
        
        switch(MyVar){
            case LOW:
                System.out.println("==========LOW LEVEL=========");
                break;
            case MEDIUM:
                System.out.println("==========MEDIUM LEVEL=======");
                break;
            case HIGH:
                System.out.println("=========HIGH LEVEL==========");
                break;
            
            }
            
        }
            
}

