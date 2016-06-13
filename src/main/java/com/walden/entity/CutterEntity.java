package com.walden.entity;

import javax.persistence.*;

/**
 * Created by walden on 16/6/13.
 */
@Entity
@Table(name = "cutter", schema = "goTurf", catalog = "")
public class CutterEntity {
    private int cutterId;
    private String cutterName;
    private String cutterSex;
    private String cutterCompany;
    private String cutterHealth;
    private String cutterAge;
    private String cutterContactNumber;
    private String cutterAddress;
    private String cutterEmail;
    private String isOnline;

    @Id
    @Column(name = "cutter_id")
    public int getCutterId() {
        return cutterId;
    }

    public void setCutterId(int cutterId) {
        this.cutterId = cutterId;
    }

    @Basic
    @Column(name = "cutter_name")
    public String getCutterName() {
        return cutterName;
    }

    public void setCutterName(String cutterName) {
        this.cutterName = cutterName;
    }

    @Basic
    @Column(name = "cutter_sex")
    public String getCutterSex() {
        return cutterSex;
    }

    public void setCutterSex(String cutterSex) {
        this.cutterSex = cutterSex;
    }

    @Basic
    @Column(name = "cutter_company")
    public String getCutterCompany() {
        return cutterCompany;
    }

    public void setCutterCompany(String cutterCompany) {
        this.cutterCompany = cutterCompany;
    }

    @Basic
    @Column(name = "cutter_health")
    public String getCutterHealth() {
        return cutterHealth;
    }

    public void setCutterHealth(String cutterHealth) {
        this.cutterHealth = cutterHealth;
    }

    @Basic
    @Column(name = "cutter_age")
    public String getCutterAge() {
        return cutterAge;
    }

    public void setCutterAge(String cutterAge) {
        this.cutterAge = cutterAge;
    }

    @Basic
    @Column(name = "cutter_contact_number")
    public String getCutterContactNumber() {
        return cutterContactNumber;
    }

    public void setCutterContactNumber(String cutterContactNumber) {
        this.cutterContactNumber = cutterContactNumber;
    }

    @Basic
    @Column(name = "cutter_address")
    public String getCutterAddress() {
        return cutterAddress;
    }

    public void setCutterAddress(String cutterAddress) {
        this.cutterAddress = cutterAddress;
    }

    @Basic
    @Column(name = "cutter_email")
    public String getCutterEmail() {
        return cutterEmail;
    }

    public void setCutterEmail(String cutterEmail) {
        this.cutterEmail = cutterEmail;
    }

    @Basic
    @Column(name = "is_online")
    public String getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(String isOnline) {
        this.isOnline = isOnline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CutterEntity that = (CutterEntity) o;

        if (cutterId != that.cutterId) return false;
        if (cutterName != null ? !cutterName.equals(that.cutterName) : that.cutterName != null) return false;
        if (cutterSex != null ? !cutterSex.equals(that.cutterSex) : that.cutterSex != null) return false;
        if (cutterCompany != null ? !cutterCompany.equals(that.cutterCompany) : that.cutterCompany != null)
            return false;
        if (cutterHealth != null ? !cutterHealth.equals(that.cutterHealth) : that.cutterHealth != null) return false;
        if (cutterAge != null ? !cutterAge.equals(that.cutterAge) : that.cutterAge != null) return false;
        if (cutterContactNumber != null ? !cutterContactNumber.equals(that.cutterContactNumber) : that.cutterContactNumber != null)
            return false;
        if (cutterAddress != null ? !cutterAddress.equals(that.cutterAddress) : that.cutterAddress != null)
            return false;
        if (cutterEmail != null ? !cutterEmail.equals(that.cutterEmail) : that.cutterEmail != null) return false;
        if (isOnline != null ? !isOnline.equals(that.isOnline) : that.isOnline != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cutterId;
        result = 31 * result + (cutterName != null ? cutterName.hashCode() : 0);
        result = 31 * result + (cutterSex != null ? cutterSex.hashCode() : 0);
        result = 31 * result + (cutterCompany != null ? cutterCompany.hashCode() : 0);
        result = 31 * result + (cutterHealth != null ? cutterHealth.hashCode() : 0);
        result = 31 * result + (cutterAge != null ? cutterAge.hashCode() : 0);
        result = 31 * result + (cutterContactNumber != null ? cutterContactNumber.hashCode() : 0);
        result = 31 * result + (cutterAddress != null ? cutterAddress.hashCode() : 0);
        result = 31 * result + (cutterEmail != null ? cutterEmail.hashCode() : 0);
        result = 31 * result + (isOnline != null ? isOnline.hashCode() : 0);
        return result;
    }
}
