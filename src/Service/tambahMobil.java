/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;
import config.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author max
 */
public class tambahMobil {
    
    public tambahMobil() {
    }
    public void tambah(String kode,String merk,String tipe,int harga,String deskripsi,File foto,String type) throws FileNotFoundException{
        try {
            // Membuat koneksi ke database
            Connection connection = DatabaseConnector.getConnection();

            // Menyiapkan pernyataan SQL untuk input data
            String insertQuery = "INSERT INTO daftarMobil (kode, merk, tipe,harga,deskripsi,foto,type) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            // Input data dari pengguna
            InputStream imageInputStream = new FileInputStream(foto);

            // Menetapkan nilai ke parameter pernyataan SQL
            preparedStatement.setString(1, kode);
            preparedStatement.setString(2, merk);
            preparedStatement.setString(3, tipe);
            preparedStatement.setInt(4, harga);
            preparedStatement.setString(5, deskripsi);
            
            preparedStatement.setBinaryStream(6, imageInputStream, (int) foto.length());
            preparedStatement.setString(7, type);
          
            
            
            

            // Melakukan input ke database
            int rowsAffected = preparedStatement.executeUpdate();

            // Menutup resource
            preparedStatement.close();
            connection.close();
            

            JOptionPane.showMessageDialog(null, "Berhasil Menambahkan Mobil","Pesan",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Salah Memasukan Harga","Pesan",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    }

