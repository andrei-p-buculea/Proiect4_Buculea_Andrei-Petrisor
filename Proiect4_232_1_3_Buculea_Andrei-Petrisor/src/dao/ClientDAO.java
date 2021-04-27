/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Client;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andrei Buculea
 */
public class ClientDAO {
    
    private String mesaj="";
    
    public String addClient(Connection conn,Client cli){
        
        PreparedStatement pst = null;
        String sql="INSERT INTO CLIENT ( nr_client , adresa_client , nume_client) "+" VALUES (?,?,?)";
        
        try {
            pst=conn.prepareStatement(sql);
            pst.setInt(1, cli.getNr_client());
            pst.setString(2, cli.getAdresa_client());
            pst.setString(3, cli.getNume_client());
            mesaj= "Valori introduse cu succes";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mesaj="Nu se poate insera  dao \n "+ e.getMessage();
        }
        return mesaj;
    }
     public String editClient(Connection conn,Client cli){
         PreparedStatement pst=null;
        String sql = "UPDATE CLIENT SET adresa_client=? , nume_client=? " + " WHERE nr_client =? ";
        
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1, cli.getAdresa_client());
            pst.setString(2, cli.getNume_client());
            pst.setInt(3, cli.getNr_client());
            mesaj= "Valori editate cu succes";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mesaj="Nu se poate edita \n "+ e.getMessage();
        }
        return mesaj;
    }
      public String deleteClient(Connection conn,int nr_client){
       
           PreparedStatement pst=null;
        String sql = "DELETE FROM Client WHERE nr_client = ? ";
        
        try {
            pst=conn.prepareStatement(sql);
       
            pst.setInt(1, nr_client);
            mesaj= "Valori sterse cu succes";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mesaj="Nu se poate sterge \n "+ e.getMessage();
        }
        return mesaj;

    }
      public void listClient(Connection conn,JTable table){
           DefaultTableModel model;
          String [] columns ={"Nr. client","Adresa client","Nume client"};
          model=new DefaultTableModel(null,columns);
          String sql="SELECT * FROM CLIENT ORDER BY nr_client";
          String [] rows = new String[3];
          Statement st=null;
          ResultSet rs=null;
          
          try {
              st = conn.createStatement();
              rs = st.executeQuery(sql);
              while (rs.next()) {
                  for(int i=0;i<3;i++){
                      rows[i]=rs.getString(i+1);
                  }
                  model.addRow(rows);
              }
              table.setModel(model);
          } catch (Exception e) {
              JOptionPane.showMessageDialog(null, "lista nu poate fi afisata");
          }
    }
}
