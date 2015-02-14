/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.sh.pubsub;

/**
 *
 * @author stefan
 */
public class Lamp implements Subscriber {

    @Override
    public void notify(Variant message, Publisher sender) {
        if ( message.isInteger() && message.asInteger() <= 1) {
            System.out.println("Alarmleuchte ist an.");
        }
    }
    
}
