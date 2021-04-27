/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Asigurare;
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
public class AsigurareDAO {
    
     private String mesaj="";
    
    public String addAsigurare(Connection conn,Asigurare asi){
        
        PreparedStatement pst = null;
        String sql="INSERT INTO Asigurare ( nr_cont , tip_asigurare , cod_companie_asigurare, detalii_companie_asigurare ) "+" VALUES (?,?,?,?)";
        
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1, asi.getNrCont());
            pst.setString(2, asi.getTipAsigurare());
            pst.setString(3, asi.getCodCompanieAsiguare());
            pst.setString(4, asi.getDetaliiCompanieAsigurare());
            mesaj= "Valori introduse cu succes";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mesaj="Nu se poate insera  dao \n "+ e.getMessage();
        }
        return mesaj;
    }
     public String editAsigurare(Connection conn,Asigurare asi){
         PreparedStatement pst=null;
        String sql = "UPDATE Asigurare SET nr_cont=? , tip_asigurare=? , cod_companie_asigurare=? , detalii_companie_asigurare=?  " + " WHERE nr_cont =? ";
        
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1,asi.getNrCont());
            pst.setString(2,asi.getTipAsigurare());
            pst.setString(3,asi.getCodCompanieAsiguare());
            pst.setString(4,asi.getDetaliiCompanieAsigurare());
            pst.setString(5,asi.getNrCont());
          
            mesaj= "Valori editate cu succes";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mesaj="Nu se poate edita \n "+ e.getMessage();
        }
        return mesaj;
    }
      public String deleteAsigurare(Connection conn,String nr_cont){
       
           PreparedStatement pst=null;
        String sql = "DELETE FROM Asigurare WHERE nr_cont = ? ";
        
        try {
            pst=conn.prepareStatement(sql);
       
            pst.setString(1, nr_cont);
            mesaj= "Valori sterse cu succes";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mesaj="Nu se poate sterge \n "+ e.getMessage();
        }
        return mesaj;

    }
      public void listAsigurare(Connection conn,JTable table){
           DefaultTableModel model;
          String [] columns ={"Nr. cont","Tip asigurare","Codul companiei de asigurare","Detaliile companiei de asigurare"};
          model=new DefaultTableModel(null,columns);
          String sql="SELECT * FROM Asigurare ORDER BY nr_cont";
          String [] rows = new String[4];
          Statement st=null;
          ResultSet rs=null;
          
          try {
              st = conn.createStatement();
              rs = st.executeQuery(sql);
              while (rs.next()) {
                  for(int i=0;i<4;i++){
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
