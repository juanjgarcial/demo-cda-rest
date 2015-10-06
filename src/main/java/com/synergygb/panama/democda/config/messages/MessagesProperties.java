package com.synergygb.panama.democda.config.messages;

/**
 *
 * @author Juan Garcia <juan.garcia@synergy-gb.com>
 */
public class MessagesProperties {

    public MessagesProperties() {
    }
    
    private static String MESSAGES_FILE = "msg.properties";
    
    private static String DEFAULT_ERROR;

    public static String getMESSAGES_FILE() {
        return MESSAGES_FILE;
    }

    public static void setMESSAGES_FILE(String MESSAGES_FILE) {
        MessagesProperties.MESSAGES_FILE = MESSAGES_FILE;
    }

    public static String getDEFAULT_ERROR() {
        return DEFAULT_ERROR;
    }

    public static void setDEFAULT_ERROR(String DEFAULT_ERROR) {
        MessagesProperties.DEFAULT_ERROR = DEFAULT_ERROR;
    }
    
}
