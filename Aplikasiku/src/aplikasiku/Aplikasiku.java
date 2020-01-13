/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasiku;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author MASTER-PC
 */
public class Aplikasiku {
       // Menyiapkan paramter JDBC untuk koneksi ke datbase
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/data";
    static final String USER = "root";
    static final String PASS = "";

    // Menyiapkan objek yang diperlukan untuk mengelola database
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;

    public static void main(String[] args) {
        
        // Melakukan koneksi ke database
        // harus dibungkus dalam blok try/catch
        try {
            // register driver yang akan dipakai
            Class.forName(JDBC_DRIVER);
            
            // buat koneksi ke database
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            // buat objek statement
            stmt = conn.createStatement();
            
//             buat query ke database
           String sql = "SELECT * FROM matkul";
//            
//            // eksekusi query dan simpan hasilnya di obj ResultSet
           rs = stmt.executeQuery(sql);
//            
//             tampilkan hasil query
           while(rs.next()){
               System.out.println("kd_Matkul : " + rs.getInt("kd_Matkul"));
               System.out.println("Matkul   :" + rs.getString("Matkul"));
               System.out.println("Nama_Dosen   : " + rs.getString("Nama_Dosen"));
               System.out.println("id_Dosen   : " + rs.getString("id_Dosen"));
            }
            
            stmt.close();
            conn.close();
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"Koneksi gagal"+e.getMessage());
         
        }

    }
    
}

    
