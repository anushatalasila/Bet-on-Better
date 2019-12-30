/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FundraisingEventEmployee;

import Business.AdvertisingEmployee.AdvertisingEmployeeAccountDirectory;
import Business.BankEmployee.BankEmployeeAccountDirectory;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.FundRaisingEmployee.FundRaisingEmployeeAccountDirectory;
import Business.FundRaiserEvents.EventDirectory;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import UserInterface.UserLogin;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author MMI
 */
public class FundraisingEventEmployeeLeftJPanel extends javax.swing.JPanel  {

    private JPanel leftContainer;
    private JPanel rightContainer;
    private UserAccountDirectory userAccountDirectory;
    private EventDirectory eventdirectory;
    private BankEmployeeAccountDirectory bankemployeeAccountDirectory;
    private FundRaisingEmployeeAccountDirectory fundraisingemployeeAccountDirectory;
    private AdvertisingEmployeeAccountDirectory advertisingemployeeAccountDirectory;
    private EcoSystem system;
    private DB4OUtil dB4OUtil;
    private UserAccount useraccount;
     private Enterprise enterprise;

    /**
     * Creates new form FundraisingEventEmployeeLeftJPanel
     */
    public FundraisingEventEmployeeLeftJPanel(JPanel leftContainer, JPanel rightContainer, 
            UserAccountDirectory userAccountDirectory, EventDirectory eventdirectory, 
            BankEmployeeAccountDirectory bankemployeeAccountDirectory, 
            FundRaisingEmployeeAccountDirectory fundraisingemployeeAccountDirectory, 
            AdvertisingEmployeeAccountDirectory advertisingemployeeAccountDirectory, EcoSystem business, DB4OUtil dB4OUtil, Enterprise enterprise, UserAccount userAccount) {
        initComponents();
        this.leftContainer = leftContainer;
        this.rightContainer = rightContainer;
        this.userAccountDirectory = userAccountDirectory;
        this.eventdirectory = eventdirectory;
        this.bankemployeeAccountDirectory = bankemployeeAccountDirectory;
        this.advertisingemployeeAccountDirectory = advertisingemployeeAccountDirectory;
        this.fundraisingemployeeAccountDirectory = fundraisingemployeeAccountDirectory;
        this.enterprise = enterprise;
        this.dB4OUtil = dB4OUtil; 
        this.system = business;
        this.useraccount = userAccount;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnHome = new javax.swing.JButton();
        btnPendingRequests = new javax.swing.JButton();
        btnApprovedRequests = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnAssignedReq = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

        btnHome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnPendingRequests.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPendingRequests.setText("Pending Requests");
        btnPendingRequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPendingRequestsActionPerformed(evt);
            }
        });

        btnApprovedRequests.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnApprovedRequests.setText("Approved Requests");
        btnApprovedRequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApprovedRequestsActionPerformed(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnAssignedReq.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAssignedReq.setText("Assigned Requests");
        btnAssignedReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignedReqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAssignedReq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnApprovedRequests, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPendingRequests, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btnHome)
                .addGap(50, 50, 50)
                .addComponent(btnPendingRequests)
                .addGap(45, 45, 45)
                .addComponent(btnApprovedRequests)
                .addGap(45, 45, 45)
                .addComponent(btnAssignedReq)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        rightContainer.remove(this);
        CardLayout rightCardLayout = (CardLayout) rightContainer.getLayout();
        rightContainer.add("FundraisingEventEmployeeHomePanel", new FundraisingEventEmployeeHomePanel(rightContainer, eventdirectory));
        rightCardLayout.next(rightContainer);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnPendingRequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPendingRequestsActionPerformed
        // TODO add your handling code here:
         rightContainer.remove(this);
        CardLayout rightCardLayout = (CardLayout) rightContainer.getLayout();
        rightContainer.add("FundraisingEventsPendingRequests", new FundraisingEventsPendingRequests(rightContainer, eventdirectory,enterprise,useraccount));
        rightCardLayout.next(rightContainer);
    }//GEN-LAST:event_btnPendingRequestsActionPerformed

    private void btnApprovedRequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApprovedRequestsActionPerformed
        // TODO add your handling code here:
        rightContainer.remove(this);
        CardLayout rightCardLayout = (CardLayout) rightContainer.getLayout();
        rightContainer.add("FundraisingEventApprovedRequests", new FundraisingEventApprovedRequests(rightContainer, eventdirectory));
        rightCardLayout.next(rightContainer);

    }//GEN-LAST:event_btnApprovedRequestsActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        CardLayout leftCardLayout = (CardLayout) leftContainer.getLayout();
        CardLayout rightCardLayout = (CardLayout) rightContainer.getLayout();
        leftContainer.add("UserLogin", new UserLogin(leftContainer, rightContainer,
                userAccountDirectory, eventdirectory, fundraisingemployeeAccountDirectory,
                advertisingemployeeAccountDirectory, bankemployeeAccountDirectory, system, dB4OUtil));
        leftCardLayout.next(leftContainer);
        rightContainer.removeAll();
        JPanel blank = new JPanel();
        rightContainer.add("blank", blank);
        rightCardLayout.next(rightContainer);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnAssignedReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignedReqActionPerformed
        // TODO add your handling code here:
        rightContainer.remove(this);
        CardLayout rightCardLayout = (CardLayout) rightContainer.getLayout();
        rightContainer.add("FundraisingEventAssignedWorkPanel", new FundraisingEventAssignedWorkPanel(rightContainer, enterprise, useraccount, system));
        rightCardLayout.next(rightContainer);
    }//GEN-LAST:event_btnAssignedReqActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprovedRequests;
    private javax.swing.JButton btnAssignedReq;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPendingRequests;
    // End of variables declaration//GEN-END:variables
}