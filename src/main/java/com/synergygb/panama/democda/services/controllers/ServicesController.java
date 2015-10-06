package com.synergygb.panama.democda.services.controllers;

import com.synergygb.panama.democda.config.GeneralParam;
import com.synergygb.panama.democda.config.db.DBConnection;
import com.synergygb.panama.democda.models.db.Contactos;
import com.synergygb.panama.democda.models.db.EnlacesInteres;
import com.synergygb.panama.democda.models.db.Noticias;
import com.synergygb.panama.democda.models.db.Publicidad;
import com.synergygb.panama.democda.models.db.Sucursales;
import java.util.ArrayList;
import java.util.Arrays;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.apache.log4j.Logger;

/**
 *
 * @author Juan Garcia <juan.garcia@synergy-gb.com>
 */
public class ServicesController {

    private static final Logger LOGGER = Logger.getLogger(ServicesController.class);
    
    private EntityManager getEntityManager() throws IllegalStateException {
        return DBConnection.getStatsEntityManager(GeneralParam.PERSISTENCE_UNIT_NAME); 
    }
    
    public ArrayList<Publicidad> getAllAds() throws Exception {
        
        EntityManager em = getEntityManager();
        Query q = em.createNamedQuery("Publicidad.findAll");
        ArrayList<Publicidad> result = new ArrayList<>(Arrays.asList((Publicidad[]) q.getResultList().toArray(new Publicidad[0])));
        em.close();
        
        return result;
    }
    
    public ArrayList<Contactos> getContactInfo() throws Exception {
        
        EntityManager em = getEntityManager();
        Query q = em.createNamedQuery("Contactos.findAll");
        ArrayList<Contactos> result = new ArrayList<>(Arrays.asList((Contactos[]) q.getResultList().toArray(new Contactos[0])));
        em.close();
        
        return result;
    }
    
    public ArrayList<EnlacesInteres> getSites() throws Exception {
        
        EntityManager em = getEntityManager();
        Query q = em.createNamedQuery("EnlacesInteres.findAll");
        ArrayList<EnlacesInteres> result = new ArrayList<>(Arrays.asList((EnlacesInteres[]) q.getResultList().toArray(new EnlacesInteres[0])));
        em.close();
        
        return result;
    }
    
    public ArrayList<Noticias> getNews() throws Exception {
        
        EntityManager em = getEntityManager();
        Query q = em.createNamedQuery("Noticias.findAll");
        ArrayList<Noticias> result = new ArrayList<>(Arrays.asList((Noticias[]) q.getResultList().toArray(new Noticias[0])));
        em.close();
        
        return result;
    }
    
    public ArrayList<Sucursales> getBranches() throws Exception {
        
        EntityManager em = getEntityManager();
        Query q = em.createNamedQuery("Sucursales.findAll");
        ArrayList<Sucursales> result = new ArrayList<>(Arrays.asList((Sucursales[]) q.getResultList().toArray(new Sucursales[0])));
        em.close();
        
        return result;
    }
}
