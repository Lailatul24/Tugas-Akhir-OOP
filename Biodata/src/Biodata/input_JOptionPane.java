/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biodata;
import javax.swing.JOptionPane;
/**
 *
 * @author MASTER-PC
 */
public class input_JOptionPane {
    public static void main (String[]args){
        
        String nama ;
        String hobi;
         
        nama = JOptionPane.showInputDialog("siapa nama kamu   ?");
        hobi = JOptionPane.showInputDialog("Apa hobi mu         ");
        
        JOptionPane.showMessageDialog(null,"salam Kenal "   +  nama);
        JOptionPane.showMessageDialog(null,"wow keren your hobi is     "   +  hobi);
    }
    
}
