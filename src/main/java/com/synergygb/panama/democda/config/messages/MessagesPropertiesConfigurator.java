package com.synergygb.panama.democda.config.messages;

import com.synergygb.panama.democda.config.GeneralParam;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
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
public class MessagesPropertiesConfigurator {

    /**
     * Loads and sets all the variables defined in a properties file as
     * described at IntegrationProperties. From the params present in the
     * properties file, it calculates the complete URL for the exposed services
     * and sets the remaining variables.
     *
     */
    static final Logger LOGGER = Logger.getLogger(MessagesPropertiesConfigurator.class);

    public MessagesPropertiesConfigurator() {

        String value;
        String param = null;
        InputStreamReader inputStreamReader;
        
        //-----------------------------------------------------------------
        // Opening configuration file
        //-----------------------------------------------------------------
        
        Properties properties = new Properties();

        try {
            String path;
            path = System.getenv(GeneralParam.MESSAGES_FILE_PATH);
            LOGGER.debug("MESSAGES_FILE_PATH = " + path);
            if (path == null) {
                LOGGER.error("Archivo de Mensajes no encontrado en la variable de entorno");
                throw new Exception("No se encuentra el archivo de mensajes");
            }
            MessagesProperties.setMESSAGES_FILE(path);
        } catch (Exception e) {
            LOGGER.error("Archivo de Mensajes no encontrado: ", e);
        }

        try {
            // Loads the Properties file
            inputStreamReader = new InputStreamReader(new FileInputStream(MessagesProperties.getMESSAGES_FILE()), "UTF8");
            properties.load(inputStreamReader);

        } catch (Exception e) {
            LOGGER.error("Error en la configuración de Mensajes", e);
            try {
                File f = new File(".");
                System.out.println(f.getCanonicalPath());
            } catch (IOException ex) {
                LOGGER.error("Error en la configuración de Mensajes", ex);
            }
        }
        
        try {
            param = "DEFAULT_ERROR";
            if ((value = properties.getProperty(param)) == null) {
                throw new Exception(param + ": No encontrado en el archivo de Mensajes");
            }
            MessagesProperties.setDEFAULT_ERROR(value.trim());
            LOGGER.debug(param + ": " + value.trim());

        } catch (Exception e) {
            LOGGER.error("MENSAJE NO ENCONTRADO = " + param);
            LOGGER.error("Error en la configuración de Mensajes", e);
        }
        
    }
}
