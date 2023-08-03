/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import config.DatabaseConnector;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author max
 */
public class tambahPesanan {

    public void tambahPesanan(String user ,String kode, JLabel label) {
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            // Connect to the database
            if(validasiPesanan( user ,  kode)){
                hapusPesanan(user,kode);
                label.setText("SEWA SEKARANG");
            }else{
                connection = DatabaseConnector.getConnection();
            

            // Sample array data
//            String[] dataArray= StringToArray(getData("ardi"));
            List<String> dataList = convertJsonToList(getData(user));
            dataList.add(kode);
            
            

            // Convert the array to JSON string
            String jsonData = convertListToJson(dataList);

            // SQL query to insert the JSON data into the database
            String query = "UPDATE user SET pesanan = (?) WHERE username = '"+user+"'";

            // Create a prepared statement with the query
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, jsonData);

            // Execute the query
            preparedStatement.executeUpdate();
            label.setText("SUDAH DISEWA");

            JOptionPane.showMessageDialog(null, "Mobil sudah Disimpan ke Daftar Pesanan","Pesan",JOptionPane.INFORMATION_MESSAGE);
            }
            

        } catch (SQLException e) {
            System.out.println("data kosong");
        } finally {
            // Close the resources
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
    }
    public void hapusPesanan(String user ,String kode) {
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            
                connection = DatabaseConnector.getConnection();
            

            // Sample array data
//            String[] dataArray= StringToArray(getData("ardi"));
            List<String> dataList = convertJsonToList(getData(user));
            dataList.remove(kode);
            
            

            // Convert the array to JSON string
            String jsonData = convertListToJson(dataList);

            // SQL query to insert the JSON data into the database
            String query = "UPDATE user SET pesanan = (?) WHERE username = '"+user+"'";

            // Create a prepared statement with the query
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, jsonData);

            // Execute the query
            preparedStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Mobil sudah tidak Disimpan","Pesan",JOptionPane.INFORMATION_MESSAGE);
            
            

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the resources
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
    }
    
    public static String tampil(String user){
        String hasil = "SELECT * FROM `daftarMobil` WHERE ";
        List<String> dataList = convertJsonToList(getData(user));
        System.out.println(dataList);
        
        int jumlahList = 0;
            for (String item : dataList){
                jumlahList++;
            }
            int n = 0;
            
            
            for (String item : dataList){
                
                
                if (n != jumlahList-1){
                    
                    hasil = hasil+("kode = '"+item+ "' OR  ");
                }else{
                    hasil = hasil + ("kode = '"+item+"'");
                }
                n++;
            }
        return hasil;
        
    }
    
    
     private static String arrayToJSON(String[] array) {
        StringBuilder json = new StringBuilder();
        json.append("[");
        for (int i = 0; i < array.length; i++) {
            json.append("\"").append(array[i]).append("\"");
            if (i < array.length - 1) {
                json.append(",");
            }
        }
        json.append("]");
        return json.toString();
    }
    private static String convertListToJson(List<String> dataList) {
        JSONArray jsonArray = new JSONArray();
        for (String item : dataList) {
            jsonArray.put(item);
        }

        return jsonArray.toString();
    }
    public static String[] StringToArray(String jsonString) {
    
        // Sample JSON string
        

        // Convert JSON string to array
        try {
            JSONArray jsonArray = new JSONArray(jsonString);

            // Convert JSONArray to String array
            String[] dataArray = new String[jsonArray.length()];
            for (int i = 0; i < jsonArray.length(); i++) {
                dataArray[i] = jsonArray.getString(i);
            }
            return dataArray;

            // Print the array elements
            
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
    private  static String getData(String user) {
        String data = null;
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Connect to the database
            connection = DatabaseConnector.getConnection();

            // Create a statement object
            statement = connection.createStatement();

            // Query to retrieve data from the specified table and column
            String query = "SELECT pesanan FROM user WHERE username ='" + user+"'";
            resultSet = statement.executeQuery(query);

            // Move the result pointer to the specified row number
            if (resultSet.next()) {
                // Get the data from the specified column
                data = resultSet.getString("pesanan");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the resources
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return data;
    }
    private static List<String> convertJsonToList(String jsonData) {
        List<String> dataList = new ArrayList<>();

        try {
            JSONArray jsonArray = new JSONArray(jsonData);
            for (int i = 0; i < jsonArray.length(); i++) {
                String item = jsonArray.getString(i);
                dataList.add(item);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return dataList;
    }
    
    public Boolean validasiPesanan(String user , String kode){
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            // Connect to the database
            connection = DatabaseConnector.getConnection();
            

            // Sample array data
//            String[] dataArray= StringToArray(getData("ardi"));
            List<String> dataList = convertJsonToList(getData(user));
            for (String item : dataList){
                
                if(kode.equals(item)){
                    return true;
                }
            }
            
            

            

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the resources
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
    

