/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasiku;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author MASTER-PC
 */
public class CRUD {
static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
static final String DB_URL = "jdbc:mysql://localhost/data";
static final String USER = "root";
static final String PASS = "";

static Connection conn;
static Statement stmt;
static ResultSet rs;

static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
static BufferedReader input = new BufferedReader(inputStreamReader);

 
public static void main(String[] args) {

    try {
        // register driver
        Class.forName(JDBC_DRIVER);

        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        stmt = conn.createStatement();

        while (!conn.isClosed()) {
            showMenu();
        }

        stmt.close();
        conn.close();

    } catch (Exception e) {
        e.printStackTrace();
    }

}
static void showMenu() {
    System.out.println("\n========= MENU UTAMA =========");
    System.out.println("1. Insert Data");
    System.out.println("2. Show Data");
    System.out.println("3. Edit Data");
    System.out.println("4. Delete Data");
    System.out.println("0. Keluar");
    System.out.println("");
    System.out.print("PILIHAN> ");

    try {
        int pilihan = Integer.parseInt(input.readLine());

        switch (pilihan) {
            case 0:
                System.exit(0);
                break;
            case 1:
                insertData();
                break;
            case 2:
                showData();
                break;
            case 3:
                updateData();
                break;
            case 4:
                deleteData();
                break;
            default:
                System.out.println("Pilihan salah!");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
static void showData() {
    String sql = "SELECT * FROM matkul";
    try {
        rs = stmt.executeQuery(sql);
        
        System.out.println("+------------------------------------+");
        System.out.println("|    DATA MATKUL TEKNIK INFORMATIKA  |");
        System.out.println("+------------------------------------+");
        while (rs.next()) {
            int Kd_Matkul = rs.getInt("Kd_Matkul");
            String Matkul = rs.getString("Matkul");
            String Nama_dosen = rs.getString("Nama_dosen");
            String id_Dosen = rs.getString("id_Dosen");
            String Sks = rs.getString("SKS");
            
            System.out.println(String.format("%d. %s = (%s ( %s ) - %s)", Kd_Matkul,Matkul,Nama_dosen,id_Dosen,Sks));
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
static void insertData() {
    try {
        // ambil input dari user
        System.out.print("Kd_Matkul : ");
        int Kd_Matkul = Integer.parseInt(input.readLine());
        System.out.print("Matkul    : ");
        String Matkul = input.readLine().trim();
        System.out.print("Nama_dosen: ");
        String Nama_dosen = input.readLine().trim();
        System.out.print("id_Dosen  :");
        String id_Dosen = input.readLine().trim();
        System.out.print("SKS       :");
        String Sks = input.readLine().trim();
        
        // query simpan
        String sql = "INSERT INTO matkul (Kd_Matkul,Matkul,Nama_dosen,id_Dosen,SKS) VALUE('%s','%s','%s', '%s','%s')";
        sql = String.format(sql, Kd_Matkul,Matkul,Nama_dosen,id_Dosen,Sks);
        
        // simpan buku
        stmt.execute(sql);
        
    } catch (Exception e) {
        e.printStackTrace();
    }
}
static void updateData() {
    try {  
        // ambil input dari user
        System.out.print("Kd yang mau diedit: ");
        int Kd_Matkul = Integer.parseInt(input.readLine());
        System.out.print("Matkul            : ");
        String Matkul = input.readLine().trim();
        System.out.print("Nama_dosen        : ");
        String Nama_dosen = input.readLine().trim();
        System.out.print("id_Dosen          : ");
        String id_Dosen = input.readLine().trim();
        System.out.print("SKS          : ");
        String Sks = input.readLine().trim();

        // query update
        String sql = "UPDATE matkul SET Matkul='%s',Nama_dosen ='%s', id_Dosen='%s',SKS ='%s' WHERE Kd_Matkul=%d";
        sql = String.format(sql,Matkul,Nama_dosen,id_Dosen,Sks,Kd_Matkul);

        // update data buku
        stmt.execute(sql);
        
    } catch (Exception e) {
        e.printStackTrace();
    }
}
static void deleteData() {
    try {
        
        // ambil input dari user
        System.out.print("Kd yang mau dihapus   : ");
        int Kd_Matkul = Integer.parseInt(input.readLine());
        
        // buat query hapus
        String sql = String.format("DELETE FROM Matkul WHERE Kd_Matkul=%d", Kd_Matkul);
        // hapus data
        stmt.execute(sql);
        
        System.out.println("Data telah terhapus...");
    } catch (Exception e) {
        e.printStackTrace();
    }
}

}
