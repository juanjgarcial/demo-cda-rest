package com.synergygb.panama.democda.models.db;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "beneficios")
@NamedQueries({
    @NamedQuery(name = "Beneficios.findAll", query = "SELECT b FROM Beneficios b"),
    @NamedQuery(name = "Beneficios.findByBId", query = "SELECT b FROM Beneficios b WHERE b.bId = :bId"),
    @NamedQuery(name = "Beneficios.findByBPicture", query = "SELECT b FROM Beneficios b WHERE b.bPicture = :bPicture"),
    @NamedQuery(name = "Beneficios.findByBDetail", query = "SELECT b FROM Beneficios b WHERE b.bDetail = :bDetail"),
    @NamedQuery(name = "Beneficios.findByBpictureDetail", query = "SELECT b FROM Beneficios b WHERE b.bpictureDetail = :bpictureDetail"),
    @NamedQuery(name = "Beneficios.findByBuserCreate", query = "SELECT b FROM Beneficios b WHERE b.buserCreate = :buserCreate"),
    @NamedQuery(name = "Beneficios.findByBuserUpdate", query = "SELECT b FROM Beneficios b WHERE b.buserUpdate = :buserUpdate"),
    @NamedQuery(name = "Beneficios.findByBdateCreate", query = "SELECT b FROM Beneficios b WHERE b.bdateCreate = :bdateCreate"),
    @NamedQuery(name = "Beneficios.findByBdateUpdate", query = "SELECT b FROM Beneficios b WHERE b.bdateUpdate = :bdateUpdate")})
public class Beneficios implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "b_id")
    private Integer bId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "b_text")
    private String bText;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "b_picture")
    private String bPicture;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "b_detail")
    private String bDetail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "b_pictureDetail")
    private String bpictureDetail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "b_userCreate")
    private String buserCreate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "b_userUpdate")
    private String buserUpdate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "b_dateCreate")
    @Temporal(TemporalType.DATE)
    private Date bdateCreate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "b_dateUpdate")
    @Temporal(TemporalType.DATE)
    private Date bdateUpdate;

    public Beneficios() {
    }

    public Beneficios(Integer bId) {
        this.bId = bId;
    }

    public Beneficios(Integer bId, String bText, String bPicture, String bDetail, String bpictureDetail, String buserCreate, String buserUpdate, Date bdateCreate, Date bdateUpdate) {
        this.bId = bId;
        this.bText = bText;
        this.bPicture = bPicture;
        this.bDetail = bDetail;
        this.bpictureDetail = bpictureDetail;
        this.buserCreate = buserCreate;
        this.buserUpdate = buserUpdate;
        this.bdateCreate = bdateCreate;
        this.bdateUpdate = bdateUpdate;
    }

    public Integer getBId() {
        return bId;
    }

    public void setBId(Integer bId) {
        this.bId = bId;
    }

    public String getBText() {
        return bText;
    }

    public void setBText(String bText) {
        this.bText = bText;
    }

    public String getBPicture() {
        return bPicture;
    }

    public void setBPicture(String bPicture) {
        this.bPicture = bPicture;
    }

    public String getBDetail() {
        return bDetail;
    }

    public void setBDetail(String bDetail) {
        this.bDetail = bDetail;
    }

    public String getBpictureDetail() {
        return bpictureDetail;
    }

    public void setBpictureDetail(String bpictureDetail) {
        this.bpictureDetail = bpictureDetail;
    }

    public String getBuserCreate() {
        return buserCreate;
    }

    public void setBuserCreate(String buserCreate) {
        this.buserCreate = buserCreate;
    }

    public String getBuserUpdate() {
        return buserUpdate;
    }

    public void setBuserUpdate(String buserUpdate) {
        this.buserUpdate = buserUpdate;
    }

    public Date getBdateCreate() {
        return bdateCreate;
    }

    public void setBdateCreate(Date bdateCreate) {
        this.bdateCreate = bdateCreate;
    }

    public Date getBdateUpdate() {
        return bdateUpdate;
    }

    public void setBdateUpdate(Date bdateUpdate) {
        this.bdateUpdate = bdateUpdate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bId != null ? bId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Beneficios)) {
            return false;
        }
        Beneficios other = (Beneficios) object;
        if ((this.bId == null && other.bId != null) || (this.bId != null && !this.bId.equals(other.bId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.synergygb.panama.democda.models.db.Beneficios[ bId=" + bId + " ]";
    }

}
