/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

/**
 *
 * @author hasa
 */
public class IssueMedi extends javax.swing.JPanel {

    /**
     * Creates new form IssueMedi
     */
    public IssueMedi() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(781, 519));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Patient ID:-");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 60, -1));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 110, -1));

        jButton1.setText("Get medi list");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medi Name", "dayTime", "count", "before after"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, 170));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 180, 110));

        jButton2.setText("genarate medi recipt(or clicking the table)");
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jButton3.setText("print");
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MedID", "MedName", "amount in stock"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 450, 200));
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 50, -1));

        jLabel3.setText("count:-");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 60, 20));
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 100, -1));

        jLabel4.setText("Medi Name:-");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 154, 60, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bCK/50-Beautiful-and-Minimalist-Presentation-Backgrounds-036.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 790, 520));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
