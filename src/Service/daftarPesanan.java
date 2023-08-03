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
import javax.swing.JLabel;

/**
 *
 * @author max
 */
public class daftarPesanan {
    public static void pesanan(JLabel label,JLabel label1,String user,int hari){
        
        String pesanan = "";
        String pesanan2="";
        int totalPesanan = 0;
        int total=0;
        int n = 0;
         try {
            Connection connection = DatabaseConnector.getConnection();
            Statement statement = connection.createStatement();
             
            String query = "SELECT * FROM user WHERE username ='"+user+"'";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String pesanan1 = resultSet.getString("pesanan");
                
                java.util.List<String> dataList = konversi.convertJsonToList(pesanan1);
                for(String item : dataList){
                    pesanan = pesanan + item+" ";
                    totalPesanan++;
                }
                for (String item : dataList){
                    if (n != totalPesanan-1){
                        pesanan2 = pesanan2+"kode ='"+item+"' OR ";
                    }else{
                        pesanan2 =pesanan2+"kode = '"+item+"'";
                    }
                    n++;
                }
               label.setText(pesanan);

               
               
                

            }

            connection.close();
        } catch (SQLException e) {
            System.out.println("daftar pesan kosong");
            label1.setText("0");
        }
       
         try {
            Connection connection = DatabaseConnector.getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM daftarMobil WHERE ";
            query = query+pesanan2;
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int pesanan1 = resultSet.getInt("harga");
                total = total+pesanan1;
                
               
               
                

            }
            
            total = total*hari;
            label1.setText(String.valueOf("Rp "+CurrencyFormatter.formatToRupiah(total)));

            connection.close();
        } catch (SQLException e) {
            System.out.println("daftar pesan kosong ehe");
            label1.setText("0");
        }
    }
}
