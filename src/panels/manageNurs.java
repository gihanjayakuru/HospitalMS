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
public class manageNurs {
    
     MYCONNECTION myconnection =new MYCONNECTION();
    
    
    public boolean addmanage(String id, String name, String position, String depart, String word){
        
        PreparedStatement st;
        ResultSet rs;
        String addQuery="INSERT INTO `manage_nurse`(`id`, `name`, `department`, `word`,`position`) VALUES (?,?,?,?,?)";
        
        try {
            st=myconnection.createConnection().prepareStatement(addQuery);
            
            st.setString(1, id);
            st.setString(2, name);
            st.setString(3, position);   
            st.setString(4, depart);
            st.setString(5, word);   
            
            
            if(st.executeUpdate()>0)
            {
             return true;   
            }else{
                return false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(manageNurs.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
     public boolean editmanage(String id,String name,String position,String department,String word){
        
        PreparedStatement st;
        ResultSet rs;
        String addQuery="UPDATE `manage_nurse` SET `name`=?,`department`=?,`word`=?,`position`=? WHERE `id`=?";
        
        try {
            st=myconnection.createConnection().prepareStatement(addQuery);
            
            st.setString(1, name);
            st.setString(2, position);
            st.setString(3, department);
            st.setString(4,word);
            st.setString(5, id);    
            
            
            if(st.executeUpdate()>0)
            {
             return true;   
            }else{
                return false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(manageNurs.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
     public boolean removemanage(String id){
        
        PreparedStatement st;
        ResultSet rs;
        String addQuery="DELETE FROM `manage_nurse` WHERE `id`=?";
        
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
            Logger.getLogger(manageNurs.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
 
     }
     
       //function to populate table with database data
    public void fillmngnurseTable(JTable table)
    {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `manage_nurse`";
        
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
                row[3]= rs.getString(4);
                row[4]= rs.getString(5);
                
                tablemodel.addRow(row);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(manageNurs.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    
}
