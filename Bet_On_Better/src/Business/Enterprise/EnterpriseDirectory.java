/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author devma
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if(type.equals(Enterprise.EnterpriseType.FundRaiser)){
            enterprise = new FundRaisingEnterprise(name);
            enterpriseList.add(enterprise);
        }else if(type.equals(Enterprise.EnterpriseType.Bank)){
            enterprise = new BankEnterprise(name);
            enterpriseList.add(enterprise);
        }else if(type.equals(Enterprise.EnterpriseType.Advertising)){
            enterprise = new AdvertisingEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
