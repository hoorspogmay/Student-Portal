
package main;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author hoors
 */
public class TeacherLogin implements UserInterface
{
    private int count = 3;
  
    private String Username;
    private String Password;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JPasswordField PasswordField;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean login(String username, String password) {
         return username.equals("teacher") && password.equals("1234");
    }
    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public JTextField getUsernameField() {
        return UsernameField;
    }

    public void setUsernameField(JTextField UsernameField) {
        this.UsernameField = UsernameField;
    }

    public JPasswordField getPasswordField() {
        return PasswordField;
    }

    public void setPasswordField(JPasswordField PasswordField) {
        this.PasswordField = PasswordField;
    }

    
    public TeacherLogin() {
    }

    public TeacherLogin(javax.swing.JTextField UsernameField, javax.swing.JPasswordField PasswordField) {
        this.UsernameField = UsernameField;
        this.PasswordField = PasswordField;
    }

    public void login()
                { 
         Username = UsernameField.getText();
         Password = PasswordField.getText();
        
        if(login(Username,Password)==true){
            JOptionPane.showMessageDialog(null, "Login succesfull");
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teacher().setVisible(true);
            }
        });   
            
        }
        else
        {
            count = count-1;
            if (count == 0)
            {
                JOptionPane.showMessageDialog(null,"No more login attempts left");
               
            }
            else
            {
            JOptionPane.showInternalMessageDialog(null, "Invalid try "+count+" Attempts left");
            UsernameField.setText("");
            PasswordField.setText("");
            }
        }
    }
}
 class TeacherLoginGUI extends javax.swing.JFrame {

    private TeacherLogin teacherLogin;
    public TeacherLoginGUI() {
        initComponents();
        Color col = new Color(245,210,245);
        getContentPane().setBackground(col);
        teacherLogin = new TeacherLogin(usernameField, passwordField);
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        usernameField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 120, 120));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to Teacher Center");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, 360, 36));

        jLabel2.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Username:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, 203, 36));

        jLabel3.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 310, 203, 40));

        loginButton.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 430, 156, 64));

        passwordField.setBackground(new java.awt.Color(230, 213, 235));
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, 238, 41));

        usernameField.setBackground(new java.awt.Color(230, 213, 235));
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, 238, 41));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/border.jpg"))); // NOI18N
        jLabel6.setText("jLabel2");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 290, 150));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/border.jpg"))); // NOI18N
        jLabel7.setText("jLabel2");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 290, 150));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/main.jpg"))); // NOI18N
        jLabel8.setText("jLabel6");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 400));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/account.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 190, 150));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        teacherLogin.login();
    }//GEN-LAST:event_loginButtonActionPerformed

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
