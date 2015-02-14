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
public interface Subscriber {
    
    public abstract void notify(final Variant message, Publisher sender);
    
}
