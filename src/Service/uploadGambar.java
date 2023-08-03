/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;
import config.*;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
/**
 *
 * @author max
 */
public class uploadGambar {

    public uploadGambar() {
    }
    public static void uploadImage(File imageFile, String kode) {
        try {
            // Buat koneksi ke database
            Connection connection = DatabaseConnector.getConnection();

            // Baca data gambar dari file
            InputStream imageInputStream = new FileInputStream(imageFile);

            // Persiapkan pernyataan SQL untuk menyimpan data gambar ke database
            String insertSQL = "UPDATE daftarMobil SET foto = ?  WHERE kode = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
            preparedStatement.setBinaryStream(1, imageInputStream, (int) imageFile.length());
            preparedStatement.setString(2, kode);

            // Jalankan pernyataan SQL untuk menyimpan data gambar
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Gambar berhasil diunggah ke database.");
            } else {
                System.out.println("Gagal mengunggah gambar ke database.");
            }

            // Tutup sumber daya
            preparedStatement.close();
            connection.close();
            imageInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
}
    public static ImageIcon createImageIcon(String imagePath) {
        ImageIcon icon = null;
        try {
            // Baca gambar dari file
            Image image = new ImageIcon(imagePath).getImage();

            // Ubah ukuran gambar menjadi ukuran ikon yang diinginkan
            int iconWidth = 450;
            int iconHeight = image.getHeight(null) * iconWidth / image.getWidth(null);
            Image resizedImage = image.getScaledInstance(iconWidth, iconHeight, Image.SCALE_SMOOTH);

            // Buat ImageIcon dari gambar yang telah diubah ukurannya
            icon = new ImageIcon(resizedImage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return icon;
    }
}
