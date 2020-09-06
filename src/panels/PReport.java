/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author hasa
 */
public class PReport extends javax.swing.JPanel {

    /**
     * Creates new form PReport
     */
    MYCONNECTION myconnection =new MYCONNECTION();
    PATEINTREGIS register = new PATEINTREGIS();
    REPORT report=new REPORT();
    
    public PReport() {
        initComponents();
        jTextField6.setBackground(new java.awt.Color(0,0,0,1));
        jTextField2.setBackground(new java.awt.Color(0,0,0,1));
        jTextField3.setBackground(new java.awt.Color(0,0,0,1));
        jTextField4.setBackground(new java.awt.Color(0,0,0,1));
        jTextField5.setBackground(new java.awt.Color(0,0,0,1));
        currentdate();
        report.fillreporttable(jTable1);
        register.fillregisterTable(jTable2);
    }
    public void currentdate(){
    
        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        jTextField4.setText(year+"/"+(month+1)+"/"+day);
    
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
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField6 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(820, 660));
        setMinimumSize(new java.awt.Dimension(820, 660));
        setPreferredSize(new java.awt.Dimension(820, 660));

        jPanel1.setMaximumSize(new java.awt.Dimension(820, 660));
        jPanel1.setMinimumSize(new java.awt.Dimension(820, 660));
        jPanel1.setPreferredSize(new java.awt.Dimension(820, 660));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("search Patient:-");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        jLabel2.setText("Patient ID:-");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 70, 20));

        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField2.setOpaque(false);
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 110, -1));

        jLabel3.setText("diagnose:-");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField3.setOpaque(false);
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 100, -1));

        jLabel4.setText("Discription and diagnose report:- ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 190, 130));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "P.ID", "P.name", "diagnose", "discription", "date"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 410, 200));

        jButton1.setText("Save report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        jButton2.setText("edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, -1, -1));

        jButton3.setText("remove");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, -1));

        jLabel6.setText("date");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField4.setOpaque(false);
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 70, -1));

        jLabel7.setText("patient medi report down here:-");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, -1, -1));

        jLabel8.setText("Patient name:-");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField5.setOpaque(false);
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 90, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "P.ID", "P.Name"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 420, 90));

        jTextField6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField6.setOpaque(false);
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 110, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bCK/50-Beautiful-and-Minimalist-Presentation-Backgrounds-036.jpg"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(820, 660));
        jLabel5.setMinimumSize(new java.awt.Dimension(820, 660));
        jLabel5.setPreferredSize(new java.awt.Dimension(820, 660));
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String id = jTextField2.getText();
        String name= jTextField5.getText();
        String diagnose= jTextField3.getText();
        
        String description= jTextArea1.getText();
        String date= jTextField4.getText();
        
        if(id.trim().equals("")|| name.trim().equals("") || diagnose.trim().equals("")|| description.trim().equals("")){
        
            JOptionPane.showMessageDialog(null, "empty fields!!","Appointment", JOptionPane.ERROR_MESSAGE);
        }
        else{     
             if(report.addreport(id,name,diagnose,description,date) && report.addreportHistory(id,name,diagnose,description,date))// pass values to class
                 {
                 JOptionPane.showMessageDialog(null, "added Successfuly!!","report", JOptionPane.INFORMATION_MESSAGE);
                 }
             else{
                 JOptionPane.showMessageDialog(null, "added Failed!!","report", JOptionPane.ERROR_MESSAGE);
             }
        }
        
        jTable1.setModel(new DefaultTableModel(null,new Object[]{"P.ID","P.name","diagnose","description","date"}));
        //populate table
        report.fillreporttable(jTable1);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel  model = (DefaultTableModel)jTable1.getModel();
        
        int rIndex = jTable1.getSelectedRow();//get the select row index
        
        jTextField2.setText(model.getValueAt(rIndex,0).toString());
        jTextField5.setText(model.getValueAt(rIndex,1).toString());
        jTextField3.setText(model.getValueAt(rIndex,2).toString());
        jTextArea1.setText(model.getValueAt(rIndex,3).toString());
        
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //
        String id = jTextField2.getText();
        String name= jTextField5.getText();
        String diagnose= jTextField3.getText();
        
        String description= jTextArea1.getText();
        String date= jTextField4.getText();
        
        if(id.trim().equals("")|| name.trim().equals("") || diagnose.trim().equals("")|| description.trim().equals("")){
        
            JOptionPane.showMessageDialog(null, "empty fields!!","Appointment", JOptionPane.ERROR_MESSAGE);
        }
        else{     
             if(report.editreport(id,name,diagnose,description,date) && report.editreportHistory(id,name,diagnose,description,date))// pass values to class
                 {
                 JOptionPane.showMessageDialog(null, "added Successfuly!!","report", JOptionPane.INFORMATION_MESSAGE);
                 }
             else{
                 JOptionPane.showMessageDialog(null, "added Failed!!","report", JOptionPane.ERROR_MESSAGE);
             }
        }
        
        jTable1.setModel(new DefaultTableModel(null,new Object[]{"P.ID","P.name","diagnose","description","date"}));
        //populate table
        report.fillreporttable(jTable1);
        
        jTextField2.setText("");
        jTextField5.setText("");
        jTextField3.setText(""); 
        jTextArea1.setText("");
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //delete select data
         try{
           String id = jTextField2.getText(); 
                
            if(report.removereport(id))// pass values to employee.java
               {
                JOptionPane.showMessageDialog(null, "Deleted Successfuly!!","Remove EMPLOYEE", JOptionPane.INFORMATION_MESSAGE);
               }
            else{
                JOptionPane.showMessageDialog(null, " Data Delete Failed!!","Remove Employee Error", JOptionPane.ERROR_MESSAGE);
                }  
            
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(null, ex.getMessage()+"Enter ID", "ID ERROR", JOptionPane.ERROR_MESSAGE);
            }
         
        jTextField2.setText("");
        jTextField5.setText("");
        jTextField3.setText(""); 
        jTextArea1.setText("");
        
        jTable1.setModel(new DefaultTableModel(null,new Object[]{"P.ID","P.name","diagnose","description","date"}));
        //populate table
        report.fillreporttable(jTable1);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel  model = (DefaultTableModel)jTable2.getModel();

        int rIndex = jTable2.getSelectedRow();//get the select row index

        jTextField2.setText(model.getValueAt(rIndex,0).toString());
        jTextField5.setText(model.getValueAt(rIndex,1).toString());
        
        
       

    }//GEN-LAST:event_jTable2MouseClicked

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
        // TODO add your handling code here:
        
//    String value1 =jTextField6.getText().toString();
//        
//    DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
//    TableRowSorter<DefaultTableModel> tro=new TableRowSorter<DefaultTableModel>(model);
//    jTable2.setRowSorter(tro);
//    tro.setRowFilter(RowFilter.regexFilter(value1));

        
        try {
            
            PreparedStatement st;
            ResultSet rs;
            String Query="SELECT * FROM `patientdetails` WHERE `id`=?";
            
            st=myconnection.createConnection().prepareStatement(Query);
            
            st.setString(1, jTextField6.getText());
            
            rs=st.executeQuery();
            if(rs.next()){
            
                String a=rs.getString("id");
                jTextField2.setText(a);
                String b=rs.getString("p.name");
                jTextField5.setText(b);
            
            }
  
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, ex);
            
        }
    
       
        
            
    }//GEN-LAST:event_jTextField6KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
