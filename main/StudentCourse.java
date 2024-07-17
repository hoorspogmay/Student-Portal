
package main;

import java.awt.Color;
import java.io.*;
import static java.lang.System.exit;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class StudentCourse {
    // Attributes
    private String courseName;
    private String instructorName;
    private int credits;
    private int courseId;

    // Constructor
    public StudentCourse(String courseName, String instructorName, int credits, int courseId) {
        this.courseName = courseName;
        this.instructorName = instructorName;
        this.credits = credits;
        this.courseId = courseId;
    }

    // Getters and Setters
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
}


class StudentCourseGUI extends javax.swing.JFrame {

 ArrayList<String> availableCourses = new ArrayList<>();
   
    public StudentCourseGUI() {
        initComponents();
        Color col = new Color(245,210,245);
        getContentPane().setBackground(col);
    }

    public void viewCourses()
   {
       try{
       FileReader reader = new FileReader("courseinformation.txt");
       BufferedReader breader = new BufferedReader(reader);
        try
        {
            StringBuilder course = new StringBuilder();
            String line;
            while((line = breader.readLine())!=null)
            {
                course.append(line).append("\n");  
            
             for (int i = 0; i < line.length(); i++) 
             {
                if (line.startsWith("Course ID:")) { 
                {
                    String courseName = line.substring(line.indexOf(":") + 2); // Add 2 to skip ": "
                    availableCourses.add(courseName);
                }
                    System.out.println(availableCourses);
                    break;
             }
             }
             DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(availableCourses.toArray(new String[0]));
            courseComboBox.setModel(comboBoxModel);

            studentArea.setText(course.toString().trim());
            studentArea.setEditable(false);
        }
        }
        finally
        {
            breader.close();
            reader.close();
        }
       }
       catch(IOException e)
       {
           e.printStackTrace();
           JOptionPane.showMessageDialog(null, "Error occured while retrieving course details");
       }
   }
    public void saveEnrolledCourses()
    { 
        try
        {
            FileWriter writer = new FileWriter("EnrolledCourses.txt",true);
            BufferedWriter bwriter = new BufferedWriter(writer);
            
            try
            {
                String enrolledCourse = courseComboBox.getSelectedItem().toString();
                bwriter.write(enrolledCourse + "\n");
                JOptionPane.showMessageDialog(null, "Data saved sucessfully!");
            }
            finally
            {
                bwriter.close();
                writer.close();
            }
        }

        catch(IOException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Error occured while storing data");
        }
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        enrollButton = new javax.swing.JButton();
        displayButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentArea = new javax.swing.JTextArea();
        courseComboBox = new javax.swing.JComboBox<>();
        logoutButton = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        remove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Courses");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 327, 58));

        enrollButton.setBackground(new java.awt.Color(255, 204, 255));
        enrollButton.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        enrollButton.setText("Enroll Course");
        enrollButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enrollButtonActionPerformed(evt);
            }
        });
        jPanel1.add(enrollButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 190, 70));

        displayButton.setBackground(new java.awt.Color(255, 204, 255));
        displayButton.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        displayButton.setText("Display Courses");
        displayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayButtonActionPerformed(evt);
            }
        });
        jPanel1.add(displayButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 190, 71));

        studentArea.setBackground(new java.awt.Color(255, 204, 204));
        studentArea.setColumns(20);
        studentArea.setRows(5);
        jScrollPane1.setViewportView(studentArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 290, 250));

        courseComboBox.setBackground(new java.awt.Color(255, 204, 255));
        courseComboBox.setModel(new DefaultComboBoxModel<String>(availableCourses.toArray(new String[0])));
        jPanel1.add(courseComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 180, 40));

        logoutButton.setBackground(new java.awt.Color(255, 204, 255));
        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        jPanel1.add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 80, 80));

        jButton11.setBackground(new java.awt.Color(255, 204, 255));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/off .png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 100, 80));

        jButton12.setBackground(new java.awt.Color(255, 204, 255));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 80, 80));

        remove.setBackground(new java.awt.Color(255, 204, 255));
        remove.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        remove.setText("Remove Course");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel1.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 190, 70));
        remove.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void enrollButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrollButtonActionPerformed
        saveEnrolledCourses();
    }//GEN-LAST:event_enrollButtonActionPerformed

    private void displayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayButtonActionPerformed
        viewCourses();
    }//GEN-LAST:event_displayButtonActionPerformed

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
        
    }//GEN-LAST:event_jButton12ActionPerformed
    
    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        
    }//GEN-LAST:event_removeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> courseComboBox;
    private javax.swing.JButton displayButton;
    private javax.swing.JButton enrollButton;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton remove;
    private javax.swing.JTextArea studentArea;
    // End of variables declaration//GEN-END:variables
}
