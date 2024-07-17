package main;

import static java.lang.System.exit;

/**
 *
 * @author hoors
 */
public class Student extends javax.swing.JFrame {


    public Student() {  
        initComponents();
 
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        enterButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        courseButton = new javax.swing.JButton();
        announcementButon = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        displayButton = new javax.swing.JButton();
        PowerOffButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 210, 245));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome To Student Center");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 326, 32));

        enterButton.setBackground(new java.awt.Color(255, 204, 255));
        enterButton.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        enterButton.setText("Enter your information");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });
        jPanel1.add(enterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 148, -1, 81));

        logoutButton.setBackground(new java.awt.Color(255, 204, 255));
        logoutButton.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        jPanel1.add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 460, 77, 71));

        editButton.setBackground(new java.awt.Color(255, 204, 255));
        editButton.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        editButton.setText("Edit Information");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        jPanel1.add(editButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 247, 192, 81));

        courseButton.setBackground(new java.awt.Color(255, 204, 255));
        courseButton.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        courseButton.setText("Courses");
        courseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseButtonActionPerformed(evt);
            }
        });
        jPanel1.add(courseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 197, 81));

        announcementButon.setBackground(new java.awt.Color(255, 204, 255));
        announcementButon.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        announcementButon.setText("Announcements");
        announcementButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                announcementButonActionPerformed(evt);
            }
        });
        jPanel1.add(announcementButon, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 247, 197, 81));

        backButton.setBackground(new java.awt.Color(255, 204, 255));
        backButton.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 459, 80, -1));

        displayButton.setBackground(new java.awt.Color(255, 204, 255));
        displayButton.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        displayButton.setText("Display Data");
        displayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayButtonActionPerformed(evt);
            }
        });
        jPanel1.add(displayButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 148, 192, 81));

        PowerOffButton.setBackground(new java.awt.Color(255, 204, 255));
        PowerOffButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/off .png"))); // NOI18N
        PowerOffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PowerOffButtonActionPerformed(evt);
            }
        });
        jPanel1.add(PowerOffButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 86, 82));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 540));
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentinfoGUI().setVisible(true);
            }
        });
    }//GEN-LAST:event_enterButtonActionPerformed

    private void courseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseButtonActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentCourseGUI().setVisible(true);
            }
        });
    }//GEN-LAST:event_courseButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
      java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editStudentinfoGUI().setVisible(true);
            }
        });      
    }//GEN-LAST:event_editButtonActionPerformed

    private void announcementButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_announcementButonActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentAnnouncementGUI().setVisible(true);
            }
        });
    }//GEN-LAST:event_announcementButonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        this.toBack();
        LoginPage login = new LoginPage();
        login.setVisible(true);
        login.toFront();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void displayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayButtonActionPerformed
     java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayStudentDataGUI().setVisible(true);
            }
        });  
    }//GEN-LAST:event_displayButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.toBack();
    }//GEN-LAST:event_backButtonActionPerformed

    private void PowerOffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PowerOffButtonActionPerformed
        exit(0);
    }//GEN-LAST:event_PowerOffButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PowerOffButton;
    private javax.swing.JButton announcementButon;
    private javax.swing.JButton backButton;
    private javax.swing.JButton courseButton;
    private javax.swing.JButton displayButton;
    private javax.swing.JButton editButton;
    private javax.swing.JButton enterButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutButton;
    // End of variables declaration//GEN-END:variables
}
