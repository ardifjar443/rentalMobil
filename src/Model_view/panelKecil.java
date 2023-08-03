/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_view;

import Service.tambahFavorit;
import Service.tambahPesanan;
import Service.tampilMobil;
import View.Menu;
import config.DatabaseConnector;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author max
 */
public class panelKecil {
    private final int panelWidth = 549;
    private final int panelHeight = 320;
    public void addSmallPanel(String query ,String username,int panelCount,JPanel panelContainer ,Menu menu) {
        panelContainer.removeAll();
        panelContainer.revalidate();
        panelContainer.repaint();
        
        try {
            Connection connection = DatabaseConnector.getConnection();
            Statement statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String kode1 = resultSet.getString("kode");
                String tipe1 = resultSet.getString("tipe");
                String merk1 = resultSet.getString("merk");
                
                int harga1 = resultSet.getInt("harga");
                String deskripsi1 = resultSet.getString("deskripsi");
                byte[] fotoBytes = resultSet.getBytes("foto");
                ImageIcon fotoIcon = new ImageIcon(fotoBytes);
                
                
                // Create panel for each product
                tampilMobil tampil = new tampilMobil(kode1);
                JPanel smallPanel = new panelPercobaan(kode1,username,menu,tampil);
               
                smallPanel.setPreferredSize(new Dimension(panelWidth, panelHeight));


                panelContainer.add(smallPanel);
                panelCount++;

            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error connecting to the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void addSmallPanel1(String username,int panelCount,JPanel panelContainer ,Menu menu) {
        panelContainer.removeAll();

        //IMPORTANT
        panelContainer.revalidate();
        panelContainer.repaint();
        
        try {
            Connection connection = DatabaseConnector.getConnection();
            Statement statement = connection.createStatement();
            String query = tambahFavorit.tampil(username);
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String kode2 = resultSet.getString("kode");
                String tipe2 = resultSet.getString("tipe");
                String merk2 = resultSet.getString("merk");
                
                int harga2 = resultSet.getInt("harga");
                String deskripsi2 = resultSet.getString("deskripsi");
                byte[] fotoBytes = resultSet.getBytes("foto");
                ImageIcon fotoIcon = new ImageIcon(fotoBytes);
                
                
                // Create panel for each product
                tampilMobil tampil = new tampilMobil(kode2);
                
                JPanel smallPanel = new tampilDaftarMobil(kode2,username,menu,tampil);panelContainer.add(smallPanel);
                panelCount++;
            }

            connection.close();
        } catch (SQLException e) {
            System.out.println("data Favorit tidak ada");
        }
    }
    public void addSmallPanel2(String username, int panelCount, JPanel panelContainer, Menu menu) {
         panelContainer.removeAll();

        //IMPORTANT
        panelContainer.revalidate();
        panelContainer.repaint();
       
        try {
            Connection connection = DatabaseConnector.getConnection();
            Statement statement = connection.createStatement();
            String query = tambahPesanan.tampil(username);
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String kode3 = resultSet.getString("kode");
                String tipe3 = resultSet.getString("tipe");
                String merk3 = resultSet.getString("merk");
                
                int harga3 = resultSet.getInt("harga");
                String deskripsi3 = resultSet.getString("deskripsi");
                byte[] fotoBytes = resultSet.getBytes("foto");
                ImageIcon fotoIcon = new ImageIcon(fotoBytes);
                
                
                // Create panel for each product
                tampilMobil tampil = new tampilMobil(kode3);
                
                JPanel smallPanel = new tampilPesanan3(kode3,username,menu,tampil);
                panelContainer.add(smallPanel);
                panelCount++;
                 }

            connection.close();
        } catch (SQLException e) {
            System.out.println("daftar pesan kosong");
        }
    }   
    public void addSmallPanel3(String username, int panelCount, JPanel panelContainer, Menu menu) {
         panelContainer.removeAll();
        panelContainer.revalidate();
        panelContainer.repaint();
       
        try {
            Connection connection = DatabaseConnector.getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM pesanan WHERE username ='"+username+"' ORDER BY kodePesanan DESC ";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String kode3 = resultSet.getString("mobil");
                String kode = resultSet.getString("kodePesanan");
                String status3 = resultSet.getString("status");
                JPanel smallPanel = new tampilPesanan4(kode3, kode,status3);
                panelContainer.add(smallPanel);
                panelCount++;
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println("daftar pesan kosong");
        }
    }
    public void addSmallPanel4(int panelCount,JPanel panelContainer) {
        panelContainer.removeAll();

        panelContainer.revalidate();
        panelContainer.repaint();
       
        try {
            Connection connection = DatabaseConnector.getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM useradmin WHERE 1 ";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String nama = resultSet.getString("namaLengkap");
                String nim = resultSet.getString("nim");
                String kontribusi = resultSet.getString("kontribusi");
                byte[] fotoBytes = resultSet.getBytes("foto");
                ImageIcon fotoIcon = new ImageIcon(fotoBytes);
                
                JPanel smallPanel = new cardAdmin(nama,nim,kontribusi,fotoIcon);
//                
                panelContainer.add(smallPanel);
                panelCount++;
            }

            connection.close();
        } catch (SQLException e) {
            System.out.println("daftar pesan kosong");
        }
    }
}
