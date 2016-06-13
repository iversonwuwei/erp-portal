package com.walden.entity;

import javax.persistence.*;

/**
 * Created by walden on 16/6/13.
 */
@Entity
@Table(name = "driver", schema = "goTurf", catalog = "")
public class DriverEntity {
    private int driverId;
    private String driverName;
    private String driverCompany;
    private String driverSex;
    private String driverAge;
    private String driverHealth;
    private String isOnline;
    private String driverContactNumber;
    private String driverEmail;
    private String driverAddress;

    @Id
    @Column(name = "driver_id")
    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    @Basic
    @Column(name = "driver_name")
    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    @Basic
    @Column(name = "driver_company")
    public String getDriverCompany() {
        return driverCompany;
    }

    public void setDriverCompany(String driverCompany) {
        this.driverCompany = driverCompany;
    }

    @Basic
    @Column(name = "driver_sex")
    public String getDriverSex() {
        return driverSex;
    }

    public void setDriverSex(String driverSex) {
        this.driverSex = driverSex;
    }

    @Basic
    @Column(name = "driver_age")
    public String getDriverAge() {
        return driverAge;
    }

    public void setDriverAge(String driverAge) {
        this.driverAge = driverAge;
    }

    @Basic
    @Column(name = "driver_health")
    public String getDriverHealth() {
        return driverHealth;
    }

    public void setDriverHealth(String driverHealth) {
        this.driverHealth = driverHealth;
    }

    @Basic
    @Column(name = "is_online")
    public String getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(String isOnline) {
        this.isOnline = isOnline;
    }

    @Basic
    @Column(name = "driver_contact_number")
    public String getDriverContactNumber() {
        return driverContactNumber;
    }

    public void setDriverContactNumber(String driverContactNumber) {
        this.driverContactNumber = driverContactNumber;
    }

    @Basic
    @Column(name = "driver_email")
    public String getDriverEmail() {
        return driverEmail;
    }

    public void setDriverEmail(String driverEmail) {
        this.driverEmail = driverEmail;
    }

    @Basic
    @Column(name = "driver_address")
    public String getDriverAddress() {
        return driverAddress;
    }

    public void setDriverAddress(String driverAddress) {
        this.driverAddress = driverAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DriverEntity that = (DriverEntity) o;

        if (driverId != that.driverId) return false;
        if (driverName != null ? !driverName.equals(that.driverName) : that.driverName != null) return false;
        if (driverCompany != null ? !driverCompany.equals(that.driverCompany) : that.driverCompany != null)
            return false;
        if (driverSex != null ? !driverSex.equals(that.driverSex) : that.driverSex != null) return false;
        if (driverAge != null ? !driverAge.equals(that.driverAge) : that.driverAge != null) return false;
        if (driverHealth != null ? !driverHealth.equals(that.driverHealth) : that.driverHealth != null) return false;
        if (isOnline != null ? !isOnline.equals(that.isOnline) : that.isOnline != null) return false;
        if (driverContactNumber != null ? !driverContactNumber.equals(that.driverContactNumber) : that.driverContactNumber != null)
            return false;
        if (driverEmail != null ? !driverEmail.equals(that.driverEmail) : that.driverEmail != null) return false;
        if (driverAddress != null ? !driverAddress.equals(that.driverAddress) : that.driverAddress != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = driverId;
        result = 31 * result + (driverName != null ? driverName.hashCode() : 0);
        result = 31 * result + (driverCompany != null ? driverCompany.hashCode() : 0);
        result = 31 * result + (driverSex != null ? driverSex.hashCode() : 0);
        result = 31 * result + (driverAge != null ? driverAge.hashCode() : 0);
        result = 31 * result + (driverHealth != null ? driverHealth.hashCode() : 0);
        result = 31 * result + (isOnline != null ? isOnline.hashCode() : 0);
        result = 31 * result + (driverContactNumber != null ? driverContactNumber.hashCode() : 0);
        result = 31 * result + (driverEmail != null ? driverEmail.hashCode() : 0);
        result = 31 * result + (driverAddress != null ? driverAddress.hashCode() : 0);
        return result;
    }
}
