/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author hasa
 */
public class Appointment extends javax.swing.JPanel {

    /**
     * Creates new form Appointment
     */
    APPOINTMENTPA appointment=new APPOINTMENTPA();
    
    public Appointment() {
        initComponents();
        jTextField1.setBackground(new java.awt.Color(0,0,0,1));
        jTextField3.setBackground(new java.awt.Color(0,0,0,1));
        jTextField5.setBackground(new java.awt.Color(0,0,0,1));
        currentdate();
        appointment.fillappointmentTable(jTable1);
        
    }
    
    public void currentdate(){
    
        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        jTextField3.setText(year+"/"+(month+1)+"/"+day);
    
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(781, 519));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("ADD APPOINTMENT");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 120, 40));

        jLabel3.setText("Patient ID:-");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel4.setText("Chose Clinic:-");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jTextField1.setText("type id");
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField1.setOpaque(false);
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 90, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Clinic 1");
        jRadioButton1.setContentAreaFilled(false);
        add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Clinic 2");
        jRadioButton2.setContentAreaFilled(false);
        add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Clinic 3");
        jRadioButton3.setContentAreaFilled(false);
        add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));

        jLabel8.setText("Chose Day:-");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 210, 140));

        jButton1.setText("genarate recipt");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, -1, 40));

        jButton2.setText("print recipt");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, -1, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "P.ID", "Clinic", "Date", "time"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 410, 220));

        jLabel12.setText("time:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8-12", "2-4" }));
        add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        jButton3.setText("edit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, 30));

        jButton4.setText("remove");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, -1, 30));

        jLabel14.setText("pateint clinic date list table:");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 54, -1, 20));

        jButton5.setText("add");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, 30));

        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField3.setOpaque(false);
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 80, -1));

        jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 204)));
        jTextField5.setOpaque(false);
        add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 90, -1));
        add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bCK/50-Beautiful-and-Minimalist-Presentation-Backgrounds-036.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 520));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date = dFormat.format(jDateChooser2.getDate());
        //jTextField5.setText(date);
        
        String pid= jTextField1.getText();
        String clinic="";
        String time= jComboBox4.getSelectedItem().toString();
        
        if(jRadioButton1.isSelected()){
            clinic="clinic 1";
        }else if(jRadioButton2.isSelected()){
            clinic="clinic 2";
        }else if(jRadioButton3.isSelected()){
            clinic="clinic 3";
         }
        if(pid.trim().equals("")|| clinic.trim().equals("") || time.trim().equals("")|| jDateChooser2.getDate() == null){
        
            JOptionPane.showMessageDialog(null, "empty fields!!","Appointment", JOptionPane.ERROR_MESSAGE);
        }
        else{     
             if(appointment.editappointment(pid,clinic,date,time))// pass values to appointment class
                 {
                 JOptionPane.showMessageDialog(null, "Appointmnet added Successfuly!!","Appointmnet", JOptionPane.INFORMATION_MESSAGE);
                 }
             else{
                 JOptionPane.showMessageDialog(null, "Appointmnet added Failed!!","Appointmnet", JOptionPane.ERROR_MESSAGE);
             }
        }
        
        jTable1.setModel(new DefaultTableModel(null,new Object[]{"P.ID","Clinic","Date","time"}));
        //populate table
        appointment.fillappointmentTable(jTable1);
        
        
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date = dFormat.format(jDateChooser2.getDate());
        //jTextField5.setText(date);
        
        String pid= jTextField1.getText();
        String clinic="";
        String time= jComboBox4.getSelectedItem().toString();
        
        if(jRadioButton1.isSelected()){
            clinic="clinic 1";
        }else if(jRadioButton2.isSelected()){
            clinic="clinic 2";
        }else if(jRadioButton3.isSelected()){
            clinic="clinic 3";
         }

//        if (jDateChooser2.getDate() == null) 
//        {
//            JOptionPane.showMessageDialog(null, "Pleas Choose Date ", "Error", JOptionPane.ERROR_MESSAGE);
//            
//           
//        }
        
        if(pid.trim().equals("")|| clinic.trim().equals("") || time.trim().equals("")|| jDateChooser2.getDate() == null){
        
            JOptionPane.showMessageDialog(null, "empty fields!!","Appointment", JOptionPane.ERROR_MESSAGE);
        }
        else{     
             if(appointment.addappointment(pid,clinic,date,time))// pass values to appointment class
                 {
                 JOptionPane.showMessageDialog(null, "Appointmnet added Successfuly!!","Appointmnet", JOptionPane.INFORMATION_MESSAGE);
                 }
             else{
                 JOptionPane.showMessageDialog(null, "Appointmnet added Failed!!","Appointmnet", JOptionPane.ERROR_MESSAGE);
             }
        }
        
        jTable1.setModel(new DefaultTableModel(null,new Object[]{"P.ID","Clinic","Date","time"}));
        //populate table
        appointment.fillappointmentTable(jTable1);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel  model = (DefaultTableModel)jTable1.getModel();
        
        int rIndex = jTable1.getSelectedRow();//get the select row index
        
        jTextField1.setText(model.getValueAt(rIndex,0).toString());

        String clinic= model.getValueAt(rIndex, 1).toString();
        
        if(clinic.equals("clinic 1")){//get value from table to jRadioButtons
            jRadioButton1.setSelected(true);
        }else if(clinic.equals("clinic 2")){
            jRadioButton2.setSelected(true);
        }else if(clinic.equals("clinic 3")){
            jRadioButton3.setSelected(true);
        }
        
        
        
        try {
            int selectedrow = jTable1.getSelectedRow();
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(selectedrow, 2).toString());
           // DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
               jDateChooser2.setDate(date);
        
        } catch (ParseException ex) {
            Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String time=model.getValueAt(rIndex, 3).toString();
        for(int i=0; i<jComboBox4.getItemCount(); i++)
        {
            if(jComboBox4.getItemAt(i).toString().equalsIgnoreCase(time))
            {
                jComboBox4.setSelectedIndex(i);
            }
        }
        
        
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try{
           String pid= jTextField1.getText(); 
                
            if(appointment.removeappointment(pid))// pass values to appointment class
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
        
        jTextField1.setText("");
        jTable1.setModel(new DefaultTableModel(null,new Object[]{"P.ID","Clinic","Date","time"}));
        //populate table
        appointment.fillappointmentTable(jTable1);
        
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox4;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
