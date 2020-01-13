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
public class School {
    public void SchoolRuler(){
        System.out.println("Peraturan untuk siswa dan guru : ");
    }
}
class Student extends School{   
    public void SchoolRuler(){
        System.out.println("Siswa harus mematuhi peraturan di Sekolah");
    }
}

class Teacher extends School{
    public void SchoolRuler(){
        System.out.println("guru harus memberikan hak untuk siswa");
    }
}
