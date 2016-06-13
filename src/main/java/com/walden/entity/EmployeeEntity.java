package com.walden.entity;

import javax.persistence.*;

/**
 * Created by walden on 16/6/13.
 */
@Entity
@Table(name = "employee", schema = "goTurf", catalog = "")
public class EmployeeEntity {
    private int employeeId;
    private String employeeName;
    private String employeeContactNumber;
    private String employeeEmail;
    private String employeeAddress;
    private String employeeCompany;

    @Id
    @Column(name = "employee_id")
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Basic
    @Column(name = "employee_name")
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Basic
    @Column(name = "employee_contact_number")
    public String getEmployeeContactNumber() {
        return employeeContactNumber;
    }

    public void setEmployeeContactNumber(String employeeContactNumber) {
        this.employeeContactNumber = employeeContactNumber;
    }

    @Basic
    @Column(name = "employee_email")
    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    @Basic
    @Column(name = "employee_address")
    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    @Basic
    @Column(name = "employee_company")
    public String getEmployeeCompany() {
        return employeeCompany;
    }

    public void setEmployeeCompany(String employeeCompany) {
        this.employeeCompany = employeeCompany;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeEntity that = (EmployeeEntity) o;

        if (employeeId != that.employeeId) return false;
        if (employeeName != null ? !employeeName.equals(that.employeeName) : that.employeeName != null) return false;
        if (employeeContactNumber != null ? !employeeContactNumber.equals(that.employeeContactNumber) : that.employeeContactNumber != null)
            return false;
        if (employeeEmail != null ? !employeeEmail.equals(that.employeeEmail) : that.employeeEmail != null)
            return false;
        if (employeeAddress != null ? !employeeAddress.equals(that.employeeAddress) : that.employeeAddress != null)
            return false;
        if (employeeCompany != null ? !employeeCompany.equals(that.employeeCompany) : that.employeeCompany != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = employeeId;
        result = 31 * result + (employeeName != null ? employeeName.hashCode() : 0);
        result = 31 * result + (employeeContactNumber != null ? employeeContactNumber.hashCode() : 0);
        result = 31 * result + (employeeEmail != null ? employeeEmail.hashCode() : 0);
        result = 31 * result + (employeeAddress != null ? employeeAddress.hashCode() : 0);
        result = 31 * result + (employeeCompany != null ? employeeCompany.hashCode() : 0);
        return result;
    }
}
