/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrei Buculea
 */
public class ConexiuneDB {
    private static Connection conn=null;
    private static String login="admin";
    private static String password="admin";
    private static String url="jdbc:oracle:thin:@localhost:1521:xe";
    
    public static Connection getConnection(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn= DriverManager.getConnection(url,login,password);
           // conn.setAutoCommit(false);
            if(conn != null){
                System.err.println("Conexiune realizata cu succes");
            }else{
                System.err.println("Eroare la conectare");
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Eroare conectare");
        }
        return conn;
    }
    
    
    public static void main(String[] args){
        ConexiuneDB c =new ConexiuneDB();
        c.getConnection();
    }
    
}
