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
public class BellButton extends Publisher {
    
    public void press() {
        broadcast( new Variant(new Integer(1)) );
    }
    
    public void pressLong() {
        broadcast( new Variant(new Integer(5)) );
    }
}
