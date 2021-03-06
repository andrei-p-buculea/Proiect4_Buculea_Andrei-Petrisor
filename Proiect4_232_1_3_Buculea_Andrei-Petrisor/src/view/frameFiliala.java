/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bo.FilialaBO;
import entity.Filiala;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrei Buculea
 */
public class frameFiliala extends javax.swing.JFrame {

    /**
     * Creates new form frameFiliala
     */
    
    private FilialaBO fbo= new FilialaBO();
    
    public frameFiliala() {
        initComponents();
        listFiliala();
        setTitle("Filiale");
    }
    
    public void listFiliala(){
        fbo.listFiliala(tbFiliala);
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
        txtNumeFiliala = new javax.swing.JTextField();
        txtCodFiliala = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbFiliala = new javax.swing.JTable();
        btnInapoi = new javax.swing.JButton();
        btnAdaugare = new javax.swing.JButton();
        btnEditare = new javax.swing.JButton();
        btnStergere = new javax.swing.JButton();
        btnResetare = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Filiale");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 10, 1810, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Nume filiala:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 140, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Cod filiala:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 110, 30));
        jPanel1.add(txtNumeFiliala, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 310, 30));
        jPanel1.add(txtCodFiliala, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 310, 30));

        tbFiliala.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbFiliala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbFilialaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbFiliala);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 1230, 340));

        btnInapoi.setText("Inapoi");
        btnInapoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInapoiActionPerformed(evt);
            }
        });
        jPanel1.add(btnInapoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 550, 210, 100));

        btnAdaugare.setText("Adaugare");
        btnAdaugare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdaugareActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdaugare, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 550, 180, 100));

        btnEditare.setText("Editare");
        btnEditare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditareActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditare, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 550, 210, 100));

        btnStergere.setText("Stergere");
        btnStergere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStergereActionPerformed(evt);
            }
        });
        jPanel1.add(btnStergere, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 550, 230, 100));

        btnResetare.setText("Resetare");
        btnResetare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetareActionPerformed(evt);
            }
        });
        jPanel1.add(btnResetare, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 550, 210, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1810, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetareActionPerformed
        // TODO add your handling code here:
        txtCodFiliala.setText("");
        txtNumeFiliala.setText("");
    }//GEN-LAST:event_btnResetareActionPerformed

    private void btnInapoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInapoiActionPerformed
        // TODO add your handling code here:
            this.dispose();
           Menu menu=new Menu();
           menu.setVisible(true);
    }//GEN-LAST:event_btnInapoiActionPerformed

    private void btnAdaugareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdaugareActionPerformed
        // TODO add your handling code here:
        if(txtCodFiliala.getText().isEmpty() || txtNumeFiliala.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "completati toate campurile!");
        }else{
            Filiala fil=new Filiala();
            fil.setCod_filiala(Integer.parseInt(txtCodFiliala.getText()));
            fil.setNume_filiala(txtNumeFiliala.getText());
            String mesaj = fbo.addFiliala(fil);
            JOptionPane.showMessageDialog(null, mesaj);
             clean_field();
            listFiliala();
          
        }
    }//GEN-LAST:event_btnAdaugareActionPerformed

    private void btnEditareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditareActionPerformed
        // TODO add your handling code here:
        
         if(txtCodFiliala.getText().isEmpty() || txtNumeFiliala.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "completati toate campurile!");
        }else{
            Filiala fil=new Filiala();
            fil.setCod_filiala(Integer.parseInt(txtCodFiliala.getText()));
            fil.setNume_filiala(txtNumeFiliala.getText());
            String mesaj = fbo.editFiliala(fil);
            JOptionPane.showMessageDialog(null, mesaj);
            listFiliala();
        }
        
    }//GEN-LAST:event_btnEditareActionPerformed

    private void btnStergereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStergereActionPerformed
        // TODO add your handling code here:
         if(txtCodFiliala.getText().isEmpty() || txtNumeFiliala.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "completati toate campurile!");
            }else{
            String mesaj = fbo.deleteFiliala(Integer.parseInt(txtCodFiliala.getText()));
            JOptionPane.showMessageDialog(null, mesaj);
            clean_field();
            listFiliala();
            
        }
        
    }//GEN-LAST:event_btnStergereActionPerformed

    private void tbFilialaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbFilialaMouseClicked
       int selection =  tbFiliala.rowAtPoint(evt.getPoint());
       txtCodFiliala.setText(tbFiliala.getValueAt(selection, 0)+"");
        txtNumeFiliala.setText(tbFiliala.getValueAt(selection, 1)+"");
        
        
    }//GEN-LAST:event_tbFilialaMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frameFiliala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameFiliala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameFiliala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameFiliala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameFiliala().setVisible(true);
            }
        });
    }

    public void clean_field(){
        txtCodFiliala.setText("");
        txtNumeFiliala.setText("");
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbFiliala;
    private javax.swing.JTextField txtCodFiliala;
    private javax.swing.JTextField txtNumeFiliala;
    // End of variables declaration//GEN-END:variables
}
