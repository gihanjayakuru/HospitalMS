/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hasa
 */



public class APPOINTMENTPA {
    
     MYCONNECTION myconnection =new MYCONNECTION();
    
     
     
     public boolean addappointment(String pid, String clinic, String date, String time){
        
        PreparedStatement st;
        ResultSet rs;
        String addQuery="INSERT INTO `patient_appointment`(`id`, `clinic`, `date`, `time`) VALUES (?,?,?,?)";
        
        try {
            st=myconnection.createConnection().prepareStatement(addQuery);
            
            st.setString(1, pid);
            st.setString(2, clinic);
            st.setString(3, date);   
            st.setString(4, time);
            
            
            if(st.executeUpdate()>0)
            {
             return true;   
            }else{
                return false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(APPOINTMENTPA.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
     }
     
      //function to populate table with database data
    public void fillappointmentTable(JTable table)
    {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `patient_appointment`";
        
        try {
            
            
            ps = myconnection.createConnection().prepareStatement(selectQuery);
            
            rs = ps.executeQuery();
            
            DefaultTableModel tablemodel= (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next())
            {
                row = new Object[4];//column on table
                row[0]=rs.getString(1);
                row[1]= rs.getString(2);
                row[2]= rs.getString(3);
                row[3]=rs.getString(4);
                
                
                tablemodel.addRow(row);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(APPOINTMENTPA.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }    
     
    
    public boolean editappointment(String pid,String clinic, String date,String time)
    {
        PreparedStatement st;
        ResultSet rs;
        String editQuery="UPDATE `patient_appointment` SET `clinic`=?,`date`=?,`time`=? WHERE `id`=?";
        
        try {
            st=myconnection.createConnection().prepareStatement(editQuery);
            
            st.setString(1, clinic);
            st.setString(2, date);
            st.setString(3, time);
            st.setString(4, pid);
          
            
            
            return (st.executeUpdate()>0); 
            
        }
        catch (SQLException ex) {
            Logger.getLogger(APPOINTMENTPA.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }          
    }
    
    
   public boolean removeappointment(String pid)
     {
        PreparedStatement st;
        ResultSet rs;
        String deleteQuery="DELETE FROM `patient_appointment` WHERE `id`=?";
        
        try {
            st=myconnection.createConnection().prepareStatement(deleteQuery);
            

            st.setString(1, pid);
            
            return (st.executeUpdate()>0); 
            
        }
        catch (SQLException ex) {
            Logger.getLogger(APPOINTMENTPA.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }      
     
     
     }
}
