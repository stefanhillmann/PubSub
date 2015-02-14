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
public class Bell implements Subscriber {

    @Override
    public void notify(Variant message, Publisher sender) {
        if ( message.isInteger() ) {
            int duration = message.asInteger();
            
            System.out.println(duration + " Sekunde" + (duration == 1 ? "" : "n") + 
                    " klingeln.");
        }
    }
}
