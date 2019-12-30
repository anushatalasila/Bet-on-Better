/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AdvertisingEmployee;

//import Business.FundRaisingEmployee.FundRaisingEmployeeAccount;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author devma
 */
public class AdvertisingEmployeeAccountDirectory {
    private ArrayList<AdvertisingEmployeeAccount> employeeAccountList;

    public AdvertisingEmployeeAccountDirectory() {
        employeeAccountList = new ArrayList();
    }

    public ArrayList<AdvertisingEmployeeAccount> getEmployeeAccountList() {
        return employeeAccountList;
    }
    
    public AdvertisingEmployeeAccount authenticateEmployee(String username, String password){
        for (AdvertisingEmployeeAccount ae : employeeAccountList)
            if (ae.getUsername().equals(username) && ae.getPassword().equals(password)){
                return ae;
            }
        return null;
    }
    
    public AdvertisingEmployeeAccount createEmployeeAccount(String username, String password, Role role){
        AdvertisingEmployeeAccount employeeAccount = new AdvertisingEmployeeAccount();
        employeeAccount.setUsername(username);
        employeeAccount.setPassword(password);
        employeeAccount.setRole(role);
        employeeAccountList.add(employeeAccount);
        return employeeAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (AdvertisingEmployeeAccount ae : employeeAccountList){
            if (ae.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
}
