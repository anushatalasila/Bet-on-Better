/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

import Business.FundRaiserEvents.Event;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Urvashi
 */
public class VerificationRequest extends WorkRequest{
    private int requestId;
    private Date verificationDate;
    private String status;
    private String reason;
    private UserAccount user;
    private Event event;
    private static int Reqcounter = 1001;

    public VerificationRequest() {
        requestId = Reqcounter;
        Reqcounter++;
    } 
    
    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
    
    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public Date getVerificationDate() {
        return verificationDate;
    }

    public void setVerificationDate(Date verificationDate) {
        this.verificationDate = verificationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public UserAccount getUser() {
        return user;
    }

    public void setUser(UserAccount user) {
        this.user = user;
    }
    
    @Override
    public String toString(){
        return String.valueOf(this.requestId);
    }
}
