package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.*;
import java.io.IOException;
import static java.lang.System.exit;
import javax.swing.JOptionPane;
import java.util.ArrayList;

 public class Studentinfo {
    
    //data members
    private String name;
    private String id;
    private String age;
    private String address;
    private String personalContactNumber;
    private String emergencyContactNumber;
    private String gender;
    private String nationality;
    private String dob;
    private String email;
    
    //Constructor
    public Studentinfo()
    {
        name = null;
        id = null;
        age = null;
        address = null;
        personalContactNumber = null;
        emergencyContactNumber = null;
        gender = null;
        nationality = null;
        dob = null;
        email = null;
    }
    public Studentinfo(String name, String id, String age, String address, String personalContactNumber, String emergencyContactNumber, String gender, String nationality, String dob, String email)
    {
        this.name = name;
        this.id = id;
        this.age = age;
        this.address = address;
        this.personalContactNumber = personalContactNumber;
        this.emergencyContactNumber = emergencyContactNumber;
        this.gender = gender;
        this.nationality = nationality;
        this.dob = dob;
        this.email = email;
   
        
    }
    
    // Getters
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPersonalContactNumber() {
        return personalContactNumber;
    }

    public String getEmergencyContactNumber() {
        return emergencyContactNumber;
    }

    public String getGender() {
        return gender;
    }

    public String getNationality() {
        return nationality;
    }

    public String getDob() {
        return dob;
    }

    public String getEmail() {
        return email;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPersonalContactNumber(String personalContactNumber) {
        this.personalContactNumber = personalContactNumber;
    }

    public void setEmergencyContactNumber(String emergencyContactNumber) {
        this.emergencyContactNumber = emergencyContactNumber;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    // Display info
    @Override
     public String toString() {
         return "Student Information\nName: " + name + "\n" +
            "ID: " + id + "\n" +
            "Age: " + age + "\n" +
            "Address: " + address + "\n" +
            "Personal Contact Number: " + personalContactNumber + "\n" +
            "Emergency Contact Number: " + emergencyContactNumber + "\n" +
            "Gender: " + gender + "\n" +
            "Nationality: " + nationality + "\n" +
            "Date of Birth: " + dob + "\n" +
            "Email: " + email + "\n";
    }
}    
    
 class StudentinfoGUI extends javax.swing.JFrame {

    /**
     * Creates new form StudentInfo
     */
    public StudentinfoGUI() {
        initComponents();
        
    }
    
   private void saveStudentInfo() {
        File file = new File("Studentdata.txt");
        try {
    FileWriter writer = new FileWriter(file);
    BufferedWriter bwriter = new BufferedWriter(writer);
    try {
        String name = nameField.getText().trim();
        String id = idField.getText().trim();
        String age = ageField.getText().trim();
        String address = addressField.getText().trim();
        String personalContactNumber = personalContactNumberField.getText().trim();
        String emergencyContactNumber = emergencyContactNumberField.getText().trim();
        String gender = genderField.getText().trim();
        String nationality = nationalityField.getText().trim();
        String dob = dobField.getText().trim();
        String email = emailField.getText().trim();

        // Validate inputs
        if (name.isEmpty() || id.isEmpty() || age.isEmpty() || address.isEmpty() || 
            personalContactNumber.isEmpty() || emergencyContactNumber.isEmpty() || 
            gender.isEmpty() || nationality.isEmpty() || dob.isEmpty() || email.isEmpty()) {
            throw new IllegalArgumentException("All fields must be filled.");
        }

        int ageInt;
        try {
            ageInt = Integer.parseInt(age);
            if (ageInt <= 0) {
                throw new IllegalArgumentException("Age must be a positive number.");
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Age must be a valid number.", e);
        }

        if (!personalContactNumber.matches("\\d+")) {
            throw new IllegalArgumentException("Personal Contact Number must contain only digits.");
        }

        if (!emergencyContactNumber.matches("\\d+")) {
            throw new IllegalArgumentException("Emergency Contact Number must contain only digits.");
        }

        if (!email.matches("^[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$")) {
            throw new IllegalArgumentException("Email is not in a valid format.");
        }

        Studentinfo student = new Studentinfo(name, id, age, address, personalContactNumber, emergencyContactNumber, gender, nationality, dob, email);
        bwriter.write(student.toString());

        JOptionPane.showMessageDialog(this, "Student Information saved to Studentdata.txt.");
    } catch (IllegalArgumentException e) {
        JOptionPane.showMessageDialog(this, e.getMessage(), "Input Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        try {
            bwriter.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} catch (IOException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Error occurred while saving student information.", "Error", JOptionPane.ERROR_MESSAGE);
}

   }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();
        idField = new javax.swing.JTextField();
        ageField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        nationalityField = new javax.swing.JTextField();
        addressField = new javax.swing.JTextField();
        personalContactNumberField = new javax.swing.JTextField();
        dobField = new javax.swing.JTextField();
        emergencyContactNumberField = new javax.swing.JTextField();
        genderField = new javax.swing.JTextField();
        genderComboBox = new javax.swing.JComboBox<>();
        clearButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 210, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 204, 255));
        jLabel2.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel2.setText("Email");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 358, 80, 30));

        jLabel3.setBackground(new java.awt.Color(255, 204, 255));
        jLabel3.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel3.setText("Nationality");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 124, 80, 30));

        jLabel5.setBackground(new java.awt.Color(255, 204, 255));
        jLabel5.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel5.setText("Date Of Birth");
        jLabel5.setMaximumSize(new java.awt.Dimension(80, 30));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 242, 80, 30));

        jLabel6.setBackground(new java.awt.Color(255, 204, 255));
        jLabel6.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel6.setText("Address");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 180, 80, 30));

        jLabel8.setBackground(new java.awt.Color(255, 204, 255));
        jLabel8.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel8.setText("Age");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 242, 80, 30));

        jLabel9.setBackground(new java.awt.Color(255, 204, 255));
        jLabel9.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel9.setText("Emergency Contact Number");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 358, 165, 30));

        jLabel10.setBackground(new java.awt.Color(255, 204, 255));
        jLabel10.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel10.setText("ID");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 180, 80, 30));

        jLabel11.setBackground(new java.awt.Color(255, 204, 255));
        jLabel11.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel11.setText("Name");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 124, 80, 30));

        jLabel4.setBackground(new java.awt.Color(255, 204, 255));
        jLabel4.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel4.setText("Gender");
        jLabel4.setPreferredSize(new java.awt.Dimension(80, 30));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 296, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 204, 255));
        jLabel7.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel7.setText("Personal Conrtact Number");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 296, 155, 30));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter Your Particulars");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 275, 34));

        saveButton.setBackground(new java.awt.Color(255, 204, 255));
        saveButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        jPanel1.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 90, 90));

        nameField.setBackground(new java.awt.Color(255, 204, 255));
        nameField.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        nameField.setText("Enter your Name");
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 117, 179, 44));

        idField.setBackground(new java.awt.Color(255, 204, 255));
        idField.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        idField.setText("Enter your ID");
        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });
        jPanel1.add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 173, 179, 44));

        ageField.setBackground(new java.awt.Color(255, 204, 255));
        ageField.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        ageField.setText("Enter your Age");
        ageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageFieldActionPerformed(evt);
            }
        });
        jPanel1.add(ageField, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 235, 179, 44));

        emailField.setBackground(new java.awt.Color(255, 204, 255));
        emailField.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        emailField.setText("Enter your Email");
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });
        jPanel1.add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 351, 179, 44));

        nationalityField.setBackground(new java.awt.Color(255, 204, 255));
        nationalityField.setText("Enter your Nationality");
        nationalityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nationalityFieldActionPerformed(evt);
            }
        });
        jPanel1.add(nationalityField, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 117, 177, 44));

        addressField.setBackground(new java.awt.Color(255, 204, 255));
        addressField.setText("Enter your Address");
        addressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressFieldActionPerformed(evt);
            }
        });
        jPanel1.add(addressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 173, 177, 44));

        personalContactNumberField.setBackground(new java.awt.Color(255, 204, 255));
        personalContactNumberField.setText("Enter your Contact");
        personalContactNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalContactNumberFieldActionPerformed(evt);
            }
        });
        jPanel1.add(personalContactNumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 289, 177, 44));

        dobField.setBackground(new java.awt.Color(255, 204, 255));
        dobField.setText("Enter your DOB");
        dobField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobFieldActionPerformed(evt);
            }
        });
        jPanel1.add(dobField, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 235, 177, 44));

        emergencyContactNumberField.setBackground(new java.awt.Color(255, 204, 255));
        emergencyContactNumberField.setText("Enter your Contact");
        emergencyContactNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emergencyContactNumberFieldActionPerformed(evt);
            }
        });
        jPanel1.add(emergencyContactNumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 177, 44));

        genderField.setBackground(new java.awt.Color(255, 204, 255));
        genderField.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        genderField.setText("Enter your Gender");
        genderField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderFieldActionPerformed(evt);
            }
        });
        jPanel1.add(genderField, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 289, 89, 44));

        genderComboBox.setBackground(new java.awt.Color(255, 204, 255));
        genderComboBox.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "male", "female" }));
        genderComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        genderComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(genderComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 293, 78, 34));

        clearButton.setBackground(new java.awt.Color(255, 204, 255));
        clearButton.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        clearButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reset.png"))); // NOI18N
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        jPanel1.add(clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 90, 90));

        logoutButton.setBackground(new java.awt.Color(255, 204, 255));
        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        jPanel1.add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 480, 90, 90));

        jButton11.setBackground(new java.awt.Color(255, 204, 255));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/off .png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 90, 90));

        jButton12.setBackground(new java.awt.Color(255, 204, 255));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 90, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
          ArrayList<String> Student = new ArrayList<>();
          Student.add(nameField.getText()); 
    }//GEN-LAST:event_nameFieldActionPerformed

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFieldActionPerformed

    private void ageFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageFieldActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void nationalityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nationalityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nationalityFieldActionPerformed

    private void addressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressFieldActionPerformed

    private void personalContactNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalContactNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personalContactNumberFieldActionPerformed

    private void dobFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobFieldActionPerformed

    private void emergencyContactNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emergencyContactNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emergencyContactNumberFieldActionPerformed

    private void genderFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderFieldActionPerformed
  
    }//GEN-LAST:event_genderFieldActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        saveStudentInfo();
    }//GEN-LAST:event_saveButtonActionPerformed

    private void genderComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderComboBoxActionPerformed
         genderField.setText(genderComboBox.getSelectedItem().toString());
         genderField.setEditable(false);
    }//GEN-LAST:event_genderComboBoxActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
       nameField.setText("");
        idField.setText("");
        ageField.setText("");
        addressField.setText("");
        personalContactNumberField.setText("");
        emergencyContactNumberField.setText("");
        genderComboBox.setSelectedIndex(0);
        nationalityField.setText("");
        dobField.setText("");
        emailField.setText("");   
    }//GEN-LAST:event_clearButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        this.toBack();
        LoginPage login = new LoginPage();
        login.setVisible(true);
        login.toFront();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        exit(0);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        this.toBack();
        Student student = new Student();
        student.setVisible(true);
        student.toFront();
    }//GEN-LAST:event_jButton12ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JTextField ageField;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField dobField;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField emergencyContactNumberField;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JTextField genderField;
    private javax.swing.JTextField idField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField nationalityField;
    private javax.swing.JTextField personalContactNumberField;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}

