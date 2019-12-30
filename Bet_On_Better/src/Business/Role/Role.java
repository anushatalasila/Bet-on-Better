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
import javax.swing.JPanel;

/**
 *
 * @author devma
 */
public abstract class Role {
    public enum RoleType{
        Admin("Admin"), User("User"), BankEmployee("Bank Employee"), 
        AdvertisingEmployee("Advertising Employee"), FundRaisingEmployee("FundRaising Employee"), InitiativesEmployee("Initiatives Employee");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createRightWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business, EventDirectory eventdirectory);
    
    public abstract JPanel createLeftWorkArea(JPanel leftContainer, JPanel rightContainer, UserAccountDirectory userAccountDirectory, 
                EventDirectory eventdirectory, BankEmployeeAccountDirectory bankemployeeAccountDirectory, 
                FundRaisingEmployeeAccountDirectory fundraisingemployeeAccountDirectory, 
                AdvertisingEmployeeAccountDirectory advertisingemployeeAccountDirectory, EcoSystem business, 
                DB4OUtil dB4OUtil, Enterprise enterprise, UserAccount account);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
