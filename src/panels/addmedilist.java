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
public class addmedilist extends javax.swing.JPanel {

    /**
     * Creates new form addmedilist
     */
    ADDMEDI medi=new ADDMEDI();
    
    public addmedilist() {
        initComponents();
        jTextField1.setBackground(new java.awt.Color(0,0,0,1));
        jTextField2.setBackground(new java.awt.Color(0,0,0,1));
        jTextField4.setBackground(new java.awt.Color(0,0,0,1));
        medi.fillmediTable(jTable1);
        
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
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(781, 519));

        jPanel1.setPreferredSize(new java.awt.Dimension(781, 519));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Medi Name :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 70, 20));

        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField1.setOpaque(false);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 90, -1));

        jLabel2.setText("Medi ID :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 60, 20));

        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField2.setOpaque(false);
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 90, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medi ID", "Name", "Form", "Strength"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 30, 410, 270));

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, 30));

        jButton2.setText("EDIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, 30));

        jButton3.setText("REMOVE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, -1, 30));

        jLabel3.setText("Form :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 40, 20));

        jLabel4.setText("Strength :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField4.setOpaque(false);
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 90, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Liquid", "Tablet", "Capsules", "Drops", "Inhalers", "Injections" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 100, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bCK/50-Beautiful-and-Minimalist-Presentation-Backgrounds-036.jpg"))); // NOI18N
        jLabel5.setPreferredSize(new java.awt.Dimension(781, 519));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String medi_id=  jTextField1.getText();
        String medi_name= jTextField2.getText();
        String form = jComboBox1.getSelectedItem().toString();       
        String strength = jTextField4.getText();
        
        if(medi_id.trim().equals("") || medi_name.trim().equals("") || form.trim().equals("") || strength.trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "ERROR", "Please check the empty fields", JOptionPane.ERROR_MESSAGE);
        
        }
        else
        {
            if(medi.addmedi(medi_id,medi_name,form,strength))// pass values to medi list class
                 {
                 JOptionPane.showMessageDialog(null, "medi added Successfuly!!","medi list", JOptionPane.INFORMATION_MESSAGE);
                 }
             else{
                 JOptionPane.showMessageDialog(null, "medi added Failed!!","medi list", JOptionPane.ERROR_MESSAGE);
             }
        }
        jTable1.setModel(new DefaultTableModel(null,new Object[]{"medi_id","medi_name","form","strength"}));
        //populate table
        medi.fillmediTable(jTable1);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String medi_id=  jTextField1.getText();
        String medi_name= jTextField2.getText();
        String form = jComboBox1.getSelectedItem().toString();       
        String strength = jTextField4.getText();
        
        if(medi_id.trim().equals("") || medi_name.trim().equals("") || form.trim().equals("") || strength.trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "ERROR", "Please check the empty fields", JOptionPane.ERROR_MESSAGE);
        
        }
        else
        {
            if(medi.editmedi(medi_id,medi_name,form,strength))// pass values to medi list class
                 {
                 JOptionPane.showMessageDialog(null, "medi edit Successfuly!!","medi list", JOptionPane.INFORMATION_MESSAGE);
                 }
             else{
                 JOptionPane.showMessageDialog(null, "medi edit Failed!!","medi list", JOptionPane.ERROR_MESSAGE);
             }
        }
        
        jTable1.setModel(new DefaultTableModel(null,new Object[]{"medi_id","medi_name","form","strength"}));
        //populate table
        medi.fillmediTable(jTable1);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String medi_id=  jTextField1.getText();
        
        
        if(medi_id.trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "ERROR", "Please check the empty fields", JOptionPane.ERROR_MESSAGE);
        
        }
        else
        {
            if(medi.removemedi(medi_id))// pass values to medi list class
                 {
                 JOptionPane.showMessageDialog(null, "medi remove Successfuly!!","medi list", JOptionPane.INFORMATION_MESSAGE);
                 }
             else{
                 JOptionPane.showMessageDialog(null, "medi remove Failed!!","medi list", JOptionPane.ERROR_MESSAGE);
             }
        }
        
        jTable1.setModel(new DefaultTableModel(null,new Object[]{"medi_id","medi_name","form","strength"}));
        //populate table
        medi.fillmediTable(jTable1);
        
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
        
        jTextField4.setText(model.getValueAt(rIndex,3).toString());
        
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
