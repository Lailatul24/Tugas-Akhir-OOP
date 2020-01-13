/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudyKasus;

/**
 *
 * @author Mr
 */
abstract class Manusia {
  // Abstract method (does not have a body)
  public abstract void ManusiaSound();
  // Regular method
  public void sleep() {
    System.out.println("hehe");
  }
}

// Subclass (inherit from Animal)
class Cewek extends Manusia {
  public void ManusiaSound() {
    // The body of animalSound() is provided here
    System.out.println("Afidah'S says : U're lucky girl");
  }
}

class MyMainClass {
  public static void main(String[] args) {
    Cewek myCewek = new Cewek(); // Create a Pig object
    myCewek.ManusiaSound();
    myCewek.sleep();
  }
}

