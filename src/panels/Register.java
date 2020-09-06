/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author hasa
 */
public class Register extends javax.swing.JPanel {

    /**
     * Creates new form Register
     */
    PATEINTREGIS register = new PATEINTREGIS();
    
    public Register() {
        initComponents();
        jTextField1.setBackground(new java.awt.Color(0,0,0,1));
        jTextField2.setBackground(new java.awt.Color(0,0,0,1));
        jTextField3.setBackground(new java.awt.Color(0,0,0,1));
        jTextField4.setBackground(new java.awt.Color(0,0,0,1));
        jTextField5.setBackground(new java.awt.Color(0,0,0,1));
        jTextField6.setBackground(new java.awt.Color(0,0,0,1));
        register.fillregisterTable(jTable1);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonSave = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonRemove = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(820, 660));
        setMinimumSize(new java.awt.Dimension(820, 660));
        setPreferredSize(new java.awt.Dimension(820, 660));

        jPanel1.setMaximumSize(new java.awt.Dimension(820, 660));
        jPanel1.setMinimumSize(new java.awt.Dimension(820, 660));
        jPanel1.setPreferredSize(new java.awt.Dimension(820, 660));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "P.ID", "P.Name", "G.Name", "G.ID", "G.Contact", "Address"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 550, 320));

        jLabel1.setText("Patient ID:-");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 60, 20));

        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField1.setOpaque(false);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 110, -1));

        jLabel3.setText("Patient Name:-");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 90, 20));

        jLabel4.setText("Gardien Name:-");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 80, -1));

        jLabel5.setText("Gardien ID:-");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel6.setText("Gardien Contact:-");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel7.setText("Address:-");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField2.setOpaque(false);
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 110, -1));

        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField3.setOpaque(false);
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 110, -1));

        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField4.setOpaque(false);
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 110, -1));

        jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField5.setOpaque(false);
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 110, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 160, 120));

        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        jButtonEdit.setText("Edit");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, -1));

        jButtonRemove.setText("Remove");
        jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, -1, -1));

        jLabel8.setText("Search");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 40, 20));

        jTextField6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField6.setOpaque(false);
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 120, -1));

        jLabel9.setText("OPD Register Patients");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 170, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button icons/Beautiful Backgrounds-036.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(820, 660));
        jLabel2.setMinimumSize(new java.awt.Dimension(820, 660));
        jLabel2.setPreferredSize(new java.awt.Dimension(820, 660));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        // TODO add your handling code here:
        String id= jTextField1.getText();
        String pname= jTextField2.getText();
        String gname= jTextField3.getText();
        String gid= jTextField4.getText();
        String contact= jTextField5.getText();
        String address= jTextArea1.getText();
        
        if(id.trim().equals("") || pname.trim().equals("") || gname.trim().equals("") || gid.trim().equals("") || contact.trim().equals("") || address.trim().equals(""))
        {
          JOptionPane.showMessageDialog(null, "Some Fields are empty!!", "EMPTY", JOptionPane.WARNING_MESSAGE);

        }
        
        else{
            
           if(register.addregister(id,pname,gname,gid,contact,address))
            {
            JOptionPane.showMessageDialog(null, "New Patient added successfuly!!", "ADD patient", JOptionPane.INFORMATION_MESSAGE);
            }
        else{
             JOptionPane.showMessageDialog(null, "New Patient Added Failed!!", "ADD patient", JOptionPane.ERROR_MESSAGE);
            }        
        }
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextArea1.setText("");
        
        jTable1.setModel(new DefaultTableModel(null,new Object[]{"P.ID","P.Name","GName","G.ID","G.Contact","Address"}));
        register.fillregisterTable(jTable1);
        
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        // TODO add your handling code here:
        String pid =jTextField1.getText();
        String pname =jTextField2.getText();  
        String gname =jTextField3.getText();
        String gid =jTextField4.getText();
        String gcontact =jTextField5.getText();
        String address =jTextArea1.getText();
  
        
        if(pid.trim().equals("") || pname.trim().equals("") || gname.trim().equals("") )
        {
          JOptionPane.showMessageDialog(null, "Fields are empty!!","EMPTY", JOptionPane.ERROR_MESSAGE);   
        }
        else{
              
            try{
    
            if(register.editregister(pid,pname,gname,gid,gcontact,address))// pass values to employee
               {
                JOptionPane.showMessageDialog(null, "register Updated Successfuly!!","EDIT register", JOptionPane.INFORMATION_MESSAGE);
               }
            else{
                JOptionPane.showMessageDialog(null, "register Updated Failed!!","EDIT register", JOptionPane.ERROR_MESSAGE);
                }  
            
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(null, ex.getMessage()+"check fields", " ID ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextArea1.setText("");
        
        jTable1.setModel(new DefaultTableModel(null,new Object[]{"P.ID","P.Name","GName","G.ID","G.Contact","Address"}));
        //populate table
        register.fillregisterTable(jTable1);
        
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveActionPerformed
        // TODO add your handling code here:
        //delete select data
         try{
           String pid= jTextField1.getText(); 
                
            if(register.removeregister(pid))// pass values to employee.java
               {
                JOptionPane.showMessageDialog(null, "patient Deleted Successfuly!!","Remove patient", JOptionPane.INFORMATION_MESSAGE);
               }
            else{
                JOptionPane.showMessageDialog(null, "patient Data Delete Failed!!","Remove patient Error", JOptionPane.ERROR_MESSAGE);
                }  
            
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(null, ex.getMessage()+"Echeck fields ", "patient ID ERROR", JOptionPane.ERROR_MESSAGE);
            }
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextArea1.setText("");
        
        jTable1.setModel(new DefaultTableModel(null,new Object[]{"P.ID","P.Name","GName","G.ID","G.Contact","Address"}));
        //populate table
        register.fillregisterTable(jTable1);
        
    }//GEN-LAST:event_jButtonRemoveActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel  model = (DefaultTableModel)jTable1.getModel();
        
        int rIndex = jTable1.getSelectedRow();//get the select row index
        
        jTextField1.setText(model.getValueAt(rIndex,0).toString());
        jTextField2.setText(model.getValueAt(rIndex,1).toString());
        jTextField3.setText(model.getValueAt(rIndex,2).toString());
        jTextField4.setText(model.getValueAt(rIndex,3).toString());
        jTextField5.setText(model.getValueAt(rIndex,4).toString());
        jTextArea1.setText(model.getValueAt(rIndex,5).toString());
        
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        // TODO add your handling code here:
//        String value1 =jTextField6.getText().toString();
//        
//    DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
//    TableRowSorter<DefaultTableModel> tro=new TableRowSorter<DefaultTableModel>(model);
//    jTable1.setRowSorter(tro);
//    tro.setRowFilter(RowFilter.regexFilter(value1));
    
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
        // TODO add your handling code here:
          try {
            MYCONNECTION myconnection =new MYCONNECTION();
            PreparedStatement st;
            ResultSet rs;
            String Query="SELECT * FROM `patientdetails` WHERE `id`=?";
            
            st=myconnection.createConnection().prepareStatement(Query);
            
            st.setString(1, jTextField6.getText());
            
            rs=st.executeQuery();
            if(rs.next()){
            
                String a=rs.getString("id");
                jTextField1.setText(a);
                String b=rs.getString("p.name");
                jTextField2.setText(b);
                String c=rs.getString("g.name");
                jTextField3.setText(c);
                String d=rs.getString("g.id");
                jTextField4.setText(d);
                String e=rs.getString("g.contact");
                jTextField5.setText(e);
                String f=rs.getString("address");
                jTextArea1.setText(f);
            
            }
  
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, ex);
            
        }
        
        
    }//GEN-LAST:event_jTextField6KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
