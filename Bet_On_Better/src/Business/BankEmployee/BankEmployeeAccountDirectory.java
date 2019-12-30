/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BankEmployee;

import Business.FundRaisingEmployee.FundRaisingEmployeeAccount;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author devma
 */
public class BankEmployeeAccountDirectory {
    private ArrayList<BankEmployeeAccount> employeeAccountList;

    public BankEmployeeAccountDirectory() {
        employeeAccountList = new ArrayList();
    }

    public ArrayList<BankEmployeeAccount> getEmployeeAccountList() {
        return employeeAccountList;
    }
    
    public BankEmployeeAccount authenticateEmployee(String username, String password){
        for (BankEmployeeAccount be : employeeAccountList)
            if (be.getUsername().equals(username) && be.getPassword().equals(password)){
                return be;
            }
        return null;
    }
    
    public BankEmployeeAccount createEmployeeAccount(String username, String password, Role role){
        BankEmployeeAccount employeeAccount = new BankEmployeeAccount();
        employeeAccount.setUsername(username);
        employeeAccount.setPassword(password);
        employeeAccount.setRole(role);
        employeeAccountList.add(employeeAccount);
        return employeeAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (BankEmployeeAccount be : employeeAccountList){
            if (be.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
}
