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
public class REQSTOCK {
    
    
    MYCONNECTION myconnection =new MYCONNECTION();
    
    public boolean addreqstock(String medi_id, String medi_name, String form, String strength, int num_pack){
        
        PreparedStatement st;
        ResultSet rs;
        String addQuery="INSERT INTO `request_stock`(`medi_id`, `medi_name`, `form`, `strength`, `num_pack`) VALUES (?,?,?,?,?)";
        
        try {
            st=myconnection.createConnection().prepareStatement(addQuery);
            
            st.setString(1, medi_id);
            st.setString(2, medi_name);
            st.setString(3, form);   
            st.setString(4, strength);
            st.setInt(5, num_pack);   

            
            if(st.executeUpdate()>0)
            {
             return true;   
            }else{
                return false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(REQSTOCK.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
    
    public void fillreqstockTable(JTable table)
    {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `request_stock`";
        
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
            Logger.getLogger(REQSTOCK.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
}
