
package main;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author hoors
 */
public class StudentLogin implements UserInterface
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
         return username.equals("student") && password.equals("1234");
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

    
    public StudentLogin() {
    }

    public StudentLogin(javax.swing.JTextField UsernameField, javax.swing.JPasswordField PasswordField) {
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
                new Student().setVisible(true);
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
 class StudentLoginGUI extends javax.swing.JFrame {

     private StudentLogin studentLogin;
   
     public StudentLoginGUI() {
        initComponents();  
        Color col = new Color(245,210,245);
        getContentPane().setBackground(col);
         studentLogin = new StudentLogin(UsernameField, PasswordField);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        usernameField = new javax.swing.JLabel();
        passwordField = new javax.swing.JLabel();
        UsernameField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginButton.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 430, 180, 60));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome To Student Center");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 360, 57));

        usernameField.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        usernameField.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usernameField.setText("Usename:");
        getContentPane().add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, 207, 50));

        passwordField.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        passwordField.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordField.setText("Password:");
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, 207, 48));

        UsernameField.setBackground(new java.awt.Color(230, 213, 235));
        UsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(UsernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, 222, 50));

        PasswordField.setBackground(new java.awt.Color(230, 213, 235));
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, 222, 47));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/border.jpg"))); // NOI18N
        jLabel4.setText("jLabel2");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 290, 150));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/border.jpg"))); // NOI18N
        jLabel5.setText("jLabel2");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 290, 150));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/account.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, 190, 150));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/main.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
    private void UsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameFieldActionPerformed
        studentLogin.setUsername(UsernameField.getText());
    }//GEN-LAST:event_UsernameFieldActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
       studentLogin.login();
    }//GEN-LAST:event_loginButtonActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        
    }//GEN-LAST:event_PasswordFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JButton loginButton;
    private javax.swing.JLabel passwordField;
    private javax.swing.JLabel usernameField;
    // End of variables declaration//GEN-END:variables
}
