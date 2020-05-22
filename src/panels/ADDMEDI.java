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
public class ADDMEDI {
    
    MYCONNECTION myconnection =new MYCONNECTION();
    
    
    public boolean addmedi(String medi_id,String medi_name,String form,String strength){
        
        PreparedStatement st;
        ResultSet rs;
        String addQuery="INSERT INTO `medi`(`medi_id`, `medi_name`, `form`, `strength`) VALUES (?,?,?,?)";
        
        try {
            st=myconnection.createConnection().prepareStatement(addQuery);
            
            st.setString(1, medi_id);
            st.setString(2, medi_name);
            st.setString(3, form);   
            st.setString(4, strength);
            
            
            if(st.executeUpdate()>0)
            {
             return true;   
            }else{
                return false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ADDMEDI.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
 
     }
    
    
    public boolean editmedi(String medi_id,String medi_name,String form,String strength)
    {
        PreparedStatement st;
        ResultSet rs;
        String editQuery="UPDATE `medi` SET `medi_name`=?,`form`=?,`strength`=? WHERE `medi_id`=?";
        
        try {
            st=myconnection.createConnection().prepareStatement(editQuery);
            
            
            st.setString(1, medi_name);
            st.setString(2, form);
            st.setString(3, strength);
            st.setString(4, medi_id);
      
            
            return (st.executeUpdate()>0); 
            
        }
        catch (SQLException ex) {
            Logger.getLogger(ADDMEDI.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }     
    }
    
    public boolean removemedi(String medi_id)
    {
        PreparedStatement st;
        ResultSet rs;
        String deleteQuery="DELETE FROM `medi` WHERE `medi_id`=?";
        
        try {
            st=myconnection.createConnection().prepareStatement(deleteQuery);
            

            st.setString(1, medi_id);
            
            return (st.executeUpdate()>0); 
            
        }
        catch (SQLException ex) {
            Logger.getLogger(ADDMEDI.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }      
     
     
     }
    
    
       //function to populate table with database data
    public void fillmediTable(JTable table)
    {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `medi`";
        
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
            Logger.getLogger(PATIENTMEDI.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
}
