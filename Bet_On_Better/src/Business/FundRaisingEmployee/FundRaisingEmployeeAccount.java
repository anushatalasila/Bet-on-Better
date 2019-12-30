/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FundRaisingEmployee;

import Business.Role.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author devma
 */
public class FundRaisingEmployeeAccount {
  private String name;
    private String username;
    private String password;
    private Role role;
    private WorkQueue workQueue;

    public FundRaisingEmployeeAccount() {
        workQueue = new WorkQueue();
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    @Override
    public String toString() {
        return username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }  
}
