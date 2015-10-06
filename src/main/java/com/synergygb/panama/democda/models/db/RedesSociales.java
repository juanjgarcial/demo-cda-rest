package com.synergygb.panama.democda.models.db;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "redes_sociales")
@NamedQueries({
    @NamedQuery(name = "RedesSociales.findAll", query = "SELECT r FROM RedesSociales r"),
    @NamedQuery(name = "RedesSociales.findByRId", query = "SELECT r FROM RedesSociales r WHERE r.rId = :rId"),
    @NamedQuery(name = "RedesSociales.findByRTitle", query = "SELECT r FROM RedesSociales r WHERE r.rTitle = :rTitle"),
    @NamedQuery(name = "RedesSociales.findByRLink", query = "SELECT r FROM RedesSociales r WHERE r.rLink = :rLink"),
    @NamedQuery(name = "RedesSociales.findByRuserCreate", query = "SELECT r FROM RedesSociales r WHERE r.ruserCreate = :ruserCreate"),
    @NamedQuery(name = "RedesSociales.findByRuserUpdate", query = "SELECT r FROM RedesSociales r WHERE r.ruserUpdate = :ruserUpdate"),
    @NamedQuery(name = "RedesSociales.findByRdateCreate", query = "SELECT r FROM RedesSociales r WHERE r.rdateCreate = :rdateCreate"),
    @NamedQuery(name = "RedesSociales.findByRdateUpdate", query = "SELECT r FROM RedesSociales r WHERE r.rdateUpdate = :rdateUpdate")})
public class RedesSociales implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "r_id")
    private Integer rId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "r_title")
    private String rTitle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "r_link")
    private String rLink;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "r_userCreate")
    private String ruserCreate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "r_userUpdate")
    private String ruserUpdate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "r_dateCreate")
    @Temporal(TemporalType.DATE)
    private Date rdateCreate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "r_dateUpdate")
    @Temporal(TemporalType.DATE)
    private Date rdateUpdate;
    @JoinColumn(name = "r_tipo", referencedColumnName = "tr_id")
    @ManyToOne(optional = false)
    private TipoRedes rTipo;
    @JoinColumn(name = "r_idContacto", referencedColumnName = "c_id")
    @ManyToOne(optional = false)
    private Contactos ridContacto;

    public RedesSociales() {
    }

    public RedesSociales(Integer rId) {
        this.rId = rId;
    }

    public RedesSociales(Integer rId, String rTitle, String rLink, String ruserCreate, String ruserUpdate, Date rdateCreate, Date rdateUpdate) {
        this.rId = rId;
        this.rTitle = rTitle;
        this.rLink = rLink;
        this.ruserCreate = ruserCreate;
        this.ruserUpdate = ruserUpdate;
        this.rdateCreate = rdateCreate;
        this.rdateUpdate = rdateUpdate;
    }

    public Integer getRId() {
        return rId;
    }

    public void setRId(Integer rId) {
        this.rId = rId;
    }

    public String getRTitle() {
        return rTitle;
    }

    public void setRTitle(String rTitle) {
        this.rTitle = rTitle;
    }

    public String getRLink() {
        return rLink;
    }

    public void setRLink(String rLink) {
        this.rLink = rLink;
    }

    public String getRuserCreate() {
        return ruserCreate;
    }

    public void setRuserCreate(String ruserCreate) {
        this.ruserCreate = ruserCreate;
    }

    public String getRuserUpdate() {
        return ruserUpdate;
    }

    public void setRuserUpdate(String ruserUpdate) {
        this.ruserUpdate = ruserUpdate;
    }

    public Date getRdateCreate() {
        return rdateCreate;
    }

    public void setRdateCreate(Date rdateCreate) {
        this.rdateCreate = rdateCreate;
    }

    public Date getRdateUpdate() {
        return rdateUpdate;
    }

    public void setRdateUpdate(Date rdateUpdate) {
        this.rdateUpdate = rdateUpdate;
    }

    public TipoRedes getRTipo() {
        return rTipo;
    }

    public void setRTipo(TipoRedes rTipo) {
        this.rTipo = rTipo;
    }

    public Contactos getRidContacto() {
        return ridContacto;
    }

    public void setRidContacto(Contactos ridContacto) {
        this.ridContacto = ridContacto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rId != null ? rId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RedesSociales)) {
            return false;
        }
        RedesSociales other = (RedesSociales) object;
        if ((this.rId == null && other.rId != null) || (this.rId != null && !this.rId.equals(other.rId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.synergygb.panama.democda.models.db.RedesSociales[ rId=" + rId + " ]";
    }

}
