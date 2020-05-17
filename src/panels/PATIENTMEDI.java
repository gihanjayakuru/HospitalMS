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
public class PATIENTMEDI {
    MYCONNECTION myconnection =new MYCONNECTION();
    
     
     
     public boolean addmedi(String pid,String mediname,String daytime,int count,String be_af,String date){
        
        PreparedStatement st;
        ResultSet rs;
        String addQuery="INSERT INTO `patient_medi_list`(`id`, `medi_name`, `daytime`, `count`, `be_af`, `date`) VALUES (?,?,?,?,?,?)";
        
        try {
            st=myconnection.createConnection().prepareStatement(addQuery);
            
            st.setString(1, pid);
            st.setString(2, mediname);
            st.setString(3, daytime);   
            st.setInt(4, count);
            st.setString(5, be_af);   
            st.setString(6, date);
            
            if(st.executeUpdate()>0)
            {
             return true;   
            }else{
                return false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(PATIENTMEDI.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
     }
     
     public boolean addmedihistory(String pid,String mediname,String daytime,int count,String be_af,String date){
        
        PreparedStatement st;
        ResultSet rs;
        String addQuery="INSERT INTO `patient_medi_list_history`(`id`, `medi_name`, `daytime`, `count`, `be_af`, `date`) VALUES (?,?,?,?,?,?)";
        
        try {
            st=myconnection.createConnection().prepareStatement(addQuery);
            
            st.setString(1, pid);
            st.setString(2, mediname);
            st.setString(3, daytime);   
            st.setInt(4, count);
            st.setString(5, be_af);   
            st.setString(6, date);
            
            if(st.executeUpdate()>0)
            {
             return true;   
            }else{
                return false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(PATIENTMEDI.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
     }
     
       //function to populate table with database data
    public void fillmediTable(JTable table)
    {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `patient_medi_list`";
        
        try {
            
            
            ps = myconnection.createConnection().prepareStatement(selectQuery);
            
            rs = ps.executeQuery();
            
            DefaultTableModel tablemodel= (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next())
            {
                row = new Object[6];//column on table
                row[0]=rs.getString(1);
                row[1]= rs.getString(2);
                row[2]= rs.getString(3);
                row[3]=rs.getString(4);
                row[4]= rs.getString(5);
                row[5]=rs.getString(6);
                
                tablemodel.addRow(row);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(PATIENTMEDI.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    } 
     
    public boolean editmedilist(String pid,String mediname,String daytime,int count,String be_af,String date)
    {
        PreparedStatement st;
        ResultSet rs;
        String editQuery="UPDATE `patient_medi_list` SET `daytime`=?,`count`=?,`be_af`=?,`date`=? WHERE `medi_name`=?";
        
        try {
            st=myconnection.createConnection().prepareStatement(editQuery);
            
            //st.setString(1, pid);
            st.setString(1, daytime);
            st.setInt(2, count);
            st.setString(3, be_af);
            st.setString(4, date);
            st.setString(5, mediname);
            
            
            return (st.executeUpdate()>0); 
            
        }
        catch (SQLException ex) {
            Logger.getLogger(PATIENTMEDI.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }     
    }
    
    public boolean editmedilisthistory(String pid,String mediname,String daytime,int count,String be_af,String date)
    {
        PreparedStatement st;
        ResultSet rs;
        String editQuery="UPDATE `patient_medi_list_history` SET `daytime`=?,`count`=?,`be_af`=?,`date`=? WHERE `medi_name`=?";
        
        try {
            st=myconnection.createConnection().prepareStatement(editQuery);
            
            //st.setString(1, pid);
            st.setString(1, daytime);
            st.setInt(2, count);
            st.setString(3, be_af);
            st.setString(4, date);
            st.setString(5, mediname);
            
            
            return (st.executeUpdate()>0); 
            
        }
        catch (SQLException ex) {
            Logger.getLogger(PATIENTMEDI.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }     
    }
    

    public boolean removemedilist(String mediname)
    {
        PreparedStatement st;
        ResultSet rs;
        String deleteQuery="DELETE FROM `patient_medi_list` WHERE `medi_name`=?";
        
        try {
            st=myconnection.createConnection().prepareStatement(deleteQuery);
            

            st.setString(1, mediname);
            
            return (st.executeUpdate()>0); 
            
        }
        catch (SQLException ex) {
            Logger.getLogger(PATIENTMEDI.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }      
     
     
     }
    public boolean removemedilistall(String pid)
    {
        PreparedStatement st;
        ResultSet rs;
        String deleteQuery="DELETE FROM `patient_medi_list` WHERE `id`=?";
        
        try {
            st=myconnection.createConnection().prepareStatement(deleteQuery);
            

            st.setString(1, pid);
            
            return (st.executeUpdate()>0); 
            
        }
        catch (SQLException ex) {
            Logger.getLogger(PATIENTMEDI.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }      
    
     }
    
    public boolean removemedilisthistory(String mediname)
    {
        PreparedStatement st;
        ResultSet rs;
        String deleteQuery="DELETE FROM `patient_medi_list_history` WHERE `medi_name`=?";
        
        try {
            st=myconnection.createConnection().prepareStatement(deleteQuery);
            

            st.setString(1, mediname);
            
            return (st.executeUpdate()>0); 
            
        }
        catch (SQLException ex) {
            Logger.getLogger(PATIENTMEDI.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }      
     
     
     }
        
    
        
}
     