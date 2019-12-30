/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FundRaiserEvents;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Urvashi
 */
public class EventDirectory {
    private List<Event> eventList;

    public EventDirectory() {
        this.eventList = new ArrayList<>();
    }

    public List<Event> getEventList() {
        return eventList;
    }

    public void setEventList(ArrayList<Event> eventList) {
        this.eventList = eventList;
    }
    
    public void deleteEvent(Event event){
        eventList.remove(event);
    }
    public Event createEvent(String category, Date createDate, String description, String name, UserAccount raisedBy, 
            Double requestAmount, Date targetDate, String status){
        Event event = new Event();
        event.setCategory(category);
        event.setCreateDate(createDate);
        event.setDescription(description);
        event.setEventName(name);
        event.setRaisedAmt(0.00);
        event.setRaisedBy(raisedBy.getUsername());
        event.setRequestAmt(requestAmount);
        event.setTargetDate(targetDate);
        event.setStatus(status);
        eventList.add(event);
        return event;
    }
}
