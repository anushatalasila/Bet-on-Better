/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.EndUser.DonationDirectory;
import Business.FundRaiserEvents.EventDirectory;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author devma
 */
public abstract class Enterprise extends Organization{
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private EventDirectory eventDirectory;
    private DonationDirectory donationDirectory;

    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDirectory = new OrganizationDirectory();
        eventDirectory = new EventDirectory();
    }

    public enum EnterpriseType{
        FundRaiser("FundRaiser"), Bank("Bank"), Advertising("Advertising");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public EventDirectory getEventDirectory() {
        return eventDirectory;
    }
    
    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
   
    public void setEventDirectory(EventDirectory eventDirectory) {
        this.eventDirectory = eventDirectory;
    }

    public DonationDirectory getDonationDirectory() {
        return donationDirectory;
    }

    public void setDonationDirectory(DonationDirectory donationDirectory) {
        this.donationDirectory = donationDirectory;
    }
}
