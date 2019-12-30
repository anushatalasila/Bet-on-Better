/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkRequest.CreateEventByOrganizationEmployee;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author MMI
 */
public class CreateEventByOrganizationEmployeeDirectory {

    private ArrayList<CreateEventByOrganizationEmployee> createEventByOrganizationEmployeeList;

    public CreateEventByOrganizationEmployeeDirectory() {
        createEventByOrganizationEmployeeList = new ArrayList<>();
    }

    public ArrayList<CreateEventByOrganizationEmployee> getCreateEventByOrganizationEmployeeList() {
        return createEventByOrganizationEmployeeList;
    }

    public void setCreateEventByOrganizationEmployeeList(ArrayList<CreateEventByOrganizationEmployee> createEventByOrganizationEmployeeList) {
        this.createEventByOrganizationEmployeeList = createEventByOrganizationEmployeeList;
    }

    public CreateEventByOrganizationEmployee createNewWorkRequest(String title, String description, Date deadline, String location, Date eventDate) {
        CreateEventByOrganizationEmployee createEventByOrganizationEmployee = new CreateEventByOrganizationEmployee();
        createEventByOrganizationEmployee.setTitle(title);
        createEventByOrganizationEmployee.setDescription(description);
        createEventByOrganizationEmployee.setDeadline(deadline);
        createEventByOrganizationEmployee.setLocation(location);
        createEventByOrganizationEmployee.setEventDate(eventDate);

        createEventByOrganizationEmployeeList.add(createEventByOrganizationEmployee);
        return createEventByOrganizationEmployee;
    }

}
