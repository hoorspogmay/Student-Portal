
package main;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public interface UserInterface {
     
    javax.swing.JTextField UsernameField = null;
    javax.swing.JPasswordField PasswordField = null;
    int count = 0;
    
    int getCount();
    void setCount(int count);
 
    
    String getUsername();
    void setUsername(String Username);
    
    String getPassword();
    void setPassword(String Password);
    
    JTextField getUsernameField();
    void setUsernameField(JTextField UsernameField);
    
    JPasswordField getPasswordField();
    void setPasswordField(JPasswordField PasswordField);
    
    boolean login(String username, String password);
    void login();
}

