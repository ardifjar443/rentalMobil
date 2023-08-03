/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import config.DatabaseConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author max
 */
public class updateStatus {
String mobil;
    public updateStatus(LocalDate tanggal, String kode) {
        
        String sqlQuery1 = "UPDATE daftarMobil SET status=? WHERE kode = ?";
                    try (Connection conn = DatabaseConnector.getConnection();
                         PreparedStatement statement1 = conn.prepareStatement(sqlQuery1)) {
                        java.sql.Date sqlDate = new java.sql.Date(new Date().getTime());
                        int hasil = tanggal.compareTo(sqlDate.toLocalDate());
                        if (hasil == 0){
                            statement1.setString(1, "disewa");
                            statement1.setString(2, kode);
                        }else if(hasil > 0 ){
                            statement1.setString(1, "booking");
                            statement1.setString(2, kode);
                        }
                        


                        int rowsInserted = statement1.executeUpdate();

                        

                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    try {
            Connection connection = DatabaseConnector.getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM pesanan WHERE mobil = '"+kode+"'";
            ResultSet resultSet = statement.executeQuery(query);

                while (resultSet.next()) {
                    mobil = resultSet.getString("kodePesanan");
                    




                
                
                // Create panel for each product
                
                

            }

            connection.close();
        } catch (SQLException e) {
            System.out.println("daftar pesan kosong");
        }
                    
                    
                    
                    System.out.println("ehehehe "+mobil);
                    
                    String sqlQuery2 = "UPDATE pesanan SET status=? WHERE kodePesanan = ?";
                    try (Connection conn = DatabaseConnector.getConnection();
                         PreparedStatement statement1 = conn.prepareStatement(sqlQuery2)) {
                        java.sql.Date sqlDate = new java.sql.Date(new Date().getTime());
                        int hasil = tanggal.compareTo(sqlDate.toLocalDate());
                        if (hasil == 0){
                            statement1.setString(1, "disewa");
                            statement1.setString(2, mobil);
                        }else if(hasil > 0 ){
                            statement1.setString(1, "booking");
                            statement1.setString(2, mobil);
                        }else{
                            statement1.setString(1, "ready");
                            statement1.setString(2, mobil);
                        }
                        


                        int rowsInserted = statement1.executeUpdate();

                        

                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
    }
    
}
