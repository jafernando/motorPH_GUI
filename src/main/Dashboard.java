
package main;


/**
 *
 * @author ADRIAN
 */
public class Dashboard extends javax.swing.JFrame {

    ViewEmployees ve = new ViewEmployees();
    ViewProfile vp = new ViewProfile();
    ViewSalary vs = new ViewSalary();
  
    
    public Dashboard() {
        
        initComponents();

        
        }    

    public Dashboard(String name, String position) {

        initComponents();
        
        jLabelLoggedUser.setText(name);
        jLabelPosition.setText(position);
        jLayeredPane1.add(ve);
        jLayeredPane1.add(vp);
        jLayeredPane1.add(vs);
        
        ve.setVisible(false);
        vp.setVisible(false);
        vs.setVisible(false);
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
        jLabelwelcome = new javax.swing.JLabel();
        jLabelLoggedUser = new javax.swing.JLabel();
        jLabelPosition = new javax.swing.JLabel();
        jButtonViewProfile = new javax.swing.JButton();
        jButtonViewEmployees = new javax.swing.JButton();
        jButtonViewSalary = new javax.swing.JButton();
        jButtonViewLeaves = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 800));

        jPanel1.setBackground(new java.awt.Color(5, 68, 94));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelwelcome.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabelwelcome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelwelcome.setText("Welcome,");
        jPanel1.add(jLabelwelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(662, 14, -1, 34));

        jLabelLoggedUser.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabelLoggedUser.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLoggedUser.setText("<name>");
        jPanel1.add(jLabelLoggedUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(769, 16, 305, -1));

        jLabelPosition.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelPosition.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPosition.setText("<position>");
        jPanel1.add(jLabelPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, 245, -1));

        jButtonViewProfile.setBackground(new java.awt.Color(117, 230, 218));
        jButtonViewProfile.setText("VIEW PROFILE");
        jButtonViewProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewProfileActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonViewProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 210, 40));

        jButtonViewEmployees.setBackground(new java.awt.Color(117, 230, 218));
        jButtonViewEmployees.setText("VIEW EMPLOYEES");
        jButtonViewEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewEmployeesActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonViewEmployees, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 210, 40));

        jButtonViewSalary.setBackground(new java.awt.Color(117, 230, 218));
        jButtonViewSalary.setText("VIEW SALARY");
        jButtonViewSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewSalaryActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonViewSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 210, 40));

        jButtonViewLeaves.setBackground(new java.awt.Color(117, 230, 218));
        jButtonViewLeaves.setText("LEAVE CREDITS");
        jPanel1.add(jButtonViewLeaves, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, 210, 40));

        jLayeredPane1.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonViewEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewEmployeesActionPerformed
        
        ve.setVisible(true);
        vp.setVisible(false);
        vs.setVisible(false);
        ve.setSize(jLayeredPane1.getSize());
        
    }//GEN-LAST:event_jButtonViewEmployeesActionPerformed

    private void jButtonViewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewProfileActionPerformed
        
        ve.setVisible(false);
        vp.setVisible(true);
        vs.setVisible(false);
        vp.setSize(jLayeredPane1.getSize());
        
        
    }//GEN-LAST:event_jButtonViewProfileActionPerformed

    private void jButtonViewSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewSalaryActionPerformed
        
        ve.setVisible(false);
        vp.setVisible(false);
        vs.setVisible(true);
        vs.setSize(jLayeredPane1.getSize());
        
    }//GEN-LAST:event_jButtonViewSalaryActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonViewEmployees;
    private javax.swing.JButton jButtonViewLeaves;
    private javax.swing.JButton jButtonViewProfile;
    private javax.swing.JButton jButtonViewSalary;
    private javax.swing.JLabel jLabelLoggedUser;
    private javax.swing.JLabel jLabelPosition;
    private javax.swing.JLabel jLabelwelcome;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
