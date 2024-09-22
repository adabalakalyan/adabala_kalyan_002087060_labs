/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.VitalSigns;
import model.VitalSignsHistory;

/**
 *
 * @author nanik
 */
public class CreateJPanel extends javax.swing.JPanel {
    
    VitalSignsHistory vitalSignsHistory;

    /**
     * Creates new form CreateJPanel
     */
    public CreateJPanel(VitalSignsHistory vitalSignsHistory) {
        initComponents();
        this.vitalSignsHistory = vitalSignsHistory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        txtTemperature = new javax.swing.JTextField();
        lblTemperature = new javax.swing.JLabel();
        txtBloodPressure = new javax.swing.JTextField();
        lblBloodPressure = new javax.swing.JLabel();
        txtPulse = new javax.swing.JTextField();
        lblPulse = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        lblDate = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setText("Create Vital Signs");

        lblTemperature.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTemperature.setText("Temperature:");

        lblBloodPressure.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblBloodPressure.setText("Blood Pressure:");

        txtPulse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPulseActionPerformed(evt);
            }
        });

        lblPulse.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPulse.setText("Pulse:");

        lblDate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDate.setText("Date:");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(283, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTemperature, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblBloodPressure, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPulse, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDate, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSave)
                            .addComponent(txtTemperature)
                            .addComponent(txtBloodPressure)
                            .addComponent(txtPulse)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(274, 274, 274))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblBloodPressure, lblDate, lblPulse, lblTemperature});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTemperature))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBloodPressure))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPulse))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDate))
                .addGap(29, 29, 29)
                .addComponent(btnSave)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblBloodPressure, lblDate, lblPulse, lblTemperature});

    }// </editor-fold>//GEN-END:initComponents

    private void txtPulseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPulseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPulseActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:'
        
        Double temperature = Double.parseDouble(txtTemperature.getText());
        Double bloodPressure = Double.parseDouble(txtBloodPressure.getText());
        int pulse = Integer.parseInt(txtPulse.getText());
        String date = txtDate.getText();
        
        VitalSigns newVs = vitalSignsHistory.addNewVitals();
        
        newVs.setTemperature(temperature);
        newVs.setBloodpressure(bloodPressure);
        newVs.setPulse(pulse);
        newVs.setDate(date);
        
        //confirmation dialogue box
        JOptionPane.showMessageDialog(this, "New Vital Signs Created", "Success", JOptionPane.INFORMATION_MESSAGE);
        
        txtTemperature.setText("");
        txtBloodPressure.setText("");
        txtDate.setText("");
        txtPulse.setText("");
       
        
        
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblPulse;
    private javax.swing.JLabel lblTemperature;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration//GEN-END:variables
}