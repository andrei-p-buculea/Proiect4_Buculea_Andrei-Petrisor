/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template clie, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import db.ConexiuneDB;
import entity.Client;
import dao.ClientDAO;
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
public class ClientBO {
    
     private String mesaj="";
     private ClientDAO cdao = new ClientDAO();
     
    public String addClient(Client cli){
        Connection conn = ConexiuneDB.getConnection();
        
        try {
            mesaj=cdao.addClient(conn, cli);
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
     public String editClient(Client cli){
        
         Connection conn = ConexiuneDB.getConnection();
        
        try {
            mesaj=cdao.editClient(conn, cli);
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
      public String deleteClient(int nr_client){
        
          Connection conn = ConexiuneDB.getConnection();
        
        try {
            mesaj=cdao.deleteClient(conn,nr_client);
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
      public void listClient(JTable table){
         Connection conn=ConexiuneDB.getConnection();
         cdao.listClient(conn, table);
         try {
             conn.close();
         } catch (SQLException ex) {
             System.out.println(ex.getMessage());
         }
      }
    
}
