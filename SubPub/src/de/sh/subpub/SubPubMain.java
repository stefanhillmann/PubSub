/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.sh.subpub;

/**
 *
 * @author stefan
 */
public class SubPubMain {
    
    public static void main(String [] args) {
        Bell bell = new Bell();
        Lamp lamp = new Lamp();
        
        BellButton button = new BellButton();
        
        button.subscribe(bell);
        button.subscribe(lamp);
        
        button.press();
        button.pressLong();
    }
    
}
