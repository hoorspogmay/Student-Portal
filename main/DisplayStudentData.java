package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.System.exit;
import javax.swing.JOptionPane;

public class DisplayStudentData{
     public String readStudentInfo() {
        File file = new File("Studentdata.txt");
        StringBuilder sb = new StringBuilder();
        try {
            FileReader reader = new FileReader(file);
            BufferedReader breader = new BufferedReader(reader);
            try
            {
            String line;
            while ((line = breader.readLine()) != null) {
                sb.append(line).append("\n");
            }
            }
            finally 
            {
            breader.close();
            reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error occurred while reading student information.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return sb.toString();
    }
     public String readStudentCourses() {
        File file = new File("EnrolledCourses.txt");
        StringBuilder sb = new StringBuilder();
        try {
            FileReader reader = new FileReader(file);
            BufferedReader breader = new BufferedReader(reader);
            String line;
            while ((line = breader.readLine()) != null) {
                sb.append(line).append("\n");
            }
            breader.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error occurred while reading student information.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return sb.toString();
    }
}
 class DisplayStudentDataGUI extends javax.swing.JFrame {

    public DisplayStudentDataGUI() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logoutButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        PowerOffButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        courseButton = new javax.swing.JButton();
        displayStudentInfo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 210, 255));

        logoutButton.setBackground(new java.awt.Color(255, 204, 255));
        logoutButton.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(255, 204, 255));
        backButton.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        PowerOffButton.setBackground(new java.awt.Color(255, 204, 255));
        PowerOffButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/off .png"))); // NOI18N
        PowerOffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PowerOffButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel1.setText("Display Student Info");

        courseButton.setBackground(new java.awt.Color(255, 204, 255));
        courseButton.setText("Display Enrolled Courses");
        courseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseButtonActionPerformed(evt);
            }
        });

        displayStudentInfo.setBackground(new java.awt.Color(255, 204, 255));
        displayStudentInfo.setText("Display Student Info");
        displayStudentInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayStudentInfoActionPerformed(evt);
            }
        });

        jTextArea1.setBackground(new java.awt.Color(255, 204, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PowerOffButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(displayStudentInfo)
                                    .addGap(18, 18, 18)
                                    .addComponent(courseButton))))
                        .addContainerGap(28, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PowerOffButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayStudentInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        this.toBack();
        LoginPage login = new LoginPage();
        login.setVisible(true);
        login.toFront();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.toBack();
        
    }//GEN-LAST:event_backButtonActionPerformed

    private void PowerOffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PowerOffButtonActionPerformed
        exit(0);
    }//GEN-LAST:event_PowerOffButtonActionPerformed

    private void displayStudentInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayStudentInfoActionPerformed
        DisplayStudentData displayStudentData = new DisplayStudentData();
        String studentInfo = displayStudentData.readStudentInfo();
        jTextArea1.setText(studentInfo);
    }//GEN-LAST:event_displayStudentInfoActionPerformed

    private void courseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseButtonActionPerformed
        DisplayStudentData displayStudentData = new DisplayStudentData();
        String studentInfo = displayStudentData.readStudentCourses();
        jTextArea1.setText(studentInfo);
    }//GEN-LAST:event_courseButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PowerOffButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton courseButton;
    private javax.swing.JButton displayStudentInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton logoutButton;
    // End of variables declaration//GEN-END:variables
}
