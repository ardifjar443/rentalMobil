/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import config.DatabaseConnector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author max
 */
public class status {

    public int status(String kode ) {
        int hasil=0;
        try {
            Connection connection = DatabaseConnector.getConnection();
            Statement statement = connection.createStatement();
             
            String query = "SELECT * FROM daftarMobil WHERE kode ='"+kode+"'";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String status = resultSet.getString("status");
                if (status.equals("disewa")){
                    
                    return 1;
                    
                }else if(status.equals("booking")){
                    return 2;
                }
               
               
                

            }

            connection.close();
        } catch (SQLException e) {
            System.out.println("daftar pesan kosong"+kode);
            
        }
        return hasil;
    }
    
}
