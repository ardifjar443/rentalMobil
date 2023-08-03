/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

/**
 *
 * @author max
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import config.DatabaseConnector;

public class DatabaseSignUpService implements signUpService {
   

    @Override
    public void signUp(String username, String password, String nama) throws SQLException {
      String sqlQuery = "INSERT INTO user (namaLengkap, username, password) VALUES (?, ?, ?)";

        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement statement = conn.prepareStatement(sqlQuery)) {

            statement.setString(1, nama);
            statement.setString(2, username);
            statement.setString(3, password);

            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("Data berhasil dimasukkan ke database.");
            } else {
                System.out.println("Gagal memasukkan data ke database.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
}

