/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package coding;

/**
 *
 * @author Admin
 */
public class PERSEGI extends javax.swing.JFrame {

    /**
     * Creates new form PERSEGI
     */
    public PERSEGI() {
        initComponents();
        reset();
    }
    void reset (){
        SISI.setText(null);
        JLUAS.setText(null);
        JKELILING.setText(null);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        ALUAS = new javax.swing.JLabel();
        Akeliling = new javax.swing.JLabel();
        KELILING = new javax.swing.JTextField();
        LUAS = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SISI = new javax.swing.JTextField();
        PKEMBALI = new javax.swing.JButton();
        PRESET = new javax.swing.JButton();
        PHITUNG = new javax.swing.JButton();
        JLUAS = new javax.swing.JLabel();
        JKELILING = new javax.swing.JLabel();

        jTextField4.setText("jTextField4");

        ALUAS.setText("jLabel5");

        Akeliling.setText("jLabel6");

        KELILING.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KELILINGActionPerformed(evt);
            }
        });

        LUAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LUASActionPerformed(evt);
            }
        });

        jLabel3.setText("LUAS");

        jLabel4.setText("KELILING");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("PERSEGI");

        jLabel2.setText("SISI");

        SISI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SISIActionPerformed(evt);
            }
        });

        PKEMBALI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coding/arrow.png"))); // NOI18N
        PKEMBALI.setText("KEMBALI");
        PKEMBALI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PKEMBALIActionPerformed(evt);
            }
        });

        PRESET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coding/circular.png"))); // NOI18N
        PRESET.setText("RESET");
        PRESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRESETActionPerformed(evt);
            }
        });

        PHITUNG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coding/account.png"))); // NOI18N
        PHITUNG.setText("HITUNG");
        PHITUNG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PHITUNGActionPerformed(evt);
            }
        });

        JLUAS.setText("jLabel5");

        JKELILING.setText("jLabel6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JKELILING)
                    .addComponent(JLUAS)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PHITUNG)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(PRESET, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(PKEMBALI))
                            .addComponent(SISI, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(SISI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PHITUNG)
                    .addComponent(PRESET)
                    .addComponent(PKEMBALI))
                .addGap(75, 75, 75)
                .addComponent(JLUAS)
                .addGap(18, 18, 18)
                .addComponent(JKELILING)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LUASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LUASActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LUASActionPerformed

    private void KELILINGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KELILINGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KELILINGActionPerformed

    private void PKEMBALIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PKEMBALIActionPerformed
        new home().setVisible(true);
        dispose();
    }//GEN-LAST:event_PKEMBALIActionPerformed

    private void SISIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SISIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SISIActionPerformed

    private void PRESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRESETActionPerformed
        reset();
    }//GEN-LAST:event_PRESETActionPerformed

    private void PHITUNGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PHITUNGActionPerformed
        int sisi = Integer.parseInt(SISI.getText());
        int luas = sisi * sisi;
        int keliling = 2 * (sisi + sisi);
        JLUAS.setText("luas : " +keliling);
        JKELILING.setText("keliling : " +keliling);
    }//GEN-LAST:event_PHITUNGActionPerformed

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
            java.util.logging.Logger.getLogger(PERSEGI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PERSEGI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PERSEGI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PERSEGI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PERSEGI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ALUAS;
    private javax.swing.JLabel Akeliling;
    private javax.swing.JLabel JKELILING;
    private javax.swing.JLabel JLUAS;
    private javax.swing.JTextField KELILING;
    private javax.swing.JTextField LUAS;
    private javax.swing.JButton PHITUNG;
    private javax.swing.JButton PKEMBALI;
    private javax.swing.JButton PRESET;
    private javax.swing.JTextField SISI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
