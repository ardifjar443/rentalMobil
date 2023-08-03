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
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author max
 */
public class batalPesanan {
    
    public batalPesanan(String kode,String mobil) {
        String sqlQuery1 = "UPDATE daftarMobil SET status=? WHERE kode = ?";
                    try (Connection conn = DatabaseConnector.getConnection();
                         PreparedStatement statement1 = conn.prepareStatement(sqlQuery1)) {
                        
                        
                            statement1.setString(1, "ready");
                            statement1.setString(2, kode);
                        
                        


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
                    
                    String sqlQuery2 = "UPDATE pesanan SET status=? WHERE kodePesanan = ?";
                    try (Connection conn = DatabaseConnector.getConnection();
                         PreparedStatement statement1 = conn.prepareStatement(sqlQuery2)) {
                        
                        
                            statement1.setString(1, "dibatalkan");
                            statement1.setString(2, mobil);
                       
                        

                        JOptionPane.showMessageDialog(null, "Mobil dengan kode: "+kode+" Sudah dibatalkan","Pesan",JOptionPane.INFORMATION_MESSAGE);
                        int rowsInserted = statement1.executeUpdate();

                        

                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
    }
    
}
