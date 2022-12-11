/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package design;

/**
 *
 * @author renuka
 */
public class viewContractsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form absoluteJPanel
     */
    public viewContractsJPanel() {
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

        SplitPane = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        workArea = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewContractJTable = new javax.swing.JTable();
        search = new javax.swing.JLabel();
        remak = new javax.swing.JLabel();
        searchjTextField = new javax.swing.JTextField();
        remakjTextField = new javax.swing.JTextField();
        acceptJbutton = new javax.swing.JButton();
        rejectJbutton = new javax.swing.JButton();
        signOutjButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        remak1 = new javax.swing.JLabel();
        remakjTextField1 = new javax.swing.JTextField();

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );

        SplitPane.setLeftComponent(controlPanel);

        workArea.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Hoefler Text", 1, 34)); // NOI18N
        jLabel3.setText("View Contracts");
        workArea.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 300, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/handshake (1).png"))); // NOI18N
        workArea.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 80, 60));

        viewContractJTable.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.hoverBorderColor"));
        viewContractJTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(1, 1, 1), 1, true));
        viewContractJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Contract ID", "Name", "Email", "Contact Number", "Current Address", "City", "State", "Zip Code", "Tenure", "Security Deposit", "Application Fee", "Budget/Rent"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        viewContractJTable.setGridColor(new java.awt.Color(255, 204, 204));
        viewContractJTable.setShowGrid(false);
        jScrollPane1.setViewportView(viewContractJTable);

        workArea.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 1190, 110));

        search.setText("Search : ");
        workArea.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        remak.setBackground(new java.awt.Color(0, 0, 0));
        remak.setText("Remark : ");
        workArea.add(remak, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, -1, -1));
        workArea.add(searchjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 210, 20));
        workArea.add(remakjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 220, 20));

        acceptJbutton.setText("Accept");
        workArea.add(acceptJbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 477, 80, -1));

        rejectJbutton.setText("Reject");
        rejectJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectJbuttonActionPerformed(evt);
            }
        });
        workArea.add(rejectJbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 477, 90, -1));

        signOutjButton.setText("Sign Out");
        workArea.add(signOutjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 530, 90, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/contracts.png"))); // NOI18N
        workArea.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -90, 1280, 990));

        remak1.setText("Remark : ");
        workArea.add(remak1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        workArea.add(remakjTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        SplitPane.setRightComponent(workArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rejectJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectJbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rejectJbuttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JButton acceptJbutton;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton rejectJbutton;
    private javax.swing.JLabel remak;
    private javax.swing.JLabel remak1;
    private javax.swing.JTextField remakjTextField;
    private javax.swing.JTextField remakjTextField1;
    private javax.swing.JLabel search;
    private javax.swing.JTextField searchjTextField;
    private javax.swing.JButton signOutjButton;
    private javax.swing.JTable viewContractJTable;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
}
