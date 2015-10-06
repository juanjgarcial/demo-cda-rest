package com.synergygb.panama.democda.config.properties;

import com.synergygb.panama.democda.config.GeneralParam;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;

/**
 * * @author Juan Garcia <juan.garcia@synergy-gb.com>
 * 
 * Configuration class that makes possible to set the static variables defined
 * at IntegrationProperties from a properties file. It configures the properties
 * for db access and net connection between the REST and SOAP layers of the
 * application
 *
 */
public class IntegrationPropertiesConfigurator {

    /**
     * Loads and sets all the variables defined in a properties file as
     * described at IntegrationProperties. From the params present in the
     * properties file, it calculates the complete URL for the exposed services
     * and sets the remaining variables.
     *
     */
    static final Logger LOGGER = Logger.getLogger(IntegrationPropertiesConfigurator.class);

    public IntegrationPropertiesConfigurator() {

        LOGGER.info("Iniciando configuración de la aplicación");
        
        String value;
        String param = null;
        FileInputStream f1;
        
        //-----------------------------------------------------------------
        // Opening configuration file
        //-----------------------------------------------------------------
        
        LOGGER.info("Abriendo archivo de configuración");
        
        Properties properties = new Properties();

        try {
            String path;
            path = System.getenv(GeneralParam.PROPERTIES_FILE_PATH);
            LOGGER.debug("PROPERTIES_FILE_PATH = " + path);
            if (path == null) {
                LOGGER.error("Archivo de Configuración y Propiedades no encontrado en la variable de entorno");
                throw new Exception("No se encuentra el archivo de properties");
            }
            IntegrationProperties.setCONFIG_FILE(path);
        } catch (Exception e) {
            LOGGER.error("Archivo de Configuración y Propiedades no encontrado: ", e);
        }
        
        LOGGER.info("Cargando archivo de configuración");
        
        try {
            // Loads the Properties file
            f1 = new FileInputStream(IntegrationProperties.getCONFIG_FILE());
            properties.load(f1);

        } catch (Exception e) {
            LOGGER.error("Error en la configuración de Propiedades", e);
            try {
                File f = new File(".");
                System.out.println(f.getCanonicalPath());
            } catch (IOException ex) {
                LOGGER.error("Error en la configuración de Propiedades", ex);
            }
        }
        
        //-----------------------------------------------------------------
        // Loading configuration
        //-----------------------------------------------------------------
        
        LOGGER.info("Leyendo parámetros de configuración");
        
        try {
            param = "LOG_LEVEL";
            if ((value = properties.getProperty(param)) == null) {
                throw new Exception(param + ": No encontrado en el archivo de configuración");
            }
            IntegrationProperties.setLOG_LEVEL(value.trim());
            LOGGER.debug(param + ": " + value.trim());

        } catch (Exception e) {
            LOGGER.error("PARAMETRO DE CONFIGURACIÓN NO ENCONTRADO = " + param);
            LOGGER.error("Error en la configuración de Propiedades", e);
        }
        
        try {
            param = "DB_HOST";
            if ((value = properties.getProperty(param)) == null) {
                throw new Exception(param + ": No encontrado en el archivo de configuración");
            }
            IntegrationProperties.setDB_HOST(value.trim());
            LOGGER.debug(param + ": " + value.trim());

        } catch (Exception e) {
            LOGGER.error("PARAMETRO DE CONFIGURACIÓN NO ENCONTRADO = " + param);
            LOGGER.error("Error en la configuración de Propiedades", e);
        }
        
        try {
            param = "DB_NAME";
            if ((value = properties.getProperty(param)) == null) {
                throw new Exception(param + ": No encontrado en el archivo de configuración");
            }
            IntegrationProperties.setDB_NAME(value.trim());
            LOGGER.debug(param + ": " + value.trim());

        } catch (Exception e) {
            LOGGER.error("PARAMETRO DE CONFIGURACIÓN NO ENCONTRADO = " + param);
            LOGGER.error("Error en la configuración de Propiedades", e);
        }
        
        try {
            param = "DB_PORT";
            if ((value = properties.getProperty(param)) == null) {
                throw new Exception(param + ": No encontrado en el archivo de configuración");
            }
            IntegrationProperties.setDB_PORT(value.trim());
            LOGGER.debug(param + ": " + value.trim());

        } catch (Exception e) {
            LOGGER.error("PARAMETRO DE CONFIGURACIÓN NO ENCONTRADO = " + param);
            LOGGER.error("Error en la configuración de Propiedades", e);
        }
        
        try {
            param = "DB_USER";
            if ((value = properties.getProperty(param)) == null) {
                throw new Exception(param + ": No encontrado en el archivo de configuración");
            }
            IntegrationProperties.setDB_USER(value.trim());
            LOGGER.debug(param + ": " + value.trim());

        } catch (Exception e) {
            LOGGER.error("PARAMETRO DE CONFIGURACIÓN NO ENCONTRADO = " + param);
            LOGGER.error("Error en la configuración de Propiedades", e);
        }
        
        try {
            param = "DB_PASSWORD";
            if ((value = properties.getProperty(param)) == null) {
                throw new Exception(param + ": No encontrado en el archivo de configuración");
            }
            IntegrationProperties.setDB_PASSWORD(value.trim());
            LOGGER.debug(param + ": " + value.trim());

        } catch (Exception e) {
            LOGGER.error("PARAMETRO DE CONFIGURACIÓN NO ENCONTRADO = " + param);
            LOGGER.error("Error en la configuración de Propiedades", e);
        }
        
        try {
            param = "DB_DRIVER";
            if ((value = properties.getProperty(param)) == null) {
                throw new Exception(param + ": No encontrado en el archivo de configuración");
            }
            IntegrationProperties.setDB_DRIVER(value.trim());
            LOGGER.debug(param + ": " + value.trim());

        } catch (Exception e) {
            LOGGER.error("PARAMETRO DE CONFIGURACIÓN NO ENCONTRADO = " + param);
            LOGGER.error("Error en la configuración de Propiedades", e);
        }
    }
}
