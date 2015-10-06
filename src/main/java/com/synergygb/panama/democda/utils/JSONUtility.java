package com.synergygb.panama.democda.utils;

import com.google.gson.Gson;
import java.lang.reflect.Type;

/**
 *
 * @author Juan Garcia <juan.garcia@synergy-gb.com>
 */
public class JSONUtility {

    static public String jsonFromObject(Object obj) {
        Gson gson = new Gson();
        return gson.toJson(obj);
    }
    
    static public Object objectFromJson(String str, Class c) {
        Gson gson = new Gson();
        return gson.fromJson(str, c);
    }
    
    static public Object objectFromJson(String str, Type c) {
        Gson gson = new Gson();
        return gson.fromJson(str, c);
    }
}
