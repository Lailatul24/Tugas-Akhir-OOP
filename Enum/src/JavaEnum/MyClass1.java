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
public class MyClass1 {
    enum Level{
        LOW,
        MEDIUM,
        HIIGH,
    }
    public static void main(String[]args){
        Level Myvar = Level.MEDIUM;
        System.out.println(Myvar);
    }
    
}
