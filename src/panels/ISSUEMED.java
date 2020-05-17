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
public class ISSUEMED {
    
    MYCONNECTION myconnection =new MYCONNECTION();
    
    
    public void fillmediTable(JTable table)
    {
        //PreparedStatement st;
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
                row = new Object[5];//column on table
                row[0]=rs.getString(1);
                row[1]=rs.getString(2);
                row[2]= rs.getString(3);
                row[3]= rs.getString(4);
                row[4]=rs.getString(5);
                
                
                tablemodel.addRow(row);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(ISSUEMED.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    
    
    
    
}
