package com.synergygb.panama.democda.models.db;

import java.io.Serializable;
import java.util.Collection;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Juan Garcia <juan.garcia@synergy-gb.com>
 */
@Entity
@Table(name = "tipo_usuarios")
@NamedQueries({
    @NamedQuery(name = "TipoUsuarios.findAll", query = "SELECT t FROM TipoUsuarios t"),
    @NamedQuery(name = "TipoUsuarios.findByTuId", query = "SELECT t FROM TipoUsuarios t WHERE t.tuId = :tuId"),
    @NamedQuery(name = "TipoUsuarios.findByTuDescription", query = "SELECT t FROM TipoUsuarios t WHERE t.tuDescription = :tuDescription")})
public class TipoUsuarios implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tu_id")
    private Integer tuId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "tu_description")
    private String tuDescription;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "uTipo")
    private Collection<Usuarios> usuariosCollection;

    public TipoUsuarios() {
    }

    public TipoUsuarios(Integer tuId) {
        this.tuId = tuId;
    }

    public TipoUsuarios(Integer tuId, String tuDescription) {
        this.tuId = tuId;
        this.tuDescription = tuDescription;
    }

    public Integer getTuId() {
        return tuId;
    }

    public void setTuId(Integer tuId) {
        this.tuId = tuId;
    }

    public String getTuDescription() {
        return tuDescription;
    }

    public void setTuDescription(String tuDescription) {
        this.tuDescription = tuDescription;
    }

    public Collection<Usuarios> getUsuariosCollection() {
        return usuariosCollection;
    }

    public void setUsuariosCollection(Collection<Usuarios> usuariosCollection) {
        this.usuariosCollection = usuariosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tuId != null ? tuId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoUsuarios)) {
            return false;
        }
        TipoUsuarios other = (TipoUsuarios) object;
        if ((this.tuId == null && other.tuId != null) || (this.tuId != null && !this.tuId.equals(other.tuId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.synergygb.panama.democda.models.db.TipoUsuarios[ tuId=" + tuId + " ]";
    }

}
