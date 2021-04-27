/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Ipoteca;
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
public class IpotecaDAO {

    private String mesaj = "";

    public String addIpoteca(Connection conn, Ipoteca ipo) {

        PreparedStatement pst = null;
        String sql = "INSERT INTO Ipoteca ( nr_cont , cod_filiala , suma_imprumutata, suma_de_restituit, tip_cont , tip_ipoteca , rata_dobanzii , nr_client )"
                + " " + " VALUES (?,?,?,?,?,?,?,?)";

        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, ipo.getNumar_cont());
            pst.setInt(2, ipo.getCod_filiala_conducere());
            pst.setFloat(3, ipo.getSuma_imprumutata());
            pst.setFloat(4, ipo.getSuma_de_restituit());
            pst.setString(5, ipo.getTip_cont());
            pst.setString(6, ipo.getTip_ipoteca());
            pst.setFloat(7, ipo.getRata_dobanzii());
            pst.setInt(8, ipo.getNr_client());
            mesaj = "Valori introduse cu succes";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mesaj = "Nu se poate insera  dao \n " + e.getMessage();
        }
        return mesaj;
    }

    public String editIpoteca(Connection conn, Ipoteca ipo) {
        PreparedStatement pst = null;
        String sql = "UPDATE Ipoteca SET nr_cont=? , cod_filiala=? , suma_imprumutata=? , suma_de_restituit=? , tip_cont=? ,"
                + " tip_ipoteca=? , rata_dobanzii=? , nr_client=? " + " WHERE nr_cont =? ";

        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, ipo.getNumar_cont());
            pst.setInt(2, ipo.getCod_filiala_conducere());
            pst.setFloat(3, ipo.getSuma_imprumutata());
            pst.setFloat(4, ipo.getSuma_de_restituit());
            pst.setString(5, ipo.getTip_cont());
            pst.setString(6, ipo.getTip_ipoteca());
            pst.setFloat(7, ipo.getRata_dobanzii());
            pst.setInt(8, ipo.getNr_client());
            pst.setString(9, ipo.getNumar_cont());

            mesaj = "Valori editate cu succes";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mesaj = "Nu se poate edita \n " + e.getMessage();
        }
        return mesaj;
    }

    public String deleteIpoteca(Connection conn, String nr_cont) {

        PreparedStatement pst = null;
        String sql = "DELETE FROM Ipoteca WHERE nr_cont = ? ";

        try {
            pst = conn.prepareStatement(sql);

            pst.setString(1, nr_cont);
            mesaj = "Valori sterse cu succes";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mesaj = "Nu se poate sterge \n " + e.getMessage();
        }
        return mesaj;

    }

    public void listIpoteca(Connection conn, JTable table) {
        DefaultTableModel model;
        String[] columns = {"Nr. cont", "Codul filialei de conducere", "Suma imprumutata", "Suma de restituit", "Tip cont", "Tip ipoteca",
            "Rata dobanzii", "Nr. client"};
        model = new DefaultTableModel(null, columns);
        String sql = "SELECT * FROM Ipoteca ORDER BY nr_cont";
        String[] rows = new String[8];
        Statement st = null;
        ResultSet rs = null;

        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                for (int i = 0; i < 8; i++) {
                    rows[i] = rs.getString(i + 1);
                }
                model.addRow(rows);
            }
            table.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "lista nu poate fi afisata");
        }
    }

}
