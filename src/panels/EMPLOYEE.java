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
public class EMPLOYEE {
    
    MYCONNECTION myconnection =new MYCONNECTION();
    
    
    public boolean addemployee(String id, String name, String position,String gender){
        
        PreparedStatement st;
        ResultSet rs;
        String addQuery="INSERT INTO `employee`(`id`, `name`, `position`,`gender`) VALUES (?,?,?,?)";
        
        try {
            st=myconnection.createConnection().prepareStatement(addQuery);
            
            st.setString(1, id);
            st.setString(2, name);
            st.setString(3, position);   
            st.setString(4, gender);
            
            if(st.executeUpdate()>0)
            {
             return true;   
            }else{
                return false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(EMPLOYEE.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
     public boolean editemployee(String id,String name,String position,String gender){
        
        PreparedStatement st;
        ResultSet rs;
        String addQuery="UPDATE `employee` SET `name`=?,`position`=?,`gender`=? WHERE `id`=?";
        
        try {
            st=myconnection.createConnection().prepareStatement(addQuery);
            
            st.setString(1, name);
            st.setString(2, position);
            st.setString(3, gender);
            st.setString(4, id);    
            
            
            if(st.executeUpdate()>0)
            {
             return true;   
            }else{
                return false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(EMPLOYEE.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
     public boolean removeemployee(String id){
        
        PreparedStatement st;
        ResultSet rs;
        String addQuery="DELETE FROM `employee` WHERE `id`=?";
        
        try {
            st=myconnection.createConnection().prepareStatement(addQuery);
            
            
            st.setString(1, id);    
            
            
            if(st.executeUpdate()>0)
            {
             return true;   
            }else{
                return false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(EMPLOYEE.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
     
      //function to populate table with database data
    public void fillemployeeTable(JTable table)
    {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `employee`";
        
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
                row[3]= rs.getString(4);
                
                tablemodel.addRow(row);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(PATEINTREGIS.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
}
