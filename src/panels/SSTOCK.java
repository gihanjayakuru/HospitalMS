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
public class SSTOCK {
    
    MYCONNECTION myconnection =new MYCONNECTION();
    
    public boolean addstock(String medi_id, String medi_name, String form, String strength, int pack,int unit, String Exp_date, int total,String st_date){
        
        PreparedStatement st;
        ResultSet rs;
        String addQuery="INSERT INTO `stock`(`medi_id`, `medi_name`, `form`, `strength`, `pack`, `unit`, `Exp_date`, `total`, `st_date`) VALUES (?,?,?,?,?,?,?,?,?)";
        
        try {
            st=myconnection.createConnection().prepareStatement(addQuery);
            
            st.setString(1, medi_id);
            st.setString(2, medi_name);
            st.setString(3, form);   
            st.setString(4, strength);
            st.setInt(5, pack);   
            st.setInt(6, unit);   
            st.setString(7, Exp_date);
            st.setInt(8, total); 
            st.setString(9, st_date);
            
            
            if(st.executeUpdate()>0)
            {
             return true;   
            }else{
                return false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SSTOCK.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean editstock(String medi_id, String medi_name, String form, String strength, int pack,int unit, String Exp_date, int total,String st_date)
    {
        PreparedStatement st;
        ResultSet rs;
        String editQuery="UPDATE `stock` SET `medi_name`=?,`form`=?,`strength`=?,`pack`=?,`unit`=?,`Exp_date`=?,`total`=?,`st_date`=? WHERE `medi_id`=?";
        
        try {
            st=myconnection.createConnection().prepareStatement(editQuery);
            
            st.setString(1, medi_name);
            st.setString(2, form);
            st.setString(3, strength);   
            st.setInt(4, pack);
            st.setInt(5, unit);   
            st.setString(6, Exp_date);   
            st.setInt(7, total);
            st.setString(8, st_date);
            st.setString(9, medi_id);
            
            
            return (st.executeUpdate()>0); 
            
        }
        catch (SQLException ex) {
            Logger.getLogger(SSTOCK.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }          
    }
    
    public boolean removestock(String medi_id)
     {
        PreparedStatement st;
        ResultSet rs;
        String deleteQuery="DELETE FROM `stock` WHERE `medi_id`=?";
        
        try {
            st=myconnection.createConnection().prepareStatement(deleteQuery);
            

            st.setString(1, medi_id);
            
            return (st.executeUpdate()>0); 
            
        }
        
        catch (SQLException ex) {
            Logger.getLogger(SSTOCK.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }      
     
     
     }
    
    
    public void fillstockTable(JTable table)
    {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `stock`";
        
        try {
            
            
            ps = myconnection.createConnection().prepareStatement(selectQuery);
            
            rs = ps.executeQuery();
            
            DefaultTableModel tablemodel= (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next())
            {
                row = new Object[9];//column on table
                row[0]=rs.getString(1);
                row[1]= rs.getString(2);
                row[2]= rs.getString(3);
                row[3]=rs.getString(4);
                row[4]= rs.getString(5);
                row[5]= rs.getString(6);
                row[7]=rs.getString(7);
                row[6]= rs.getString(8);
                row[8]= rs.getString(9);

                tablemodel.addRow(row);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(SSTOCK.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
}
