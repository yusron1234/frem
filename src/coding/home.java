/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package coding;

/**
 *
 * @author Admin
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        persegi = new javax.swing.JButton();
        lingkaran = new javax.swing.JButton();
        segitiga = new javax.swing.JButton();
        PERSEGIPANANG = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("APLIKASI BANGUN DATAR");

        persegi.setText("PERSEGI");
        persegi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                persegiActionPerformed(evt);
            }
        });

        lingkaran.setText("LINGKARAN");
        lingkaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lingkaranActionPerformed(evt);
            }
        });

        segitiga.setText("SEGITIGA");
        segitiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segitigaActionPerformed(evt);
            }
        });

        PERSEGIPANANG.setBackground(new java.awt.Color(0, 0, 0));
        PERSEGIPANANG.setForeground(new java.awt.Color(255, 255, 255));
        PERSEGIPANANG.setText("PERSIGI PANJANG");
        PERSEGIPANANG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PERSEGIPANANGActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(segitiga, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(persegi, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PERSEGIPANANG)
                            .addComponent(lingkaran, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(PERSEGIPANANG)
                .addGap(26, 26, 26)
                .addComponent(persegi)
                .addGap(26, 26, 26)
                .addComponent(lingkaran)
                .addGap(28, 28, 28)
                .addComponent(segitiga)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void persegiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_persegiActionPerformed

        new PERSEGI().setVisible(true);
    }//GEN-LAST:event_persegiActionPerformed

    private void PERSEGIPANANGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PERSEGIPANANGActionPerformed
        
        new PERSEGIPANJANG().setVisible(true);
    }//GEN-LAST:event_PERSEGIPANANGActionPerformed

    private void lingkaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lingkaranActionPerformed
        
        new LINGKARAN().setVisible(true);
    }//GEN-LAST:event_lingkaranActionPerformed

    private void segitigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segitigaActionPerformed
        
        new SEGITIGA().setVisible(true);
    }//GEN-LAST:event_segitigaActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PERSEGIPANANG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton lingkaran;
    private javax.swing.JButton persegi;
    private javax.swing.JButton segitiga;
    // End of variables declaration//GEN-END:variables
}
