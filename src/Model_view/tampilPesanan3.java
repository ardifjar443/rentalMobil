/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_view;

import Service.CurrencyFormatter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import Service.*;
import View.Menu;


/**
 *
 * @author max
 */
public class tampilPesanan3 extends javax.swing.JPanel {

    /**
     * Creates new form tampilPesanan
     */
    public tampilPesanan3(String kode,String username,Menu menu, tampilMobil tampil) {
        initComponents();
        jMerk.setText(tampil.getMerk());
        jTipe.setText(tampil.getTipe());
        String harga3 = CurrencyFormatter.formatToRupiah(tampil.getHarga());
        jHarga.setText("Rp."+harga3+"/Hari");
        jFoto.setIcon(ubahUkuran.resizeImageIcon(tampil.getFotoIcon(), 450));
        lihatMobil.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
//                CardLayout cl = (CardLayout)panel.getLayout();
//                cl.show(panel, "tampilMobil");
                  tambahPesanan pesan = new tambahPesanan();
                  pesan.tambahPesanan(username, kode, lihatMobil);
                  daftarPesanan.pesanan(menu.getjLabel40(),menu.getjLabel42(),username,1);
                    
                    
            }
                @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFoto = new javax.swing.JLabel();
        jTipe = new javax.swing.JLabel();
        jHarga = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lihatMobil = new javax.swing.JLabel();
        jMerk = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1085, 194));

        jFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/toyota-all-new-avanza-2015-tangkapan-layar_169-3.jpeg"))); // NOI18N

        jTipe.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jTipe.setText("AVANZA");

        jHarga.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jHarga.setText("Rp.500.000");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        lihatMobil.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lihatMobil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lihatMobil.setText("SUDAH TERSIMPAN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lihatMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lihatMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMerk.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jMerk.setForeground(new java.awt.Color(102, 102, 102));
        jMerk.setText("TOYOTA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFoto)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTipe)
                            .addComponent(jMerk))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jHarga)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jMerk)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTipe))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(jHarga)
                        .addContainerGap(53, Short.MAX_VALUE))
                    .addComponent(jFoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jFoto;
    private javax.swing.JLabel jHarga;
    private javax.swing.JLabel jMerk;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jTipe;
    private javax.swing.JLabel lihatMobil;
    // End of variables declaration//GEN-END:variables
}
