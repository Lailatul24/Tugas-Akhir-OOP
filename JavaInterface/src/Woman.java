/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MASTER-PC
 */
interface Manusia{
    public void Cry();
    public void Laugh();
}
public class Woman implements Manusia {
  public void Cry() {
    System.out.println("The women Cry : HU HU HU ");
  }
  public void Laugh() {
    System.out.println("The women Laugh : HA HA HA ");
  }
}
class MyMainClass {
  public static void main(String[] args) {
    Woman myPig = new Woman();
    myPig.Cry();
    myPig.Laugh();
  }
}