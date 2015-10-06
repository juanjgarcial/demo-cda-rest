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
@Table(name = "terminos_condiciones")
@NamedQueries({
    @NamedQuery(name = "TerminosCondiciones.findAll", query = "SELECT t FROM TerminosCondiciones t"),
    @NamedQuery(name = "TerminosCondiciones.findByTId", query = "SELECT t FROM TerminosCondiciones t WHERE t.tId = :tId"),
    @NamedQuery(name = "TerminosCondiciones.findByTuserCreate", query = "SELECT t FROM TerminosCondiciones t WHERE t.tuserCreate = :tuserCreate"),
    @NamedQuery(name = "TerminosCondiciones.findByTuserUpdate", query = "SELECT t FROM TerminosCondiciones t WHERE t.tuserUpdate = :tuserUpdate"),
    @NamedQuery(name = "TerminosCondiciones.findByTdateCreate", query = "SELECT t FROM TerminosCondiciones t WHERE t.tdateCreate = :tdateCreate"),
    @NamedQuery(name = "TerminosCondiciones.findByTdateUpdate", query = "SELECT t FROM TerminosCondiciones t WHERE t.tdateUpdate = :tdateUpdate")})
public class TerminosCondiciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "t_id")
    private Integer tId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "t_userCreate")
    private String tuserCreate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "t_userUpdate")
    private String tuserUpdate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "t_dateCreate")
    @Temporal(TemporalType.DATE)
    private Date tdateCreate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "t_dateUpdate")
    @Temporal(TemporalType.DATE)
    private Date tdateUpdate;

    public TerminosCondiciones() {
    }

    public TerminosCondiciones(Integer tId) {
        this.tId = tId;
    }

    public TerminosCondiciones(Integer tId, String tuserCreate, String tuserUpdate, Date tdateCreate, Date tdateUpdate) {
        this.tId = tId;
        this.tuserCreate = tuserCreate;
        this.tuserUpdate = tuserUpdate;
        this.tdateCreate = tdateCreate;
        this.tdateUpdate = tdateUpdate;
    }

    public Integer getTId() {
        return tId;
    }

    public void setTId(Integer tId) {
        this.tId = tId;
    }

    public String getTuserCreate() {
        return tuserCreate;
    }

    public void setTuserCreate(String tuserCreate) {
        this.tuserCreate = tuserCreate;
    }

    public String getTuserUpdate() {
        return tuserUpdate;
    }

    public void setTuserUpdate(String tuserUpdate) {
        this.tuserUpdate = tuserUpdate;
    }

    public Date getTdateCreate() {
        return tdateCreate;
    }

    public void setTdateCreate(Date tdateCreate) {
        this.tdateCreate = tdateCreate;
    }

    public Date getTdateUpdate() {
        return tdateUpdate;
    }

    public void setTdateUpdate(Date tdateUpdate) {
        this.tdateUpdate = tdateUpdate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tId != null ? tId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TerminosCondiciones)) {
            return false;
        }
        TerminosCondiciones other = (TerminosCondiciones) object;
        if ((this.tId == null && other.tId != null) || (this.tId != null && !this.tId.equals(other.tId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.synergygb.panama.democda.models.db.TerminosCondiciones[ tId=" + tId + " ]";
    }

}
