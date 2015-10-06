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
@Table(name = "contactos")
@NamedQueries({
    @NamedQuery(name = "Contactos.findAll", query = "SELECT c FROM Contactos c"),
    @NamedQuery(name = "Contactos.findByCId", query = "SELECT c FROM Contactos c WHERE c.cId = :cId"),
    @NamedQuery(name = "Contactos.findByCEmail", query = "SELECT c FROM Contactos c WHERE c.cEmail = :cEmail"),
    @NamedQuery(name = "Contactos.findByCPhone", query = "SELECT c FROM Contactos c WHERE c.cPhone = :cPhone"),
    @NamedQuery(name = "Contactos.findByCAddress", query = "SELECT c FROM Contactos c WHERE c.cAddress = :cAddress"),
    @NamedQuery(name = "Contactos.findByCaddressLatitude", query = "SELECT c FROM Contactos c WHERE c.caddressLatitude = :caddressLatitude"),
    @NamedQuery(name = "Contactos.findByCaddressLength", query = "SELECT c FROM Contactos c WHERE c.caddressLength = :caddressLength"),
    @NamedQuery(name = "Contactos.findByCuserCreate", query = "SELECT c FROM Contactos c WHERE c.cuserCreate = :cuserCreate"),
    @NamedQuery(name = "Contactos.findByCuserUpdate", query = "SELECT c FROM Contactos c WHERE c.cuserUpdate = :cuserUpdate"),
    @NamedQuery(name = "Contactos.findByCdateCreate", query = "SELECT c FROM Contactos c WHERE c.cdateCreate = :cdateCreate"),
    @NamedQuery(name = "Contactos.findByCdateUpdate", query = "SELECT c FROM Contactos c WHERE c.cdateUpdate = :cdateUpdate")})
public class Contactos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "c_id")
    private Integer cId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "c_email")
    private String cEmail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "c_phone")
    private String cPhone;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "c_address")
    private String cAddress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "c_addressLatitude")
    private float caddressLatitude;
    @Basic(optional = false)
    @NotNull
    @Column(name = "c_addressLength")
    private float caddressLength;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "c_userCreate")
    private String cuserCreate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "c_userUpdate")
    private String cuserUpdate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "c_dateCreate")
    @Temporal(TemporalType.DATE)
    private Date cdateCreate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "c_dateUpdate")
    @Temporal(TemporalType.DATE)
    private Date cdateUpdate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ridContacto")
    private Collection<RedesSociales> redesSocialesCollection;

    public Contactos() {
    }

    public Contactos(Integer cId) {
        this.cId = cId;
    }

    public Contactos(Integer cId, String cEmail, String cPhone, String cAddress, float caddressLatitude, float caddressLength, String cuserCreate, String cuserUpdate, Date cdateCreate, Date cdateUpdate) {
        this.cId = cId;
        this.cEmail = cEmail;
        this.cPhone = cPhone;
        this.cAddress = cAddress;
        this.caddressLatitude = caddressLatitude;
        this.caddressLength = caddressLength;
        this.cuserCreate = cuserCreate;
        this.cuserUpdate = cuserUpdate;
        this.cdateCreate = cdateCreate;
        this.cdateUpdate = cdateUpdate;
    }

    public Integer getCId() {
        return cId;
    }

    public void setCId(Integer cId) {
        this.cId = cId;
    }

    public String getCEmail() {
        return cEmail;
    }

    public void setCEmail(String cEmail) {
        this.cEmail = cEmail;
    }

    public String getCPhone() {
        return cPhone;
    }

    public void setCPhone(String cPhone) {
        this.cPhone = cPhone;
    }

    public String getCAddress() {
        return cAddress;
    }

    public void setCAddress(String cAddress) {
        this.cAddress = cAddress;
    }

    public float getCaddressLatitude() {
        return caddressLatitude;
    }

    public void setCaddressLatitude(float caddressLatitude) {
        this.caddressLatitude = caddressLatitude;
    }

    public float getCaddressLength() {
        return caddressLength;
    }

    public void setCaddressLength(float caddressLength) {
        this.caddressLength = caddressLength;
    }

    public String getCuserCreate() {
        return cuserCreate;
    }

    public void setCuserCreate(String cuserCreate) {
        this.cuserCreate = cuserCreate;
    }

    public String getCuserUpdate() {
        return cuserUpdate;
    }

    public void setCuserUpdate(String cuserUpdate) {
        this.cuserUpdate = cuserUpdate;
    }

    public Date getCdateCreate() {
        return cdateCreate;
    }

    public void setCdateCreate(Date cdateCreate) {
        this.cdateCreate = cdateCreate;
    }

    public Date getCdateUpdate() {
        return cdateUpdate;
    }

    public void setCdateUpdate(Date cdateUpdate) {
        this.cdateUpdate = cdateUpdate;
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
        hash += (cId != null ? cId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contactos)) {
            return false;
        }
        Contactos other = (Contactos) object;
        if ((this.cId == null && other.cId != null) || (this.cId != null && !this.cId.equals(other.cId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.synergygb.panama.democda.models.db.Contactos[ cId=" + cId + " ]";
    }

}
