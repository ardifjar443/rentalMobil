package Service;

import Service.Product;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {
    // Konfigurasi koneksi ke basis data
    private static final String DB_URL = "jdbc:mysql://localhost:3306/test1";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    public static List<Product> getProductsFromDatabase() {
        List<Product> products = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM daftarMobil";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String kode = resultSet.getString("kode");
                String nama = resultSet.getString("nama");
                int harga = resultSet.getInt("harga");
                String deskripsi = resultSet.getString("deskripsi");
                Blob foto = resultSet.getBlob("foto");

                Product product = new Product(kode, nama, harga,deskripsi, foto);
                products.add(product);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }
}
