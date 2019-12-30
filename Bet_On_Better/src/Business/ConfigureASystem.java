/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.Network;
import Business.Role.*;
import Business.UserAccount.UserAccount;

/**
 *
 * @author devma
 */
public class ConfigureASystem {
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        Network network = new Network();
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        for(UserAccount u: system.getUserAccountDirectory().getUserAccountList()){
        System.out.println(u);
        }
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("networkAdmin", "networkAdmin", new NetworkAdmin());

        return system;
    }
}
