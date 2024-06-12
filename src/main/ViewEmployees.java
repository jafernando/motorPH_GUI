/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main;

import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADRIAN
 */
public class ViewEmployees extends javax.swing.JPanel {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    Statement s = null;
    
    public ViewEmployees(){
        initComponents();
        MyConnection myConnection = new MyConnection();
        conn = myConnection.getConnection();
        tbload();
    }

    
    public void tbload(){
        
     try {
        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
        dt.setRowCount(0);
        
        String query = "SELECT * FROM `motorph employee data`";
        
        // Create a PreparedStatement
        PreparedStatement ps = conn.prepareStatement(query);
        
        // Execute the query
        ResultSet rs = ps.executeQuery();
        
        // Iterate over the result set and add rows to the table model
        while (rs.next()) {
            Vector row = new Vector();
            row.add(rs.getInt(1));
            row.add(rs.getString(4));
            row.add(rs.getString(5));
            row.add(rs.getString(6));
            row.add(rs.getString(7));
            row.add(rs.getString(8));
            row.add(rs.getString(9));
            row.add(rs.getString(10));
            row.add(rs.getString(11));
            row.add(rs.getString(12));
            row.add(rs.getString(13));
            row.add(rs.getString(14));
            row.add(rs.getString(15));
            dt.addRow(row);
        }
 
    } catch (SQLException e) {
        // Handle any SQL exceptions
        e.printStackTrace();
    }
}
            
            
            
            
            
            
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelBDay = new javax.swing.JLabel();
        jLabelFirstName = new javax.swing.JLabel();
        jLabelLastName = new javax.swing.JLabel();
        jLabelPHno = new javax.swing.JLabel();
        jTextFieldFirstName = new javax.swing.JTextField();
        jTextFieldLastName = new javax.swing.JTextField();
        jTextFieldPhone = new javax.swing.JTextField();
        jTextFieldBday = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonDelete = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        Address = new javax.swing.JLabel();
        jTextFieldAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldSSSNo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldTINNo = new javax.swing.JTextField();
        jTextFieldPhilhealthNo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldPagIbigNo = new javax.swing.JTextField();
        jLabelStatus = new javax.swing.JLabel();
        jLabelStatus1 = new javax.swing.JLabel();
        jLabelStatus2 = new javax.swing.JLabel();
        jComboBoxStatus = new javax.swing.JComboBox<>();
        jComboBoxPosition = new javax.swing.JComboBox<>();
        jComboBoxSupv = new javax.swing.JComboBox<>();
        jTextFieldEmpNo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButtonReset = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(24, 154, 180));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE EMPLOYEE INFORMATION");

        jLabelBDay.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabelBDay.setText("BIRTHDATE :");

        jLabelFirstName.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabelFirstName.setText("FIRST NAME :");

        jLabelLastName.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabelLastName.setText("LAST NAME :");

        jLabelPHno.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabelPHno.setText("PHONE NUMBER :");

        jTextFieldFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFirstNameActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Employee #", "Last Name", "First Name", "Birthday", "Address", "Phone Number", "SSS #", "Philhealth #", "TIN #", "Pag-ibig #", "Status", "Position", "Immediate Supervisory"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButtonDelete.setText("DELETE");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonAdd.setText("ADD");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonUpdate.setText("UPDATE");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        Address.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Address.setText("ADDRESS :");

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel7.setText("SSS Number :");

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel8.setText("TIN Number :");

        jTextFieldTINNo.setPreferredSize(new java.awt.Dimension(62, 22));

        jTextFieldPhilhealthNo.setPreferredSize(new java.awt.Dimension(62, 22));

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel9.setText("PhilHealth Number :");

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel10.setText("Pag-Ibig Number :");

        jTextFieldPagIbigNo.setPreferredSize(new java.awt.Dimension(62, 22));

        jLabelStatus.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabelStatus.setText("SUPERVISOR :");

        jLabelStatus1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabelStatus1.setText("STATUS :");

        jLabelStatus2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabelStatus2.setText("POSITION :");

        jComboBoxStatus.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Regular", "Probationary" }));
        jComboBoxStatus.setPreferredSize(new java.awt.Dimension(62, 22));

        jComboBoxPosition.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jComboBoxPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chief Executive Officer", "Chief Operating Officer", "Chief Finance Officer", "Chief Marketing Officer", "IT Operations and Systems", "HR Manager", "HR Team Leader", "HR Rank and File", "Accounting Head", "Payroll Manager", "Payroll Team Leader", "Payroll Rank and File", "Account Manager", "Account Team Leader", "Account Rank and File", "Sales & Marketing", "Supply Chain and Logistics", "Customer Service and Relations" }));
        jComboBoxPosition.setPreferredSize(new java.awt.Dimension(62, 22));

        jComboBoxSupv.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jComboBoxSupv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "Garcia, Manuel III", "Lim, Antonio", "Villanueva, Andrea Mae", "San, Jose Brad", "Aquino, Bianca Sofia", "Alvaro, Roderick", "Salcedo, Anthony", "Romualdez, Fredrick", "Mata, Christian", "De Leon, Selena", "Reyes, Isabella" }));
        jComboBoxSupv.setPreferredSize(new java.awt.Dimension(62, 22));
        jComboBoxSupv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSupvActionPerformed(evt);
            }
        });

        jTextFieldEmpNo.setPreferredSize(new java.awt.Dimension(62, 22));

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel11.setText("EMP NO. :");

        jButtonReset.setText("CLEAR");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldSSSNo, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabelFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabelLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabelBDay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Address, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabelPHno, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextFieldAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jTextFieldBday, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jTextFieldLastName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldEmpNo, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldPhilhealthNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextFieldTINNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldPagIbigNo, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabelStatus1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabelStatus2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(9, 9, 9)))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jComboBoxSupv, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBoxPosition, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBoxStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(13, 13, 13))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonReset)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 947, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEmpNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelBDay, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldBday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPHno, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldSSSNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTINNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPhilhealthNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPagIbigNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(jLabelStatus2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxSupv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonDelete)
                            .addComponent(jButtonUpdate)
                            .addComponent(jButtonAdd)
                            .addComponent(jButtonReset))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        int i = jTable1.getSelectedRow();
        
        String firstName = jTable1.getValueAt(i, 2).toString();
        String lastName = jTable1.getValueAt(i, 1).toString();
        String birthday = jTable1.getValueAt(i, 3).toString();
        String phoneNum = jTable1.getValueAt(i, 5).toString();
        String address = jTable1.getValueAt(i, 4).toString();
        String SSS = jTable1.getValueAt(i, 6).toString();
        String TIN = jTable1.getValueAt(i, 8).toString();
        String philhealth = jTable1.getValueAt(i, 7).toString();
        String pagibig = jTable1.getValueAt(i, 9).toString();
        String empno = jTable1.getValueAt(i, 0).toString();
        String status = jTable1.getValueAt(i, 10).toString();
        String position = jTable1.getValueAt(i, 11).toString();
        String supervisor = jTable1.getValueAt(i, 12).toString();
        
        jTextFieldFirstName.setText(firstName);
        jTextFieldLastName.setText(lastName);
        jTextFieldBday.setText(birthday);
        jTextFieldPhone.setText(phoneNum);
        jTextFieldAddress.setText(address);
        
        jTextFieldSSSNo.setText(SSS);
        jTextFieldTINNo.setText(TIN);
        jTextFieldPhilhealthNo.setText(philhealth);
        jTextFieldPagIbigNo.setText(pagibig);
        
        jTextFieldEmpNo.setText(empno);
        jComboBoxStatus.setSelectedItem(status);
        jComboBoxPosition.setSelectedItem(position);
        jComboBoxSupv.setSelectedItem(supervisor);
        
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        String empno = jTextFieldEmpNo.getText();
    
    if (empno.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter Employee # to delete.");
        return;
    }
    
    int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this record?", "Confirmation", JOptionPane.YES_NO_OPTION);
    if (option == JOptionPane.YES_OPTION) {
        try {
            String sql = "DELETE FROM `motorph employee data` WHERE `Employee #` = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, empno);
            int deleted = ps.executeUpdate();
            
            if (deleted > 0) {
                JOptionPane.showMessageDialog(null, "Employee Record Deleted Successfully!");
                
                
                jTextFieldFirstName.setText("");
                jTextFieldLastName.setText("");
                jTextFieldBday.setText("");
                jTextFieldPhone.setText("");
                jTextFieldAddress.setText("");
                jTextFieldSSSNo.setText("");
                jTextFieldTINNo.setText("");
                jTextFieldPhilhealthNo.setText("");
                jTextFieldPagIbigNo.setText("");
                jTextFieldEmpNo.setText("");
                tbload();
                
            } else {
                JOptionPane.showMessageDialog(null, "Failed to delete Employee Record.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jComboBoxSupvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSupvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSupvActionPerformed

    private void jTextFieldFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFirstNameActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
         
      
        try {
      
            String firstName = jTextFieldFirstName.getText();
            String lastName = jTextFieldLastName.getText();
            String birthday = jTextFieldBday.getText();
            String phoneNum = jTextFieldPhone.getText();
            String address = jTextFieldAddress.getText();
            String SSS = jTextFieldSSSNo.getText();
            String TIN = jTextFieldTINNo.getText();
            String philhealth = jTextFieldPhilhealthNo.getText();
            String pagibig = jTextFieldPagIbigNo.getText();
            String empno = jTextFieldEmpNo.getText();
            String status = (String) jComboBoxStatus.getSelectedItem();
            String position = (String) jComboBoxPosition.getSelectedItem();
            String supervisor = (String) jComboBoxSupv.getSelectedItem();

            String sql = "INSERT INTO `motorph employee data` (`Employee #`, `Last Name`, `First Name`, `Birthday`, `Address`, `Phone Number`, `SSS #`, `Philhealth #`, `TIN #`, `Pag-ibig #`, `Status`, `Position`, `Immediate Supervisor`) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

                
            ps = conn.prepareStatement(sql);
                
                ps.setString(1, empno);
                ps.setString(2, lastName);
                ps.setString(3, firstName);
                ps.setString(4, birthday);
                ps.setString(5, address);
                ps.setString(6, phoneNum);
                ps.setString(7, SSS);
                ps.setString(8, philhealth);
                ps.setString(9, TIN);
                ps.setString(10, pagibig);
                ps.setString(11, status);
                ps.setString(12, position);
                ps.setString(13, supervisor);
                
                ps.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Employee Record Added Sucessfully!");
                tbload();
              
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
       
            }
        
        
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
            
            jTextFieldFirstName.setText("");
            jTextFieldLastName.setText("");
            jTextFieldBday.setText("");
            jTextFieldPhone.setText("");
            jTextFieldAddress.setText("");
            jTextFieldSSSNo.setText("");
            jTextFieldTINNo.setText("");
            jTextFieldPhilhealthNo.setText("");
            jTextFieldPagIbigNo.setText("");
            jTextFieldEmpNo.setText("");
            
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
            
            try {
      
            String firstName = jTextFieldFirstName.getText();
            String lastName = jTextFieldLastName.getText();
            String birthday = jTextFieldBday.getText();
            String phoneNum = jTextFieldPhone.getText();
            String address = jTextFieldAddress.getText();
            String SSS = jTextFieldSSSNo.getText();
            String TIN = jTextFieldTINNo.getText();
            String philhealth = jTextFieldPhilhealthNo.getText();
            String pagibig = jTextFieldPagIbigNo.getText();
            String empno = jTextFieldEmpNo.getText();
            String status = (String) jComboBoxStatus.getSelectedItem();
            String position = (String) jComboBoxPosition.getSelectedItem();
            String supervisor = (String) jComboBoxSupv.getSelectedItem();

            String sql = "UPDATE `motorph employee data` SET `Last Name` = ?, `First Name` = ?, `Birthday` = ?, `Address` = ?, `Phone Number` = ?, `SSS #` = ?, `Philhealth #` = ?, "
                    + "`TIN #` = ?, `Pag-ibig #` = ?, `Status` = ?, `Position` = ?, `Immediate Supervisor` = ? WHERE `Employee #` = ?";

                
            ps = conn.prepareStatement(sql);
                
                ps.setString(1, empno);
                ps.setString(2, lastName);
                ps.setString(3, firstName);
                ps.setString(4, birthday);
                ps.setString(5, address);
                ps.setString(6, phoneNum);
                ps.setString(7, SSS);
                ps.setString(8, philhealth);
                ps.setString(9, TIN);
                ps.setString(10, pagibig);
                ps.setString(11, status);
                ps.setString(12, position);
                ps.setString(13, supervisor);
                
                ps.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Employee Record Updated Sucessfully!");
              
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
       
            }
        
        
    }//GEN-LAST:event_jButtonUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBoxPosition;
    private javax.swing.JComboBox<String> jComboBoxStatus;
    private javax.swing.JComboBox<String> jComboBoxSupv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelBDay;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelPHno;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelStatus1;
    private javax.swing.JLabel jLabelStatus2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldBday;
    private javax.swing.JTextField jTextFieldEmpNo;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldPagIbigNo;
    private javax.swing.JTextField jTextFieldPhilhealthNo;
    private javax.swing.JTextField jTextFieldPhone;
    private javax.swing.JTextField jTextFieldSSSNo;
    private javax.swing.JTextField jTextFieldTINNo;
    // End of variables declaration//GEN-END:variables
}
