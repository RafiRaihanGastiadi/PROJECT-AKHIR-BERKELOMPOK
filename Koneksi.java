package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private static Connection conn;
    
    public static Connection getConnection() {
        if (conn == null) {
            try {
                // Sesuaikan nama database menjadi db_perpustakaan
                String url = "jdbc:mysql://localhost:3306/db_perpustakaan";
                String user = "root";
                String password = "";
                conn = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi berhasil");
            } catch (SQLException e) {
                System.out.println("Koneksi gagal: " + e.getMessage());
            }
        }
        return conn;
    }
}