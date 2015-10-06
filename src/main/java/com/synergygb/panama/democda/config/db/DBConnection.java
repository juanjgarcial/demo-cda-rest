package com.synergygb.panama.democda.config.db;

import com.synergygb.panama.democda.config.PropertiesConfiguration;
import com.synergygb.panama.democda.config.properties.IntegrationProperties;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.apache.log4j.Logger;

/**
 *
 * @author Juan Garcia <juan.garcia@synergy-gb.com>
 */
public class DBConnection {

    static final Logger LOGGER = Logger.getLogger(DBConnection.class);
    
    private static EntityManagerFactory appEmf = null;
      
    /**
     * Configures the db connection for JPA controllers and returns an entity
     * manager for the given persistence unit
     * This method is used for additional statistics database
     * @param persistenceUnit
     * @return 
     */
    public static EntityManager getStatsEntityManager(String persistenceUnit){

        Map<String,String> props = new HashMap<>();
        
        if (appEmf == null || !appEmf.isOpen()) {
            // set property configuration
            try {
                PropertiesConfiguration.initConfig();
        
                appEmf = Persistence.createEntityManagerFactory(persistenceUnit, props);
                
                props.put("javax.persistence.jdbc.url", "jdbc:mysql://"+IntegrationProperties.getDB_HOST()+":"+IntegrationProperties.getDB_PORT()+"/"+IntegrationProperties.getDB_NAME());
                props.put("javax.persistence.jdbc.driver", IntegrationProperties.getDB_DRIVER());
                props.put("javax.persistence.jdbc.user", IntegrationProperties.getDB_USER());
                props.put("javax.persistence.jdbc.password", IntegrationProperties.getDB_PASSWORD());
                
                LOGGER.debug("DB Connection: " + props.get("javax.persistence.jdbc.url") + " "
                        + "- USR: "+ props.get("javax.persistence.jdbc.user") + " "
                        + "PASS: "+ props.get("javax.persistence.jdbc.password") + " "
                        + "- DRIVER: "+ props.get("javax.persistence.jdbc.driver") );

                
                
                if (appEmf == null) {
                    LOGGER.debug("[DBConnection] EntityManagerFactory NULL");
                }
            } catch (Exception e) {
                LOGGER.error("[DBConnection] Error al intentar obtener el EntityManagerFactory", e);
            }
        }
        return appEmf.createEntityManager(props);
    }
    
    public static void invalidateEMF() {
        appEmf = null;
    }
}
