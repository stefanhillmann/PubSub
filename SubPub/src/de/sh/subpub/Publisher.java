/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.sh.subpub;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author stefan
 */
public abstract class Publisher {
    
    private boolean isBlocked;
    
    private final List<Subscriber> subscribers;
    
    public Publisher() {
        this.isBlocked = false;
        this.subscribers = new LinkedList<>();
    }
    
    public void subscribe(final Subscriber subscriber) {
        subscribers.add(subscriber);
    }
    
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }
    
    public void broadcast(final Variant message) {
        broadcast(message, null);
    }
    
    public void broadcast(final Variant message, Subscriber ignoredSubscriber) {
        if ( ! isBlocked ) {
            for ( Subscriber subscriber : subscribers ) {
                if ( subscriber != ignoredSubscriber ) {
                    subscriber.notify(message, this);
                }
            }
        }
    }
    
    public void block(boolean blocked) {
        this.isBlocked = blocked;
    }
    
}
