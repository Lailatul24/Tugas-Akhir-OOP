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
public class Myclass {
    public static void main (String[]args){
        School Schoolruler = new School ();
        School StudentRuler = new Student();
        School TeacherRuler = new Teacher();
        
        Schoolruler.SchoolRuler();
        StudentRuler.SchoolRuler();
        TeacherRuler.SchoolRuler();
        
    }
    
}
