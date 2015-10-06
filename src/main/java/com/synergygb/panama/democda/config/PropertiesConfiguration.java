package com.synergygb.panama.democda.config;

import com.synergygb.panama.democda.config.logs.LogsPropertiesConfigurator;
import com.synergygb.panama.democda.config.messages.MessagesPropertiesConfigurator;
import com.synergygb.panama.democda.config.properties.IntegrationPropertiesConfigurator;
import org.apache.log4j.Logger;

/**
 *
 * @author Juan Garcia <juan.garcia@synergy-gb.com>
 */
public class PropertiesConfiguration {
    
    static final Logger LOGGER = Logger.getLogger(PropertiesConfiguration.class);

    private static IntegrationPropertiesConfigurator ic = null;
    private static MessagesPropertiesConfigurator mc = null;
    private static LogsPropertiesConfigurator lc = null;

    public static IntegrationPropertiesConfigurator getIc() {
        if (ic == null) {
            LOGGER.info("Configurando Propiedades de la aplicación");
            ic = new IntegrationPropertiesConfigurator();
        }
        return ic;
    }

    public static MessagesPropertiesConfigurator getMc() {
        if (mc == null) {
            LOGGER.info("Configurando Mensajes");
            mc = new MessagesPropertiesConfigurator();
        }
        return mc;
    }

    public static LogsPropertiesConfigurator getLc() {
        if (lc == null) {
            LOGGER.info("Configurando Mensajes");
            lc = new LogsPropertiesConfigurator();
        }
        return lc;
    }

    public static void initConfig() {
        getIc();
        getMc();
        getLc();
    }

    public static void invalidate() {
        LOGGER.info("Invalidando Configuración");
        ic = null;
        mc = null;
        lc = null;
    }
}
