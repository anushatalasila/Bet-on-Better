/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EndUser;

/**
 *
 * @author devma
 */
public class AccountDetails {
    private String Name;
    private String BankName;
    private Integer AccountNumber;
    private Integer RoutingNumber;
    private Integer SWIFTCode;
    private String BankAddress;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String BankName) {
        this.BankName = BankName;
    }

    public Integer getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(Integer AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

    public Integer getRoutingNumber() {
        return RoutingNumber;
    }

    public void setRoutingNumber(Integer RoutingNumber) {
        this.RoutingNumber = RoutingNumber;
    }

    public Integer getSWIFTCode() {
        return SWIFTCode;
    }

    public void setSWIFTCode(Integer SWIFTCode) {
        this.SWIFTCode = SWIFTCode;
    }

    public String getBankAddress() {
        return BankAddress;
    }

    public void setBankAddress(String BankAddress) {
        this.BankAddress = BankAddress;
    }
    
    
}
