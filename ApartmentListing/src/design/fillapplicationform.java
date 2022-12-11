/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package design;

import model.Person;
import model.QualityCheckerDirectory;

/**
 *
 * @author visha_wb3uzfg
 */
public class fillapplicationform extends javax.swing.JPanel {

    /**
     * Creates new form panel3
     */
    
    private static Person person;
    private String aptid;
    
    public fillapplicationform(Person person, String aptid) {
        initComponents();
        this.person = person;
        this.aptid = aptid;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 204));
        jLabel2.setText("Does Apartment have Smoke Detector and Fire Extinguishers?");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 204));
        jLabel3.setText("Does Carbon monoxide system come installed in the unit?");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 204));
        jLabel4.setText("Does buildings common hallway has fire safety features?");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, -1));

        jLabel5.setBackground(new java.awt.Color(204, 255, 204));
        jLabel5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 204));
        jLabel5.setText("Does Building have fire escape plan?");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, -1, -1));

        jButton1.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 600, 150, 50));

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 204));
        jLabel1.setText("Final Approval");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, -1, -1));

        jLabel6.setBackground(new java.awt.Color(204, 255, 204));
        jLabel6.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 204));
        jLabel6.setText("Comments:");
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YES", "NO" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, 80, 30));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YES", "NO" }));
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 260, 80, 30));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YES", "NO" }));
        jPanel1.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 310, 80, 30));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YES", "NO" }));
        jPanel1.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 360, 80, 30));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YES", "NO" }));
        jPanel1.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 410, 80, 30));

        jLabel7.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 204));
        jLabel7.setText("Check Requests and Final Approval");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 330, 40));

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 470, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        QualityCheckerDirectory qc = new QualityCheckerDirectory();
        
        int smokeDetector = jComboBox2.getSelectedIndex();
        int carbonMonoxide = jComboBox3.getSelectedIndex();
        int firesafety = jComboBox4.getSelectedIndex();
        int escapePlan = jComboBox4.getSelectedIndex();
        int finalApproval = jComboBox6.getSelectedIndex();
        String comments = textArea.getText();
        
        qc.fillFeedback(person.getId(), this.aptid, smokeDetector, carbonMonoxide, firesafety, escapePlan, finalApproval, comments);
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}