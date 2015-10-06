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
@Table(name = "general_publicidad")
@NamedQueries({
    @NamedQuery(name = "GeneralPublicidad.findAll", query = "SELECT g FROM GeneralPublicidad g"),
    @NamedQuery(name = "GeneralPublicidad.findByGId", query = "SELECT g FROM GeneralPublicidad g WHERE g.gId = :gId"),
    @NamedQuery(name = "GeneralPublicidad.findByGactiveRotation", query = "SELECT g FROM GeneralPublicidad g WHERE g.gactiveRotation = :gactiveRotation"),
    @NamedQuery(name = "GeneralPublicidad.findByGtimeRotation", query = "SELECT g FROM GeneralPublicidad g WHERE g.gtimeRotation = :gtimeRotation"),
    @NamedQuery(name = "GeneralPublicidad.findByGuserCreate", query = "SELECT g FROM GeneralPublicidad g WHERE g.guserCreate = :guserCreate"),
    @NamedQuery(name = "GeneralPublicidad.findByGuserUpdate", query = "SELECT g FROM GeneralPublicidad g WHERE g.guserUpdate = :guserUpdate"),
    @NamedQuery(name = "GeneralPublicidad.findByGdateCreate", query = "SELECT g FROM GeneralPublicidad g WHERE g.gdateCreate = :gdateCreate"),
    @NamedQuery(name = "GeneralPublicidad.findByGdateUpdate", query = "SELECT g FROM GeneralPublicidad g WHERE g.gdateUpdate = :gdateUpdate")})
public class GeneralPublicidad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "g_id")
    private Integer gId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "g_activeRotation")
    private boolean gactiveRotation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "g_timeRotation")
    private int gtimeRotation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "g_userCreate")
    private String guserCreate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "g_userUpdate")
    private String guserUpdate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "g_dateCreate")
    @Temporal(TemporalType.DATE)
    private Date gdateCreate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "g_dateUpdate")
    @Temporal(TemporalType.DATE)
    private Date gdateUpdate;

    public GeneralPublicidad() {
    }

    public GeneralPublicidad(Integer gId) {
        this.gId = gId;
    }

    public GeneralPublicidad(Integer gId, boolean gactiveRotation, int gtimeRotation, String guserCreate, String guserUpdate, Date gdateCreate, Date gdateUpdate) {
        this.gId = gId;
        this.gactiveRotation = gactiveRotation;
        this.gtimeRotation = gtimeRotation;
        this.guserCreate = guserCreate;
        this.guserUpdate = guserUpdate;
        this.gdateCreate = gdateCreate;
        this.gdateUpdate = gdateUpdate;
    }

    public Integer getGId() {
        return gId;
    }

    public void setGId(Integer gId) {
        this.gId = gId;
    }

    public boolean getGactiveRotation() {
        return gactiveRotation;
    }

    public void setGactiveRotation(boolean gactiveRotation) {
        this.gactiveRotation = gactiveRotation;
    }

    public int getGtimeRotation() {
        return gtimeRotation;
    }

    public void setGtimeRotation(int gtimeRotation) {
        this.gtimeRotation = gtimeRotation;
    }

    public String getGuserCreate() {
        return guserCreate;
    }

    public void setGuserCreate(String guserCreate) {
        this.guserCreate = guserCreate;
    }

    public String getGuserUpdate() {
        return guserUpdate;
    }

    public void setGuserUpdate(String guserUpdate) {
        this.guserUpdate = guserUpdate;
    }

    public Date getGdateCreate() {
        return gdateCreate;
    }

    public void setGdateCreate(Date gdateCreate) {
        this.gdateCreate = gdateCreate;
    }

    public Date getGdateUpdate() {
        return gdateUpdate;
    }

    public void setGdateUpdate(Date gdateUpdate) {
        this.gdateUpdate = gdateUpdate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gId != null ? gId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GeneralPublicidad)) {
            return false;
        }
        GeneralPublicidad other = (GeneralPublicidad) object;
        if ((this.gId == null && other.gId != null) || (this.gId != null && !this.gId.equals(other.gId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.synergygb.panama.democda.models.db.GeneralPublicidad[ gId=" + gId + " ]";
    }

}
