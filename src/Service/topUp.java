
package Service;
import config.*;

/**
 *
 * @author max
 */
import java.sql.*;
public class topUp {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/test1";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    public static void isi(int saldo, String username) {
        try {
            // Membuat koneksi ke basis data
            Connection connection = DatabaseConnector.getConnection();

            // Pertimbangkan Anda memiliki tabel "employees" dengan kolom "id", "name", dan "salary"
            String employeeId = username; // ID karyawan yang ingin diedit
            int newSalary = saldo; // Gaji baru

            // Membuat query SQL untuk mengambil data karyawan yang akan diedit
            String selectQuery = "SELECT * FROM user WHERE username = ?";
            PreparedStatement selectStatement = connection.prepareStatement(selectQuery);
            selectStatement.setString(1, employeeId);
            ResultSet resultSet = selectStatement.executeQuery();

            if (resultSet.next()) {
                // Data karyawan yang akan diedit ditemukan, tampilkan informasinya kepada pengguna
                int cache = resultSet.getInt("saldo");
                newSalary = newSalary + cache;
                // Menanyakan kepada pengguna apakah ingin melakukan perubahan
                // Anda dapat mengimplementasikan logika yang lebih kompleks di sini sesuai kebutuhan aplikasi Anda

                // Jika pengguna ingin melakukan perubahan, lakukan update data
                String updateQuery = "UPDATE user SET saldo = ? WHERE username = ?";
                PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
                updateStatement.setInt(1, newSalary);
                updateStatement.setString(2, employeeId);
                int rowsUpdated = updateStatement.executeUpdate();
                if (rowsUpdated > 0) {
                    System.out.println("Data updated successfully.");
                } else {
                    System.out.println("Failed to update data.");
                }

                
            } else {
                System.out.println("Employee with ID " + employeeId + " not found.");
            }

            // Menutup sumber daya
            resultSet.close();
            selectStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
