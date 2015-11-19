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
@Table(name = "publicidad")
@NamedQueries({
    @NamedQuery(name = "Publicidad.findAll", query = "SELECT p FROM Publicidad p"),
    @NamedQuery(name = "Publicidad.findByPId", query = "SELECT p FROM Publicidad p WHERE p.pId = :pId"),
    @NamedQuery(name = "Publicidad.findByPText", query = "SELECT p FROM Publicidad p WHERE p.pText = :pText"),
    @NamedQuery(name = "Publicidad.findByPPicture", query = "SELECT p FROM Publicidad p WHERE p.pPicture = :pPicture"),
    @NamedQuery(name = "Publicidad.findByPActive", query = "SELECT p FROM Publicidad p WHERE p.pActive = :pActive"),
    @NamedQuery(name = "Publicidad.findByPuserCreate", query = "SELECT p FROM Publicidad p WHERE p.puserCreate = :puserCreate"),
    @NamedQuery(name = "Publicidad.findByPuserUpdate", query = "SELECT p FROM Publicidad p WHERE p.puserUpdate = :puserUpdate"),
    @NamedQuery(name = "Publicidad.findByPdateCreate", query = "SELECT p FROM Publicidad p WHERE p.pdateCreate = :pdateCreate"),
    @NamedQuery(name = "Publicidad.findByPdateUpdate", query = "SELECT p FROM Publicidad p WHERE p.pdateUpdate = :pdateUpdate")})
public class Publicidad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "p_id")
    private Integer pId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "p_text")
    private String pText;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "p_picture")
    private String pPicture;
    @Basic(optional = false)
    @NotNull
    @Column(name = "p_active")
    private boolean pActive;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "p_userCreate")
    private String puserCreate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "p_userUpdate")
    private String puserUpdate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "p_dateCreate")
    @Temporal(TemporalType.DATE)
    private Date pdateCreate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "p_dateUpdate")
    @Temporal(TemporalType.DATE)
    private Date pdateUpdate;

    public Publicidad() {
    }

    public Publicidad(Integer pId) {
        this.pId = pId;
    }

    public Publicidad(Integer pId, String pText, String pPicture, boolean pActive, String puserCreate, String puserUpdate, Date pdateCreate, Date pdateUpdate) {
        this.pId = pId;
        this.pText = pText;
        this.pPicture = pPicture;
        this.pActive = pActive;
        this.puserCreate = puserCreate;
        this.puserUpdate = puserUpdate;
        this.pdateCreate = pdateCreate;
        this.pdateUpdate = pdateUpdate;
    }

    public Integer getPId() {
        return pId;
    }

    public void setPId(Integer pId) {
        this.pId = pId;
    }

    public String getPText() {
        return pText;
    }

    public void setPText(String pText) {
        this.pText = pText;
    }

    public String getPPicture() {
        return pPicture;
    }

    public void setPPicture(String pPicture) {
        this.pPicture = pPicture;
    }

    public boolean getPActive() {
        return pActive;
    }

    public void setPActive(boolean pActive) {
        this.pActive = pActive;
    }

    public String getPuserCreate() {
        return puserCreate;
    }

    public void setPuserCreate(String puserCreate) {
        this.puserCreate = puserCreate;
    }

    public String getPuserUpdate() {
        return puserUpdate;
    }

    public void setPuserUpdate(String puserUpdate) {
        this.puserUpdate = puserUpdate;
    }

    public Date getPdateCreate() {
        return pdateCreate;
    }

    public void setPdateCreate(Date pdateCreate) {
        this.pdateCreate = pdateCreate;
    }

    public Date getPdateUpdate() {
        return pdateUpdate;
    }

    public void setPdateUpdate(Date pdateUpdate) {
        this.pdateUpdate = pdateUpdate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pId != null ? pId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Publicidad)) {
            return false;
        }
        Publicidad other = (Publicidad) object;
        if ((this.pId == null && other.pId != null) || (this.pId != null && !this.pId.equals(other.pId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.synergygb.panama.democda.models.db.Publicidad[ pId=" + pId + " ]";
    }

}
