package com.synergygb.panama.democda.models.db;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name = "tipo_redes")
@NamedQueries({
    @NamedQuery(name = "TipoRedes.findAll", query = "SELECT t FROM TipoRedes t"),
    @NamedQuery(name = "TipoRedes.findByTrId", query = "SELECT t FROM TipoRedes t WHERE t.trId = :trId"),
    @NamedQuery(name = "TipoRedes.findByTrDescription", query = "SELECT t FROM TipoRedes t WHERE t.trDescription = :trDescription"),
    @NamedQuery(name = "TipoRedes.findByTruserCreate", query = "SELECT t FROM TipoRedes t WHERE t.truserCreate = :truserCreate"),
    @NamedQuery(name = "TipoRedes.findByTruserUpdate", query = "SELECT t FROM TipoRedes t WHERE t.truserUpdate = :truserUpdate"),
    @NamedQuery(name = "TipoRedes.findByTrdateCreate", query = "SELECT t FROM TipoRedes t WHERE t.trdateCreate = :trdateCreate"),
    @NamedQuery(name = "TipoRedes.findByTrdateUpdate", query = "SELECT t FROM TipoRedes t WHERE t.trdateUpdate = :trdateUpdate")})
public class TipoRedes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tr_id")
    private Integer trId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "tr_description")
    private String trDescription;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "tr_userCreate")
    private String truserCreate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "tr_userUpdate")
    private String truserUpdate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tr_dateCreate")
    @Temporal(TemporalType.DATE)
    private Date trdateCreate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tr_dateUpdate")
    @Temporal(TemporalType.DATE)
    private Date trdateUpdate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rTipo")
    private Collection<RedesSociales> redesSocialesCollection;

    public TipoRedes() {
    }

    public TipoRedes(Integer trId) {
        this.trId = trId;
    }

    public TipoRedes(Integer trId, String trDescription, String truserCreate, String truserUpdate, Date trdateCreate, Date trdateUpdate) {
        this.trId = trId;
        this.trDescription = trDescription;
        this.truserCreate = truserCreate;
        this.truserUpdate = truserUpdate;
        this.trdateCreate = trdateCreate;
        this.trdateUpdate = trdateUpdate;
    }

    public Integer getTrId() {
        return trId;
    }

    public void setTrId(Integer trId) {
        this.trId = trId;
    }

    public String getTrDescription() {
        return trDescription;
    }

    public void setTrDescription(String trDescription) {
        this.trDescription = trDescription;
    }

    public String getTruserCreate() {
        return truserCreate;
    }

    public void setTruserCreate(String truserCreate) {
        this.truserCreate = truserCreate;
    }

    public String getTruserUpdate() {
        return truserUpdate;
    }

    public void setTruserUpdate(String truserUpdate) {
        this.truserUpdate = truserUpdate;
    }

    public Date getTrdateCreate() {
        return trdateCreate;
    }

    public void setTrdateCreate(Date trdateCreate) {
        this.trdateCreate = trdateCreate;
    }

    public Date getTrdateUpdate() {
        return trdateUpdate;
    }

    public void setTrdateUpdate(Date trdateUpdate) {
        this.trdateUpdate = trdateUpdate;
    }

    public Collection<RedesSociales> getRedesSocialesCollection() {
        return redesSocialesCollection;
    }

    public void setRedesSocialesCollection(Collection<RedesSociales> redesSocialesCollection) {
        this.redesSocialesCollection = redesSocialesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trId != null ? trId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoRedes)) {
            return false;
        }
        TipoRedes other = (TipoRedes) object;
        if ((this.trId == null && other.trId != null) || (this.trId != null && !this.trId.equals(other.trId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.synergygb.panama.democda.models.db.TipoRedes[ trId=" + trId + " ]";
    }

}
