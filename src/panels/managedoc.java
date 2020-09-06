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
public class managedoc extends javax.swing.JPanel {

    /**
     * Creates new form managedoc
     */
    manageDoctors mngdoc =new manageDoctors();
    EMPLOYEE employee=new EMPLOYEE();
    
    public managedoc() {
        initComponents();
        jTextField1.setBackground(new java.awt.Color(0,0,0,1));
        jTextField2.setBackground(new java.awt.Color(0,0,0,1));
        
        employee.fillemployeeTable(jTable1);
        mngdoc.fillmngDocTable(jTable2);
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
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1024, 678));
        setMinimumSize(new java.awt.Dimension(1024, 678));
        setPreferredSize(new java.awt.Dimension(1024, 678));

        jPanel1.setMaximumSize(new java.awt.Dimension(1024, 678));
        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 678));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 678));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("doc id:-");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, -1));

        jLabel2.setText("doc name:-");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        jLabel3.setText("word:-");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        jLabel4.setText("department");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "position", "gender"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 400, 170));

        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField1.setOpaque(false);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 100, -1));

        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField2.setOpaque(false);
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 160, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "OPD", "IPD" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 150, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "word 1", "word 2", "word 3", "word 4" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 100, -1));

        jLabel5.setText("employee list :Doctor list filtered");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "depart", "word", "word_position"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 400, 210));

        jLabel6.setText("word position:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "HEAD", "SINIOR", "JUNIOR" }));
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 130, -1));

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, -1, -1));

        jButton2.setText("EDIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, -1, -1));

        jButton3.setText("REMOVE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bCK/50-Beautiful-and-Minimalist-Presentation-Backgrounds-036.jpg"))); // NOI18N
        jLabel7.setPreferredSize(new java.awt.Dimension(1024, 678));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 1020, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //
        String id =jTextField1.getText();
        String name = jTextField2.getText();
        String depart = jComboBox1.getSelectedItem().toString();
        String word = jComboBox2.getSelectedItem().toString();
        String position = jComboBox3.getSelectedItem().toString();
        
        if(id.trim().equals("") || name.trim().equals("") )
        {
            JOptionPane.showMessageDialog(null, "Empty Fields", "please fill the form", JOptionPane.ERROR_MESSAGE);
        }
        else{
            
           if(mngdoc.addmanage(id,name,depart,word,position))
            {
            JOptionPane.showMessageDialog(null, "Manage Doctor successfuly!!", "Manage Doctor", JOptionPane.INFORMATION_MESSAGE);
            }
        else{
             JOptionPane.showMessageDialog(null, "Manage Doctor Failed!!", "Manage Doctor", JOptionPane.ERROR_MESSAGE);
            }        
        }
        jTable2.setModel(new DefaultTableModel(null,new Object[]{"ID","name","department","word","position"}));
        //populate table
        mngdoc.fillmngDocTable(jTable2);
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //editmanage(id,name,position,department,word)
        String id =jTextField1.getText();
        String name = jTextField2.getText();
        String depart = jComboBox1.getSelectedItem().toString();
        String word = jComboBox2.getSelectedItem().toString();
        String position = jComboBox3.getSelectedItem().toString();
        
        if(id.trim().equals("") || name.trim().equals("") )
        {
            JOptionPane.showMessageDialog(null, "Empty Fields", "please fill the form", JOptionPane.ERROR_MESSAGE);
        }
        else{
            
           if(mngdoc.editmanage(id,name,depart,word,position))
            {
            JOptionPane.showMessageDialog(null, "Manage Doctor edit successfuly!!", "Manage Doctor", JOptionPane.INFORMATION_MESSAGE);
            }
        else{
             JOptionPane.showMessageDialog(null, "Manage Doctor edit Failed!!", "Manage Doctor", JOptionPane.ERROR_MESSAGE);
            }        
        }
        jTable2.setModel(new DefaultTableModel(null,new Object[]{"ID","name","department","word","position"}));
        //populate table
        mngdoc.fillmngDocTable(jTable2);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //removemanage(String id)
        String id =jTextField1.getText();
        
        
        if(id.trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Empty Fields", "please fill the form", JOptionPane.ERROR_MESSAGE);
        }
        else{
            
           if(mngdoc.removemanage(id))
            {
            JOptionPane.showMessageDialog(null, "remove successfuly!!", "Manage Doctor", JOptionPane.INFORMATION_MESSAGE);
            }
        else{
             JOptionPane.showMessageDialog(null, "remove Failed!!", "Manage Doctor", JOptionPane.ERROR_MESSAGE);
            }        
        }
        jTable2.setModel(new DefaultTableModel(null,new Object[]{"ID","name","department","word","position"}));
        //populate table
        mngdoc.fillmngDocTable(jTable2);
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel  model = (DefaultTableModel)jTable1.getModel();
        
        int rIndex = jTable1.getSelectedRow();//get the select row index
        
        jTextField1.setText(model.getValueAt(rIndex,0).toString());
        jTextField2.setText(model.getValueAt(rIndex,1).toString());
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        DefaultTableModel  model = (DefaultTableModel)jTable2.getModel();
        
        int rIndex = jTable2.getSelectedRow();//get the select row index
        
        jTextField1.setText(model.getValueAt(rIndex,0).toString());
        jTextField2.setText(model.getValueAt(rIndex,1).toString());
        
        String depart=model.getValueAt(rIndex, 2).toString();
        for(int i=0; i<jComboBox1.getItemCount(); i++)
        {
            if(jComboBox1.getItemAt(i).toString().equalsIgnoreCase(depart))
            {
                jComboBox1.setSelectedIndex(i);
            }
        }
        
        String word=model.getValueAt(rIndex, 3).toString();
        for(int i=0; i<jComboBox2.getItemCount(); i++)
        {
            if(jComboBox2.getItemAt(i).toString().equalsIgnoreCase(word))
            {
                jComboBox2.setSelectedIndex(i);
            }
        }
        
        String position=model.getValueAt(rIndex, 4).toString();
        for(int i=0; i<jComboBox3.getItemCount(); i++)
        {
            if(jComboBox3.getItemAt(i).toString().equalsIgnoreCase(position))
            {
                jComboBox3.setSelectedIndex(i);
            }
        }
        
        
    }//GEN-LAST:event_jTable2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
