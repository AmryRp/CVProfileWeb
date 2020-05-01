/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amryramadhanprasetya.cv.model;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author amry4
 */
@Entity
@Table(name = "experience")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Experience.findAll", query = "SELECT e FROM Experience e")
    , @NamedQuery(name = "Experience.findById", query = "SELECT e FROM Experience e WHERE e.id = :id")
    , @NamedQuery(name = "Experience.findByNama", query = "SELECT e FROM Experience e WHERE e.nama = :nama")
    , @NamedQuery(name = "Experience.findByDeskripsi", query = "SELECT e FROM Experience e WHERE e.deskripsi = :deskripsi")
    , @NamedQuery(name = "Experience.findByMulai", query = "SELECT e FROM Experience e WHERE e.mulai = :mulai")
    , @NamedQuery(name = "Experience.findBySelesai", query = "SELECT e FROM Experience e WHERE e.selesai = :selesai")})
public class Experience implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 44)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "deskripsi")
    private String deskripsi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mulai")
    @Temporal(TemporalType.DATE)
    private Date mulai;
    @Basic(optional = false)
    @NotNull
    @Column(name = "selesai")
    @Temporal(TemporalType.DATE)
    private Date selesai;

    public Experience() {
    }

    public Experience(Integer id) {
        this.id = id;
    }

    public Experience(Integer id, String nama, String deskripsi, Date mulai, Date selesai) {
        this.id = id;
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.mulai = mulai;
        this.selesai = selesai;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public Date getMulai() {
        return mulai;
    }

    public void setMulai(Date mulai) {
        this.mulai = mulai;
    }

    public Date getSelesai() {
        return selesai;
    }

    public void setSelesai(Date selesai) {
        this.selesai = selesai;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Experience)) {
            return false;
        }
        Experience other = (Experience) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.amryramadhanprasetya.cv.model.Experience[ id=" + id + " ]";
    }
    
}
