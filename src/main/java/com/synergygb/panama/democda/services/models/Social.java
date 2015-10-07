package com.synergygb.panama.democda.services.models;

import java.io.Serializable;

/**
 *
 * @author Juan Garcia <juan.garcia@synergy-gb.com>
 */
public class Social implements Serializable {
    private String type;
    private String name;
    private String url;

    public Social() {
    }

    public Social(String type, String name, String url) {
        this.type = type;
        this.name = name;
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Social{" + "type=" + type + ", name=" + name + ", url=" + url + '}';
    }
    
    
}
