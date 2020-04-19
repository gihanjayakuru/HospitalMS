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
public class PATEINTREGIS {
    
    MYCONNECTION myconnection =new MYCONNECTION();
    
    public boolean addregister(String id, String pname, String gname, String gid, String contact, String address){
        
        PreparedStatement st;
        ResultSet rs;
        String addQuery="INSERT INTO `patientdetails`(`id`, `p.name`, `g.name`, `g.id`, `g.contact`, `address`) VALUES (?,?,?,?,?,?)";
        
        try {
            st=myconnection.createConnection().prepareStatement(addQuery);
            
            st.setString(1, id);
            st.setString(2, pname);
            st.setString(3, gname);   
            st.setString(4, gid);
            st.setString(5, contact);   
            st.setString(6, address);
            
            if(st.executeUpdate()>0)
            {
             return true;   
            }else{
                return false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(PATEINTREGIS.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    } 
    
    public boolean editregister(String pid,String pname, String gname,String gid,String gcontact,String address)
    {
        PreparedStatement st;
        ResultSet rs;
        String editQuery="UPDATE `patientdetails` SET `p.name`=?,`g.name`=?,`g.id`=?,`g.contact`=?,`address`=? WHERE `id`=?";
        
        try {
            st=myconnection.createConnection().prepareStatement(editQuery);
            
            st.setString(1, pname);
            st.setString(2, gname);
            st.setString(3, gid);
            st.setString(4, gcontact);
            st.setString(5, address);
            st.setString(6, pid);
            
            
            return (st.executeUpdate()>0); 
            
        }
        catch (SQLException ex) {
            Logger.getLogger(PATEINTREGIS.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }          
    }
    
     //function to populate table with database data
    public void fillregisterTable(JTable table)
    {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `patientdetails`";
        
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
                row[4]= rs.getInt(5);
                row[5]= rs.getString(6);
                
                tablemodel.addRow(row);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(PATEINTREGIS.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }    
    

         //remove  function
     public boolean removeregister(String pid)
     {
        PreparedStatement st;
        ResultSet rs;
        String deleteQuery="DELETE FROM `patientdetails` WHERE `id`=?";
        
        try {
            st=myconnection.createConnection().prepareStatement(deleteQuery);
            

            st.setString(1, pid);
            
            return (st.executeUpdate()>0); 
            
        }
        catch (SQLException ex) {
            Logger.getLogger(PATEINTREGIS.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }      
     
     
     }
    
}
