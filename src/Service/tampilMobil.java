/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import View.Menu;
import Model_view.tampilPesanan3;
import config.DatabaseConnector;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author max
 */
public class tampilMobil {
    private ImageIcon fotoIcon;
    private String merk;
    private int harga;
    private String tipe;
    private String kode;
    private String status;
    private java.sql.Date tanggalPesan;
    private java.sql.Date tanggalBooking;
    private java.sql.Date tanggalKembali;
    private String penyewa;
    private int hargaPesanan;
    private int hari;
    private String statusMobil;
    private String deskripsi;

    public String getStatusMobil() {
        return statusMobil;
    }

    public void setStatusMobil(String statusMobil) {
        this.statusMobil = statusMobil;
    }
    

    public int getHari() {
        return hari;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }

    public int getHargaPesanan() {
        return hargaPesanan;
    }

    public void setHargaPesanan(int hargaPesanan) {
        this.hargaPesanan = hargaPesanan;
    }
    

    public String getPenyewa() {
        return penyewa;
    }

    public void setPenyewa(String penyewa) {
        this.penyewa = penyewa;
    }

    public Date getTanggalPesan() {
        return tanggalPesan;
    }

    public void setTanggalPesan(Date tanggalPesan) {
        this.tanggalPesan = tanggalPesan;
    }

    public Date getTanggalBooking() {
        return tanggalBooking;
    }

    public void setTanggalBooking(Date tanggalBooking) {
        this.tanggalBooking = tanggalBooking;
    }

    public Date getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(Date tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }
    public ImageIcon getFotoIcon() {
        return fotoIcon;
    }

    public void setFotoIcon(ImageIcon fotoIcon) {
        this.fotoIcon = fotoIcon;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    

    
    
    
    public tampilMobil(String kode) {
        Mobil(kode);
        Pesanan(kode);
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    public void Mobil(String kode1) {
        
        try {
            Connection connection = DatabaseConnector.getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM daftarMobil WHERE kode = '"+kode1+"'";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                kode = resultSet.getString("kode");
                tipe = resultSet.getString("tipe");
                merk = resultSet.getString("merk");
                statusMobil = resultSet.getString("status");
                
                harga = resultSet.getInt("harga");
                String deskripsi3 = resultSet.getString("deskripsi");
                byte[] fotoBytes = resultSet.getBytes("foto");
                fotoIcon = new ImageIcon(fotoBytes);
                deskripsi = resultSet.getString("deskripsi");
                
                
                
                
                
                
                // Create panel for each product
                
                

            }

            connection.close();
        } catch (SQLException e) {
            System.out.println("daftar pesan kosong");
        }
    }
    public void Pesanan(String kode1) {
        
        try {
            Connection connection = DatabaseConnector.getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM pesanan WHERE mobil = '"+kode1+"'";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                tanggalPesan = resultSet.getDate("tanggal");
                tanggalBooking = resultSet.getDate("tanggalBooking");
                tanggalKembali = resultSet.getDate("tanggalKembali");
                status = resultSet.getString("status");
                penyewa = resultSet.getString("username");
                hargaPesanan = resultSet.getInt("harga");
                hari = resultSet.getInt("hari");
                
                
                
                
                // Create panel for each product
                
                

            }

            connection.close();
        } catch (SQLException e) {
            System.out.println("daftar pesan kosong");
        }
    }

    
    
    

    

    
    
}
