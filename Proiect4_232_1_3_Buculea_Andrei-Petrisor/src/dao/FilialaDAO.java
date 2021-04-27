/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Filiala;
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
public class FilialaDAO {
    
    private String mesaj="";
    
    public String addFiliala(Connection conn,Filiala fil){
        
        PreparedStatement pst = null;
        String sql="INSERT INTO FILIALA (cod_filiala, nume_filiala) " + "VALUES (?,?)";
        
        try {
            pst=conn.prepareStatement(sql);
            pst.setInt(1, fil.getCod_filiala());
            pst.setString(2, fil.getNume_filiala());
            mesaj= "Valori introduse cu succes";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mesaj="Nu se poate insera  dao \n "+ e.getMessage();
        }
        return mesaj;
    }
     public String editFiliala(Connection conn,Filiala fil){
         PreparedStatement pst=null;
        String sql = "UPDATE FILIALA SET nume_filiala=? "+ " WHERE cod_filiala =?";
        
        try {
            pst=conn.prepareStatement(sql);
       
            pst.setString(1, fil.getNume_filiala());
            pst.setInt(2, fil.getCod_filiala());
            mesaj= "Valori editate cu succes";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mesaj="Nu se poate edita \n "+ e.getMessage();
        }
        return mesaj;
    }
      public String deleteFiliala(Connection conn,int cod_filiala){
       
           PreparedStatement pst=null;
        String sql = "DELETE FROM FILIALA WHERE cod_filiala = ?";
        
        try {
            pst=conn.prepareStatement(sql);
       
            pst.setInt(1, cod_filiala);
            mesaj= "Valori sterse cu succes";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mesaj="Nu se poate sterge \n "+ e.getMessage();
        }
        return mesaj;

    }
      public void listFiliala(Connection conn,JTable table){
           DefaultTableModel model;
          String [] columns ={"Codul filialei","Numele filialei"};
          model=new DefaultTableModel(null,columns);
          String sql="SELECT * FROM FILIALA ORDER BY COD_FILIALA";
          String [] rows = new String[2];
          Statement st=null;
          ResultSet rs=null;
          
          try {
              st = conn.createStatement();
              rs = st.executeQuery(sql);
              while (rs.next()) {
                  for(int i=0;i<2;i++){
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
