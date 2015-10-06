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
@Table(name = "preguntas_frecuentes")
@NamedQueries({
    @NamedQuery(name = "PreguntasFrecuentes.findAll", query = "SELECT p FROM PreguntasFrecuentes p"),
    @NamedQuery(name = "PreguntasFrecuentes.findByPfId", query = "SELECT p FROM PreguntasFrecuentes p WHERE p.pfId = :pfId"),
    @NamedQuery(name = "PreguntasFrecuentes.findByPfQuestion", query = "SELECT p FROM PreguntasFrecuentes p WHERE p.pfQuestion = :pfQuestion"),
    @NamedQuery(name = "PreguntasFrecuentes.findByPfuserCreate", query = "SELECT p FROM PreguntasFrecuentes p WHERE p.pfuserCreate = :pfuserCreate"),
    @NamedQuery(name = "PreguntasFrecuentes.findByPfuserUpdate", query = "SELECT p FROM PreguntasFrecuentes p WHERE p.pfuserUpdate = :pfuserUpdate"),
    @NamedQuery(name = "PreguntasFrecuentes.findByPfdateCreate", query = "SELECT p FROM PreguntasFrecuentes p WHERE p.pfdateCreate = :pfdateCreate"),
    @NamedQuery(name = "PreguntasFrecuentes.findByPfdateUpdate", query = "SELECT p FROM PreguntasFrecuentes p WHERE p.pfdateUpdate = :pfdateUpdate")})
public class PreguntasFrecuentes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pf_id")
    private Integer pfId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "pf_question")
    private String pfQuestion;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "pf_answer")
    private String pfAnswer;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "pf_userCreate")
    private String pfuserCreate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "pf_userUpdate")
    private String pfuserUpdate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pf_dateCreate")
    @Temporal(TemporalType.DATE)
    private Date pfdateCreate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pf_dateUpdate")
    @Temporal(TemporalType.DATE)
    private Date pfdateUpdate;

    public PreguntasFrecuentes() {
    }

    public PreguntasFrecuentes(Integer pfId) {
        this.pfId = pfId;
    }

    public PreguntasFrecuentes(Integer pfId, String pfQuestion, String pfAnswer, String pfuserCreate, String pfuserUpdate, Date pfdateCreate, Date pfdateUpdate) {
        this.pfId = pfId;
        this.pfQuestion = pfQuestion;
        this.pfAnswer = pfAnswer;
        this.pfuserCreate = pfuserCreate;
        this.pfuserUpdate = pfuserUpdate;
        this.pfdateCreate = pfdateCreate;
        this.pfdateUpdate = pfdateUpdate;
    }

    public Integer getPfId() {
        return pfId;
    }

    public void setPfId(Integer pfId) {
        this.pfId = pfId;
    }

    public String getPfQuestion() {
        return pfQuestion;
    }

    public void setPfQuestion(String pfQuestion) {
        this.pfQuestion = pfQuestion;
    }

    public String getPfAnswer() {
        return pfAnswer;
    }

    public void setPfAnswer(String pfAnswer) {
        this.pfAnswer = pfAnswer;
    }

    public String getPfuserCreate() {
        return pfuserCreate;
    }

    public void setPfuserCreate(String pfuserCreate) {
        this.pfuserCreate = pfuserCreate;
    }

    public String getPfuserUpdate() {
        return pfuserUpdate;
    }

    public void setPfuserUpdate(String pfuserUpdate) {
        this.pfuserUpdate = pfuserUpdate;
    }

    public Date getPfdateCreate() {
        return pfdateCreate;
    }

    public void setPfdateCreate(Date pfdateCreate) {
        this.pfdateCreate = pfdateCreate;
    }

    public Date getPfdateUpdate() {
        return pfdateUpdate;
    }

    public void setPfdateUpdate(Date pfdateUpdate) {
        this.pfdateUpdate = pfdateUpdate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pfId != null ? pfId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PreguntasFrecuentes)) {
            return false;
        }
        PreguntasFrecuentes other = (PreguntasFrecuentes) object;
        if ((this.pfId == null && other.pfId != null) || (this.pfId != null && !this.pfId.equals(other.pfId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.synergygb.panama.democda.models.db.PreguntasFrecuentes[ pfId=" + pfId + " ]";
    }

}
