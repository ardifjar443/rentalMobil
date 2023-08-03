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
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/**
 *
 * @author max
 */
public class konversi {
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
    public  static String getData(String user) {
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
            String query = "SELECT favorit FROM user WHERE username ='" + user+"'";
            resultSet = statement.executeQuery(query);

            // Move the result pointer to the specified row number
            if (resultSet.next()) {
                // Get the data from the specified column
                data = resultSet.getString("favorit");
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
    public static List<String> convertJsonToList(String jsonData) {
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
}
