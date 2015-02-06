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
public class Variant {
    
    Object value;
    
    Class type;
    
    
    public boolean isValid() {
        return value != null;
    }
    
    // Empty
    public Variant() {}
    
    // String
    public Variant(String value) {
        this.value = value;
        this.type = String.class;
    }
    
    public boolean isString() {
        return type == String.class;
    }
    
    public String asString() {
        return value.toString();
    }
    
    //Double
    public Variant(Double value) {
        this.value = value;
        this.type = Double.class;
    }
    
    public boolean isDouble() {
        return type == Double.class;
    }
    
    public Double asDouble() {
        return (Double) value;
    }
    
    // Integer
    public Variant(Integer value) {
        this.value = value;
        this.type = Integer.class;
    }
    
    public boolean isInteger() {
        return type == Integer.class;
    }
    
    public Integer asInteger() {
        return (Integer) value;
    }
    
    // int
    public Variant(int value) {
        this.value = value;
        this.type = int.class;
    }
    
    public boolean isInt() {
        return value == int.class;
    }
    
    public int asInt() {
        return (int) value;
    }
    
    // Long
    public Variant(Long value) {
        this.value = value;
        this.type = Long.class;
    }
    
    public boolean isLong() {
        return type == Long.class;
    }
    
    public Long asLong() {
        return (Long) value;
    }
}
