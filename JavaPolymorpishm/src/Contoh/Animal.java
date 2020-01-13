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
public class Animal {
    public void animalSound(){
        System.out.println("the animal makes sounds");
    }
}
class ping extends Animal{
    public void animalSound(){
        System.out.println("the ping sounds : week week");
    }
}
class dog extends Animal {
    public void animalSounds(){
        System.out.println("the dog make sound : guok guk");
    }
}
class MYmainClass{
public static void main (String[]args){
    Animal myAnimal = new Animal ();
    Animal myPing = new ping();
    Animal myDog = new dog ();
    
    myAnimal.animalSound();
    myPing.animalSound();
    myDog.animalSound();
}
}
