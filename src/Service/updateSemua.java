/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model_view.panelPercobaan;
import config.DatabaseConnector;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author max
 */
public class updateSemua {

    public updateSemua() {
        try {
            Connection connection = DatabaseConnector.getConnection();
            Statement statement = connection.createStatement();
            String query="SELECT * FROM pesanan";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String kode = resultSet.getString("mobil");
                java.sql.Date tanggal = resultSet.getDate("tanggalKembali");
                java.sql.Date tanggal1 = resultSet.getDate("tanggalBooking");
                LocalDate tanggal3 = tanggal1.toLocalDate();
                int hasil1 = tanggal3.compareTo(LocalDate.now());
                LocalDate tanggal2 = tanggal.toLocalDate();
                int hasil = tanggal2.compareTo(LocalDate.now());
                if (hasil == 0){
                    String sqlQuery1 = "UPDATE daftarMobil SET status=? WHERE kode = ?";
                    try (Connection conn = DatabaseConnector.getConnection();
                         PreparedStatement statement1 = conn.prepareStatement(sqlQuery1)) {
                        java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
                        statement1.setString(1, "ready");
                        statement1.setString(2, kode);
                        


                        int rowsInserted = statement1.executeUpdate();

                        

                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    String sqlQuery2 = "UPDATE pesanan SET status=? WHERE mobil = ?";
                    try (Connection conn = DatabaseConnector.getConnection();
                         PreparedStatement statement1 = conn.prepareStatement(sqlQuery2)) {
                        java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
                        statement1.setString(1, "selesai");
                        statement1.setString(2, kode);
                        


                        int rowsInserted = statement1.executeUpdate();

                        

                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                if (hasil1 == 0){
                    String sqlQuery1 = "UPDATE daftarMobil SET status=? WHERE kode = ?";
                    try (Connection conn = DatabaseConnector.getConnection();
                         PreparedStatement statement1 = conn.prepareStatement(sqlQuery1)) {
                        java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
                        statement1.setString(1, "disewa");
                        statement1.setString(2, kode);
                        


                        int rowsInserted = statement1.executeUpdate();

                        

                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    String sqlQuery2 = "UPDATE pesanan SET status=? WHERE mobil = ?";
                    try (Connection conn = DatabaseConnector.getConnection();
                         PreparedStatement statement1 = conn.prepareStatement(sqlQuery2)) {
                        java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
                        statement1.setString(1, "disewa");
                        statement1.setString(2, kode);
                        


                        int rowsInserted = statement1.executeUpdate();

                        

                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                        
                
                
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error connecting to the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
