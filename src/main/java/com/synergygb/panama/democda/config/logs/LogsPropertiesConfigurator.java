package com.synergygb.panama.democda.config.logs;

import com.synergygb.panama.democda.config.GeneralParam;
import com.synergygb.panama.democda.config.properties.IntegrationProperties;
import java.io.FileInputStream;
import java.util.Properties;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * * @author Juan Garcia <juan.garcia@synergy-gb.com>
 * 
 * Configuration class that makes possible to set the static variables defined
 * at IntegrationProperties from a properties file. It configures the properties
 * for db access and net connection between the REST and SOAP layers of the
 * application
 *
 */
public class LogsPropertiesConfigurator {

    /**
     * Loads and sets all the variables defined in a properties file as
     * described at IntegrationProperties. From the params present in the
     * properties file, it calculates the complete URL for the exposed services
     * and sets the remaining variables.
     *
     */
    static final Logger LOGGER = Logger.getLogger(LogsPropertiesConfigurator.class);

    public LogsPropertiesConfigurator() {
        
        LOGGER.info("Configurando propiedades de Log4j");
        
        //-----------------------------------------------------------------
        // Configuring Log4j
        //-----------------------------------------------------------------
        
        try {
            String configPath = System.getenv(GeneralParam.LOG_PROPERTIES_FILE_PATH);
            String logPath = System.getenv(GeneralParam.LOGS_PATH);

            Properties properties = new Properties();
            LOGGER.info("Leyendo propiedades de Log4j");
            try {
                FileInputStream file = new FileInputStream(configPath);
                properties.load(file);
            } catch (Exception ex) {
            
            }
            
            LOGGER.info("Asignando nuevas propiedades desde variable de entorno");
            
            properties.remove(GeneralParam.LOG4J_APPENDER_FILE);
            properties.setProperty(GeneralParam.LOG4J_APPENDER_FILE, logPath);
            
            properties.remove(GeneralParam.LOG4J_ROOT_LOGGER);
            properties.setProperty(GeneralParam.LOG4J_ROOT_LOGGER, IntegrationProperties.getLOG_LEVEL() + ", stdout, file");

            LogManager.resetConfiguration();
            PropertyConfigurator.configure(properties);
            
            LOGGER.info("Propiedades de Log4j configuradas con éxito");
            
        } catch (Exception ex) {
            LOGGER.error("Ocurrió un error al configurar las propiedades de Log4j", ex);
        }
        
    }
}
