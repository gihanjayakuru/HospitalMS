/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hasa
 */
public class addEmployee extends javax.swing.JPanel {

    /**
     * Creates new form addEmployee
     */
    
    EMPLOYEE employee=new EMPLOYEE();
    
    public addEmployee() {
        initComponents();
        jTextField1.setBackground(new java.awt.Color(0,0,0,1));
        jTextField2.setBackground(new java.awt.Color(0,0,0,1));
        
        employee.fillemployeeTable(jTable1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setMaximumSize(new java.awt.Dimension(1190, 750));
        setMinimumSize(new java.awt.Dimension(1190, 750));
        setPreferredSize(new java.awt.Dimension(1190, 750));

        jPanel1.setBackground(new java.awt.Color(44, 52, 58));
        jPanel1.setMaximumSize(new java.awt.Dimension(1190, 750));
        jPanel1.setMinimumSize(new java.awt.Dimension(1190, 750));
        jPanel1.setPreferredSize(new java.awt.Dimension(1190, 750));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Employee Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("chose position:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, 20));

        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField1.setOpaque(false);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 220, -1));

        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField2.setOpaque(false);
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 220, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DOCTOR", "NURS", "PHAMERCIST", "STOCKMANAGER" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "position", "gender"
            }
        ));
        jTable1.setOpaque(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 720, 280));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/normal button/1.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setContentAreaFilled(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/click buttons/1.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/hover buttons/1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 60, 60));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/normal button/2.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setContentAreaFilled(false);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/click buttons/2.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/hover buttons/2.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 60, 60));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/normal button/3.png"))); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setContentAreaFilled(false);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/click buttons/3.png"))); // NOI18N
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/hover buttons/3.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 60, 60));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Gender");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        jRadioButton1.setBackground(new java.awt.Color(255, 102, 0));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Male");
        jRadioButton1.setOpaque(false);
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(255, 102, 0));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Female");
        jRadioButton2.setOpaque(false);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

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

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:    
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //
        
        String id = jTextField1.getText();
        String name = jTextField2.getText();
        String position = jComboBox1.getSelectedItem().toString();
        String gender = "";
        
        
        if(jRadioButton1.isSelected()){
            gender="Male";
        }else if(jRadioButton2.isSelected()){
            gender="Female";
        }
        
        if(id.trim().equals("") || name.trim().equals("") )
        {
            JOptionPane.showMessageDialog(null, "Empty Fields", "please fill the form", JOptionPane.ERROR_MESSAGE);
        }
        else{
            
           if(employee.addemployee(id,name,position,gender))
            {
            JOptionPane.showMessageDialog(null, "New Employee added successfuly!!", "ADD employee", JOptionPane.INFORMATION_MESSAGE);
            }
        else{
             JOptionPane.showMessageDialog(null, "New Employee Added Failed!!", "ADD employee", JOptionPane.ERROR_MESSAGE);
            }        
        }
        jTable1.setModel(new DefaultTableModel(null,new Object[]{"ID","name","position","gender"}));
        //populate table
        employee.fillemployeeTable(jTable1);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //
        
        String id = jTextField1.getText();
        String name = jTextField2.getText();
        String position = jComboBox1.getSelectedItem().toString();
        String gender = "";
        
        
        if(jRadioButton1.isSelected()){
            gender="before";
        }else if(jRadioButton2.isSelected()){
            gender="after";
        }
        
        if(id.trim().equals("") || name.trim().equals("") )
        {
            JOptionPane.showMessageDialog(null, "Empty Fields", "please fill the form", JOptionPane.ERROR_MESSAGE);
        }
        else{
            
           if(employee.editemployee(id,name,position,gender))
            {
            JOptionPane.showMessageDialog(null, "Employee edit successfuly!!", "edit employee", JOptionPane.INFORMATION_MESSAGE);
            }
        else{
             JOptionPane.showMessageDialog(null, "Employee edit Failed!!", "edit employee", JOptionPane.ERROR_MESSAGE);
            }        
        }
        
        jTable1.setModel(new DefaultTableModel(null,new Object[]{"ID","name","position","gender"}));
        //populate table
        employee.fillemployeeTable(jTable1);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //
        String id = jTextField1.getText();
 
        
        if(id.trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Empty Field", "please enter id", JOptionPane.ERROR_MESSAGE);
        }
        else{
            
           if(employee.removeemployee(id))
            {
            JOptionPane.showMessageDialog(null, "Employee remove successfuly!!", "remove employee", JOptionPane.INFORMATION_MESSAGE);
            }
        else{
             JOptionPane.showMessageDialog(null, "Employee remove Failed!!", "remove employee", JOptionPane.ERROR_MESSAGE);
            }        
        }
        jTable1.setModel(new DefaultTableModel(null,new Object[]{"ID","name","position","gender"}));
        //populate table
        employee.fillemployeeTable(jTable1);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel  model = (DefaultTableModel)jTable1.getModel();
        
        int rIndex = jTable1.getSelectedRow();//get the select row index
        
        jTextField1.setText(model.getValueAt(rIndex,0).toString());
        jTextField2.setText(model.getValueAt(rIndex,1).toString());
        
        String form=model.getValueAt(rIndex, 2).toString();
        for(int i=0; i<jComboBox1.getItemCount(); i++)
        {
            if(jComboBox1.getItemAt(i).toString().equalsIgnoreCase(form))
            {
                jComboBox1.setSelectedIndex(i);
            }
        }
        
        String gender = model.getValueAt(rIndex,3).toString();
        if(gender.equals("Male"))
        {
            jRadioButton1.setSelected(true);
        }
        else if(gender.equals("Female"))
        {
            jRadioButton2.setSelected(true);
            
        }
        
        
        
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
