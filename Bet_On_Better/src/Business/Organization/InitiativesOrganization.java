/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FundRaisingAdmin;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author MMI
 */
public class InitiativesOrganization extends Organization {
  public  InitiativesOrganization(){
      super(Organization.Type.Initiatives.getValue());
  }  

  @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FundRaisingAdmin());
        return roles;
    }
   
}
