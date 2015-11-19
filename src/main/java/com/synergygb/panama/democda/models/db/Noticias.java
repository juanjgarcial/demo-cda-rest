package com.synergygb.panama.democda.models.db;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Juan Garcia <juan.garcia@synergy-gb.com>
 */
@Entity
@Table(name = "noticias")
@NamedQueries({
    @NamedQuery(name = "Noticias.findAll", query = "SELECT n FROM Noticias n"),
    @NamedQuery(name = "Noticias.findByNId", query = "SELECT n FROM Noticias n WHERE n.nId = :nId"),
    @NamedQuery(name = "Noticias.findByNText", query = "SELECT n FROM Noticias n WHERE n.nText = :nText"),
    @NamedQuery(name = "Noticias.findByNPicture", query = "SELECT n FROM Noticias n WHERE n.nPicture = :nPicture"),
    @NamedQuery(name = "Noticias.findByNLink", query = "SELECT n FROM Noticias n WHERE n.nLink = :nLink"),
    @NamedQuery(name = "Noticias.findByNActive", query = "SELECT n FROM Noticias n WHERE n.nActive = :nActive"),
    @NamedQuery(name = "Noticias.findByNuserCreate", query = "SELECT n FROM Noticias n WHERE n.nuserCreate = :nuserCreate"),
    @NamedQuery(name = "Noticias.findByNuserUpdate", query = "SELECT n FROM Noticias n WHERE n.nuserUpdate = :nuserUpdate"),
    @NamedQuery(name = "Noticias.findByNdateCreate", query = "SELECT n FROM Noticias n WHERE n.ndateCreate = :ndateCreate"),
    @NamedQuery(name = "Noticias.findByNdateUpdate", query = "SELECT n FROM Noticias n WHERE n.ndateUpdate = :ndateUpdate")})
public class Noticias implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "n_id")
    private Integer nId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "n_text")
    private String nText;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "n_picture")
    private String nPicture;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "n_link")
    private String nLink;
    @Basic(optional = false)
    @NotNull
    @Column(name = "n_active")
    private boolean nActive;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "n_userCreate")
    private String nuserCreate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "n_userUpdate")
    private String nuserUpdate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "n_dateCreate")
    @Temporal(TemporalType.DATE)
    private Date ndateCreate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "n_dateUpdate")
    @Temporal(TemporalType.DATE)
    private Date ndateUpdate;

    public Noticias() {
    }

    public Noticias(Integer nId) {
        this.nId = nId;
    }

    public Noticias(Integer nId, String nText, String nPicture, String nLink, boolean nActive, String nuserCreate, String nuserUpdate, Date ndateCreate, Date ndateUpdate) {
        this.nId = nId;
        this.nText = nText;
        this.nPicture = nPicture;
        this.nLink = nLink;
        this.nActive = nActive;
        this.nuserCreate = nuserCreate;
        this.nuserUpdate = nuserUpdate;
        this.ndateCreate = ndateCreate;
        this.ndateUpdate = ndateUpdate;
    }

    public Integer getNId() {
        return nId;
    }

    public void setNId(Integer nId) {
        this.nId = nId;
    }

    public String getNText() {
        return nText;
    }

    public void setNText(String nText) {
        this.nText = nText;
    }

    public String getNPicture() {
        return nPicture;
    }

    public void setNPicture(String nPicture) {
        this.nPicture = nPicture;
    }

    public String getNLink() {
        return nLink;
    }

    public void setNLink(String nLink) {
        this.nLink = nLink;
    }

    public boolean getNActive() {
        return nActive;
    }

    public void setNActive(boolean nActive) {
        this.nActive = nActive;
    }

    public String getNuserCreate() {
        return nuserCreate;
    }

    public void setNuserCreate(String nuserCreate) {
        this.nuserCreate = nuserCreate;
    }

    public String getNuserUpdate() {
        return nuserUpdate;
    }

    public void setNuserUpdate(String nuserUpdate) {
        this.nuserUpdate = nuserUpdate;
    }

    public Date getNdateCreate() {
        return ndateCreate;
    }

    public void setNdateCreate(Date ndateCreate) {
        this.ndateCreate = ndateCreate;
    }

    public Date getNdateUpdate() {
        return ndateUpdate;
    }

    public void setNdateUpdate(Date ndateUpdate) {
        this.ndateUpdate = ndateUpdate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nId != null ? nId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Noticias)) {
            return false;
        }
        Noticias other = (Noticias) object;
        if ((this.nId == null && other.nId != null) || (this.nId != null && !this.nId.equals(other.nId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.synergygb.panama.democda.models.db.Noticias[ nId=" + nId + " ]";
    }

}
