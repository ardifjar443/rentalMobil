
package Service;

/**
 *
 * @author max
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import config.DatabaseConnector;
import java.net.URL;

public class dataUser {
    private String username;
    private int saldo;
    private ImageIcon foto;
    private String nama;

    public dataUser(String user) {
        try {
            Connection connection = DatabaseConnector.getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM user WHERE username = '"+user+"'";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                username = resultSet.getString("username");
                saldo = resultSet.getInt("saldo");
                byte[] fotoBytes = resultSet.getBytes("foto");
                if (fotoBytes != null){
                    foto = new ImageIcon(fotoBytes);
                }
                nama = resultSet.getString("namaLengkap");
                
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    

    
    //getter dan setter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    
    public ImageIcon getFoto() {
        return foto;
    }

    public void setFoto(ImageIcon foto) {
        this.foto = foto;
    }
    
    
    
}


