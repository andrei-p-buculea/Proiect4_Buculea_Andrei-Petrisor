/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import db.ConexiuneDB;
import entity.Filiala;
import dao.FilialaDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Andrei Buculea
 */
public class FilialaBO {
    
     private String mesaj="";
     private FilialaDAO fdao = new FilialaDAO();
     
    public String addFiliala(Filiala fil){
        Connection conn = ConexiuneDB.getConnection();
        
        try {
            mesaj=fdao.addFiliala(conn, fil);
           // conn.rollback();
        } catch (Exception e) {
            mesaj=mesaj + " "+ e.getMessage();
            
        }finally{
            try {
                if (conn!=null) {
                    conn.close();
                }
            } catch (Exception e) {
                mesaj=mesaj + " " + e.getMessage();
            }
        }
        return mesaj;
    }
     public String editFiliala(Filiala fil){
        
         Connection conn = ConexiuneDB.getConnection();
        
        try {
            mesaj=fdao.editFiliala(conn, fil);
            //conn.rollback();
        } catch (Exception e) {
            mesaj=mesaj + " "+ e.getMessage();
            
        }finally{
            try {
                if (conn!=null) {
                    conn.close();
                }
            } catch (Exception e) {
                mesaj=mesaj + " " + e.getMessage();
            }
        }
        return mesaj;
         
    }
      public String deleteFiliala(int cod_filiala){
        
          Connection conn = ConexiuneDB.getConnection();
        
        try {
            mesaj=fdao.deleteFiliala(conn,cod_filiala);
          //  conn.rollback();
        } catch (Exception e) {
            mesaj=mesaj + " "+ e.getMessage();
            
        }finally{
            try {
                if (conn!=null) {
                    conn.close();
                }
            } catch (Exception e) {
                mesaj=mesaj + " " + e.getMessage();
            }
        }
        return mesaj;
          
    }
      public void listFiliala(JTable table){
         Connection conn=ConexiuneDB.getConnection();
         fdao.listFiliala(conn, table);
         try {
             conn.close();
         } catch (SQLException ex) {
             System.out.println(ex.getMessage());
         }
      }
    
}
