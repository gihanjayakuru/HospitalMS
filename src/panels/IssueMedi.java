/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import java.awt.print.PrinterException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author hasa
 */
public class IssueMedi extends javax.swing.JPanel {

    /**
     * Creates new form IssueMedi
     */
    PATIENTMEDI medilist= new PATIENTMEDI();
    ISSUEMED issue=new ISSUEMED();
    
    
    public IssueMedi() {
        initComponents();
        jTextField4.setBackground(new java.awt.Color(0,0,0,1));
        jTextField2.setBackground(new java.awt.Color(0,0,0,1));
        jTextField3.setBackground(new java.awt.Color(0,0,0,1));
        issuetable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(44, 52, 58));
        setMaximumSize(new java.awt.Dimension(1190, 750));
        setMinimumSize(new java.awt.Dimension(1190, 750));
        setPreferredSize(new java.awt.Dimension(1190, 750));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Patient ID:-");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 60, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Medi Name", "dayTime", "count", "before after"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, 170));

        jButton3.setText("PRINT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 70, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MedID", "MedName", "amount in stock"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 450, 200));

        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField2.setOpaque(false);
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 60, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("count:-");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 60, 20));

        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField3.setOpaque(false);
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 130, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Medi Name:-");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 154, 60, 30));

        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField4.setOpaque(false);
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 120, -1));

        jButton4.setText("ISSUE DONE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    public void issuetable(){
    
        
        
        //jTable2.setModel(new DefaultTableModel(null,new Object[]{"mediname","daytime","count","be_af"}));
        //populate table
        jTable2.setModel(new DefaultTableModel(null,new Object[]{"P.ID","mediname","daytime","count","be_af"}));
        issue.fillmediTable(jTable2);
    
    
    
    }
    
    
    
    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        // TODO add your handling code here:
//        MYCONNECTION myconnection =new MYCONNECTION();
//        
//        try {
//            
//            PreparedStatement st;
//            ResultSet rs;
//            String Query="SELECT * FROM `patient_medi_list` WHERE `id`=?";
//            
//            st=myconnection.createConnection().prepareStatement(Query);
//            
//            st.setString(1, jTextField4.getText());
//            
//            rs=st.executeQuery();
//            if(rs.next()){
//            
//                String a=rs.getString("id");
//                jTextField1.setText(a);
//                String b=rs.getString("medi_name");
//                jTextField3.setText(b);
//                String c=rs.getString("count");
//                jTextField2.setText(c);
//            
//            }
//  
//        } catch (SQLException ex) {
//            
//            JOptionPane.showMessageDialog(null, ex);
//            }
        String value1 =jTextField4.getText().toString();
        
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        TableRowSorter<DefaultTableModel> tro=new TableRowSorter<DefaultTableModel>(model);
        jTable2.setRowSorter(tro);
        tro.setRowFilter(RowFilter.regexFilter(value1));
        
       
        
        
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        //REMOVE doctors patient medi list table but data asslo remaine in history databse table
        try{
           String pid   = jTextField4.getText(); 
                
            if(medilist.removemedilistall(pid))// pass values to appointment class
               {
                JOptionPane.showMessageDialog(null, " Deleted Successfuly!!","Remove EMPLOYEE", JOptionPane.INFORMATION_MESSAGE);
               }
            else{
                JOptionPane.showMessageDialog(null, "Data Delete Failed!!","Remove Employee Error", JOptionPane.ERROR_MESSAGE);
                }  
            
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(null, ex.getMessage()+"Enter ID", " ID ERROR", JOptionPane.ERROR_MESSAGE);
            }
        
        jTable2.setModel(new DefaultTableModel(null,new Object[]{"P.ID","mediname","daytime","count","be_af","date"}));
        //populate table
        medilist.fillmediTable(jTable2);
        
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField2.setText("");
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel  model = (DefaultTableModel)jTable2.getModel();
        
        int rIndex = jTable2.getSelectedRow();//get the select row index
        
        jTextField4.setText(model.getValueAt(rIndex,0).toString());
        jTextField3.setText(model.getValueAt(rIndex,1).toString());
        jTextField2.setText(model.getValueAt(rIndex,3).toString());
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        String PID = jTextField4.getText();
        
        if(PID.trim().equals("")){
            JOptionPane.showMessageDialog(null,"please enter patient id NUMBER","PRINT", JOptionPane.ERROR_MESSAGE);
        }
        else{
        MessageFormat header= new MessageFormat("MEDI LIST");
        MessageFormat footer= new MessageFormat("..................................");
        
        try {
            jTable2.print(JTable.PrintMode.FIT_WIDTH,header,footer);
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(null, "Print Failed","Printer Error", JOptionPane.ERROR_MESSAGE);
        }
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
