/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bo.AsigurareBO;
import entity.Asigurare;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrei Buculea
 */
public class frameAsigurare extends javax.swing.JFrame {

    
    /**
     * Creates new form frameAsigurare
     */
    
    private AsigurareBO abo= new AsigurareBO();
    
    public frameAsigurare() {
        initComponents();
        listAsigurare();
        setTitle("Asigurari");
    }
    
    public void listAsigurare(){
        abo.listAsigurare(tbAsigurare);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNrCont = new javax.swing.JTextField();
        txtTipAsigurare = new javax.swing.JTextField();
        txtCodCompanie = new javax.swing.JTextField();
        txtDetalii = new javax.swing.JTextField();
        btnInapoi = new javax.swing.JButton();
        btnAdaugare = new javax.swing.JButton();
        btnEditare = new javax.swing.JButton();
        btnStergere = new javax.swing.JButton();
        btnResetare = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAsigurare = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Asigurari");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1800, -1));

        jLabel2.setText("Nr. cont");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel3.setText("Tip asigurare");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel4.setText("Codul companiei de asigurare");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel5.setText("Detaliile companiei de asigurare");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));
        jPanel1.add(txtNrCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 330, -1));
        jPanel1.add(txtTipAsigurare, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 330, -1));
        jPanel1.add(txtCodCompanie, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 330, -1));
        jPanel1.add(txtDetalii, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 330, -1));

        btnInapoi.setText("Inapoi");
        btnInapoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInapoiActionPerformed(evt);
            }
        });
        jPanel1.add(btnInapoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 610, 250, 100));

        btnAdaugare.setText("Adaugare");
        btnAdaugare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdaugareActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdaugare, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 610, 250, 100));

        btnEditare.setText("Editare");
        btnEditare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditareActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditare, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 610, 250, 100));

        btnStergere.setText("Stergere");
        btnStergere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStergereActionPerformed(evt);
            }
        });
        jPanel1.add(btnStergere, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 610, 260, 100));

        btnResetare.setText("Resetare");
        btnResetare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetareActionPerformed(evt);
            }
        });
        jPanel1.add(btnResetare, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 610, 250, 100));

        tbAsigurare.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbAsigurare.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAsigurareMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbAsigurare);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 1200, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1810, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbAsigurareMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAsigurareMouseClicked
        // TODO add your handling code here:
         int selection =  tbAsigurare.rowAtPoint(evt.getPoint());
       txtNrCont.setText(tbAsigurare.getValueAt(selection, 0)+"");
        txtTipAsigurare.setText(tbAsigurare.getValueAt(selection, 1)+"");
        txtCodCompanie.setText(tbAsigurare.getValueAt(selection,2)+"");
        txtDetalii.setText(tbAsigurare.getValueAt(selection,3)+"");
    }//GEN-LAST:event_tbAsigurareMouseClicked

    private void btnAdaugareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdaugareActionPerformed
        // TODO add your handling code here:
         if(txtNrCont.getText().isEmpty() || txtTipAsigurare.getText().isEmpty() || txtCodCompanie.getText().isEmpty() || txtDetalii.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "completati toate campurile!");
        }else{
            Asigurare asi=new Asigurare();
            asi.setNrCont(txtNrCont.getText());
            asi.setTipAsigurare(txtTipAsigurare.getText());
            asi.setCodCompanieAsiguare(txtCodCompanie.getText());
            asi.setDetaliiCompanieAsigurare(txtDetalii.getText());
            String mesaj = abo.addAsigurare(asi);
            JOptionPane.showMessageDialog(null, mesaj);
              clean_field();
            listAsigurare();
          
        }
    }//GEN-LAST:event_btnAdaugareActionPerformed

    public void clean_field(){
      txtNrCont.setText("");
      txtTipAsigurare.setText("");
      txtCodCompanie.setText("");
      txtDetalii.setText("");
    }
    
    
    private void btnEditareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditareActionPerformed
        // TODO add your handling code here:
        
          if(txtNrCont.getText().isEmpty() || txtTipAsigurare.getText().isEmpty() || txtCodCompanie.getText().isEmpty() || txtDetalii.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "completati toate campurile!");
        }else{
            Asigurare asi=new Asigurare();
            asi.setNrCont(txtNrCont.getText());
            asi.setTipAsigurare(txtTipAsigurare.getText());
            asi.setCodCompanieAsiguare(txtCodCompanie.getText());
            asi.setDetaliiCompanieAsigurare(txtDetalii.getText());
            String mesaj = abo.editAsigurare(asi);
            JOptionPane.showMessageDialog(null, mesaj);
              clean_field();
            listAsigurare();
        }
        
    }//GEN-LAST:event_btnEditareActionPerformed

    private void btnStergereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStergereActionPerformed
        // TODO add your handling code here:
        
          if(txtNrCont.getText().isEmpty() || txtTipAsigurare.getText().isEmpty() || txtCodCompanie.getText().isEmpty() || txtDetalii.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "completati toate campurile!");
        }else{
            String mesaj = abo.deleteAsigurare(txtNrCont.getText());
            JOptionPane.showMessageDialog(null, mesaj);
              clean_field();
            listAsigurare();
          
        }
        
    }//GEN-LAST:event_btnStergereActionPerformed

    private void btnResetareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetareActionPerformed
        // TODO add your handling code here:
        clean_field();
    }//GEN-LAST:event_btnResetareActionPerformed

    private void btnInapoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInapoiActionPerformed
        // TODO add your handling code here:
        this.dispose();
           Menu menu=new Menu();
           menu.setVisible(true);
    }//GEN-LAST:event_btnInapoiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frameAsigurare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameAsigurare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameAsigurare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameAsigurare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameAsigurare().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdaugare;
    private javax.swing.JButton btnEditare;
    private javax.swing.JButton btnInapoi;
    private javax.swing.JButton btnResetare;
    private javax.swing.JButton btnStergere;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbAsigurare;
    private javax.swing.JTextField txtCodCompanie;
    private javax.swing.JTextField txtDetalii;
    private javax.swing.JTextField txtNrCont;
    private javax.swing.JTextField txtTipAsigurare;
    // End of variables declaration//GEN-END:variables
}
