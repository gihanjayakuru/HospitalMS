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
public class REPORT {
    
    MYCONNECTION myconnection =new MYCONNECTION();
    
    public boolean addreport(String id, String name, String diagnose, String description, String date){
        
        PreparedStatement st;
        ResultSet rs;
        String addQuery="INSERT INTO `patient_report`(`id`, `p.name`, `diagnose`, `description`, `date`) VALUES (?,?,?,?,?)";
        
        try {
            st=myconnection.createConnection().prepareStatement(addQuery);
            
            st.setString(1, id);
            st.setString(2, name);
            st.setString(3, diagnose);   
            st.setString(4, description);
            st.setString(5, date);   
            
            
            if(st.executeUpdate()>0)
            {
             return true;   
            }else{
                return false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(REPORT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
    public boolean addreportHistory(String id, String name, String diagnose, String description, String date){
        
        PreparedStatement st;
        ResultSet rs;
        String addQuery="INSERT INTO `patient_report_history`(`id`, `p.name`, `diagnose`, `description`, `date`) VALUES (?,?,?,?,?)";
        
        try {
            st=myconnection.createConnection().prepareStatement(addQuery);
            
            st.setString(1, id);
            st.setString(2, name);
            st.setString(3, diagnose);   
            st.setString(4, description);
            st.setString(5, date);   
            
            
            if(st.executeUpdate()>0)
            {
             return true;   
            }else{
                return false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(REPORT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
 //function to populate table with database data
    public void fillreporttable(JTable table)
    {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `patient_report`";
        
        try {
            
            
            ps = myconnection.createConnection().prepareStatement(selectQuery);
            
            rs = ps.executeQuery();
            
            DefaultTableModel tablemodel= (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next())
            {
                row = new Object[5];//column on table
                row[0]=rs.getString(1);
                row[1]= rs.getString(2);
                row[2]= rs.getString(3);
                row[3]=rs.getString(4);
                row[4]= rs.getString(5);

                tablemodel.addRow(row);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(REPORT.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public void fillreporthistorytable(JTable table)
    {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `patient_report_history`";
        
        try {
            
            
            ps = myconnection.createConnection().prepareStatement(selectQuery);
            
            rs = ps.executeQuery();
            
            DefaultTableModel tablemodel= (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next())
            {
                row = new Object[5];//column on table
                row[0]=rs.getString(1);
                row[1]= rs.getString(2);
                row[2]= rs.getString(3);
                row[3]=rs.getString(4);
                row[4]= rs.getString(5);

                tablemodel.addRow(row);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(REPORT.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public boolean editreport(String id,String name, String diagnose,String description, String date)
    {
        PreparedStatement st;
        ResultSet rs;
        String editQuery="UPDATE `patient_report` SET `p.name`=?,`diagnose`=?,`description`=?,`date`=? WHERE id=?";
        
        try {
            st=myconnection.createConnection().prepareStatement(editQuery);
            
            st.setString(1, name);
            st.setString(2, diagnose);
            st.setString(3, description);
            st.setString(4, date);
            st.setString(5, id);
          
            
            
            return (st.executeUpdate()>0); 
            
        }
        catch (SQLException ex) {
            Logger.getLogger(REPORT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }          
    }
    
    public boolean editreportHistory(String id,String name, String diagnose,String description, String date)
    {
        PreparedStatement st;
        ResultSet rs;
        String editQuery="UPDATE `patient_report_history` SET `p.name`=?,`diagnose`=?,`description`=?,`date`=? WHERE id=?";
        
        try {
            st=myconnection.createConnection().prepareStatement(editQuery);
            
            st.setString(1, name);
            st.setString(2, diagnose);
            st.setString(3, description);
            st.setString(4, date);
            st.setString(5, id);
          
            
            
            return (st.executeUpdate()>0); 
            
        }
        catch (SQLException ex) {
            Logger.getLogger(REPORT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }          
    }
    
         //remove  function
     public boolean removereport(String id)
     {
        PreparedStatement st;
        ResultSet rs;
        String deleteQuery="DELETE FROM `patient_report` WHERE `id`=?";
        
        try {
            st=myconnection.createConnection().prepareStatement(deleteQuery);
            

            st.setString(1, id);
            
            return (st.executeUpdate()>0); 
            
        }
        catch (SQLException ex) {
            Logger.getLogger(REPORT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

     }
     
     public boolean removereportHistory(String id)
     {
        PreparedStatement st;
        ResultSet rs;
        String deleteQuery="DELETE FROM `patient_report_history` WHERE `id`=?";
        
        try {
            st=myconnection.createConnection().prepareStatement(deleteQuery);
            

            st.setString(1, id);
            
            return (st.executeUpdate()>0); 
            
        }
        catch (SQLException ex) {
            Logger.getLogger(REPORT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

     }
  
    
}    
