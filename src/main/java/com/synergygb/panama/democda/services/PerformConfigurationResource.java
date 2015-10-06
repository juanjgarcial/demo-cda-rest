package com.synergygb.panama.democda.services;


import com.synergygb.panama.democda.config.PropertiesConfiguration;
import com.synergygb.panama.democda.config.db.DBConnection;
import com.synergygb.panama.democda.services.models.WebServiceStatus;
import com.synergygb.panama.democda.utils.JSONUtility;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import org.apache.log4j.Logger;

/**
 *
 * @author Juan Garcia <juan.garcia@synergy-gb.com>
 */
@Path("validate-conf")
public class PerformConfigurationResource {
    
    final static Logger LOGGER = Logger.getLogger(PerformConfigurationResource.class);

    @GET
    @Produces("application/json")
    public Response validate() {
        
        LOGGER.info("Iniciando servicio de Validación de configuracion");
        
        PropertiesConfiguration.initConfig();
        DBConnection.invalidateEMF();
        
        WebServiceStatus status = WebServiceStatus.okResponse();
        
        String jsonBody = JSONUtility.jsonFromObject(status);
        
        LOGGER.debug("JSON RESPONSE - VALIDATE = " + jsonBody);
        
        ResponseBuilder responseBuilder = Response.ok(jsonBody, MediaType.APPLICATION_JSON);
        Response response = responseBuilder.build();
        
        LOGGER.info("Finalizado servicio de Validación de configuración");
        return response;
    }
    
}
