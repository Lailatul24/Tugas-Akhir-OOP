 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projek1;

/**
 *
 * @author MASTER-PC
 */
public class Person {
    
    private String Name ;
    
public String getName(){
 return Name;   

}
//set
public void setName(String newName){
    this.Name = newName;
    
}

public static void main (String[]args){
        Person data = new Person();
        data.Name = "rara";
        System.out.println(data.Name);
        
    }
}
