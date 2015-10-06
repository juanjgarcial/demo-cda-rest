package com.synergygb.panama.democda.services.models;

import com.synergygb.panama.democda.models.db.Contactos;
import com.synergygb.panama.democda.models.db.EnlacesInteres;
import com.synergygb.panama.democda.models.db.Noticias;
import com.synergygb.panama.democda.models.db.Publicidad;
import com.synergygb.panama.democda.models.db.Sucursales;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Juan Garcia <juan.garcia@synergy-gb.com>
 */
public class ServiceResponse implements Serializable {
    
    private ArrayList<Publicidad> ads;
    private Contactos contact;
    private ArrayList<Noticias> news;
    private ArrayList<Sucursales> branches;
    private ArrayList<EnlacesInteres> sites;
  
    private WebServiceStatus status;

    public ServiceResponse() {
    }

    public ServiceResponse(ArrayList<Publicidad> ads, Contactos contact, ArrayList<Noticias> news, ArrayList<Sucursales> branches, ArrayList<EnlacesInteres> sites, WebServiceStatus status) {
        this.ads = ads;
        this.contact = contact;
        this.news = news;
        this.branches = branches;
        this.sites = sites;
        this.status = status;
    }

    public ArrayList<Publicidad> getAds() {
        return ads;
    }

    public void setAds(ArrayList<Publicidad> ads) {
        this.ads = ads;
    }

    public Contactos getContact() {
        return contact;
    }

    public void setContact(Contactos contact) {
        this.contact = contact;
    }

    public ArrayList<Noticias> getNews() {
        return news;
    }

    public void setNews(ArrayList<Noticias> news) {
        this.news = news;
    }

    public ArrayList<Sucursales> getBranches() {
        return branches;
    }

    public void setBranches(ArrayList<Sucursales> branches) {
        this.branches = branches;
    }

    public ArrayList<EnlacesInteres> getSites() {
        return sites;
    }

    public void setSites(ArrayList<EnlacesInteres> sites) {
        this.sites = sites;
    }

    public WebServiceStatus getStatus() {
        return status;
    }

    public void setStatus(WebServiceStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ServiceResponse{" + "ads=" + ads + ", contact=" + contact + ", news=" + news + ", branches=" + branches + ", sites=" + sites + ", status=" + status + '}';
    }
    
    
}
