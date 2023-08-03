/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_view;


import Service.*;
import View.Menu;
import View.Menu;
import config.DatabaseConnector;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author max
 */
public class tampilMobil1 {

    

    public tampilMobil1(String kode,String username, Menu menu ,String tampil, tampilMobil tampilMobil) {
        
        
                if (tampil.equals("daftarMobil")){
                    
                    // Create panel for each product
                    menu.getMerk().setText(tampilMobil.getMerk());
                    menu.getTipe().setText(tampilMobil.getTipe());
                    menu.getHarga().setText("Rp."+tampilMobil.getHarga()+"/Hari");
                    menu.getDeskripsi().setText(tampilMobil.getDeskripsi());
                    menu.getFoto().setIcon(tampilMobil.getFotoIcon());
                    menu.getKode().setText(tampilMobil.getKode());
                    
                    
                }else if (tampil.equals("favorit")){
                    
                    // Create panel for each product
                    menu.getMerk1().setText(tampilMobil.getMerk());
                    menu.getTipe1().setText(tampilMobil.getTipe());
                    menu.getHarga1().setText("Rp."+tampilMobil.getHarga()+"/Hari");
                    menu.getDeskripsi1().setText(tampilMobil.getDeskripsi());
                    menu.getFoto1().setIcon(tampilMobil.getFotoIcon());
                    menu.getKode1().setText(tampilMobil.getKode());
                }
                

        
        if (tampil.equals("daftarMobil")){
            CardLayout cl = (CardLayout)menu.getjPanel16().getLayout();
            cl.show(menu.getjPanel16(), "tampilMobil");
            tambahFavorit tambahFavorit = new tambahFavorit();

            if(tambahFavorit.validasiFavorit(username, kode)){
                menu.getjLabel29().setText("MOBIL DISIMPAN");
            }else{
                menu.getjLabel29().setText("SIMPAN FAVORIT");
            }
            tambahPesanan tambahPesanan = new tambahPesanan();

            if(tambahPesanan.validasiPesanan(username, kode)){
                menu.getjLabel28().setText("MOBIL DISEWA");
            }else{
                menu.getjLabel28().setText("SEWA MOBIL");
            }
        }else if (tampil.equals("favorit")){
            CardLayout cl = (CardLayout)menu.getjPanel23().getLayout();
            cl.show(menu.getjPanel23(), "tampilMobil");
            tambahFavorit tambahFavorit = new tambahFavorit();

            if(tambahFavorit.validasiFavorit(username, kode)){
                menu.getjLabel32().setText("MOBIL DISIMPAN");
            }else{
                menu.getjLabel32().setText("SIMPAN FAVORIT");
            }
            tambahPesanan tambahPesanan = new tambahPesanan();

            if(tambahPesanan.validasiPesanan(username, kode)){
                menu.getjLabel33().setText("MOBIL DISEWA");
            }else{
                menu.getjLabel33().setText("SEWA MOBIL");
            }
        }
    }
    
     
    

    
    
    

    

    
    
}
