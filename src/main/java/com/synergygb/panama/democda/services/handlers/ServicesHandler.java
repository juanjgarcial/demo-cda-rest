package com.synergygb.panama.democda.services.handlers;

import com.synergygb.panama.democda.models.db.Contactos;
import com.synergygb.panama.democda.models.db.EnlacesInteres;
import com.synergygb.panama.democda.models.db.Noticias;
import com.synergygb.panama.democda.models.db.Publicidad;
import com.synergygb.panama.democda.models.db.RedesSociales;
import com.synergygb.panama.democda.models.db.Sucursales;
import com.synergygb.panama.democda.services.controllers.ServicesController;
import com.synergygb.panama.democda.services.models.ServiceResponse;
import com.synergygb.panama.democda.services.models.Social;
import com.synergygb.panama.democda.services.models.WebServiceStatus;
import com.synergygb.panama.democda.utils.JSONUtility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import org.apache.log4j.Logger;

/**
 *
 * @author Juan Garcia <juan.garcia@synergy-gb.com>
 */
public class ServicesHandler {

    private static final Logger LOGGER = Logger.getLogger(ServicesHandler.class);
    
    public String getAds() {
        LOGGER.info("Iniciando handler de Obtención de Publicidad");
        
        ServicesController controller = new ServicesController();
        ArrayList<Publicidad> ads;
        ServiceResponse response = new ServiceResponse();
        
        try {
            ads = controller.getAllAds();
            response.setAds(ads);
            response.setStatus(WebServiceStatus.okResponse());
        } catch (Exception ex) {
            LOGGER.error("Error al La publicidad ", ex);
            response.setStatus(WebServiceStatus.failResponseByDefault(ex));
        }
        
        LOGGER.info("Finalizando handler de Obtención de publicidad");
        return JSONUtility.jsonFromObject(response);
    }

    public String getContactInfo() {
        LOGGER.info("Iniciando handler de Obtención de Contacto");
        
        ServicesController controller = new ServicesController();
        ArrayList<Contactos> contactos;
        ServiceResponse response = new ServiceResponse();
        
        try {
            contactos = controller.getContactInfo();
            if (contactos.size() > 0)
                response.setContact(contactos.get(0));
            response.setStatus(WebServiceStatus.okResponse());
        } catch (Exception ex) {
            LOGGER.error("Error al Obtener la informacion de contacto", ex);
            response.setStatus(WebServiceStatus.failResponseByDefault(ex));
        }
        
        
        ArrayList<Social> socialNetwors = new ArrayList<>();
        
        if (response.getContact() != null) {
            if (response.getContact().getRedesSocialesCollection() != null) {
                for (RedesSociales red : response.getContact().getRedesSocialesCollection()) {
                    Social s = new Social();
                    s.setName(red.getRTitle());
                    s.setType(red.getRTipo().getTrDescription());
                    s.setUrl(red.getRLink());
                    socialNetwors.add(s);
                }
            }
            response.getContact().setRedesSocialesCollection(null);
        }
        
        response.setSocial(socialNetwors);
        
        LOGGER.info("Finalizando handler de Obtención de informacion de contacto");
        return JSONUtility.jsonFromObject(response);
    }

    public String getSites() {
        LOGGER.info("Iniciando handler de Obtención de Sitios de Interes");
        
        ServicesController controller = new ServicesController();
        ArrayList<EnlacesInteres> sites;
        ServiceResponse response = new ServiceResponse();
        
        try {
            sites = controller.getSites();
            response.setSites(sites);
            response.setStatus(WebServiceStatus.okResponse());
        } catch (Exception ex) {
            LOGGER.error("Error al Sitios de Interes ", ex);
            response.setStatus(WebServiceStatus.failResponseByDefault(ex));
        }
        
        LOGGER.info("Finalizando handler de Obtención de Sitios de Interes");
        return JSONUtility.jsonFromObject(response);
    }
    
    public String getNews() {
        LOGGER.info("Iniciando handler de Obtención de Noticias");
        
        ServicesController controller = new ServicesController();
        ArrayList<Noticias> news;
        ServiceResponse response = new ServiceResponse();
        
        try {
            news = controller.getNews();
            response.setNews(news);
            response.setStatus(WebServiceStatus.okResponse());
        } catch (Exception ex) {
            LOGGER.error("Error al La Noticia ", ex);
            response.setStatus(WebServiceStatus.failResponseByDefault(ex));
        }
        
        LOGGER.info("Finalizando handler de Obtención de Noticias");
        return JSONUtility.jsonFromObject(response);
    }
    
    public String getBranches() {
        LOGGER.info("Iniciando handler de Obtención de Sucursales");
        
        ServicesController controller = new ServicesController();
        ArrayList<Sucursales> branches;
        ServiceResponse response = new ServiceResponse();
        
        try {
            branches = controller.getBranches();
            response.setBranches(branches);
            response.setStatus(WebServiceStatus.okResponse());
        } catch (Exception ex) {
            LOGGER.error("Error al La Sucursales ", ex);
            response.setStatus(WebServiceStatus.failResponseByDefault(ex));
        }
        
        LOGGER.info("Finalizando handler de Obtención de Sucursales");
        return JSONUtility.jsonFromObject(response);
    }
}
