/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkg5009cem_assignment;

/**
 *
 * @author sjjde
 */
public class VisitorTrackingMain extends javax.swing.JFrame {

    /**
     * Creates new form visitorTrackingMain
     */
    public VisitorTrackingMain() {
        initComponents();
    }
    
    
    //close entire UI page when navbtn clicked
    public void close() {
        dispose();
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
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        trackedVisitorsJan_btn = new javax.swing.JButton();
        trackedVisitorsFeb_btn = new javax.swing.JButton();
        trackedVisitorsMar_btn = new javax.swing.JButton();
        trackedVisitorsApr_btn = new javax.swing.JButton();
        trackedVisitorsMay_btn = new javax.swing.JButton();
        trackedVisitorsJun_btn = new javax.swing.JButton();
        trackedVisitorsJul_btn = new javax.swing.JButton();
        trackedVisitorsAug_btn = new javax.swing.JButton();
        trackedVisitorsSep_btn = new javax.swing.JButton();
        trackedVisitorsOct_btn = new javax.swing.JButton();
        trackedVisitorsNov_btn = new javax.swing.JButton();
        trackedVisitorsDec_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        visitorTrack_navbtn = new javax.swing.JButton();
        forum_navbtn = new javax.swing.JButton();
        paymentTrack_navbtn = new javax.swing.JButton();
        residentAcc_navbtn = new javax.swing.JButton();
        logout_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(857, 497));
        setMinimumSize(new java.awt.Dimension(857, 497));
        setPreferredSize(new java.awt.Dimension(857, 497));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(832, 471));
        jPanel1.setMinimumSize(new java.awt.Dimension(857, 497));
        jPanel1.setPreferredSize(new java.awt.Dimension(857, 497));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setMaximumSize(new java.awt.Dimension(720, 460));
        jDesktopPane1.setMinimumSize(new java.awt.Dimension(720, 460));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(720, 460));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Monthly Visitor Tracking");
        jDesktopPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 21, 200, 20));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Car plate no.", "Reason for visit", "Date", "Time in", "Time out"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jDesktopPane1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 570, 360));

        trackedVisitorsJan_btn.setText("January");
        trackedVisitorsJan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trackedVisitorsJan_btnActionPerformed(evt);
            }
        });
        jDesktopPane1.add(trackedVisitorsJan_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 90, -1));

        trackedVisitorsFeb_btn.setText("February");
        jDesktopPane1.add(trackedVisitorsFeb_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, -1));

        trackedVisitorsMar_btn.setText("March");
        jDesktopPane1.add(trackedVisitorsMar_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 90, -1));

        trackedVisitorsApr_btn.setText("April");
        jDesktopPane1.add(trackedVisitorsApr_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 90, -1));

        trackedVisitorsMay_btn.setText("May");
        jDesktopPane1.add(trackedVisitorsMay_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 90, -1));

        trackedVisitorsJun_btn.setText("June");
        jDesktopPane1.add(trackedVisitorsJun_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 90, -1));

        trackedVisitorsJul_btn.setText("July");
        jDesktopPane1.add(trackedVisitorsJul_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 90, -1));

        trackedVisitorsAug_btn.setText("August");
        jDesktopPane1.add(trackedVisitorsAug_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 90, -1));

        trackedVisitorsSep_btn.setText("September");
        jDesktopPane1.add(trackedVisitorsSep_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 90, -1));

        trackedVisitorsOct_btn.setText("October");
        jDesktopPane1.add(trackedVisitorsOct_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 90, -1));

        trackedVisitorsNov_btn.setText("November");
        jDesktopPane1.add(trackedVisitorsNov_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 90, -1));

        trackedVisitorsDec_btn.setText("December");
        jDesktopPane1.add(trackedVisitorsDec_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 90, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("View tracked details");
        jDesktopPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 720, 460));

        visitorTrack_navbtn.setText("Visitor Tracking");
        jPanel1.add(visitorTrack_navbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 130, -1));

        forum_navbtn.setText("Feedback Forum");
        forum_navbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forum_navbtnActionPerformed(evt);
            }
        });
        jPanel1.add(forum_navbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 130, -1));

        paymentTrack_navbtn.setText("Bill Payment Tracking");
        paymentTrack_navbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentTrack_navbtnActionPerformed(evt);
            }
        });
        jPanel1.add(paymentTrack_navbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 130, -1));

        residentAcc_navbtn.setText("Resident Accounts");
        residentAcc_navbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                residentAcc_navbtnActionPerformed(evt);
            }
        });
        jPanel1.add(residentAcc_navbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 130, -1));

        logout_btn.setText("Logout");
        logout_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btnActionPerformed(evt);
            }
        });
        jPanel1.add(logout_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        jLabel3.setText("Visitor Tracking");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //when user clicks on the button to navigate to 'Feedback Forum'
    private void forum_navbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forum_navbtnActionPerformed
        
        //TODO  
        
    }//GEN-LAST:event_forum_navbtnActionPerformed

    //when user clicks on the button to navigate to 'Bill Payment Tracking'
    private void paymentTrack_navbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentTrack_navbtnActionPerformed
        
        //TODO
        
    }//GEN-LAST:event_paymentTrack_navbtnActionPerformed

    //when user clicks on the button to navigate to 'Resident Accounts'
    private void residentAcc_navbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_residentAcc_navbtnActionPerformed
        
        //TODO
        
    }//GEN-LAST:event_residentAcc_navbtnActionPerformed

    //when user clicks on the 'logout' button
    private void logout_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btnActionPerformed
    
        // TODO add your handling code here:
        
    }//GEN-LAST:event_logout_btnActionPerformed

    private void trackedVisitorsJan_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trackedVisitorsJan_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trackedVisitorsJan_btnActionPerformed

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
            java.util.logging.Logger.getLogger(VisitorTrackingMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisitorTrackingMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisitorTrackingMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisitorTrackingMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisitorTrackingMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton forum_navbtn;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logout_btn;
    private javax.swing.JButton paymentTrack_navbtn;
    private javax.swing.JButton residentAcc_navbtn;
    private javax.swing.JButton trackedVisitorsApr_btn;
    private javax.swing.JButton trackedVisitorsAug_btn;
    private javax.swing.JButton trackedVisitorsDec_btn;
    private javax.swing.JButton trackedVisitorsFeb_btn;
    private javax.swing.JButton trackedVisitorsJan_btn;
    private javax.swing.JButton trackedVisitorsJul_btn;
    private javax.swing.JButton trackedVisitorsJun_btn;
    private javax.swing.JButton trackedVisitorsMar_btn;
    private javax.swing.JButton trackedVisitorsMay_btn;
    private javax.swing.JButton trackedVisitorsNov_btn;
    private javax.swing.JButton trackedVisitorsOct_btn;
    private javax.swing.JButton trackedVisitorsSep_btn;
    private javax.swing.JButton visitorTrack_navbtn;
    // End of variables declaration//GEN-END:variables
}
