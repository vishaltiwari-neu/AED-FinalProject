/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package design;

import javax.swing.JOptionPane;
import model.PersonDirectory;
import model.Person;
import model.Role;

/**
 *
 * @author HP
 */
public class Login extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();

        Role[] role = Role.values();
        addRole(role);

        //Fetching name in Person Login Frame
        //brokername.setText(pd.getUserName());
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        choiceRole = new java.awt.Choice();
        txtpass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 96, -1));

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 96, -1));

        txtusername.setBackground(new java.awt.Color(255, 255, 255));
        txtusername.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 111, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 95, 47));

        jLabel4.setBackground(new java.awt.Color(204, 255, 204));
        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Login as:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 96, -1));

        choiceRole.setName(""); // NOI18N
        jPanel1.add(choiceRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 111, -1));

        txtpass.setBackground(new java.awt.Color(255, 255, 255));
        txtpass.setForeground(new java.awt.Color(0, 0, 0));
        txtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassActionPerformed(evt);
            }
        });
        jPanel1.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 111, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/lock.png"))); // NOI18N
        jLabel3.setText("LOGIN");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 180, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/loginbg.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 260, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        String username = txtusername.getText();
        String password = txtpass.getText();
        Role r = Role.valueOf(choiceRole.getSelectedItem());

        PersonDirectory pd = new PersonDirectory();

        Person person = pd.login(username, password, r);

        ownerJFrame pageOwner = new ownerJFrame(person);
        System.out.println(person.getRole());
        if (person == null){
            JOptionPane.showMessageDialog(this, "Username does not exist. Please register to login.");
        }
        switch (person.getRole().toString()) {
            case "OWNER" ->
                pageOwner.setVisible(true);
                
        }
        /*
        int validated = validateInputFields(username, password);
        if (validated == 1) {
            Person person = pd.signin(username, password, r);
            if (person != null) {
                System.out.println(person.getRole().toString());
                
                AdminJFrame pageDoctor = new AdminJFrame(pd, person);
                BrokerLogin pagePatient = new BrokerLogin(pd, person);
                CustomerLogin pageSysAdmin = new CustomerLogin(pd, person);
                
            } else {
                JOptionPane.showMessageDialog(this, "Username does not exist. Please register to login.");
            }
        }
         */
        //if login successfull


    }//GEN-LAST:event_jButton1ActionPerformed

    private void addRole(Role[] role) {
        //Adding the drop down for title
        for (Role r : role) {
            choiceRole.add(r.toString());
        }
    }

    private int validateInputFields(String username, String password) {
        //Function to validate the input fields
        int validated = 1;

        if (username == null || username.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username cannot be empty.");
            validated = 0;
        } else if (password == null || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Password cannot be empty.");
            validated = 0;
        }
        return validated;
    }

    private void txtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Choice choiceRole;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
