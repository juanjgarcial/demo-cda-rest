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
@Table(name = "sucursales")
@NamedQueries({
    @NamedQuery(name = "Sucursales.findAll", query = "SELECT s FROM Sucursales s"),
    @NamedQuery(name = "Sucursales.findBySId", query = "SELECT s FROM Sucursales s WHERE s.sId = :sId"),
    @NamedQuery(name = "Sucursales.findBySAddress", query = "SELECT s FROM Sucursales s WHERE s.sAddress = :sAddress"),
    @NamedQuery(name = "Sucursales.findBySLatitude", query = "SELECT s FROM Sucursales s WHERE s.sLatitude = :sLatitude"),
    @NamedQuery(name = "Sucursales.findBySLength", query = "SELECT s FROM Sucursales s WHERE s.sLength = :sLength"),
    @NamedQuery(name = "Sucursales.findByShoursFrom", query = "SELECT s FROM Sucursales s WHERE s.shoursFrom = :shoursFrom"),
    @NamedQuery(name = "Sucursales.findByShoursUntil", query = "SELECT s FROM Sucursales s WHERE s.shoursUntil = :shoursUntil"),
    @NamedQuery(name = "Sucursales.findByStypeEstablishment", query = "SELECT s FROM Sucursales s WHERE s.stypeEstablishment = :stypeEstablishment"),
    @NamedQuery(name = "Sucursales.findBySName", query = "SELECT s FROM Sucursales s WHERE s.sName = :sName"),
    @NamedQuery(name = "Sucursales.findBySPicture", query = "SELECT s FROM Sucursales s WHERE s.sPicture = :sPicture"),
    @NamedQuery(name = "Sucursales.findByStypeHours", query = "SELECT s FROM Sucursales s WHERE s.stypeHours = :stypeHours"),
    @NamedQuery(name = "Sucursales.findBySuserCreate", query = "SELECT s FROM Sucursales s WHERE s.suserCreate = :suserCreate"),
    @NamedQuery(name = "Sucursales.findBySuserUpdate", query = "SELECT s FROM Sucursales s WHERE s.suserUpdate = :suserUpdate"),
    @NamedQuery(name = "Sucursales.findBySdateCreate", query = "SELECT s FROM Sucursales s WHERE s.sdateCreate = :sdateCreate"),
    @NamedQuery(name = "Sucursales.findBySdateUpdate", query = "SELECT s FROM Sucursales s WHERE s.sdateUpdate = :sdateUpdate")})
public class Sucursales implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "s_id")
    private Integer sId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "s_address")
    private String sAddress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "s_latitude")
    private float sLatitude;
    @Basic(optional = false)
    @NotNull
    @Column(name = "s_length")
    private float sLength;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "s_hoursFrom")
    private String shoursFrom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "s_hoursUntil")
    private String shoursUntil;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "s_typeEstablishment")
    private String stypeEstablishment;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "s_name")
    private String sName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "s_picture")
    private String sPicture;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "s_typeHours")
    private String stypeHours;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "s_userCreate")
    private String suserCreate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "s_userUpdate")
    private String suserUpdate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "s_dateCreate")
    @Temporal(TemporalType.DATE)
    private Date sdateCreate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "s_dateUpdate")
    @Temporal(TemporalType.DATE)
    private Date sdateUpdate;

    public Sucursales() {
    }

    public Sucursales(Integer sId) {
        this.sId = sId;
    }

    public Sucursales(Integer sId, String sAddress, float sLatitude, float sLength, String shoursFrom, String shoursUntil, String stypeEstablishment, String sName, String sPicture, String stypeHours, String suserCreate, String suserUpdate, Date sdateCreate, Date sdateUpdate) {
        this.sId = sId;
        this.sAddress = sAddress;
        this.sLatitude = sLatitude;
        this.sLength = sLength;
        this.shoursFrom = shoursFrom;
        this.shoursUntil = shoursUntil;
        this.stypeEstablishment = stypeEstablishment;
        this.sName = sName;
        this.sPicture = sPicture;
        this.stypeHours = stypeHours;
        this.suserCreate = suserCreate;
        this.suserUpdate = suserUpdate;
        this.sdateCreate = sdateCreate;
        this.sdateUpdate = sdateUpdate;
    }

    public Integer getSId() {
        return sId;
    }

    public void setSId(Integer sId) {
        this.sId = sId;
    }

    public String getSAddress() {
        return sAddress;
    }

    public void setSAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    public float getSLatitude() {
        return sLatitude;
    }

    public void setSLatitude(float sLatitude) {
        this.sLatitude = sLatitude;
    }

    public float getSLength() {
        return sLength;
    }

    public void setSLength(float sLength) {
        this.sLength = sLength;
    }

    public String getShoursFrom() {
        return shoursFrom;
    }

    public void setShoursFrom(String shoursFrom) {
        this.shoursFrom = shoursFrom;
    }

    public String getShoursUntil() {
        return shoursUntil;
    }

    public void setShoursUntil(String shoursUntil) {
        this.shoursUntil = shoursUntil;
    }

    public String getStypeEstablishment() {
        return stypeEstablishment;
    }

    public void setStypeEstablishment(String stypeEstablishment) {
        this.stypeEstablishment = stypeEstablishment;
    }

    public String getSName() {
        return sName;
    }

    public void setSName(String sName) {
        this.sName = sName;
    }

    public String getSPicture() {
        return sPicture;
    }

    public void setSPicture(String sPicture) {
        this.sPicture = sPicture;
    }

    public String getStypeHours() {
        return stypeHours;
    }

    public void setStypeHours(String stypeHours) {
        this.stypeHours = stypeHours;
    }

    public String getSuserCreate() {
        return suserCreate;
    }

    public void setSuserCreate(String suserCreate) {
        this.suserCreate = suserCreate;
    }

    public String getSuserUpdate() {
        return suserUpdate;
    }

    public void setSuserUpdate(String suserUpdate) {
        this.suserUpdate = suserUpdate;
    }

    public Date getSdateCreate() {
        return sdateCreate;
    }

    public void setSdateCreate(Date sdateCreate) {
        this.sdateCreate = sdateCreate;
    }

    public Date getSdateUpdate() {
        return sdateUpdate;
    }

    public void setSdateUpdate(Date sdateUpdate) {
        this.sdateUpdate = sdateUpdate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sId != null ? sId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sucursales)) {
            return false;
        }
        Sucursales other = (Sucursales) object;
        if ((this.sId == null && other.sId != null) || (this.sId != null && !this.sId.equals(other.sId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.synergygb.panama.democda.models.db.Sucursales[ sId=" + sId + " ]";
    }

}
