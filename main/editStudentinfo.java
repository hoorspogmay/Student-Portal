package main;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.System.exit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author hoors
 */
public class editStudentinfo
{
    public void editName() 
    {
        try {
            // Read existing student data from the file
            BufferedReader reader = new BufferedReader(new FileReader("Studentdata.txt"));
            ArrayList<String> lines = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();

            // Find the line containing the name and update it
            for (int i = 0; i < lines.size(); i++) {
                if (lines.get(i).startsWith("Name:")) {
                    // Prompt the user for the new name
                    String newName = JOptionPane.showInputDialog("Enter the new name:");
                    if (newName == null) {
                        return;
                    }
                    lines.set(i, "Name: " + newName);
                    break; // Once we found and updated the name, we can stop searching
                }
            }

            // Write the modified data back to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter("Studentdata.txt"));
            for (String updatedLine : lines) {
                writer.write(updatedLine);
                writer.newLine();
            }
            writer.close();

            JOptionPane.showMessageDialog(null, "Name updated successfully!");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error occurred while updating name.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void editdob() 
    {
        try {
            // Read existing student data from the file
            BufferedReader reader = new BufferedReader(new FileReader("Studentdata.txt"));
            ArrayList<String> lines = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();

            // Find the line containing the name and update it
            for (int i = 0; i < lines.size(); i++) {
                if (lines.get(i).startsWith("Date of Birth:")) {
                    // Prompt the user for the new name
                    String newDob = JOptionPane.showInputDialog("Enter the new Date of birth:");
                    if (newDob == null) {
                        return;
                    }
                    lines.set(i, "Date of Birth: " + newDob);
                    break; // Once we found and updated the name, we can stop searching
                }
            }

            // Write the modified data back to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter("Studentdata.txt"));
            for (String updatedLine : lines) {
                writer.write(updatedLine);
                writer.newLine();
            }
            writer.close();

            JOptionPane.showMessageDialog(null, "Date of Birth updated successfully!");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error occurred while updating Date of Birth.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void editAddress() 
    {
        try {
            // Read existing student data from the file
            BufferedReader reader = new BufferedReader(new FileReader("Studentdata.txt"));
            ArrayList<String> lines = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();

            // Find the line containing the name and update it
            for (int i = 0; i < lines.size(); i++) {
                if (lines.get(i).startsWith("Address:")) {
                    // Prompt the user for the new name
                    String newAddress = JOptionPane.showInputDialog("Enter the new Address:");
                    if (newAddress == null) {
                        return;
                    }
                    lines.set(i, "Address: " + newAddress);
                    break; // Once we found and updated the name, we can stop searching
                }
            }

            // Write the modified data back to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter("Studentdata.txt"));
            for (String updatedLine : lines) {
                writer.write(updatedLine);
                writer.newLine();
            }
            writer.close();

            JOptionPane.showMessageDialog(null, "Address updated successfully!");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error occurred while updating Address.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void editEmail() 
    {
        try {
            // Read existing student data from the file
            BufferedReader reader = new BufferedReader(new FileReader("Studentdata.txt"));
            ArrayList<String> lines = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();

            // Find the line containing the name and update it
            for (int i = 0; i < lines.size(); i++) {
                if (lines.get(i).startsWith("Email:")) {
                    // Prompt the user for the new name
                    String newEmail = JOptionPane.showInputDialog("Enter the new Email:");
                    if (newEmail == null) {
                        return;
                    }
                    lines.set(i, "Email: " + newEmail);
                    break; // Once we found and updated the name, we can stop searching
                }
            }

            // Write the modified data back to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter("Studentdata.txt"));
            for (String updatedLine : lines) {
                writer.write(updatedLine);
                writer.newLine();
            }
            writer.close();

            JOptionPane.showMessageDialog(null, "Email updated successfully!");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error occurred while updating Email.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void editID() 
    {
        try {
            // Read existing student data from the file
            BufferedReader reader = new BufferedReader(new FileReader("Studentdata.txt"));
            ArrayList<String> lines = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();

            // Find the line containing the name and update it
            for (int i = 0; i < lines.size(); i++) {
                if (lines.get(i).startsWith("ID:")) {
                    // Prompt the user for the new name
                    String newID = JOptionPane.showInputDialog("Enter the new ID:");
                    if (newID == null) {
                        return;
                    }
                    lines.set(i, "ID: " + newID);
                    break; // Once we found and updated the name, we can stop searching
                }
            }
            // Write the modified data back to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter("Studentdata.txt"));
            for (String updatedLine : lines) {
                writer.write(updatedLine);
                writer.newLine();
            }
            writer.close();

            JOptionPane.showMessageDialog(null, "ID updated successfully!");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error occurred while updating ID.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void editAge() 
    {
        try {
            // Read existing student data from the file
            BufferedReader reader = new BufferedReader(new FileReader("Studentdata.txt"));
            ArrayList<String> lines = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();

            // Find the line containing the name and update it
            for (int i = 0; i < lines.size(); i++) {
                if (lines.get(i).startsWith("Age:")) {
                    // Prompt the user for the new name
                    String newAge = JOptionPane.showInputDialog("Enter the new Age:");
                    if (newAge== null) {
                        return;
                    }
                    lines.set(i, "Age: " + newAge);
                    break; // Once we found and updated the name, we can stop searching
                }
            }

            // Write the modified data back to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter("Studentdata.txt"));
            for (String updatedLine : lines) {
                writer.write(updatedLine);
                writer.newLine();
            }
            writer.close();

            JOptionPane.showMessageDialog(null, "Age updated successfully!");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error occurred while updating Age.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
   
    
    public void editGender() 
    {
        try {
            // Read existing student data from the file
            BufferedReader reader = new BufferedReader(new FileReader("Studentdata.txt"));
            ArrayList<String> lines = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();

            // Find the line containing the name and update it
            for (int i = 0; i < lines.size(); i++) {
                if (lines.get(i).startsWith("Gender: ")) {
                    // Prompt the user for the new name
                    String newGender = JOptionPane.showInputDialog("Enter the new Gender:");
                    if (newGender == null) {
                        return;
                    }
                    lines.set(i, "Gender: " + newGender);
                    break; // Once we found and updated the name, we can stop searching
                }
            }

            // Write the modified data back to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter("Studentdata.txt"));
            for (String updatedLine : lines) {
                writer.write(updatedLine);
                writer.newLine();
            }
            writer.close();

            JOptionPane.showMessageDialog(null, "Gender updated successfully!");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error occurred while updating Gender.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void editNationality() 
    {
        try {
            // Read existing student data from the file
            BufferedReader reader = new BufferedReader(new FileReader("Studentdata.txt"));
            ArrayList<String> lines = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();

            // Find the line containing the name and update it
            for (int i = 0; i < lines.size(); i++) {
                if (lines.get(i).startsWith("Nationality:")) {
                    // Prompt the user for the new name
                    String newNationality = JOptionPane.showInputDialog("Enter the new Nationality:");
                    if (newNationality == null) {
                        return;
                    }
                    lines.set(i, "Nationality: " + newNationality);
                    break; // Once we found and updated the name, we can stop searching
                }
            }

            // Write the modified data back to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter("Studentdata.txt"));
            for (String updatedLine : lines) {
                writer.write(updatedLine);
                writer.newLine();
            }
            writer.close();

            JOptionPane.showMessageDialog(null, "Nationality updated successfully!");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error occurred while updating Nationality.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void editPersonalContact() 
    {
        try {
            // Read existing student data from the file
            BufferedReader reader = new BufferedReader(new FileReader("Studentdata.txt"));
            ArrayList<String> lines = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();

            // Find the line containing the name and update it
            for (int i = 0; i < lines.size(); i++) {
                if (lines.get(i).startsWith("Personal Contact Number:")) {
                    // Prompt the user for the new name
                    String newPersonalContactNumber = JOptionPane.showInputDialog("Enter the new Personal Contact Number:");
                    if (newPersonalContactNumber == null) {
                        return;
                    }
                    lines.set(i, "Personal Contact Number: " + newPersonalContactNumber);
                    break; // Once we found and updated the name, we can stop searching
                }
            }

            // Write the modified data back to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter("Studentdata.txt"));
            for (String updatedLine : lines) {
                writer.write(updatedLine);
                writer.newLine();
            }
            writer.close();

            JOptionPane.showMessageDialog(null, "Personal Contact Number updated successfully!");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error occurred while updating Personal Contact Number.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void editEmergencyContact() 
    {
        try {
            // Read existing student data from the file
            BufferedReader reader = new BufferedReader(new FileReader("Studentdata.txt"));
            ArrayList<String> lines = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();

            // Find the line containing the name and update it
            for (int i = 0; i < lines.size(); i++) {
                if (lines.get(i).startsWith("Emergency Contact Number:")) {
                    // Prompt the user for the new name
                    String newEmergencyContactNumber = JOptionPane.showInputDialog("Enter the new Emergency Contact Number:");
                    if (newEmergencyContactNumber== null) {
                        return;
                    }
                    lines.set(i, "Emergency Contact Number: " + newEmergencyContactNumber);
                    break; // Once we found and updated the name, we can stop searching
                }
            }

            // Write the modified data back to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter("Studentdata.txt"));
            for (String updatedLine : lines) {
                writer.write(updatedLine);
                writer.newLine();
            }
            writer.close();

            JOptionPane.showMessageDialog(null, "Emergency Contact Number updated successfully!");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error occurred while updating Emergency Contact Number.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

 class editStudentinfoGUI extends javax.swing.JFrame {
    editStudentinfo editinfo;
    public editStudentinfoGUI() {
        editinfo =  new editStudentinfo();
        initComponents();
        Color col = new Color(245,210,245);
        getContentPane().setBackground(col);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        NameButton = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 210, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel1.setText("Select the field you want to edit");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 204, 255));
        jButton1.setText("Nationality");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 161, 59));

        jButton2.setBackground(new java.awt.Color(255, 204, 255));
        jButton2.setText("Personal Contact Number");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 179, 60));

        jButton3.setBackground(new java.awt.Color(255, 204, 255));
        jButton3.setText("Address");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 161, 59));

        jButton4.setBackground(new java.awt.Color(255, 204, 255));
        jButton4.setText("Date Of Birth");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 161, 59));

        jButton5.setBackground(new java.awt.Color(255, 204, 255));
        jButton5.setText("ID");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 160, 60));

        jButton6.setBackground(new java.awt.Color(255, 204, 255));
        jButton6.setText("Email");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 179, 60));

        jButton7.setBackground(new java.awt.Color(255, 204, 255));
        jButton7.setText("Emergency Contact Number");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, 60));

        jButton8.setBackground(new java.awt.Color(255, 204, 255));
        jButton8.setText("Gender");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 160, 60));

        NameButton.setBackground(new java.awt.Color(255, 204, 255));
        NameButton.setText("Name");
        NameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameButtonActionPerformed(evt);
            }
        });
        jPanel1.add(NameButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 160, 59));

        jButton10.setBackground(new java.awt.Color(255, 204, 255));
        jButton10.setText("Age");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 160, 60));

        jButton11.setBackground(new java.awt.Color(255, 204, 255));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/off .png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 84, 80));

        jButton12.setBackground(new java.awt.Color(255, 204, 255));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 80, 75));

        logoutButton.setBackground(new java.awt.Color(255, 204, 255));
        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        jPanel1.add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 77, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      editinfo.editEmergencyContact();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void NameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameButtonActionPerformed
      editinfo.editName();    
    }//GEN-LAST:event_NameButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       editinfo.editNationality();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        editinfo.editID();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        editinfo.editAddress();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        editinfo.editAge();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       editinfo.editdob();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       editinfo.editGender();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       editinfo.editPersonalContact();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       editinfo.editEmail();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        this.toBack();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        exit(0);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        this.toBack();
        LoginPage login = new LoginPage();
        login.setVisible(true);
        login.toFront();
    }//GEN-LAST:event_logoutButtonActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NameButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutButton;
    // End of variables declaration//GEN-END:variables
}