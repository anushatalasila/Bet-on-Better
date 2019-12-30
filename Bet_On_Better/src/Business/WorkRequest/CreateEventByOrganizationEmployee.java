/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author MMI
 */
public class CreateEventByOrganizationEmployee extends WorkRequest {
    private int requestID;
    private String title;
    private String description;
    private String location;
    private Date deadline;
    private Date eventDate;
    private int requestedAtm;
    private UserAccount user;
    private String Status;
    private int targetAtm;
    private static int Reqcounter = 10001;

    public CreateEventByOrganizationEmployee() {
        requestID = Reqcounter;
        Reqcounter++;
    }

    public int getTargetAtm() {
        return targetAtm;
    }

    public void setTargetAtm(int targetAtm) {
        this.targetAtm = targetAtm;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public UserAccount getUser() {
        return user;
    }

    public void setUser(UserAccount user) {
        this.user = user;
    }

    public int getRequestedAtm() {
        return requestedAtm;
    }

    public void setRequestedAtm(int requestedAtm) {
        this.requestedAtm = requestedAtm;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public int getRequestID() {
        return requestID;
    }

    public void setRequestID(int requestID) {
        this.requestID = requestID;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    @Override 
    public String toString(){
        return String.valueOf(this.requestID);
    }
    
}
