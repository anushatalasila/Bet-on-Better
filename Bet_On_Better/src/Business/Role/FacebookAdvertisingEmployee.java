/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.AdvertisingEmployee.AdvertisingEmployeeAccountDirectory;
import Business.BankEmployee.BankEmployeeAccountDirectory;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.FundRaiserEvents.EventDirectory;
import Business.FundRaisingEmployee.FundRaisingEmployeeAccountDirectory;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import UserInterface.AdvertisingAdminRole.AdminAdvertisingLeftJPanel;
import UserInterface.AdvertisingAdminRole.AdminAdvertisingWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Urvashi
 */
public class FacebookAdvertisingEmployee extends Role{

    @Override
    public JPanel createRightWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, EventDirectory eventdirectory) {
        return new AdminAdvertisingWorkAreaJPanel(userProcessContainer, enterprise, eventdirectory);
    }

    @Override
    public JPanel createLeftWorkArea(JPanel leftContainer, JPanel rightContainer, UserAccountDirectory userAccountDirectory,
            EventDirectory eventdirectory, BankEmployeeAccountDirectory bankemployeeAccountDirectory, 
            FundRaisingEmployeeAccountDirectory fundraisingemployeeAccountDirectory, 
            AdvertisingEmployeeAccountDirectory advertisingemployeeAccountDirectory, 
            EcoSystem business, DB4OUtil dB4OUtil, Enterprise enterprise, UserAccount account) {
        return new AdminAdvertisingLeftJPanel(leftContainer, rightContainer, userAccountDirectory, enterprise, eventdirectory, advertisingemployeeAccountDirectory, bankemployeeAccountDirectory, fundraisingemployeeAccountDirectory, business, dB4OUtil);
    }
    
}
