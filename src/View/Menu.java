package View;


import Model_view.panelKecil;
import javax.swing.*;
import java.awt.*;
import Service.*;
import java.sql.SQLException;
import Service.tambahFavorit;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;


public class Menu extends javax.swing.JFrame {

    

    private JPanel cards = new JPanel(new CardLayout());
    private CardLayout cardLayout;
//    MarketplaceApp panelProduct = new MarketplaceApp();
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

   
    
    private JPanel panelContainer;
    private JPanel panelContainer1;
    private JPanel panelContainer2;
    private JPanel panelContainer3;
    private JPanel panelContainer4;
    private int panelCount = 0;
    private int panelCount1 = 0;
    private int panelCount2 = 0;
    private int panelCount3 = 0;
    private int panelCount4 = 0;
    private final int panelWidth = 549;
    private final int panelHeight = 320;
    private String mobilTampil;
    private int hargaTotal;
    java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
    panelKecil panelKecil = new panelKecil();

    public String getMobilTampil() {
        return mobilTampil;
    }

    public void setMobilTampil(String mobilTampil) {
        this.mobilTampil = mobilTampil;
    }

    public JPanel getjPanel16() {
        return jPanel16;
    }

    public void setjPanel16(JPanel jPanel16) {
        this.jPanel16 = jPanel16;
    }

    public JLabel getMerk() {
        return merk;
    }

    public void setMerk(JLabel merk) {
        this.merk = merk;
    }

    public JTextArea getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(JTextArea deskripsi) {
        this.deskripsi = deskripsi;
    }

    public JLabel getFoto() {
        return foto;
    }

    public void setFoto(JLabel foto) {
        this.foto = foto;
    }

    public JLabel getKode() {
        return kode;
    }

    public void setKode(JLabel kode) {
        this.kode = kode;
    }

    public JLabel getTipe() {
        return tipe;
    }

    public void setTipe(JLabel tipe) {
        this.tipe = tipe;
    }

    public JLabel getHarga() {
        return harga;
    }

    public void setHarga(JLabel harga) {
        this.harga = harga;
    }

    public JLabel getjLabel28() {
        return jLabel28;
    }

    public void setjLabel28(JLabel jLabel28) {
        this.jLabel28 = jLabel28;
    }

    public JLabel getjLabel29() {
        return jLabel29;
    }

    public void setjLabel29(JLabel jLabel29) {
        this.jLabel29 = jLabel29;
    }

    public JLabel getjLabel32() {
        return jLabel32;
    }

    public void setjLabel32(JLabel jLabel32) {
        this.jLabel32 = jLabel32;
    }

    public JLabel getjLabel33() {
        return jLabel33;
    }

    public void setjLabel33(JLabel jLabel33) {
        this.jLabel33 = jLabel33;
    }

    public JTextArea getDeskripsi1() {
        return deskripsi1;
    }

    public void setDeskripsi1(JTextArea deskripsi1) {
        this.deskripsi1 = deskripsi1;
    }

    public JLabel getFoto1() {
        return foto1;
    }

    public void setFoto1(JLabel foto1) {
        this.foto1 = foto1;
    }

    public JLabel getHarga1() {
        return harga1;
    }

    public void setHarga1(JLabel harga1) {
        this.harga1 = harga1;
    }

    public JLabel getKode1() {
        return kode1;
    }

    public void setKode1(JLabel kode1) {
        this.kode1 = kode1;
    }

    public JLabel getTipe1() {
        return tipe1;
    }

    public void setTipe1(JLabel tipe1) {
        this.tipe1 = tipe1;
    }

    public JLabel getMerk1() {
        return merk1;
    }

    public void setMerk1(JLabel merk1) {
        this.merk1 = merk1;
    }

    public JPanel getjPanel23() {
        return jPanel23;
    }

    public void setjPanel23(JPanel jPanel23) {
        this.jPanel23 = jPanel23;
    }

    public JLabel getjLabel40() {
        return jLabel40;
    }

    public void setjLabel40(JLabel jLabel40) {
        this.jLabel40 = jLabel40;
    }

    public JLabel getjLabel42() {
        return jLabel42;
    }

    public void setjLabel42(JLabel jLabel42) {
        this.jLabel42 = jLabel42;
    }

    
    
    
    
    public Menu(String username1) {
        username = username1;
        
        initComponents();
//        percobaan();
//       this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        openMenu(panelTest,daftarMobil,jLabel4,jLabel5);
        updateSemua all = new updateSemua();
        
        dataUser data = new dataUser(username1);
        update(data);
        jUsername.setText(data.getUsername());
        jUser.setText(data.getNama());
        
        
        
        panelContainer = new JPanel();
        panelContainer.setLayout(new GridLayout(0, 2, 10, 10)); // Menggunakan GridLayout dengan 2 kolom
        JScrollPane scrollPane = new JScrollPane(panelContainer); // Memasukkan panelContainer ke dalam JScrollPane

        
        jPanel1.add(scrollPane, BorderLayout.CENTER);
        
        
        panelContainer1 = new JPanel();
        panelContainer1.setLayout(new GridLayout(0, 1, 10, 10)); // Menggunakan GridLayout dengan 2 kolom
        JScrollPane scrollPane1 = new JScrollPane(panelContainer1); // Memasukkan panelContainer ke dalam JScrollPane

        
        panel1Favorit.add(scrollPane1, BorderLayout.CENTER);
        panelContainer2 = new JPanel();
        panelContainer2.setLayout(new GridLayout(0, 1, 10, 10)); // Menggunakan GridLayout dengan 2 kolom
        JScrollPane scrollPane2 = new JScrollPane(panelContainer2); // Memasukkan panelContainer ke dalam JScrollPane
        panel1DaftarPesanan.add(scrollPane2, BorderLayout.CENTER);
        
        panelContainer3 = new JPanel();
        panelContainer3.setLayout(new GridLayout(0, 1, 10, 10)); // Menggunakan GridLayout dengan 2 kolom
        JScrollPane scrollPane3 = new JScrollPane(panelContainer3); // Memasukkan panelContainer ke dalam JScrollPane
        jPanel37.add(scrollPane3, BorderLayout.CENTER);
        
        panelContainer4 = new JPanel();
        panelContainer4.setLayout(new GridLayout(0, 3, 10, 10)); // Menggunakan GridLayout dengan 2 kolom
        JScrollPane scrollPane4 = new JScrollPane(panelContainer4); // Memasukkan panelContainer ke dalam JScrollPane
        panelAbout.add(scrollPane4, BorderLayout.CENTER);
        
        
        LocalDate hariIni = sqlDate.toLocalDate();
        tanggal.setText(String.format("%02d",hariIni.getDayOfMonth()));
        bulan.setText(String.format("%02d",hariIni.getMonthValue()));
        tahun.setText(String.format("%04d",hariIni.getYear()));

        pack();
        setLocationRelativeTo(null);

        deskripsi.setEditable(false);
 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel13 = new javax.swing.JPanel();
        jBrand = new javax.swing.JLabel();
        jHarga = new javax.swing.JLabel();
        jFoto = new javax.swing.JLabel();
        jTipe = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        lihatMobil = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        panelNavbar = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        tampilSaldo = new javax.swing.JLabel();
        jUsername = new javax.swing.JLabel();
        profil = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        panelTest = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        daftarMobil = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        topup = new javax.swing.JPanel();
        Ttopup = new javax.swing.JLabel();
        bFavorit = new javax.swing.JPanel();
        favorit = new javax.swing.JLabel();
        jPesanan = new javax.swing.JPanel();
        tPesanan = new javax.swing.JLabel();
        jPesanan1 = new javax.swing.JPanel();
        tPesanan1 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        topup1 = new javax.swing.JPanel();
        Ttopup1 = new javax.swing.JLabel();
        panelContent = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jUser = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        isiSaldo = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel49 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jPanel16 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        tampilMobil = new javax.swing.JPanel();
        tipe = new javax.swing.JLabel();
        foto = new javax.swing.JLabel();
        merk = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        deskripsi = new javax.swing.JTextArea();
        jPanel18 = new javax.swing.JPanel();
        harga = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        kode = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        searching = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        panelFavorit = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        panel1Favorit = new javax.swing.JPanel();
        tampilMobil1 = new javax.swing.JPanel();
        tipe1 = new javax.swing.JLabel();
        foto1 = new javax.swing.JLabel();
        merk1 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        deskripsi1 = new javax.swing.JTextArea();
        jPanel24 = new javax.swing.JPanel();
        harga1 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        kode1 = new javax.swing.JLabel();
        panelDaftarPesanan = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        panel1DaftarPesanan = new javax.swing.JPanel();
        tampilMobil2 = new javax.swing.JPanel();
        tipe2 = new javax.swing.JLabel();
        foto2 = new javax.swing.JLabel();
        merk2 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        deskripsi2 = new javax.swing.JTextArea();
        jPanel29 = new javax.swing.JPanel();
        harga2 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        kode2 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jumlahHari = new javax.swing.JTextField();
        jPanel40 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        tahun = new javax.swing.JTextField();
        bulan = new javax.swing.JTextField();
        tanggal = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        panelAbout = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(27, 107, 147), 5, true));
        jPanel13.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBrand.setText("TOYOTA");
        jPanel13.add(jBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jHarga.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jHarga.setText("Rp.150.000");
        jPanel13.add(jHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/toyota-all-new-avanza-2015-tangkapan-layar_169-3.jpeg"))); // NOI18N
        jPanel13.add(jFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 549, 230));

        jTipe.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jTipe.setText("avanza");
        jPanel13.add(jTipe, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 280, 64));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconStatusMobil/pngwing.com-2.png"))); // NOI18N
        jPanel13.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));

        jPanel14.setBackground(new java.awt.Color(162, 255, 134));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(27, 107, 147), 3));

        lihatMobil.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lihatMobil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lihatMobil.setText("Lihat Mobil");
        lihatMobil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lihatMobilMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lihatMobil, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lihatMobil, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel13.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 140, 40));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        panelNavbar.setBackground(new java.awt.Color(45, 67, 86));
        panelNavbar.setPreferredSize(new java.awt.Dimension(922, 80));

        jPanel4.setBackground(new java.awt.Color(45, 67, 86));

        tampilSaldo.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        tampilSaldo.setForeground(new java.awt.Color(255, 255, 255));
        tampilSaldo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tampilSaldo.setText("jLabel6");

        jUsername.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jUsername.setForeground(new java.awt.Color(255, 255, 255));
        jUsername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jUsername.setText("jLabel7");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(759, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tampilSaldo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tampilSaldo)
                .addGap(12, 12, 12))
        );

        profil.setForeground(new java.awt.Color(255, 255, 255));
        profil.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        profil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Car Fire.png"))); // NOI18N

        javax.swing.GroupLayout panelNavbarLayout = new javax.swing.GroupLayout(panelNavbar);
        panelNavbar.setLayout(panelNavbarLayout);
        panelNavbarLayout.setHorizontalGroup(
            panelNavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNavbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(profil, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addGap(261, 261, 261)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelNavbarLayout.setVerticalGroup(
            panelNavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNavbarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(profil)
                .addContainerGap())
        );

        getContentPane().add(panelNavbar, java.awt.BorderLayout.PAGE_START);

        panelMenu.setBackground(new java.awt.Color(67, 91, 102));
        panelMenu.setMinimumSize(new java.awt.Dimension(200, 100));

        panelTest.setBackground(new java.awt.Color(67, 91, 102));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MENU");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelTestLayout = new javax.swing.GroupLayout(panelTest);
        panelTest.setLayout(panelTestLayout);
        panelTestLayout.setHorizontalGroup(
            panelTestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTestLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        panelTestLayout.setVerticalGroup(
            panelTestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTestLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        daftarMobil.setBackground(new java.awt.Color(67, 91, 102));
        daftarMobil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                daftarMobilMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Daftar Mobil");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout daftarMobilLayout = new javax.swing.GroupLayout(daftarMobil);
        daftarMobil.setLayout(daftarMobilLayout);
        daftarMobilLayout.setHorizontalGroup(
            daftarMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(daftarMobilLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        daftarMobilLayout.setVerticalGroup(
            daftarMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(daftarMobilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        topup.setBackground(new java.awt.Color(67, 91, 102));
        topup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                topupMouseClicked(evt);
            }
        });

        Ttopup.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        Ttopup.setForeground(new java.awt.Color(255, 255, 255));
        Ttopup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ttopup.setText("TopUp");
        Ttopup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TtopupMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout topupLayout = new javax.swing.GroupLayout(topup);
        topup.setLayout(topupLayout);
        topupLayout.setHorizontalGroup(
            topupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topupLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Ttopup, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        topupLayout.setVerticalGroup(
            topupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topupLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Ttopup, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        bFavorit.setBackground(new java.awt.Color(67, 91, 102));
        bFavorit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bFavoritMouseClicked(evt);
            }
        });

        favorit.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        favorit.setForeground(new java.awt.Color(255, 255, 255));
        favorit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        favorit.setText("Favorit");
        favorit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                favoritMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bFavoritLayout = new javax.swing.GroupLayout(bFavorit);
        bFavorit.setLayout(bFavoritLayout);
        bFavoritLayout.setHorizontalGroup(
            bFavoritLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bFavoritLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(favorit, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        bFavoritLayout.setVerticalGroup(
            bFavoritLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bFavoritLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(favorit, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPesanan.setBackground(new java.awt.Color(67, 91, 102));
        jPesanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPesananMouseClicked(evt);
            }
        });

        tPesanan.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        tPesanan.setForeground(new java.awt.Color(255, 255, 255));
        tPesanan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tPesanan.setText("Pesanan");
        tPesanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tPesananMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPesananLayout = new javax.swing.GroupLayout(jPesanan);
        jPesanan.setLayout(jPesananLayout);
        jPesananLayout.setHorizontalGroup(
            jPesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPesananLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(tPesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPesananLayout.setVerticalGroup(
            jPesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPesananLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tPesanan, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPesanan1.setBackground(new java.awt.Color(67, 91, 102));
        jPesanan1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPesanan1MouseClicked(evt);
            }
        });

        tPesanan1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        tPesanan1.setForeground(new java.awt.Color(255, 255, 255));
        tPesanan1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tPesanan1.setText("Daftar Pesanan");
        tPesanan1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tPesanan1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPesanan1Layout = new javax.swing.GroupLayout(jPesanan1);
        jPesanan1.setLayout(jPesanan1Layout);
        jPesanan1Layout.setHorizontalGroup(
            jPesanan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPesanan1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(tPesanan1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPesanan1Layout.setVerticalGroup(
            jPesanan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPesanan1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tPesanan1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        tPesanan1.getAccessibleContext().setAccessibleName("daftarPesanan");

        jPanel22.setBackground(new java.awt.Color(27, 107, 147));
        jPanel22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(67, 91, 102), 5, true));

        jLabel26.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("LogOut");
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        topup1.setBackground(new java.awt.Color(67, 91, 102));
        topup1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                topup1MouseClicked(evt);
            }
        });

        Ttopup1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        Ttopup1.setForeground(new java.awt.Color(255, 255, 255));
        Ttopup1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ttopup1.setText("About Us");
        Ttopup1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ttopup1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout topup1Layout = new javax.swing.GroupLayout(topup1);
        topup1.setLayout(topup1Layout);
        topup1Layout.setHorizontalGroup(
            topup1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topup1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Ttopup1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        topup1Layout.setVerticalGroup(
            topup1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topup1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Ttopup1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(daftarMobil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(topup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bFavorit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPesanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                        .addComponent(jPesanan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(topup1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(daftarMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bFavorit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPesanan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPesanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(topup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(topup1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 494, Short.MAX_VALUE)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        getContentPane().add(panelMenu, java.awt.BorderLayout.LINE_START);

        panelContent.setBackground(new java.awt.Color(255, 255, 255));
        panelContent.setLayout(new java.awt.CardLayout());

        jPanel7.setBackground(new java.awt.Color(22, 75, 96));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(79, 192, 208));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Telugu Sangam MN", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("MOBIL PILIHAN");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 220, -1));

        jLabel1.setFont(new java.awt.Font("Telugu Sangam MN", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DALAM MEMILIH");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 220, -1));

        jLabel3.setFont(new java.awt.Font("Telugu Sangam MN", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("UNTUK ANDA");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 220, -1));

        jLabel21.setFont(new java.awt.Font("Telugu Sangam MN", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("YANG TERBAIK");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 220, -1));

        jPanel10.setBackground(new java.awt.Color(22, 75, 96));
        jPanel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 192, 208), 3, true));

        jLabel10.setFont(new java.awt.Font("Bangla MN", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Lihat Daftar Mobil");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 770, -1, -1));

        jPanel7.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(985, -6, 730, 1010));

        jPanel9.setBackground(new java.awt.Color(27, 107, 147));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/RENTAL v1,2-2.png"))); // NOI18N
        jPanel9.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jPanel7.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 1040, 830));

        jLabel9.setBackground(new java.awt.Color(67, 91, 102));
        jLabel9.setFont(new java.awt.Font("Telugu MN", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("SELAMAT DATANG");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 60, 600, 70));

        jUser.setBackground(new java.awt.Color(67, 91, 102));
        jUser.setFont(new java.awt.Font("Telugu MN", 1, 48)); // NOI18N
        jUser.setForeground(new java.awt.Color(255, 255, 255));
        jUser.setText("user");
        jUser.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel7.add(jUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 240, 60));

        panelContent.add(jPanel7, "menu2");

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(22, 75, 96));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atm_money_cash_icon_221004_1.png"))); // NOI18N
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 390, -1, -1));

        jPanel11.setBackground(new java.awt.Color(79, 192, 208));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo DANA (PNG-240p) - FileVector69-3.png"))); // NOI18N
        jPanel11.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo OVO (PNG-240p) - FileVector69-2-2.png"))); // NOI18N
        jPanel11.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo GoPay (PNG-240p) - FileVector69-2.png"))); // NOI18N
        jPanel11.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Bank BNI Logo (PNG-240p) - FileVector69-2.png"))); // NOI18N
        jPanel11.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ATM Bersama Logo (PNG-240p) - FileVector69-2.png"))); // NOI18N
        jPanel11.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 750, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Bank BCA Logo (PNG-240p) - FileVector69-2.png"))); // NOI18N
        jPanel11.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Bank BRI (Bank Rakyat Indonesia) Logo (PNG-240p) - FileVector69-2.png"))); // NOI18N
        jPanel11.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 540, -1, -1));

        jLabel19.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel19.setText("Support By:");
        jPanel11.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 30));

        jPanel8.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1045, -6, 710, 1020));

        isiSaldo.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        isiSaldo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        isiSaldo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 36, 29), 5));
        jPanel8.add(isiSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 410, 60));

        jPanel12.setBackground(new java.awt.Color(255, 206, 86));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 36, 29), 5));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("TOP UP");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel8.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 240, 60));

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(226, 226, 226));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("TOPUP DISINI");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 560, 110));

        jPanel6.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1740, 870));

        panelContent.add(jPanel6, "topup");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(22, 75, 96), 5));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Green Circle(2).png"))); // NOI18N
        jLabel45.setText("Ready");

        jLabel46.setText("Keterangan:");

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Yellow Circle(2).png"))); // NOI18N
        jLabel47.setText("Dibooking");

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Red Circle(2).png"))); // NOI18N
        jLabel48.setText("Disewa");

        jPanel38.setBackground(new java.awt.Color(27, 107, 147));
        jPanel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(22, 75, 96), 3));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jCheckBox1);
        jCheckBox1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("SUV");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jCheckBox2);
        jCheckBox2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("MVP");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Sorting:");

        buttonGroup1.add(jCheckBox3);
        jCheckBox3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setText("SPORT");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jCheckBox4);
        jCheckBox4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setText("PICKUP");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jCheckBox5);
        jCheckBox5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jCheckBox5.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox5.setText("MINI MVP");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jCheckBox6);
        jCheckBox6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jCheckBox6.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setText("LCGC");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jCheckBox7);
        jCheckBox7.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jCheckBox7.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox7.setText("MINIBUS MVP");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jCheckBox8);
        jCheckBox8.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jCheckBox8.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox8.setText("ELECTRIC CAR");
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        jCheckBox10.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jCheckBox10);
        jCheckBox10.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jCheckBox10.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox10.setText("SEMUA");
        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox8)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel49))
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox10))
                .addGap(0, 23, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox8)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45)
                            .addComponent(jLabel46)
                            .addComponent(jLabel47)
                            .addComponent(jLabel48))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel48)
                .addGap(66, 66, 66)
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.setLayout(new java.awt.CardLayout());

        jPanel1.setLayout(new java.awt.BorderLayout());
        jPanel16.add(jPanel1, "listMobil");

        tampilMobil.setBackground(new java.awt.Color(255, 255, 255));
        tampilMobil.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 75, 96), 5, true));

        tipe.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        tipe.setText("AVANZA");

        foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/toyota-all-new-avanza-2015-tangkapan-layar_169.jpeg"))); // NOI18N

        merk.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        merk.setText("TOYOTA");

        jLabel23.setText("Deskripsi: ");

        deskripsi.setEditable(false);
        deskripsi.setColumns(20);
        deskripsi.setRows(5);
        deskripsi.setText("warna = hitam");
        deskripsi.setBorder(null);
        deskripsi.setCaretColor(new java.awt.Color(255, 255, 255));
        deskripsi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        deskripsi.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(deskripsi);

        jPanel18.setBackground(new java.awt.Color(27, 107, 147));
        jPanel18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 75, 96), 5, true));

        harga.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        harga.setForeground(new java.awt.Color(255, 255, 255));
        harga.setText("Rp.1000000/Hari");

        jLabel27.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Sewa Mobil ini Dengan Tarif:");

        jPanel19.setBackground(new java.awt.Color(79, 192, 208));
        jPanel19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 75, 96), 5, true));

        jLabel29.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("SIMPAN KE FAVORIT");
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jPanel20.setBackground(new java.awt.Color(162, 255, 134));
        jPanel20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 75, 96), 5, true));

        jLabel28.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("SEWA SEKARANG");
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(harga)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(harga)
                .addGap(50, 50, 50)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );

        jPanel21.setBackground(new java.awt.Color(27, 107, 147));
        jPanel21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 75, 96), 5, true));

        jLabel30.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Kembali Ke Daftar Mobil");
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        kode.setForeground(new java.awt.Color(102, 102, 102));
        kode.setText("M01");

        javax.swing.GroupLayout tampilMobilLayout = new javax.swing.GroupLayout(tampilMobil);
        tampilMobil.setLayout(tampilMobilLayout);
        tampilMobilLayout.setHorizontalGroup(
            tampilMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tampilMobilLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(tampilMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tampilMobilLayout.createSequentialGroup()
                        .addComponent(merk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 706, Short.MAX_VALUE)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tampilMobilLayout.createSequentialGroup()
                        .addGroup(tampilMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(tampilMobilLayout.createSequentialGroup()
                        .addGroup(tampilMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kode)
                            .addComponent(tipe, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tampilMobilLayout.setVerticalGroup(
            tampilMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tampilMobilLayout.createSequentialGroup()
                .addGroup(tampilMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tampilMobilLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(merk))
                    .addGroup(tampilMobilLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(tampilMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tampilMobilLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(tampilMobilLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(tipe, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kode)
                        .addGap(16, 16, 16)
                        .addComponent(foto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(jLabel23)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jPanel16.add(tampilMobil, "tampilMobil");

        searching.setForeground(new java.awt.Color(153, 153, 153));
        searching.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searching.setText("Searching");
        searching.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        searching.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchingActionPerformed(evt);
            }
        });

        jPanel15.setBackground(new java.awt.Color(27, 107, 147));
        jPanel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 75, 96), 4, true));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconStatusMobil/Unknown Results.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6)
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searching, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(searching))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(8, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 1133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(189, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(821, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(122, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        panelContent.add(jPanel2, "daftarMobil");

        jPanel23.setLayout(new java.awt.CardLayout());

        panel1Favorit.setLayout(new java.awt.BorderLayout());
        jPanel23.add(panel1Favorit, "listFavorit");

        tampilMobil1.setBackground(new java.awt.Color(255, 255, 255));
        tampilMobil1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 75, 96), 5, true));

        tipe1.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        tipe1.setText("AVANZA");

        foto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/toyota-all-new-avanza-2015-tangkapan-layar_169.jpeg"))); // NOI18N

        merk1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        merk1.setText("TOYOTA");

        jLabel24.setText("Deskripsi: ");

        deskripsi1.setEditable(false);
        deskripsi1.setColumns(20);
        deskripsi1.setRows(5);
        deskripsi1.setText("warna = hitam");
        deskripsi1.setBorder(null);
        deskripsi1.setCaretColor(new java.awt.Color(255, 255, 255));
        deskripsi1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        deskripsi1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(deskripsi1);

        jPanel24.setBackground(new java.awt.Color(27, 107, 147));
        jPanel24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 75, 96), 5, true));

        harga1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        harga1.setForeground(new java.awt.Color(255, 255, 255));
        harga1.setText("Rp.1000000/Hari");

        jLabel31.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Sewa Mobil ini Dengan Tarif:");

        jPanel25.setBackground(new java.awt.Color(79, 192, 208));
        jPanel25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 75, 96), 5, true));

        jLabel32.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("SIMPAN KE FAVORIT");
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jPanel26.setBackground(new java.awt.Color(162, 255, 134));
        jPanel26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 75, 96), 5, true));

        jLabel33.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("SEWA SEKARANG");
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(harga1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(harga1)
                .addGap(50, 50, 50)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );

        jPanel27.setBackground(new java.awt.Color(27, 107, 147));
        jPanel27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 75, 96), 5, true));

        jLabel34.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Kembali Ke Daftar Mobil");
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        kode1.setForeground(new java.awt.Color(102, 102, 102));
        kode1.setText("M01");

        javax.swing.GroupLayout tampilMobil1Layout = new javax.swing.GroupLayout(tampilMobil1);
        tampilMobil1.setLayout(tampilMobil1Layout);
        tampilMobil1Layout.setHorizontalGroup(
            tampilMobil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tampilMobil1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(tampilMobil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tampilMobil1Layout.createSequentialGroup()
                        .addComponent(merk1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 863, Short.MAX_VALUE)
                        .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tampilMobil1Layout.createSequentialGroup()
                        .addGroup(tampilMobil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(foto1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(tampilMobil1Layout.createSequentialGroup()
                        .addGroup(tampilMobil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kode1)
                            .addComponent(tipe1, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tampilMobil1Layout.setVerticalGroup(
            tampilMobil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tampilMobil1Layout.createSequentialGroup()
                .addGroup(tampilMobil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tampilMobil1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(merk1))
                    .addGroup(tampilMobil1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(tampilMobil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tampilMobil1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(tampilMobil1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(tipe1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kode1)
                        .addGap(16, 16, 16)
                        .addComponent(foto1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel24)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel23.add(tampilMobil1, "tampilMobil");

        javax.swing.GroupLayout panelFavoritLayout = new javax.swing.GroupLayout(panelFavorit);
        panelFavorit.setLayout(panelFavoritLayout);
        panelFavoritLayout.setHorizontalGroup(
            panelFavoritLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFavoritLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, 1290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFavoritLayout.setVerticalGroup(
            panelFavoritLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFavoritLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        panelContent.add(panelFavorit, "favorit");

        jPanel28.setPreferredSize(new java.awt.Dimension(100, 696));
        jPanel28.setLayout(new java.awt.CardLayout());

        panel1DaftarPesanan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(22, 75, 96), 5));
        panel1DaftarPesanan.setLayout(new java.awt.BorderLayout());
        jPanel28.add(panel1DaftarPesanan, "listFavorit");

        tampilMobil2.setBackground(new java.awt.Color(255, 255, 255));
        tampilMobil2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 75, 96), 5, true));

        tipe2.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        tipe2.setText("AVANZA");

        foto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/toyota-all-new-avanza-2015-tangkapan-layar_169.jpeg"))); // NOI18N

        merk2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        merk2.setText("TOYOTA");

        jLabel25.setText("Deskripsi: ");

        deskripsi2.setEditable(false);
        deskripsi2.setColumns(20);
        deskripsi2.setRows(5);
        deskripsi2.setText("warna = hitam");
        deskripsi2.setBorder(null);
        deskripsi2.setCaretColor(new java.awt.Color(255, 255, 255));
        deskripsi2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        deskripsi2.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(deskripsi2);

        jPanel29.setBackground(new java.awt.Color(27, 107, 147));
        jPanel29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 75, 96), 5, true));

        harga2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        harga2.setForeground(new java.awt.Color(255, 255, 255));
        harga2.setText("Rp.1000000/Hari");

        jLabel35.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Sewa Mobil ini Dengan Tarif:");

        jPanel30.setBackground(new java.awt.Color(79, 192, 208));
        jPanel30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 75, 96), 5, true));

        jLabel36.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("SIMPAN KE FAVORIT");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jPanel31.setBackground(new java.awt.Color(162, 255, 134));
        jPanel31.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 75, 96), 5, true));

        jLabel37.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("SEWA SEKARANG");
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel37MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addComponent(harga2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(harga2)
                .addGap(50, 50, 50)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );

        jPanel32.setBackground(new java.awt.Color(27, 107, 147));
        jPanel32.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 75, 96), 5, true));

        jLabel38.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Kembali Ke Daftar Favorit");
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel38MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        kode2.setForeground(new java.awt.Color(102, 102, 102));
        kode2.setText("M01");

        javax.swing.GroupLayout tampilMobil2Layout = new javax.swing.GroupLayout(tampilMobil2);
        tampilMobil2.setLayout(tampilMobil2Layout);
        tampilMobil2Layout.setHorizontalGroup(
            tampilMobil2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tampilMobil2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(tampilMobil2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tampilMobil2Layout.createSequentialGroup()
                        .addGroup(tampilMobil2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kode2)
                            .addComponent(tipe2, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(490, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tampilMobil2Layout.createSequentialGroup()
                        .addGroup(tampilMobil2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(foto2, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tampilMobil2Layout.createSequentialGroup()
                        .addComponent(merk2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        tampilMobil2Layout.setVerticalGroup(
            tampilMobil2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tampilMobil2Layout.createSequentialGroup()
                .addGroup(tampilMobil2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tampilMobil2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(merk2))
                    .addGroup(tampilMobil2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(tampilMobil2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tampilMobil2Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(tampilMobil2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(tipe2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kode2)
                        .addGap(16, 16, 16)
                        .addComponent(foto2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(jLabel25)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel28.add(tampilMobil2, "tampilMobil");

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));
        jPanel33.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 75, 96), 5, true));
        jPanel33.setPreferredSize(new java.awt.Dimension(1223, 213));

        jLabel39.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel39.setText("DAFTAR MOBIL: ");

        jLabel40.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel40.setText("jLabel40");

        jLabel41.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel41.setText("TOTAL:");

        jLabel42.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel42.setText("jLabel42");

        jPanel34.setBackground(new java.awt.Color(27, 107, 147));
        jPanel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(22, 75, 96), 5));

        jLabel43.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("PESAN SEKARANG");
        jLabel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel43MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel35.setBackground(new java.awt.Color(27, 107, 147));
        jPanel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(22, 75, 96), 5));
        jPanel35.setForeground(new java.awt.Color(22, 75, 96));

        jLabel44.setBackground(new java.awt.Color(51, 255, 51));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Hexagon Reload.png"))); // NOI18N
        jLabel44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel44MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel39.setBackground(new java.awt.Color(27, 107, 147));
        jPanel39.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 75, 96), 3, true));

        jumlahHari.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jumlahHari.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jumlahHari.setText("1");
        jumlahHari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahHariActionPerformed(evt);
            }
        });

        jPanel40.setBackground(new java.awt.Color(27, 107, 147));
        jPanel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel40MouseClicked(evt);
            }
        });

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Plus.png"))); // NOI18N

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel41.setBackground(new java.awt.Color(27, 107, 147));
        jPanel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel41MouseClicked(evt);
            }
        });

        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Minus.png"))); // NOI18N

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel41Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jumlahHari, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jumlahHari, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel42.setBackground(new java.awt.Color(27, 107, 147));
        jPanel42.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 75, 96), 5, true));

        tahun.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tahun.setText("2023");
        tahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tahunActionPerformed(evt);
            }
        });

        bulan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bulan.setText("00");
        bulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bulanActionPerformed(evt);
            }
        });

        tanggal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tanggal.setText("00");
        tanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tahun, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bulan, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tanggal, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(bulan)
                    .addComponent(tahun))
                .addContainerGap())
        );

        jLabel50.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel50.setText("Berapa hari sewa :");

        jLabel51.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel51.setText("Tanggal Booking:");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel42)))
                .addContainerGap())
            .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel33Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addGap(1117, 1117, 1117)))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel42)
                        .addComponent(jLabel41))
                    .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel39)
                        .addComponent(jLabel40)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel33Layout.createSequentialGroup()
                    .addGap(58, 58, 58)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(92, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout panelDaftarPesananLayout = new javax.swing.GroupLayout(panelDaftarPesanan);
        panelDaftarPesanan.setLayout(panelDaftarPesananLayout);
        panelDaftarPesananLayout.setHorizontalGroup(
            panelDaftarPesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDaftarPesananLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDaftarPesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, 1322, Short.MAX_VALUE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDaftarPesananLayout.setVerticalGroup(
            panelDaftarPesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDaftarPesananLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelContent.add(panelDaftarPesanan, "daftarPesanan");

        jPanel37.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, 1318, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, 887, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelContent.add(jPanel36, "pesanan");

        panelAbout.setBackground(new java.awt.Color(79, 192, 208));
        panelAbout.setLayout(new java.awt.BorderLayout());

        jLabel54.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel54.setText("Anggota");

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAbout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGap(499, 499, 499)
                .addComponent(jLabel54)
                .addContainerGap(673, Short.MAX_VALUE))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel54)
                .addGap(18, 18, 18)
                .addComponent(panelAbout, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelContent.add(jPanel43, "panelAbout");

        getContentPane().add(panelContent, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1566, 1007));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        openMenu(panelTest,daftarMobil,jLabel4,jLabel5);
        openMenu(panelTest,topup,jLabel4,Ttopup);
        openMenu(panelTest,topup1,jLabel4,Ttopup1);
        openMenu(panelTest,jPesanan,jLabel4,tPesanan);
        openMenu(panelTest,jPesanan1,jLabel4,tPesanan1);
        openMenu(panelTest,bFavorit,jLabel4,favorit);
        CardLayout cl = (CardLayout)panelContent.getLayout();
        cl.show(panelContent, "menu2");
        
        

    }//GEN-LAST:event_jLabel4MouseClicked

    public JPanel getjPanel13() {
        return jPanel13;
    }

    public void setjPanel13(JPanel jPanel13) {
        this.jPanel13 = jPanel13;
    }

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)panelContent.getLayout();
        cl.show(panelContent, "daftarMobil");
        
        openMenu(daftarMobil,panelTest,jLabel5,jLabel4);
        openMenu(daftarMobil,topup,jLabel5,Ttopup);
        openMenu(daftarMobil,topup1,jLabel5,Ttopup1);
        openMenu(daftarMobil,jPesanan,jLabel5,tPesanan);
        openMenu(daftarMobil,jPesanan1,jLabel5,tPesanan1);
        openMenu(daftarMobil,bFavorit,jLabel5,favorit);
        
        CardLayout cl1 = (CardLayout)jPanel16.getLayout();
        cl1.show(jPanel16, "listMobil");
        panelKecil.addSmallPanel("SELECT * FROM daftarMobil WHERE status = 'ready'",username,panelCount,panelContainer,this);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void daftarMobilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_daftarMobilMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_daftarMobilMouseClicked
    
    
    private void TtopupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TtopupMouseClicked
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)panelContent.getLayout();
        cl.show(panelContent, "topup");
        
        openMenu(topup,daftarMobil,Ttopup,jLabel5);
        openMenu(topup,panelTest,Ttopup,jLabel4);
        openMenu(topup,jPesanan,Ttopup,tPesanan);
        openMenu(topup,jPesanan1,Ttopup,tPesanan1);
        openMenu(topup,bFavorit,Ttopup,favorit);
        openMenu(topup,topup1,Ttopup,Ttopup1);
    }//GEN-LAST:event_TtopupMouseClicked

    private void topupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topupMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_topupMouseClicked

    private void favoritMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_favoritMouseClicked
        // TODO add your handling code here:
        panelKecil.addSmallPanel1(username,panelCount1,panelContainer1,this);
        CardLayout cl = (CardLayout)panelContent.getLayout();
        cl.show(panelContent, "favorit");
        openMenu(bFavorit,daftarMobil,favorit,jLabel5);
        openMenu(bFavorit,panelTest,favorit,jLabel4);
        openMenu(bFavorit,jPesanan,favorit,tPesanan);
        openMenu(bFavorit,jPesanan1,favorit,tPesanan1);
        openMenu(bFavorit,topup,favorit,Ttopup);
        openMenu(bFavorit,topup1,favorit,Ttopup1);
        
        
    }//GEN-LAST:event_favoritMouseClicked
    private void tampilMobilMouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)panelContent.getLayout();
        cl.show(panelContent, "tampilMobil");
        System.out.println("ehe");
        
    } 
    private void bFavoritMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bFavoritMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bFavoritMouseClicked

    private void tPesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tPesananMouseClicked
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)panelContent.getLayout();
        cl.show(panelContent, "pesanan");
        openMenu(jPesanan,panelTest,tPesanan,jLabel4);
        openMenu(jPesanan,topup,tPesanan,Ttopup);
        openMenu(jPesanan,topup1,tPesanan,Ttopup1);
        openMenu(jPesanan,daftarMobil,tPesanan,jLabel5);
        openMenu(jPesanan,bFavorit,tPesanan,favorit);
        openMenu(jPesanan,jPesanan1,tPesanan,tPesanan1);
        panelKecil.addSmallPanel3(username,panelCount3,panelContainer3,this);
        
        
        
    }//GEN-LAST:event_tPesananMouseClicked

    private void jPesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPesananMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPesananMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        int saldo = Integer.parseInt(isiSaldo.getText());
        topUp.isi(saldo, username);
        JOptionPane.showMessageDialog(null, "TopUp anda berhasil sebesar : "+saldo);
        isiSaldo.setText("");
        dataUser data = new dataUser(username);
        update(data);
        
        
    }//GEN-LAST:event_jLabel8MouseClicked

    private void lihatMobilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lihatMobilMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_lihatMobilMouseClicked

    private void searchingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchingActionPerformed
        // TODO add your handling code here:
        System.out.println("ehe");
    }//GEN-LAST:event_searchingActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
//        CardLayout cl = (CardLayout)panelContent.getLayout();
//        cl.show(panelContent, "daftarMobil");
//        
//       
        CardLayout cl = (CardLayout)panelContent.getLayout();
        cl.show(panelContent, "daftarMobil");
        
        openMenu(daftarMobil,panelTest,jLabel5,jLabel4);
        openMenu(daftarMobil,topup,jLabel5,Ttopup);
        openMenu(daftarMobil,topup1,jLabel5,Ttopup1);
        openMenu(daftarMobil,jPesanan,jLabel5,tPesanan);
        openMenu(daftarMobil,jPesanan1,jLabel5,tPesanan1);
        openMenu(daftarMobil,bFavorit,jLabel5,favorit);
        
        
        
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)jPanel16.getLayout();
        cl.show(jPanel16, "listMobil");
        panelKecil.addSmallPanel("SELECT * FROM daftarMobil WHERE status = 'ready'",username,panelCount,panelContainer,this);
        
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)jPanel23.getLayout();
        cl.show(jPanel23, "listFavorit");
    }//GEN-LAST:event_jLabel34MouseClicked

    private void tPesanan1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tPesanan1MouseClicked
        // TODO add your handling code here:
        openMenu(jPesanan1,panelTest,tPesanan,jLabel4);
        openMenu(jPesanan1,topup,tPesanan,Ttopup);
        openMenu(jPesanan1,topup1,tPesanan,Ttopup1);
        openMenu(jPesanan1,daftarMobil,tPesanan,jLabel5);
        openMenu(jPesanan1,jPesanan,tPesanan1,tPesanan);
        openMenu(jPesanan1,bFavorit,tPesanan1,favorit);
        CardLayout cl = (CardLayout)panelContent.getLayout();
        cl.show(panelContent, "daftarPesanan");
        panelKecil.addSmallPanel2(username,panelCount2,panelContainer2,this);
        daftarPesanan.pesanan(jLabel40,jLabel42,username,1);
        
    }//GEN-LAST:event_tPesanan1MouseClicked

    private void jPesanan1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPesanan1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPesanan1MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        // TODO add your handling code here:
        formLogin login = new formLogin();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
        // TODO add your handling code here:
        tambahFavorit tambahFavorit = new tambahFavorit();
        
        tambahFavorit.tambahFavorit(username, kode.getText(),jLabel29);
        
        
        
        
        
        
        
    }//GEN-LAST:event_jLabel29MouseClicked

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
        // TODO add your handling code here:
        tambahFavorit tambahFavorit = new tambahFavorit();
        
        tambahFavorit.tambahFavorit(username, kode1.getText(),jLabel32);
        
         panelKecil.addSmallPanel1(username,panelCount1,panelContainer1,this);
        
    }//GEN-LAST:event_jLabel32MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        // TODO add your handling code here:
        tambahPesanan pesan = new tambahPesanan();
        pesan.tambahPesanan(username, kode.getText(), jLabel28);
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseClicked
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)jPanel28.getLayout();
        cl.show(jPanel28, "listFavorit");
    }//GEN-LAST:event_jLabel38MouseClicked

    private void jLabel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel37MouseClicked

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        // TODO add your handling code here:
        tambahPesanan pesan = new tambahPesanan();
        pesan.tambahPesanan(username, kode1.getText(), jLabel33);
    }//GEN-LAST:event_jLabel33MouseClicked

    private void jLabel44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel44MouseClicked
        // TODO add your handling code here:
        daftarPesanan.pesanan(jLabel40,jLabel42,username,1);
        panelKecil.addSmallPanel2(username,panelCount2,panelContainer2,this);
    }//GEN-LAST:event_jLabel44MouseClicked

    private void jLabel43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MouseClicked
        if(setTanggal(bulan.getText(),tanggal.getText()) == null){
            JOptionPane.showMessageDialog(null, "Format tanggal tidak valid. Pastikan tanggalnya benar");
        }else{
        try {
            // TODO add your handling code here:
            pesan pesan = new pesan(username,Integer.valueOf(jumlahHari.getText()),setTanggal(bulan.getText(),tanggal.getText()));
            panelKecil.addSmallPanel2(username,panelCount2,panelContainer2,this);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Format Tanggal salah, tolong masukan dengan format YYYY-MM-DD");
        }
        int harga=CurrencyFormatter.convertRupiahStringToInt(jLabel42.getText());
        System.out.println(harga);
        topUp.isi(harga-(harga*2), username);
        dataUser data = new dataUser(username);
        update(data);
        }
    }//GEN-LAST:event_jLabel43MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        String cari = searching.getText();
        panelKecil.addSmallPanel("SELECT * FROM daftarMobil WHERE merk ='"+cari+"' OR kode ='"+cari+"' OR tipe ='"+cari+"' OR type ='"+cari+"'",username,panelCount,panelContainer,this);
        
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        panelKecil.addSmallPanel("SELECT * FROM daftarMobil WHERE type = 'SUV'",username,panelCount,panelContainer,this);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
        panelKecil.addSmallPanel("SELECT * FROM daftarMobil WHERE type = 'MVP'",username,panelCount,panelContainer,this);
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
        panelKecil.addSmallPanel("SELECT * FROM daftarMobil WHERE type = 'SPORT'",username,panelCount,panelContainer,this);
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
        panelKecil.addSmallPanel("SELECT * FROM daftarMobil WHERE type = 'PICKUP'",username,panelCount,panelContainer,this);
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        // TODO add your handling code here:
        panelKecil.addSmallPanel("SELECT * FROM daftarMobil WHERE type = 'MINI MVP'",username,panelCount,panelContainer,this);
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        // TODO add your handling code here:
        panelKecil.addSmallPanel("SELECT * FROM daftarMobil WHERE type = 'LCGC'",username,panelCount,panelContainer,this);
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        // TODO add your handling code here:
        panelKecil.addSmallPanel("SELECT * FROM daftarMobil WHERE type = 'MINIBUS MVP'",username,panelCount,panelContainer,this);
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        // TODO add your handling code here:
        panelKecil.addSmallPanel("SELECT * FROM daftarMobil WHERE type = 'ELECTRIC CAR'",username,panelCount,panelContainer,this);
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
        // TODO add your handling code here:
        
        
        panelKecil.addSmallPanel("SELECT * FROM daftarMobil",username,panelCount,panelContainer,this);
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private void jumlahHariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahHariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahHariActionPerformed

    private void jPanel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel40MouseClicked
        // TODO add your handling code here:
        int hari = Integer.valueOf(jumlahHari.getText());
        hari++;
        jumlahHari.setText(String.valueOf(hari));
        daftarPesanan.pesanan(jLabel40,jLabel42,username,hari);
    }//GEN-LAST:event_jPanel40MouseClicked

    private void jPanel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel41MouseClicked
        // TODO add your handling code here:
        int hari = Integer.valueOf(jumlahHari.getText());
        if (hari != 1){
            hari--;
            jumlahHari.setText(String.valueOf(hari));
        }
        daftarPesanan.pesanan(jLabel40,jLabel42,username,hari);
        
        
    }//GEN-LAST:event_jPanel41MouseClicked

    private void tahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tahunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tahunActionPerformed

    private void bulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bulanActionPerformed
        // TODO add your handling code here:
        setTanggal(bulan.getText(),tanggal.getText());
    }//GEN-LAST:event_bulanActionPerformed

    private void tanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggalActionPerformed
        // TODO add your handling code here:
        setTanggal(bulan.getText(),tanggal.getText());
    }//GEN-LAST:event_tanggalActionPerformed

    private void Ttopup1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ttopup1MouseClicked
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)panelContent.getLayout();
        cl.show(panelContent, "panelAbout");
        panelKecil.addSmallPanel4(panelCount4,panelContainer4);
        
        openMenu(topup1,daftarMobil,Ttopup1,jLabel5);
        openMenu(topup1,panelTest,Ttopup1,jLabel4);
        openMenu(topup1,jPesanan,Ttopup1,tPesanan);
        openMenu(topup1,jPesanan1,Ttopup1,tPesanan1);
        openMenu(topup1,bFavorit,Ttopup1,favorit);
        openMenu(topup1,topup,Ttopup1,Ttopup);
        
    }//GEN-LAST:event_Ttopup1MouseClicked

    private void topup1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topup1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_topup1MouseClicked

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ttopup;
    private javax.swing.JLabel Ttopup1;
    private javax.swing.JPanel bFavorit;
    private javax.swing.JTextField bulan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel daftarMobil;
    private javax.swing.JTextArea deskripsi;
    private javax.swing.JTextArea deskripsi1;
    private javax.swing.JTextArea deskripsi2;
    private javax.swing.JLabel favorit;
    private javax.swing.JLabel foto;
    private javax.swing.JLabel foto1;
    private javax.swing.JLabel foto2;
    private javax.swing.JLabel harga;
    private javax.swing.JLabel harga1;
    private javax.swing.JLabel harga2;
    private javax.swing.JTextField isiSaldo;
    private javax.swing.JLabel jBrand;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JLabel jFoto;
    private javax.swing.JLabel jHarga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPesanan;
    private javax.swing.JPanel jPesanan1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel jTipe;
    private javax.swing.JLabel jUser;
    private javax.swing.JLabel jUsername;
    private javax.swing.JTextField jumlahHari;
    private javax.swing.JLabel kode;
    private javax.swing.JLabel kode1;
    private javax.swing.JLabel kode2;
    private javax.swing.JLabel lihatMobil;
    private javax.swing.JLabel merk;
    private javax.swing.JLabel merk1;
    private javax.swing.JLabel merk2;
    private javax.swing.JPanel panel1DaftarPesanan;
    private javax.swing.JPanel panel1Favorit;
    private javax.swing.JPanel panelAbout;
    private javax.swing.JPanel panelContent;
    private javax.swing.JPanel panelDaftarPesanan;
    private javax.swing.JPanel panelFavorit;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelNavbar;
    private javax.swing.JPanel panelTest;
    private javax.swing.JLabel profil;
    private javax.swing.JTextField searching;
    private javax.swing.JLabel tPesanan;
    private javax.swing.JLabel tPesanan1;
    private javax.swing.JTextField tahun;
    private javax.swing.JPanel tampilMobil;
    private javax.swing.JPanel tampilMobil1;
    private javax.swing.JPanel tampilMobil2;
    private javax.swing.JLabel tampilSaldo;
    private javax.swing.JTextField tanggal;
    private javax.swing.JLabel tipe;
    private javax.swing.JLabel tipe1;
    private javax.swing.JLabel tipe2;
    private javax.swing.JPanel topup;
    private javax.swing.JPanel topup1;
    // End of variables declaration//GEN-END:variables

    void openMenu(JPanel panel1, JPanel panel2, JLabel label1, JLabel label2){
        panel1.setBackground(Color.white);
        label1.setForeground(Color.black);
        panel2.setBackground(new java.awt.Color(67, 91, 102));
        label2.setForeground(Color.white);
    }
    void update(dataUser data){

        String cacheSaldo = String.valueOf(data.getSaldo());
 
        tampilSaldo.setText("Rp."+cacheSaldo+": Saldo");
        
        
        
    }
 
    
 
    
        
    
     
       
    
    
    private LocalDate setTanggal(String bulan, String tanggal){
        String hasil = "2023-"+bulan+"-"+tanggal ;
        
        
        
        
        try{
            int hasil1 = LocalDate.parse(hasil).compareTo(sqlDate.toLocalDate());
            if (hasil1 < 0){
                
                return null;
            }else{
                return LocalDate.parse(hasil);
            }
        }catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(null, "Format Tanggal salah, tolong masukan dengan format YYYY-MM-DD");
            return null;
        }
        }
    
    
    
        
    
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Menu("ardi").setVisible(true);
            }
        });
    }
    

}
