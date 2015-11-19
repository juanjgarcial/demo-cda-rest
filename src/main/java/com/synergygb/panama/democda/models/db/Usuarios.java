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
@Table(name = "usuarios")
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u"),
    @NamedQuery(name = "Usuarios.findByUId", query = "SELECT u FROM Usuarios u WHERE u.uId = :uId"),
    @NamedQuery(name = "Usuarios.findByUName", query = "SELECT u FROM Usuarios u WHERE u.uName = :uName"),
    @NamedQuery(name = "Usuarios.findByULastname", query = "SELECT u FROM Usuarios u WHERE u.uLastname = :uLastname"),
    @NamedQuery(name = "Usuarios.findByUEmail", query = "SELECT u FROM Usuarios u WHERE u.uEmail = :uEmail"),
    @NamedQuery(name = "Usuarios.findByUPhone", query = "SELECT u FROM Usuarios u WHERE u.uPhone = :uPhone"),
    @NamedQuery(name = "Usuarios.findByUPicture", query = "SELECT u FROM Usuarios u WHERE u.uPicture = :uPicture"),
    @NamedQuery(name = "Usuarios.findByUUser", query = "SELECT u FROM Usuarios u WHERE u.uUser = :uUser"),
    @NamedQuery(name = "Usuarios.findByUPassword", query = "SELECT u FROM Usuarios u WHERE u.uPassword = :uPassword"),
    @NamedQuery(name = "Usuarios.findByUuserCreate", query = "SELECT u FROM Usuarios u WHERE u.uuserCreate = :uuserCreate"),
    @NamedQuery(name = "Usuarios.findByUuserUpdate", query = "SELECT u FROM Usuarios u WHERE u.uuserUpdate = :uuserUpdate"),
    @NamedQuery(name = "Usuarios.findByUdateCreate", query = "SELECT u FROM Usuarios u WHERE u.udateCreate = :udateCreate"),
    @NamedQuery(name = "Usuarios.findByUdateUpdate", query = "SELECT u FROM Usuarios u WHERE u.udateUpdate = :udateUpdate"),
    @NamedQuery(name = "Usuarios.findByUPermitology", query = "SELECT u FROM Usuarios u WHERE u.uPermitology = :uPermitology")})
public class Usuarios implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "u_id")
    private Integer uId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "u_name")
    private String uName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "u_lastname")
    private String uLastname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "u_email")
    private String uEmail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "u_phone")
    private String uPhone;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "u_picture")
    private String uPicture;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "u_user")
    private String uUser;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "u_password")
    private String uPassword;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "u_userCreate")
    private String uuserCreate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "u_userUpdate")
    private String uuserUpdate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "u_dateCreate")
    @Temporal(TemporalType.DATE)
    private Date udateCreate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "u_dateUpdate")
    @Temporal(TemporalType.DATE)
    private Date udateUpdate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "u_permitology")
    private String uPermitology;
    @JoinColumn(name = "u_tipo", referencedColumnName = "tu_id")
    @ManyToOne(optional = false)
    private TipoUsuarios uTipo;

    public Usuarios() {
    }

    public Usuarios(Integer uId) {
        this.uId = uId;
    }

    public Usuarios(Integer uId, String uName, String uLastname, String uEmail, String uPhone, String uPicture, String uUser, String uPassword, String uuserCreate, String uuserUpdate, Date udateCreate, Date udateUpdate, String uPermitology) {
        this.uId = uId;
        this.uName = uName;
        this.uLastname = uLastname;
        this.uEmail = uEmail;
        this.uPhone = uPhone;
        this.uPicture = uPicture;
        this.uUser = uUser;
        this.uPassword = uPassword;
        this.uuserCreate = uuserCreate;
        this.uuserUpdate = uuserUpdate;
        this.udateCreate = udateCreate;
        this.udateUpdate = udateUpdate;
        this.uPermitology = uPermitology;
    }

    public Integer getUId() {
        return uId;
    }

    public void setUId(Integer uId) {
        this.uId = uId;
    }

    public String getUName() {
        return uName;
    }

    public void setUName(String uName) {
        this.uName = uName;
    }

    public String getULastname() {
        return uLastname;
    }

    public void setULastname(String uLastname) {
        this.uLastname = uLastname;
    }

    public String getUEmail() {
        return uEmail;
    }

    public void setUEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public String getUPhone() {
        return uPhone;
    }

    public void setUPhone(String uPhone) {
        this.uPhone = uPhone;
    }

    public String getUPicture() {
        return uPicture;
    }

    public void setUPicture(String uPicture) {
        this.uPicture = uPicture;
    }

    public String getUUser() {
        return uUser;
    }

    public void setUUser(String uUser) {
        this.uUser = uUser;
    }

    public String getUPassword() {
        return uPassword;
    }

    public void setUPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public String getUuserCreate() {
        return uuserCreate;
    }

    public void setUuserCreate(String uuserCreate) {
        this.uuserCreate = uuserCreate;
    }

    public String getUuserUpdate() {
        return uuserUpdate;
    }

    public void setUuserUpdate(String uuserUpdate) {
        this.uuserUpdate = uuserUpdate;
    }

    public Date getUdateCreate() {
        return udateCreate;
    }

    public void setUdateCreate(Date udateCreate) {
        this.udateCreate = udateCreate;
    }

    public Date getUdateUpdate() {
        return udateUpdate;
    }

    public void setUdateUpdate(Date udateUpdate) {
        this.udateUpdate = udateUpdate;
    }

    public String getUPermitology() {
        return uPermitology;
    }

    public void setUPermitology(String uPermitology) {
        this.uPermitology = uPermitology;
    }

    public TipoUsuarios getUTipo() {
        return uTipo;
    }

    public void setUTipo(TipoUsuarios uTipo) {
        this.uTipo = uTipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uId != null ? uId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.uId == null && other.uId != null) || (this.uId != null && !this.uId.equals(other.uId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.synergygb.panama.democda.models.db.Usuarios[ uId=" + uId + " ]";
    }

}
