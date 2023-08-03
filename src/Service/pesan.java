/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import config.DatabaseConnector;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author max
 */
public class pesan {

    public pesan(String user, int hari, LocalDate tanggal) throws SQLException {
        
        try {
            Connection connection = DatabaseConnector.getConnection();
            Statement statement = connection.createStatement();
             
            String query = "SELECT * FROM user WHERE username ='"+user+"'";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String pesanan1 = resultSet.getString("pesanan");
                
                java.util.List<String> dataList = konversi.convertJsonToList(pesanan1);
                for(String item : dataList){
                   String sqlQuery = "INSERT INTO pesanan (mobil, username,tanggal,hari,tanggalBooking,tanggalKembali,harga) VALUES ( ?, ?,?,?,?,?,?)";
                    try (Connection conn = DatabaseConnector.getConnection();
                         PreparedStatement statement1 = conn.prepareStatement(sqlQuery)) {

                        statement1.setString(1, item);
                        statement1.setString(2, user);
                        java.sql.Date sqlDate = new java.sql.Date(new Date().getTime());
                        
                        statement1.setDate(3, sqlDate);
                        statement1.setInt(4, hari);
                        java.sql.Date tanggal1 = java.sql.Date.valueOf(tanggal);
                        statement1.setDate(5, tanggal1);
                        
                        java.sql.Date tanggal2 = java.sql.Date.valueOf(tanggal.plusDays(hari));
                        statement1.setDate(6, tanggal2);
                        tampilMobil tampil = new tampilMobil(item);
                        statement1.setInt(7, hari*tampil.getHarga());
                        int rowsInserted = statement1.executeUpdate();

                        
                        JOptionPane.showMessageDialog(null, "Mobil berhasil dipesan","Pesan",JOptionPane.INFORMATION_MESSAGE);

                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    updateStatus update = new updateStatus(tanggal,item);
                    String sqlQuery2 = "UPDATE user SET pesanan='[]' WHERE username = ?";
                    try (Connection conn = DatabaseConnector.getConnection();
                         PreparedStatement statement1 = conn.prepareStatement(sqlQuery2)) {

                        statement1.setString(1, user);
                        


                        int rowsInserted = statement1.executeUpdate();

                        

                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                

               
               
                

            }

            connection.close();
        } catch (SQLException e) {
            System.out.println("daftar pesan kosong");
            
        }
        
        
    }
    

    
}
    

