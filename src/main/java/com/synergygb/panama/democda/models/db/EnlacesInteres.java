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
@Table(name = "enlaces_interes")
@NamedQueries({
    @NamedQuery(name = "EnlacesInteres.findAll", query = "SELECT e FROM EnlacesInteres e"),
    @NamedQuery(name = "EnlacesInteres.findByEId", query = "SELECT e FROM EnlacesInteres e WHERE e.eId = :eId"),
    @NamedQuery(name = "EnlacesInteres.findByETitle", query = "SELECT e FROM EnlacesInteres e WHERE e.eTitle = :eTitle"),
    @NamedQuery(name = "EnlacesInteres.findByEActive", query = "SELECT e FROM EnlacesInteres e WHERE e.eActive = :eActive"),
    @NamedQuery(name = "EnlacesInteres.findByEHiperlink", query = "SELECT e FROM EnlacesInteres e WHERE e.eHiperlink = :eHiperlink"),
    @NamedQuery(name = "EnlacesInteres.findByEuserCreate", query = "SELECT e FROM EnlacesInteres e WHERE e.euserCreate = :euserCreate"),
    @NamedQuery(name = "EnlacesInteres.findByEuserUpdate", query = "SELECT e FROM EnlacesInteres e WHERE e.euserUpdate = :euserUpdate"),
    @NamedQuery(name = "EnlacesInteres.findByEdateCreate", query = "SELECT e FROM EnlacesInteres e WHERE e.edateCreate = :edateCreate"),
    @NamedQuery(name = "EnlacesInteres.findByEdateUpdate", query = "SELECT e FROM EnlacesInteres e WHERE e.edateUpdate = :edateUpdate")})
public class EnlacesInteres implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "e_id")
    private Integer eId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "e_title")
    private String eTitle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "e_active")
    private boolean eActive;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "e_hiperlink")
    private String eHiperlink;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "e_userCreate")
    private String euserCreate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "e_userUpdate")
    private String euserUpdate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "e_dateCreate")
    @Temporal(TemporalType.DATE)
    private Date edateCreate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "e_dateUpdate")
    @Temporal(TemporalType.DATE)
    private Date edateUpdate;

    public EnlacesInteres() {
    }

    public EnlacesInteres(Integer eId) {
        this.eId = eId;
    }

    public EnlacesInteres(Integer eId, String eTitle, boolean eActive, String eHiperlink, String euserCreate, String euserUpdate, Date edateCreate, Date edateUpdate) {
        this.eId = eId;
        this.eTitle = eTitle;
        this.eActive = eActive;
        this.eHiperlink = eHiperlink;
        this.euserCreate = euserCreate;
        this.euserUpdate = euserUpdate;
        this.edateCreate = edateCreate;
        this.edateUpdate = edateUpdate;
    }

    public Integer getEId() {
        return eId;
    }

    public void setEId(Integer eId) {
        this.eId = eId;
    }

    public String getETitle() {
        return eTitle;
    }

    public void setETitle(String eTitle) {
        this.eTitle = eTitle;
    }

    public boolean getEActive() {
        return eActive;
    }

    public void setEActive(boolean eActive) {
        this.eActive = eActive;
    }

    public String getEHiperlink() {
        return eHiperlink;
    }

    public void setEHiperlink(String eHiperlink) {
        this.eHiperlink = eHiperlink;
    }

    public String getEuserCreate() {
        return euserCreate;
    }

    public void setEuserCreate(String euserCreate) {
        this.euserCreate = euserCreate;
    }

    public String getEuserUpdate() {
        return euserUpdate;
    }

    public void setEuserUpdate(String euserUpdate) {
        this.euserUpdate = euserUpdate;
    }

    public Date getEdateCreate() {
        return edateCreate;
    }

    public void setEdateCreate(Date edateCreate) {
        this.edateCreate = edateCreate;
    }

    public Date getEdateUpdate() {
        return edateUpdate;
    }

    public void setEdateUpdate(Date edateUpdate) {
        this.edateUpdate = edateUpdate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eId != null ? eId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EnlacesInteres)) {
            return false;
        }
        EnlacesInteres other = (EnlacesInteres) object;
        if ((this.eId == null && other.eId != null) || (this.eId != null && !this.eId.equals(other.eId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.synergygb.panama.democda.models.db.EnlacesInteres[ eId=" + eId + " ]";
    }

}
