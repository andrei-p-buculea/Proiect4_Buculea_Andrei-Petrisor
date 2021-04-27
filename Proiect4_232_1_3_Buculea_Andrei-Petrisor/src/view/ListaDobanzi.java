/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import db.ConexiuneDB;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
public class ListaDobanzi extends JFrame {
    DefaultTableModel model = new DefaultTableModel();
    Container cnt = this.getContentPane();
    JTable jtbl = new JTable(model);
    
    public ListaDobanzi() {
        cnt.setLayout(new FlowLayout(FlowLayout.LEFT));
        model.addColumn("Numar client");
        model.addColumn("Dobanda");
        try {
            Connection con= ConexiuneDB.getConnection();
            PreparedStatement pstm = con.prepareStatement("Select client.nr_client,NVL(rata_dobanzii,0) Dobanda FROM ipoteca full outer join client on ipoteca.nr_client = client.nr_client ORDER BY client.nr_client");
            ResultSet Rs = pstm.executeQuery();
            while(Rs.next()){
                model.addRow(new Object[]{Rs.getInt(1), Rs.getString(2)});
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        JScrollPane pg = new JScrollPane(jtbl);
        cnt.add(pg);
        this.pack();
    }


}