/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EndUser;

import Business.FundRaiserEvents.Event;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Urvashi
 */
public class DonationDirectory {
    private ArrayList<Donation> donationList;

    public DonationDirectory() {
        donationList = new ArrayList<>();
    }

    public ArrayList<Donation> getDonationList() {
        return donationList;
    }
    
    public Donation createDonation(Event event, double donation, Date donationDate){
        Donation donationObj = new Donation();
        donationObj.setEvent(event);
        donationObj.setDonation(donation);
        donationObj.setDonationDate(donationDate);
        return donationObj;
    }
}
