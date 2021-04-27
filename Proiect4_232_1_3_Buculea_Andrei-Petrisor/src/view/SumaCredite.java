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
public class SumaCredite extends JFrame {
    DefaultTableModel model = new DefaultTableModel();
    Container cnt = this.getContentPane();
    JTable jtbl = new JTable(model);
    
    public SumaCredite() {
        cnt.setLayout(new FlowLayout(FlowLayout.LEFT));
        model.addColumn("Cod filiala");
        model.addColumn("Suma creditelor");
        try {
            Connection con= ConexiuneDB.getConnection();
            PreparedStatement pstm = con.prepareStatement("Select Filiala.cod_filiala,NVL(sum(suma_de_restituit),0) Suma_de_restituit FROM ipoteca full outer join filiala on ipoteca.cod_filiala = filiala.cod_filiala GROUP BY filiala.cod_filiala ORDER BY filiala.cod_filiala");
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