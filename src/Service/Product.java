package Service;


import java.sql.Blob;
import java.sql.SQLException;
import javax.swing.ImageIcon;

public class Product {
    private String kode;
    private String nama;
    private int harga;
    private String deskripsi;
    private ImageIcon foto;

    public Product(String kode, String nama, int harga,String deskripsi, Blob foto) throws SQLException {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.deskripsi = deskripsi;
        byte[] profilePictureBytes = foto.getBytes(1, (int) foto.length());
        ImageIcon profilePictureIcon = new ImageIcon(profilePictureBytes);
        this.foto=profilePictureIcon;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }
    public String getDeskripsi() {
        return deskripsi;
    }

    public double getHarga() {
        return harga;
    }
    public ImageIcon getFoto() {
        return foto;
    }

    
}
