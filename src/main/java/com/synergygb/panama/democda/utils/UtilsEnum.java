/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.synergygb.panama.democda.utils;

/**
 *
 * @author sgbpty-002
 */
public enum UtilsEnum {
    
    DATE_FORMAT("yyyy-MM-dd");
    
    private final String value;

    private UtilsEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    
}
