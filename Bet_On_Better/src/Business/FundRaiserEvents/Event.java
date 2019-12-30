/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FundRaiserEvents;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Urvashi
 */
public class Event {
    String eventName;
    String category;
    Double requestAmt;
    Double raisedAmt;
    Date createDate;
    Date targetDate;
    String description;
    String raisedBy;
    String status;
    String organizationType;
      UserAccount donatedBy;

    public UserAccount getDonatedBy() {
        return donatedBy;
    }

    public void setDonatedBy(UserAccount donatedBy) {
        this.donatedBy = donatedBy;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getRequestAmt() {
        return requestAmt;
    }

    public void setRequestAmt(Double requestAmt) {
        this.requestAmt = requestAmt;
    }

    public Double getRaisedAmt() {
        return raisedAmt;
    }

    public void setRaisedAmt(Double raisedAmt) {
        this.raisedAmt = raisedAmt;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRaisedBy() {
        return raisedBy;
    }

    public void setRaisedBy(String raisedBy) {
        this.raisedBy = raisedBy;
    }

    public String getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(String organizationType) {
        this.organizationType = organizationType;
    }
    
}
