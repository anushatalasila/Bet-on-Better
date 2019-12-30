/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.CreateEventByOrganizationEmployeeDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 *  @author Urvashi
 */
public abstract class Organization {
    private String name;
    private WorkQueue workQueue;
    private CreateEventByOrganizationEmployeeDirectory createEventByOrganizationEmployeeDirectory;
    private Type organizationType;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;

    public CreateEventByOrganizationEmployeeDirectory getCreateEventByOrganizationEmployeeDirectory() {
        return createEventByOrganizationEmployeeDirectory;
    }

    public void setCreateEventByOrganizationEmployeeDirectory(CreateEventByOrganizationEmployeeDirectory createEventByOrganizationEmployeeDirectory) {
        this.createEventByOrganizationEmployeeDirectory = createEventByOrganizationEmployeeDirectory;
    }

    public enum Type{
        AccVerif("Account Verification Organization"), Email("Email Organization"), Facebook("Facebook Organization"),
        FundRaisingEvents("Fund Raising Events Organization"),FundTransfer("Fund Transfer Organization"), Initiatives ("Initiatives Organization");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        //employeeDirectory = new EmployeeDirectory();
        createEventByOrganizationEmployeeDirectory = new CreateEventByOrganizationEmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public Type getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(Type organizationType) {
        this.organizationType = organizationType;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    } 
}
