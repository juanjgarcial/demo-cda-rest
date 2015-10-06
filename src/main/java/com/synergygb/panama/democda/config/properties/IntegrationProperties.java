package com.synergygb.panama.democda.config.properties;

/**
 *
 * @author Juan Garcia <juan.garcia@synergy-gb.com>
 */
public class IntegrationProperties {

    public IntegrationProperties() {
    }
    
    private static String CONFIG_FILE = "conf.properties";
    private static String INTEGRATION_SERVICES = "";
    private static long INTEGRATION_SERVICES_TIMEOUT = 180000; // miliseconds
    private static String LOG_LEVEL = "ERROR";
    
    private static String DB_HOST;
    private static String DB_NAME;
    private static String DB_PORT;
    private static String DB_USER;
    private static String DB_PASSWORD;
    private static String DB_DRIVER;
    
    public static String getCONFIG_FILE() {
        return CONFIG_FILE;
    }

    public static void setCONFIG_FILE(String CONFIG_FILE) {
        IntegrationProperties.CONFIG_FILE = CONFIG_FILE;
    }

    public static String getINTEGRATION_SERVICES() {
        return INTEGRATION_SERVICES;
    }

    public static void setINTEGRATION_SERVICES(String INTEGRATION_SERVICES) {
        IntegrationProperties.INTEGRATION_SERVICES = INTEGRATION_SERVICES;
    }

    public static long getINTEGRATION_SERVICES_TIMEOUT() {
        return INTEGRATION_SERVICES_TIMEOUT;
    }

    public static void setINTEGRATION_SERVICES_TIMEOUT(long INTEGRATION_SERVICES_TIMEOUT) {
        IntegrationProperties.INTEGRATION_SERVICES_TIMEOUT = INTEGRATION_SERVICES_TIMEOUT;
    }

    public static String getLOG_LEVEL() {
        return LOG_LEVEL;
    }

    public static void setLOG_LEVEL(String LOG_LEVEL) {
        IntegrationProperties.LOG_LEVEL = LOG_LEVEL;
    }

    public static String getDB_HOST() {
        return DB_HOST;
    }

    public static void setDB_HOST(String DB_HOST) {
        IntegrationProperties.DB_HOST = DB_HOST;
    }

    public static String getDB_NAME() {
        return DB_NAME;
    }

    public static void setDB_NAME(String DB_NAME) {
        IntegrationProperties.DB_NAME = DB_NAME;
    }

    public static String getDB_PORT() {
        return DB_PORT;
    }

    public static void setDB_PORT(String DB_PORT) {
        IntegrationProperties.DB_PORT = DB_PORT;
    }

    public static String getDB_USER() {
        return DB_USER;
    }

    public static void setDB_USER(String DB_USER) {
        IntegrationProperties.DB_USER = DB_USER;
    }

    public static String getDB_PASSWORD() {
        return DB_PASSWORD;
    }

    public static void setDB_PASSWORD(String DB_PASSWORD) {
        IntegrationProperties.DB_PASSWORD = DB_PASSWORD;
    }

    public static String getDB_DRIVER() {
        return DB_DRIVER;
    }

    public static void setDB_DRIVER(String DB_DRIVER) {
        IntegrationProperties.DB_DRIVER = DB_DRIVER;
    }
    
}
