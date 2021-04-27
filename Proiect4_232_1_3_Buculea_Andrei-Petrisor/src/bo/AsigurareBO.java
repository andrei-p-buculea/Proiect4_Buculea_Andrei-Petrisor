/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template asie, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import dao.AsigurareDAO;
import db.ConexiuneDB;
import entity.Asigurare;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;

/**
 *
 * @author Andrei Buculea
 */
public class AsigurareBO {
    
      private String mesaj="";
     private AsigurareDAO adao = new AsigurareDAO();
     
    public String addAsigurare(Asigurare asi){
        Connection conn = ConexiuneDB.getConnection();
        
        try {
            mesaj=adao.addAsigurare(conn, asi);
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
     public String editAsigurare(Asigurare asi){
        
         Connection conn = ConexiuneDB.getConnection();
        
        try {
            mesaj=adao.editAsigurare(conn, asi);
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
      public String deleteAsigurare(String nr_cont){
        
          Connection conn = ConexiuneDB.getConnection();
        
        try {
            mesaj=adao.deleteAsigurare(conn,nr_cont);
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
      public void listAsigurare(JTable table){
         Connection conn=ConexiuneDB.getConnection();
         adao.listAsigurare(conn, table);
         try {
             conn.close();
         } catch (SQLException ex) {
             System.out.println(ex.getMessage());
         }
      }
    
    
}
