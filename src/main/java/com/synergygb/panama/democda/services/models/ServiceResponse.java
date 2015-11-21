package com.synergygb.panama.democda.services.models;

import com.synergygb.panama.democda.models.db.Beneficios;
import com.synergygb.panama.democda.models.db.Contactos;
import com.synergygb.panama.democda.models.db.EnlacesInteres;
import com.synergygb.panama.democda.models.db.Noticias;
import com.synergygb.panama.democda.models.db.PreguntasFrecuentes;
import com.synergygb.panama.democda.models.db.Publicidad;
import com.synergygb.panama.democda.models.db.Sucursales;
import com.synergygb.panama.democda.models.db.TerminosCondiciones;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Juan Garcia <juan.garcia@synergy-gb.com>
 */
public class ServiceResponse implements Serializable {
    
    private ArrayList<Publicidad> ads;
    private Contactos contact;
    private ArrayList<Social> social;
    private ArrayList<Noticias> news;
    private ArrayList<Sucursales> branches;
    private ArrayList<EnlacesInteres> sites;
    private ArrayList<Beneficios> benefits;
    private ArrayList<PreguntasFrecuentes> faq;
    private ArrayList<TerminosCondiciones> terms;
  
    private WebServiceStatus status;

    public ServiceResponse() {
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

    public ArrayList<Social> getSocial() {
        return social;
    }

    public void setSocial(ArrayList<Social> social) {
        this.social = social;
    }

    public ArrayList<Beneficios> getBenefits() {
        return benefits;
    }

    public void setBenefits(ArrayList<Beneficios> benefits) {
        this.benefits = benefits;
    }

    public ArrayList<PreguntasFrecuentes> getFaq() {
        return faq;
    }

    public void setFaq(ArrayList<PreguntasFrecuentes> faq) {
        this.faq = faq;
    }

    public ArrayList<TerminosCondiciones> getTerms() {
        return terms;
    }

    public void setTerms(ArrayList<TerminosCondiciones> terms) {
        this.terms = terms;
    }
   
}
