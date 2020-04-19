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
public class ADMIT {
    
    MYCONNECTION myconnection =new MYCONNECTION();
    
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
                row = new Object[4];//column on table
                row[0]=rs.getString(1);
                row[1]= rs.getString(2);
                row[2]= rs.getString(3);
                row[3]=rs.getString(5);


                tablemodel.addRow(row);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(ADMIT.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
     public void filladmittable(JTable table)
    {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `admit_patients`";
        
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
            Logger.getLogger(ADMIT.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    //admit_patients
    
    public boolean addadmit(String id, String name, String diagnose, String word, String admit_date){
        
        PreparedStatement st;
        ResultSet rs;
        String addQuery="INSERT INTO `admit_patients`(`id`, `p.name`, `diagnose`, `word`, `admit_date`) VALUES (?,?,?,?,?)";
        
        try {
            st=myconnection.createConnection().prepareStatement(addQuery);
            
            st.setString(1, id);
            st.setString(2, name);
            st.setString(3, diagnose);   
            st.setString(4, word);
            st.setString(5, admit_date);   
            
            
            if(st.executeUpdate()>0)
            {
             return true;   
            }else{
                return false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ADMIT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}
