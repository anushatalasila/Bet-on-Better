/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FundTransferBankEmployee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author devma
 */
public class AccountVerificationOrganization extends Organization{
    public AccountVerificationOrganization() {
        super(Organization.Type.AccVerif.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FundTransferBankEmployee());
        return roles;
    }
}
