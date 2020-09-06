/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hasa
 */
public class stock extends javax.swing.JPanel {

    /**
     * Creates new form stock
     */
    ADDMEDI medi=new ADDMEDI();
    SSTOCK stock=new SSTOCK();
    
    public stock() {
        initComponents();
        medi.fillmediTable(jTable2);
        stock.fillstockTable(jTable1);
        currentdate();
        
        jTextField1.setBackground(new java.awt.Color(0,0,0,1));
        jTextField2.setBackground(new java.awt.Color(0,0,0,1));
        jTextField4.setBackground(new java.awt.Color(0,0,0,1));
        jTextField5.setBackground(new java.awt.Color(0,0,0,1));
        jTextField6.setBackground(new java.awt.Color(0,0,0,1));
        jTextField7.setBackground(new java.awt.Color(0,0,0,1));
        jTextField8.setBackground(new java.awt.Color(0,0,0,1));
        
    }
    
    public void currentdate(){
    
    Calendar cal =new GregorianCalendar();
    int month=cal.get(Calendar.MONTH);
    int year =cal.get(Calendar.YEAR);
    int day= cal.get(Calendar.DAY_OF_MONTH);
    jTextField5.setText(year+"/"+(month+1)+"/"+day);
    jTextField5.setEditable(false);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(820, 660));
        setMinimumSize(new java.awt.Dimension(820, 660));
        setPreferredSize(new java.awt.Dimension(820, 660));

        jPanel1.setMaximumSize(new java.awt.Dimension(820, 660));
        jPanel1.setMinimumSize(new java.awt.Dimension(820, 660));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("medi id");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel2.setText("medi name:-");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel3.setText("form:-");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel4.setText("strength:-");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel5.setText("date:-");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel6.setText("exp date package:-");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 20));

        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField1.setOpaque(false);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 120, -1));

        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField2.setOpaque(false);
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 120, -1));

        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField4.setOpaque(false);
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 120, -1));

        jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField5.setOpaque(false);
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 70, -1));

        jTextField6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField6.setOpaque(false);
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 110, -1));

        jTextField7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField7.setOpaque(false);
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField7KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 110, -1));

        jLabel7.setText("how many package(box) :-");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, 20));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "medi id", "medi name", "form", "strength", "package", "unit", "total", "pack ExpDate", "stored date"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 250, 480, 260));

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        jButton2.setText("EDIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, -1, -1));

        jButton3.setText("REMOVE");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

        jLabel9.setText("total :-");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 70, -1));

        jTextField8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField8.setOpaque(false);
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 110, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medi ID", "Medi Name", "Form", "Strength"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 440, 210));

        jLabel10.setText("unit in the package :-");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 100, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 280, 10));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Liquid", "Tablet", "Capsules", "Drops", "Inhalers", "Injections" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 100, -1));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 120, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bCK/50-Beautiful-and-Minimalist-Presentation-Backgrounds-036.jpg"))); // NOI18N
        jLabel8.setMaximumSize(new java.awt.Dimension(820, 660));
        jLabel8.setMinimumSize(new java.awt.Dimension(820, 660));
        jLabel8.setPreferredSize(new java.awt.Dimension(820, 660));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
        String medi_id=  jTextField1.getText();
        String medi_name= jTextField2.getText();
        String form = jComboBox1.getSelectedItem().toString();       
        String strength = jTextField4.getText();
        
        int pack= Integer.parseInt(jTextField6.getText());
        int unit = Integer.parseInt(jTextField7.getText());
        
        SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
        String Exp_date = dFormat.format(jDateChooser1.getDate());
        
        int total = Integer.parseInt(jTextField8.getText());
        
        
        String st_date = jTextField5.getText();
        
        if(medi_id.trim().equals("") || medi_name.trim().equals("") || form.trim().equals("") || strength.trim().equals("") )
        {
            JOptionPane.showMessageDialog(null, "Empty Fields", "please fill the form", JOptionPane.ERROR_MESSAGE);
        }
        else{
            
           if(stock.addstock(medi_id,medi_name,form,strength,pack,unit,Exp_date,total,st_date))
            {
            JOptionPane.showMessageDialog(null, "Stock added successfuly!!", "Stock", JOptionPane.INFORMATION_MESSAGE);
            }
        else{
             JOptionPane.showMessageDialog(null, "Stock added Failed!!", "Stock", JOptionPane.ERROR_MESSAGE);
            }        
        }
        jTable1.setModel(new DefaultTableModel(null,new Object[]{"medi id", "medi name", "form", "strength", "package", "unit", "total", "pack ExpDate", "stored date"}));
        //populate table
        stock.fillstockTable(jTable1);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        DefaultTableModel  model = (DefaultTableModel)jTable2.getModel();
        
        int rIndex = jTable2.getSelectedRow();//get the select row index
        
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
        
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        
        
    }//GEN-LAST:event_jTable2MouseClicked

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
        
        jTextField6.setText(model.getValueAt(rIndex,4).toString());
        jTextField7.setText(model.getValueAt(rIndex,5).toString());
        jTextField8.setText(model.getValueAt(rIndex,6).toString());
        
        try {
            int selectedrow = jTable1.getSelectedRow();
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(selectedrow, 7).toString());
           
               jDateChooser1.setDate(date);
        
        } catch (ParseException ex) {
            Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        String medi_id=  jTextField1.getText();
        String medi_name= jTextField2.getText();
        String form = jComboBox1.getSelectedItem().toString();       
        String strength = jTextField4.getText();
        
        int pack= Integer.parseInt(jTextField6.getText());
        int unit = Integer.parseInt(jTextField7.getText());
        
        SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
        String Exp_date = dFormat.format(jDateChooser1.getDate());
        
        int total= Integer.parseInt(jTextField8.getText());
        
        String st_date = jTextField5.getText();
        
        if(medi_id.trim().equals("") || medi_name.trim().equals("") || form.trim().equals("") || strength.trim().equals("") )
        {
            JOptionPane.showMessageDialog(null, "Empty Fields", "please fill the form", JOptionPane.ERROR_MESSAGE);
        }
        else{
            
           if(stock.editstock(medi_id,medi_name,form,strength,pack,unit,Exp_date,total,st_date))
            {
            JOptionPane.showMessageDialog(null, "Stock edit successfuly!!", "Stock", JOptionPane.INFORMATION_MESSAGE);
            }
        else{
             JOptionPane.showMessageDialog(null, "Stock edit Failed!!", "Stock", JOptionPane.ERROR_MESSAGE);
            }        
        }
        jTable1.setModel(new DefaultTableModel(null,new Object[]{"medi id", "medi name", "form", "strength", "package", "unit", "total", "pack ExpDate", "stored date"}));
        //populate table
        stock.fillstockTable(jTable1);
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyReleased
        // TODO add your handling code here:
        int v=0;
        v = Integer.parseInt(jTextField6.getText().toString()) * Integer.parseInt(jTextField7.getText().toString());
        jTextField8.setText(Integer.toString(v));
        jTextField8.setEditable(false);
        
        
    }//GEN-LAST:event_jTextField7KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
