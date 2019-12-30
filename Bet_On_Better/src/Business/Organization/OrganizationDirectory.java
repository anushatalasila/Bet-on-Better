/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 *  @author Urvashi
 */
public class OrganizationDirectory {
  private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(String name,Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.AccVerif.getValue())){
            organization = new AccountVerificationOrganization();
            organization.setOrganizationType(type);
            organization.setName(name);
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.Email.getValue())){
            organization = new EmailOrganization();
            organization.setOrganizationType(type);
            organization.setName(name);
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.Facebook.getValue())){
            organization = new FacebookOrganization();
            organization.setOrganizationType(type);
            organization.setName(name);
            organizationList.add(organization);
         }else if (type.getValue().equals(Organization.Type.FundRaisingEvents.getValue())){
            organization = new FundRaisingEventsOrganization();
            organization.setOrganizationType(type);
            organization.setName(name);
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.FundTransfer.getValue())){
            organization = new FundTransferOrganization();
            organization.setOrganizationType(type);
            organization.setName(name);
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.Initiatives.getValue())){
            organization = new InitiativesOrganization();
            organization.setOrganizationType(type);
            organization.setName(name);
            organizationList.add(organization);
        }
        return organization;
    }  
}
