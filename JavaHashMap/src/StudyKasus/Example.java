/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudyKasus;
import java.util.HashMap;
/**
 *
 * @author MASTER-PC
 */
public class Example {
      public static void main(String[] args) {

    HashMap<String, Long> people = new HashMap<String, Long>();

    people.put("Afidah", 201869040018L);
    people.put("Laila", 201869040021L);
    people.put("Angie", 2018690400001L);

    for (String i : people.keySet()) {
      System.out.println("Name: " + i +" >> "+" NIM: " + people.get(i));
    }
  }  
}
