/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package design;

import javax.swing.JOptionPane;

/**
 *
 * @author renuka
 */
public class addDriverJPanel extends javax.swing.JPanel {

    /**
     * Creates new form addDriverJPanel
     */
    public addDriverJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        emailjText = new javax.swing.JTextField();
        AddressjTextField = new javax.swing.JTextField();
        addDriverJbutton = new javax.swing.JButton();
        firstName = new javax.swing.JLabel();
        lastName = new javax.swing.JLabel();
        Contact = new javax.swing.JLabel();
        LnamejTextField = new javax.swing.JTextField();
        AgejTextField = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        FnamejText = new javax.swing.JTextField();
        driverID = new javax.swing.JLabel();
        contactjText = new javax.swing.JTextField();
        driverIDjText = new javax.swing.JTextField();
        liscenceNumber = new javax.swing.JLabel();
        LnojTextField = new javax.swing.JTextField();
        trips = new javax.swing.JLabel();
        tripsjText = new javax.swing.JTextField();
        shift = new javax.swing.JLabel();
        shiftjTextField = new javax.swing.JTextField();
        availability = new javax.swing.JLabel();
        availabilityjDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.hoverBorderColor"));

        emailjText.setForeground(new java.awt.Color(1, 1, 1));

        AddressjTextField.setForeground(new java.awt.Color(1, 1, 1));
        AddressjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressjTextFieldActionPerformed(evt);
            }
        });

        addDriverJbutton.setText("Add");
        addDriverJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDriverJbuttonActionPerformed(evt);
            }
        });

        firstName.setFont(new java.awt.Font("Klee", 1, 18)); // NOI18N
        firstName.setForeground(new java.awt.Color(1, 1, 1));
        firstName.setText("First Name     :");

        lastName.setFont(new java.awt.Font("Klee", 1, 18)); // NOI18N
        lastName.setForeground(new java.awt.Color(1, 1, 1));
        lastName.setText("Last Name  : ");

        Contact.setFont(new java.awt.Font("Klee", 1, 18)); // NOI18N
        Contact.setForeground(new java.awt.Color(1, 1, 1));
        Contact.setText("Contact   :");

        LnamejTextField.setForeground(new java.awt.Color(1, 1, 1));

        AgejTextField.setForeground(new java.awt.Color(1, 1, 1));

        email.setFont(new java.awt.Font("Klee", 1, 18)); // NOI18N
        email.setForeground(new java.awt.Color(1, 1, 1));
        email.setText("Email      :");

        address.setFont(new java.awt.Font("Klee", 1, 18)); // NOI18N
        address.setForeground(new java.awt.Color(1, 1, 1));
        address.setText("Address   :  ");

        age.setFont(new java.awt.Font("Klee", 1, 18)); // NOI18N
        age.setForeground(new java.awt.Color(1, 1, 1));
        age.setText("Age   :   ");

        FnamejText.setForeground(new java.awt.Color(1, 1, 1));

        driverID.setFont(new java.awt.Font("Klee", 1, 18)); // NOI18N
        driverID.setForeground(new java.awt.Color(1, 1, 1));
        driverID.setText("Driver ID  : ");

        contactjText.setForeground(new java.awt.Color(1, 1, 1));

        driverIDjText.setForeground(new java.awt.Color(1, 1, 1));
        driverIDjText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driverIDjTextActionPerformed(evt);
            }
        });

        liscenceNumber.setFont(new java.awt.Font("Klee", 1, 18)); // NOI18N
        liscenceNumber.setForeground(new java.awt.Color(1, 1, 1));
        liscenceNumber.setText("Liscence Number   : ");

        LnojTextField.setForeground(new java.awt.Color(1, 1, 1));

        trips.setFont(new java.awt.Font("Klee", 1, 18)); // NOI18N
        trips.setForeground(new java.awt.Color(1, 1, 1));
        trips.setText("Total No. of trips compelted   :");

        tripsjText.setForeground(new java.awt.Color(1, 1, 1));

        shift.setFont(new java.awt.Font("Klee", 1, 18)); // NOI18N
        shift.setForeground(new java.awt.Color(1, 1, 1));
        shift.setText("Shift   : ");

        shiftjTextField.setForeground(new java.awt.Color(1, 1, 1));
        shiftjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shiftjTextFieldActionPerformed(evt);
            }
        });

        availability.setFont(new java.awt.Font("Klee", 1, 18)); // NOI18N
        availability.setForeground(new java.awt.Color(1, 1, 1));
        availability.setText("Availability   :");

        availabilityjDateChooser.setForeground(new java.awt.Color(1, 1, 1));

        jLabel5.setFont(new java.awt.Font("Hoefler Text", 1, 36)); // NOI18N
        jLabel5.setText("Add Driver Details");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/license (1) (1).png"))); // NOI18N

        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 204, 153));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Kavivanar", 1, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Best Driver Checklist\n✓Punctual\n✓Reliable\n✓Honest ");
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(jTextArea1);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/he.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(availability, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(firstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(trips, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Contact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(driverID, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addDriverJbutton)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(availabilityjDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(FnamejText, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(contactjText, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(71, 71, 71)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lastName)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(address)
                                                    .addComponent(age))))
                                        .addComponent(emailjText, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(driverIDjText, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(liscenceNumber))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(tripsjText, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(shift, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AgejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LnamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AddressjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LnojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(shiftjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(557, 557, 557)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)))
                .addContainerGap(581, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel8, jLabel9});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel6)))
                .addGap(187, 187, 187)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jLabel8)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGap(368, 368, 368))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(driverID)
                            .addComponent(driverIDjText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(liscenceNumber)
                            .addComponent(LnojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(firstName)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(FnamejText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lastName)
                                .addComponent(LnamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Contact)
                            .addComponent(contactjText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(age)
                            .addComponent(AgejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(email)
                                    .addComponent(emailjText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(address)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(AddressjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(trips)
                            .addComponent(tripsjText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(shift)
                            .addComponent(shiftjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(availability)
                            .addComponent(availabilityjDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addComponent(addDriverJbutton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel10, jLabel8, jLabel9});

    }// </editor-fold>//GEN-END:initComponents

    private void AddressjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressjTextFieldActionPerformed

    private void shiftjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shiftjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shiftjTextFieldActionPerformed

    private void addDriverJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDriverJbuttonActionPerformed
        // TODO add your handling code here:
         String driverID = driverIDjText.getText();
        String firstName = (String) FnamejText.getText();
        String contact = (String) contactjText.getText();
        String email = (String) emailjText.getText();
        String trips = tripsjText.getText();
        String liscenceNumber = LnojTextField.getText();
        String lastName = LnamejTextField.getText();
        String age = AgejTextField.getText();
        String address = AddressjTextField.getText();
        String shift = shiftjTextField.getText();

            JOptionPane.showMessageDialog(this,"Driver Added Succesfully!!");
            
            driverIDjText.setText("");
            FnamejText.setText("");
            contactjText.setText("");
            emailjText.setText("");
            tripsjText.setText("");
            LnojTextField.setText("");
            LnamejTextField.setText("");
            AgejTextField.setText("");
            AddressjTextField.setText("");
            LnamejTextField.setText("");
            shiftjTextField.setText("");

    }//GEN-LAST:event_addDriverJbuttonActionPerformed

    private void driverIDjTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driverIDjTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_driverIDjTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressjTextField;
    private javax.swing.JTextField AgejTextField;
    private javax.swing.JLabel Contact;
    private javax.swing.JTextField FnamejText;
    private javax.swing.JTextField LnamejTextField;
    private javax.swing.JTextField LnojTextField;
    private javax.swing.JButton addDriverJbutton;
    private javax.swing.JLabel address;
    private javax.swing.JLabel age;
    private javax.swing.JLabel availability;
    private com.toedter.calendar.JDateChooser availabilityjDateChooser;
    private javax.swing.JTextField contactjText;
    private javax.swing.JLabel driverID;
    private javax.swing.JTextField driverIDjText;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailjText;
    private javax.swing.JLabel firstName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lastName;
    private javax.swing.JLabel liscenceNumber;
    private javax.swing.JLabel shift;
    private javax.swing.JTextField shiftjTextField;
    private javax.swing.JLabel trips;
    private javax.swing.JTextField tripsjText;
    // End of variables declaration//GEN-END:variables
}
