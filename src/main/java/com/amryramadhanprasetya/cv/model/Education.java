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
import javax.persistence.Lob;
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
@Table(name = "education")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Education.findAll", query = "SELECT e FROM Education e")
    , @NamedQuery(name = "Education.findById", query = "SELECT e FROM Education e WHERE e.id = :id")
    , @NamedQuery(name = "Education.findByNama", query = "SELECT e FROM Education e WHERE e.nama = :nama")
    , @NamedQuery(name = "Education.findByJurusan", query = "SELECT e FROM Education e WHERE e.jurusan = :jurusan")
    , @NamedQuery(name = "Education.findByMulai", query = "SELECT e FROM Education e WHERE e.mulai = :mulai")
    , @NamedQuery(name = "Education.findBySelesai", query = "SELECT e FROM Education e WHERE e.selesai = :selesai")
    , @NamedQuery(name = "Education.findByGpa", query = "SELECT e FROM Education e WHERE e.gpa = :gpa")})
public class Education implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "nama")
    private String nama;
    @Size(max = 16)
    @Column(name = "jurusan")
    private String jurusan;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "gpa")
    private long gpa;
    @Lob
    @Column(name = "logo")
    private byte[] logo;

    public Education() {
    }

    public Education(Integer id) {
        this.id = id;
    }

    public Education(Integer id, String nama, Date mulai, Date selesai, long gpa) {
        this.id = id;
        this.nama = nama;
        this.mulai = mulai;
        this.selesai = selesai;
        this.gpa = gpa;
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

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
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

    public long getGpa() {
        return gpa;
    }

    public void setGpa(long gpa) {
        this.gpa = gpa;
    }

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
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
        if (!(object instanceof Education)) {
            return false;
        }
        Education other = (Education) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.amryramadhanprasetya.cv.model.Education[ id=" + id + " ]";
    }
    
}
