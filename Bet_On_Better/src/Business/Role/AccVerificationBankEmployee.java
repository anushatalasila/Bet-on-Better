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
import UserInterface.AdvertisingAdminRole.AdminAdvertisingWorkAreaJPanel;
import UserInterface.BankRole.BankDashBoardJPanel;
import UserInterface.BankRole.BankLeftJPanel;
import UserInterface.FundRaisingAdminRole.AdminLeftJPanel;
import javax.swing.JPanel;

/**
 *
 * @author MMI
 */


    public class AccVerificationBankEmployee extends Role{
        
    @Override
    public JPanel createRightWorkArea(JPanel container, UserAccount account, 
            Organization organization, Enterprise enterprise, EcoSystem business, EventDirectory eventdirectory) {
        return new BankDashBoardJPanel(container, account, business, enterprise);
    }
    
    @Override
    public JPanel createLeftWorkArea(JPanel leftContainer, JPanel rightContainer, UserAccountDirectory userAccountDirectory, 
                EventDirectory eventdirectory, BankEmployeeAccountDirectory bankemployeeAccountDirectory, 
                FundRaisingEmployeeAccountDirectory fundraisingemployeeAccountDirectory, 
                AdvertisingEmployeeAccountDirectory advertisingemployeeAccountDirectory, EcoSystem business, 
                DB4OUtil dB4OUtil, Enterprise enterprise, UserAccount account) {
        return new BankLeftJPanel(leftContainer, rightContainer, userAccountDirectory, eventdirectory, bankemployeeAccountDirectory, 
                fundraisingemployeeAccountDirectory, advertisingemployeeAccountDirectory, business, dB4OUtil, enterprise, account);
        
    }
}
    

