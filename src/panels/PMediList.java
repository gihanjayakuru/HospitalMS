/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hasa
 */
public class PMediList extends javax.swing.JPanel {

    /**
     * Creates new form PMediList
     */
    
    PATIENTMEDI medilist=new PATIENTMEDI();
    
    public PMediList() {
        initComponents();
        jTextField1.setBackground(new java.awt.Color(0,0,0,1));
        jTextField2.setBackground(new java.awt.Color(0,0,0,1));
        jTextField7.setBackground(new java.awt.Color(0,0,0,1));
        jTextField8.setBackground(new java.awt.Color(0,0,0,1));
        currentdate();
       
        medilist.fillmediTable(jTable1);
    }
    public void currentdate(){
    
        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        jTextField7.setText(year+"/"+(month+1)+"/"+day);
    
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(781, 519));

        jPanel1.setPreferredSize(new java.awt.Dimension(781, 519));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Medi Name:-");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField1.setOpaque(false);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 130, -1));

        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField2.setOpaque(false);
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 30, -1));

        jLabel3.setText("count");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        jLabel4.setText("Before or After Meals");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Before Meals");
        jRadioButton1.setContentAreaFilled(false);
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("After Meals");
        jRadioButton2.setContentAreaFilled(false);
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PID", "Medi Name", "dayTime", "count", "before after", "date"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, 320));

        jButton1.setText("add to list");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jButton2.setText("edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        jButton3.setText("remove");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

        jLabel5.setText("date");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, 20));

        jTextField7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField7.setOpaque(false);
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 90, -1));

        jLabel6.setText("ID:-");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 20, -1));

        jTextField8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField8.setOpaque(false);
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 70, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Morning", "Noon", "Eveening", "Night", "when nec" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 80, -1));

        jLabel7.setText("show patient medi history with another frame and table");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 320, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bCK/50-Beautiful-and-Minimalist-Presentation-Backgrounds-036.jpg"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(781, 519));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 520));

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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String pid=jTextField8.getText();
        String be_af="";
        String mediname=jTextField1.getText();
        String date=jTextField7.getText();
        int count= Integer.parseInt(jTextField2.getText().toString());
        
         String daytime=jComboBox1.getSelectedItem().toString();
        
        if(jRadioButton1.isSelected()){
            be_af="before";
        }else if(jRadioButton2.isSelected()){
            be_af="after";
        }
        
        if(pid.trim().equals("")|| be_af.trim().equals("") ||mediname.trim().equals("")|| date.trim().equals("")){
        
            JOptionPane.showMessageDialog(null, "empty fields!!","medi list", JOptionPane.ERROR_MESSAGE);
        }
        else{     
             if(medilist.editmedilist(pid,mediname,daytime,count,be_af,date) && medilist.editmedilisthistory(pid,mediname,daytime,count,be_af,date))// pass values to medi list class
                 {
                 JOptionPane.showMessageDialog(null, "medi list added Successfuly!!","medi list", JOptionPane.INFORMATION_MESSAGE);
                 }
             else{
                 JOptionPane.showMessageDialog(null, "medi list added Failed!!","medi list", JOptionPane.ERROR_MESSAGE);
             }
        }
        
        jTable1.setModel(new DefaultTableModel(null,new Object[]{"P.ID","mediname","daytime","count","be_af","date"}));
        //populate table
        medilist.fillmediTable(jTable1);
        
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       
        String pid=jTextField8.getText();
        String be_af="";
        String mediname=jTextField1.getText();
        String date=jTextField7.getText();
        int count= Integer.parseInt(jTextField2.getText().toString());
        //String daytime="";
        String daytime=jComboBox1.getSelectedItem().toString();
         //String daytime= jCheckBox1.getText();
        
//        if(jCheckBox1.isSelected())
//        {
//             daytime = "Morning";
//        }
//        else(jCheckBox1.isSelected())
//        {
//             daytime = "evening";
//        }
        
         
        if(jRadioButton1.isSelected()){
            be_af="before";
        }else if(jRadioButton2.isSelected()){
            be_af="after";
        }
        
        if(pid.trim().equals("")|| be_af.trim().equals("") ||mediname.trim().equals("")|| date.trim().equals("")){
        
            JOptionPane.showMessageDialog(null, "empty fields!!","medi list", JOptionPane.ERROR_MESSAGE);
        }
        else{     
             if(medilist.addmedi(pid,mediname,daytime,count, be_af, date) && medilist.addmedihistory(pid,mediname,daytime,count,be_af,date))// pass values to medi list class
                 {
                 JOptionPane.showMessageDialog(null, "medi list added Successfuly!!","medi list", JOptionPane.INFORMATION_MESSAGE);
                 }
             else{
                 JOptionPane.showMessageDialog(null, "medi list added Failed!!","medi list", JOptionPane.ERROR_MESSAGE);
             }
        }
        
        jTable1.setModel(new DefaultTableModel(null,new Object[]{"P.ID","mediname","daytime","count","be_af","date"}));
        //populate table
        medilist.fillmediTable(jTable1);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
     // TODO add your handling code here:
        DefaultTableModel  model = (DefaultTableModel)jTable1.getModel();
        
        int rIndex = jTable1.getSelectedRow();//get the select row index
        
        jTextField8.setText(model.getValueAt(rIndex,0).toString());
        jTextField1.setText(model.getValueAt(rIndex,1).toString());
        
        String time=model.getValueAt(rIndex, 2).toString();
        for(int i=0; i<jComboBox1.getItemCount(); i++)
        {
            if(jComboBox1.getItemAt(i).toString().equalsIgnoreCase(time))
            {
                jComboBox1.setSelectedIndex(i);
            }
        }
        
        jTextField2.setText(model.getValueAt(rIndex,3).toString());
        
        String be_af= model.getValueAt(rIndex, 4).toString();
        if(be_af.equals("before")){//get value from table to jRadioButtons
            jRadioButton1.setSelected(true);
        }else if(be_af.equals("after")){
            jRadioButton2.setSelected(true);
        }
        
        jTextField7.setText(model.getValueAt(rIndex,5).toString());
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try{
           String mediname= jTextField1.getText(); 
                
            if(medilist.removemedilist(mediname) && medilist.removemedilisthistory(mediname))// pass values to appointment class
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
        
        jTable1.setModel(new DefaultTableModel(null,new Object[]{"P.ID","mediname","daytime","count","be_af","date"}));
        //populate table
        medilist.fillmediTable(jTable1);
        
        jTextField8.setText("");
        jTextField1.setText("");
        jTextField2.setText("");
        
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
