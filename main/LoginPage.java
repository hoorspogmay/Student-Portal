package main;

import java.awt.Color;

/**
 *
 * @author hoors
 */
public class LoginPage extends javax.swing.JFrame {

    public LoginPage() {
        initComponents();
        Color col = new Color(245,210,245);
        getContentPane().setBackground(col);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        teacherLoginbutton = new javax.swing.JButton();
        studentLoginButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(245, 210, 245));
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        teacherLoginbutton.setBackground(new java.awt.Color(255, 204, 255));
        teacherLoginbutton.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        teacherLoginbutton.setText("Login as a \"Teacher\"");
        teacherLoginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherLoginbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(teacherLoginbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, 210, 110));

        studentLoginButton.setBackground(new java.awt.Color(255, 204, 255));
        studentLoginButton.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        studentLoginButton.setText("Login as a \"Student\"");
        studentLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentLoginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(studentLoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 350, 210, 110));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/main.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 440));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/account.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 390, 140));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/border.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 290, 130));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/border.jpg"))); // NOI18N
        jLabel4.setText("jLabel2");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 290, 160));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void teacherLoginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherLoginbuttonActionPerformed
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherLoginGUI().setVisible(true);
            }
        });
    }//GEN-LAST:event_teacherLoginbuttonActionPerformed

    private void studentLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentLoginButtonActionPerformed
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentLoginGUI().setVisible(true);
            }
        });
    }//GEN-LAST:event_studentLoginButtonActionPerformed
  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton studentLoginButton;
    private javax.swing.JButton teacherLoginbutton;
    // End of variables declaration//GEN-END:variables
}
