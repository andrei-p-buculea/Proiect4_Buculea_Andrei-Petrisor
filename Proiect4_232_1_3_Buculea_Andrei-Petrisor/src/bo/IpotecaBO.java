/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import dao.IpotecaDAO;
import db.ConexiuneDB;
import entity.Ipoteca;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;

/**
 *
 * @author Andrei Buculea
 */
public class IpotecaBO {
    
     private String mesaj="";
     private IpotecaDAO idao = new IpotecaDAO();
     
    public String addIpoteca(Ipoteca ipo){
        Connection conn = ConexiuneDB.getConnection();
        
        try {
            mesaj=idao.addIpoteca(conn, ipo);
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
     public String editIpoteca(Ipoteca ipo){
        
         Connection conn = ConexiuneDB.getConnection();
        
        try {
            mesaj=idao.editIpoteca(conn, ipo);
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
      public String deleteIpoteca(String nr_cont){
        
          Connection conn = ConexiuneDB.getConnection();
        
        try {
            mesaj=idao.deleteIpoteca(conn,nr_cont);
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
      public void listIpoteca(JTable table){
         Connection conn=ConexiuneDB.getConnection();
         idao.listIpoteca(conn, table);
         try {
             conn.close();
         } catch (SQLException ex) {
             System.out.println(ex.getMessage());
         }
      }
    
    
}
