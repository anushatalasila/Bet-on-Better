/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FundRaisingEmployee;

import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author devma
 */
public class FundRaisingEmployeeAccountDirectory {
    private ArrayList<FundRaisingEmployeeAccount> employeeAccountList;

    public FundRaisingEmployeeAccountDirectory() {
        employeeAccountList = new ArrayList();
    }

    public ArrayList<FundRaisingEmployeeAccount> getEmployeeAccountList() {
        return employeeAccountList;
    }
    
    public FundRaisingEmployeeAccount authenticateEmployee(String username, String password){
        for (FundRaisingEmployeeAccount ea : employeeAccountList)
            if (ea.getUsername().equals(username) && ea.getPassword().equals(password)){
                return ea;
            }
        return null;
    }
    
    public FundRaisingEmployeeAccount createEmployeeAccount(String username, String password, Role role){
        FundRaisingEmployeeAccount employeeAccount = new FundRaisingEmployeeAccount();
        employeeAccount.setUsername(username);
        employeeAccount.setPassword(password);
        employeeAccount.setRole(role);
        employeeAccountList.add(employeeAccount);
        return employeeAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (FundRaisingEmployeeAccount ea : employeeAccountList){
            if (ea.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
}
