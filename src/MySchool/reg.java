/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MySchool;

import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import javax.swing.*;

/**
 *
 * @author 91868
 */
public class reg extends JFrame {

    /**
     * Creates new form reg
     */login lin =  new login();
    String lg;
    public reg(String x) {
        
        lg= x;
        initComponents();
        //name();
        
         //NewJFrame nf = new NewJFrame(lg);
        table_update();
         
    }
    
//    public reg(){
//        
//        initComponents();
//        //name();
//        table_update(lg);
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtname2 = new javax.swing.JTextField();
        txtmobile2 = new javax.swing.JTextField();
        txtcourse2 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtaddress2 = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtdelacc = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(32, 83, 117));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel2.setMinimumSize(new java.awt.Dimension(492, 218));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 126, 109));
        jLabel1.setText("Student Registration");

        jPanel4.setBackground(new java.awt.Color(211, 206, 223));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(87, 111, 114))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(21, 19, 60));
        jLabel10.setText("Student Name");

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(21, 19, 60));
        jLabel11.setText("Mobile");

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(21, 19, 60));
        jLabel12.setText("Course");

        txtname2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        txtmobile2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmobileActionPerformed(evt);
            }
        });

        txtcourse2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcourseActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(52, 179, 241));
        jButton11.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton11.setText("Add");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(52, 179, 241));
        jButton12.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton12.setText("Edit");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(52, 179, 241));
        jButton13.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton13.setText("Delete");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(21, 19, 60));
        jLabel13.setText("Address");

        txtaddress2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddressActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(52, 179, 241));
        jButton14.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton14.setText("Delete All");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtcourse2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
                            .addComponent(txtmobile2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtname2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtaddress2))))
                .addGap(24, 24, 24))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtname2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmobile2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcourse2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtaddress2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton10.setBackground(new java.awt.Color(254, 126, 109));
        jButton10.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jButton10.setText("LOG OUT");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(254, 126, 109));
        jButton9.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jButton9.setText("SEARCH STUDENT");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Mobile", "Course", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        txtdelacc.setBackground(new java.awt.Color(254, 126, 109));
        txtdelacc.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txtdelacc.setText("DELETE ACCOUNT");
        txtdelacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdelaccActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\91868\\OneDrive\\Desktop\\icons\\reg1.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtdelacc, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdelacc, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
       
    
       Connection con ;
       PreparedStatement insert,insert3;
       login sg = new login();
       
       private void table_update(){
           
        int c;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","123456");
                insert=con.prepareStatement("select * from "+lg);
                
               
               // insert.setString(1, sg.getTxtusername());
                ResultSet rs = insert.executeQuery();
                
                ResultSetMetaData md= rs.getMetaData();
                
                 c=md.getColumnCount();
                
                 DefaultTableModel df= (DefaultTableModel) jTable1.getModel();
                 
                 df.setRowCount(0);
                  
                 while(rs.next()){
                     
                     Vector v2 =new Vector();
                     
                     
                         
                         v2.add(rs.getString("id"));
                         v2.add(rs.getString("name"));
                         v2.add(rs.getString("mobile"));
                         v2.add(rs.getString("course"));
                         v2.add(rs.getString("address"));
                         
                       
                         
                     
                     //System.out.println(v2.elementAt(0));
                     System.out.println(v2);
                     df.addRow(v2);
                 }
                
                
            } catch (SQLException ex) {
                Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);
            }
         
           
         }  
       
       
         private void table_update(String n){
           
        int c;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","123456");
                insert=con.prepareStatement("select * from "+n);
                
               
               // insert.setString(1, sg.getTxtusername());
                ResultSet rs = insert.executeQuery();
                
                ResultSetMetaData md= rs.getMetaData();
                
                 c=md.getColumnCount();
                
                 DefaultTableModel df= (DefaultTableModel) jTable1.getModel();
                 
                 df.setRowCount(0);
                  
                 while(rs.next()){
                     
                     Vector v2 =new Vector();
                     
                     
                         
                         v2.add(rs.getString("id"));
                         v2.add(rs.getString("name"));
                         v2.add(rs.getString("mobile"));
                         v2.add(rs.getString("course"));
                         v2.add(rs.getString("address"));
                         
                       
                         
                     
                     //System.out.println(v2.elementAt(0));
                     System.out.println(v2);
                     df.addRow(v2);
                 }
                
                
            } catch (SQLException ex) {
                Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);
            }
         
           
         }  
           
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        NewJFrame jf =new NewJFrame(lg);

        jf.show();
        dispose();
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
        int dialog = JOptionPane.showConfirmDialog(null, "Do you want to LOG OUT","Warning",JOptionPane.YES_NO_OPTION);
        if(dialog==JOptionPane.YES_OPTION){
        login lg = new login();
        lg.show();
        dispose();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        int dialog = JOptionPane.showConfirmDialog(null, "Do you want to delete ALL Records","Warning",JOptionPane.YES_NO_OPTION);
        if(dialog==JOptionPane.YES_OPTION){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","123456");
                insert=con.prepareStatement("truncate "+lg);
                //insert.setString(1, lg);
                insert.executeUpdate();

                JOptionPane.showMessageDialog(this,"All record deleted");
                table_update();
                
                txtname2.setText("");
                txtmobile2.setText("");
                txtcourse2.setText("");
                txtaddress2.setText("");
                txtname2.requestFocus();

            } catch (SQLException ex) {
                Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddressActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel df= (DefaultTableModel) jTable1.getModel();

        int selectedIndex =jTable1.getSelectedRow();

        try {

            int id = Integer.parseInt(df.getValueAt(selectedIndex, 0).toString());

            int dialog = JOptionPane.showConfirmDialog(null, "Do you want to delete the SELECTED Record","Warning",JOptionPane.YES_NO_OPTION);
            if(dialog==JOptionPane.YES_OPTION){
                Class.forName("com.mysql.cj.jdbc.Driver");
                try {
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","123456");
                    insert=con.prepareStatement("delete from "+lg+" where id=?");
                    //insert.setString(1,lg);
                    insert.setInt(1,id);

                    insert.executeUpdate();

                    JOptionPane.showMessageDialog(this,"Record Deleted");

                    txtname2.setText("");
                    txtmobile2.setText("");
                    txtcourse2.setText("");
                    txtaddress2.setText("");
                    txtname2.requestFocus();
                    table_update();
                    
                } catch (SQLException ex) {
                    Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{

            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel df= (DefaultTableModel) jTable1.getModel();

        int selectedIndex =jTable1.getSelectedRow();

        try {

            int id = Integer.parseInt(df.getValueAt(selectedIndex, 0).toString());
            String name = txtname2.getText();
            String mobile = txtmobile2.getText();
            String  course= txtcourse2.getText();
            String address= txtaddress2.getText();
            Class.forName("com.mysql.cj.jdbc.Driver");

            try {
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","123456");
                insert=con.prepareStatement("update "+lg+" set name= ?,mobile =?,course=?,address=? where id=?");
                //insert.setString(1, lg);
                insert.setString(1,name);

                insert.setString(2, mobile);

                insert.setString(3, course);
                insert.setString(4, address);
                insert.setInt(5,id);

                insert.executeUpdate();

                JOptionPane.showMessageDialog(this,"Record updated");
                table_update();
                txtname2.setText("");
                txtmobile2.setText("");
                txtcourse2.setText("");
                txtaddress2.setText("");

                txtname2.requestFocus();
                
            } catch (SQLException ex) {
                Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        String name = txtname2.getText();
        String mobile = txtmobile2.getText();
        String  course= txtcourse2.getText();
        String address= txtaddress2.getText();
        if(name != null && mobile != null && course != null && address != null){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","123456");
            insert=con.prepareStatement("insert into "+lg+" (name ,mobile,course,address) values (?,?,?,?)");
            //String table="paras";
              insert.setString(1,name);

                insert.setString(2, mobile);

                insert.setString(3, course);
                insert.setString(4, address);
            insert.executeUpdate();

            JOptionPane.showMessageDialog(this,"Record Added");
            table_update();
            txtname2.setText("");
            txtmobile2.setText("");
            txtcourse2.setText("");
            txtaddress2.setText("");
            txtname2.requestFocus();
            
        } catch (SQLException ex) {
            Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);
             
        }
      }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcourseActionPerformed

    private void txtmobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmobileActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         DefaultTableModel df= (DefaultTableModel) jTable1.getModel();

         int selectedIndex =jTable1.getSelectedRow();
         
         txtname2.setText(df.getValueAt(selectedIndex, 1).toString());
         txtmobile2.setText(df.getValueAt(selectedIndex, 2).toString());
         txtcourse2.setText(df.getValueAt(selectedIndex, 3).toString());
         txtaddress2.setText(df.getValueAt(selectedIndex, 4).toString());
             
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtdelaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdelaccActionPerformed
        // TODO add your handling code here:
         try {

            

            int dialog = JOptionPane.showConfirmDialog(null, "Do you want to delete you Account","Warning",JOptionPane.YES_NO_OPTION);
            if(dialog==JOptionPane.YES_OPTION){
                Class.forName("com.mysql.cj.jdbc.Driver");
                try {
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","123456");
                    insert=con.prepareStatement("drop table "+lg);
                    insert3=con.prepareStatement("delete from signup where username = ?");
                    insert3.setString(1,lg);
                    //insert.setInt(1,id);

                    insert.executeUpdate();
                    insert3.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Account Deleted");

                  // table_update();
                   
                   signup sg = new signup();
                   sg.show();
                   dispose();
                    
                } catch (SQLException ex) {
                    Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{

            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtdelaccActionPerformed
      
//       private void name() {
//            login lg = new login();
//           // System.out.println(lg.lgname);
//           String l = lg.lgname;
//            txtuserin.setText("Welcome..."+l);   
//            
//       }
       
              
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reg("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtaddress2;
    private javax.swing.JTextField txtcourse2;
    private javax.swing.JButton txtdelacc;
    private javax.swing.JTextField txtmobile2;
    private javax.swing.JTextField txtname2;
    // End of variables declaration//GEN-END:variables
}
