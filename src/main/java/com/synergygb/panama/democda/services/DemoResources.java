package com.synergygb.panama.democda.services;

import com.synergygb.panama.democda.config.PropertiesConfiguration;
import com.synergygb.panama.democda.services.handlers.ServicesHandler;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.apache.log4j.Logger;

/**
 *
 * @author Juan Garcia <juan.garcia@synergy-gb.com>
 */
@Path("demo")
public class DemoResources {

    private static final Logger LOGGER = Logger.getLogger(DemoResources.class);
    private static final ServicesHandler handler = new ServicesHandler();
    
    @Path("ads")
    @GET
    @Produces("application/json")
    public Response getAds() {
        
        LOGGER.info("Iniciando servicio de obtener todos la publicidad");
        
        PropertiesConfiguration.initConfig();
        
        String jsonBody = handler.getAds();
                
        LOGGER.debug("JSON RESPONSE -  ADS = " + jsonBody);
        
        Response.ResponseBuilder responseBuilder = Response.ok(jsonBody, MediaType.APPLICATION_JSON);
        Response response = responseBuilder.build();
        
        LOGGER.info("Finalizado servicio de obtener la publicidad");
        
        return response;
            
    }
    
    @Path("news")
    @GET
    @Produces("application/json")
    public Response getNews() {
        
        LOGGER.info("Iniciando servicio de obtener todos la Noticias");
        
        PropertiesConfiguration.initConfig();
        
        String jsonBody = handler.getNews();
                
        LOGGER.debug("JSON RESPONSE -  NEWS = " + jsonBody);
        
        Response.ResponseBuilder responseBuilder = Response.ok(jsonBody, MediaType.APPLICATION_JSON);
        Response response = responseBuilder.build();
        
        LOGGER.info("Finalizado servicio de obtener la Noticias");
        
        return response;
            
    }
    
    @Path("branches")
    @GET
    @Produces("application/json")
    public Response getBranches() {
        
        LOGGER.info("Iniciando servicio de obtener todos las Sucurales");
        
        PropertiesConfiguration.initConfig();
        
        String jsonBody = handler.getBranches();
                
        LOGGER.debug("JSON RESPONSE -  BRANCHES = " + jsonBody);
        
        Response.ResponseBuilder responseBuilder = Response.ok(jsonBody, MediaType.APPLICATION_JSON);
        Response response = responseBuilder.build();
        
        LOGGER.info("Finalizado servicio de obtener la Sucursales");
        
        return response;
            
    }
    
    @Path("benefits")
    @GET
    @Produces("application/json")
    public Response getBenefits() {
        
        LOGGER.info("Iniciando servicio de obtener todos las Beneficios");
        
        PropertiesConfiguration.initConfig();
        
        String jsonBody = handler.getBenefits();
                
        LOGGER.debug("JSON RESPONSE -  BENEFITS = " + jsonBody);
        
        Response.ResponseBuilder responseBuilder = Response.ok(jsonBody, MediaType.APPLICATION_JSON);
        Response response = responseBuilder.build();
        
        LOGGER.info("Finalizado servicio de obtener la Beneficios");
        
        return response;
            
    }
    
    @Path("contact-info")
    @GET
    @Produces("application/json")
    public Response getContactInfo() {
        
        LOGGER.info("Iniciando servicio de obtener información de contacto");
        
        PropertiesConfiguration.initConfig();
        
        String jsonBody = handler.getContactInfo();
                
        LOGGER.debug("JSON RESPONSE -  CONTACT INFO = " + jsonBody);
        
        Response.ResponseBuilder responseBuilder = Response.ok(jsonBody, MediaType.APPLICATION_JSON);
        Response response = responseBuilder.build();
        
        LOGGER.info("Finalizado servicio de obtener información de contacto");
        
        return response;
            
    }
    
    @Path("sites")
    @GET
    @Produces("application/json")
    public Response getSites() {
        
        LOGGER.info("Iniciando servicio de obtener todos la Sitios");
        
        PropertiesConfiguration.initConfig();
        
        String jsonBody = handler.getSites();
                
        LOGGER.debug("JSON RESPONSE -  SITES = " + jsonBody);
        
        Response.ResponseBuilder responseBuilder = Response.ok(jsonBody, MediaType.APPLICATION_JSON);
        Response response = responseBuilder.build();
        
        LOGGER.info("Finalizado servicio de obtener la Sitios");
        
        return response;
            
    }
    
    @Path("faq")
    @GET
    @Produces("application/json")
    public Response getFAQ() {
        
        LOGGER.info("Iniciando servicio de obtener todos las Preguntas Frecuentes");
        
        PropertiesConfiguration.initConfig();
        
        String jsonBody = handler.getFAQ();
                
        LOGGER.debug("JSON RESPONSE -  FAQ = " + jsonBody);
        
        Response.ResponseBuilder responseBuilder = Response.ok(jsonBody, MediaType.APPLICATION_JSON);
        Response response = responseBuilder.build();
        
        LOGGER.info("Finalizado servicio de obtener las Preguntas Frecuentes");
        
        return response;
            
    }
    
    @Path("terms")
    @GET
    @Produces("application/json")
    public Response getTerms() {
        
        LOGGER.info("Iniciando servicio de obtener los Terminos");
        
        PropertiesConfiguration.initConfig();
        
        String jsonBody = handler.getTerms();
                
        LOGGER.debug("JSON RESPONSE -  TERMS = " + jsonBody);
        
        Response.ResponseBuilder responseBuilder = Response.ok(jsonBody, MediaType.APPLICATION_JSON);
        Response response = responseBuilder.build();
        
        LOGGER.info("Finalizado servicio de obtener los Terminos");
        
        return response;
            
    }
}
