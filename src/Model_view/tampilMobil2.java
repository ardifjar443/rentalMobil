/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_view;


import Service.*;
import View.Menu;
import config.DatabaseConnector;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author max
 */
public class tampilMobil2 {

    

    public tampilMobil2(String kode, JPanel panel,JTextField merk, JTextField tipe, JTextField harga, JTextArea deskripsi, JLabel foto, JTextField kode1) {
        
        try {
            Connection connection = DatabaseConnector.getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM daftarMobil WHERE kode ='"+kode+"'";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String kode2 = resultSet.getString("kode");
                String tipe1 = resultSet.getString("tipe");
                String merk1 = resultSet.getString("merk");
                
                int harga1 = resultSet.getInt("harga");
                String deskripsi1 = resultSet.getString("deskripsi");
                byte[] fotoBytes = resultSet.getBytes("foto");
                ImageIcon fotoIcon = new ImageIcon(fotoBytes);
                
                String harga3 = CurrencyFormatter.formatToRupiah(harga1);
                // Create panel for each product
                merk.setText(merk1);
                tipe.setText(tipe1);
                harga.setText(String.valueOf(harga1));
                deskripsi.setText(deskripsi1);
                foto.setIcon(ubahUkuran.resizeImageIcon(fotoIcon,450));
                kode1.setText(kode2);
                

            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error connecting to the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        CardLayout cl = (CardLayout)panel.getLayout();
        cl.show(panel, "tampilMobil1");
    }
     
    
     
    

    
    
    

    

    
    
}
