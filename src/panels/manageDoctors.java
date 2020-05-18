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

/**
 *
 * @author hasa
 */
public class manageDoctors {
    
    MYCONNECTION myconnection =new MYCONNECTION();
    
    
    public boolean addmanage(String id, String name, String position, String depart, String word){
        
        PreparedStatement st;
        ResultSet rs;
        String addQuery="INSERT INTO `manage_doctors`(`id`, `name`, `position`, `department`, `word`) VALUES (?,?,?,?,?)";
        
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
            Logger.getLogger(manageDoctors.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
     public boolean editmanage(String id,String name,String position,String department,String word){
        
        PreparedStatement st;
        ResultSet rs;
        String addQuery="UPDATE `manage_doctors` SET `name`=?,`position`=?,`department`=?,`word`=? WHERE `id`=?";
        
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
            Logger.getLogger(manageDoctors.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
     public boolean removemanage(String id){
        
        PreparedStatement st;
        ResultSet rs;
        String addQuery="DELETE FROM `manage_doctors` WHERE `id`=?";
        
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
            Logger.getLogger(manageDoctors.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    //
     
}
