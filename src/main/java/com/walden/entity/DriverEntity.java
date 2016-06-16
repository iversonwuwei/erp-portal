package com.walden.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by walden on 16/6/16.
 */
@Entity
@Table(name = "driver", schema = "goTurf")
public class DriverEntity {

    private String driver_id;
    private String driver_name;
    private String driver_company;
    private String driver_sex;
    private String driver_age;
    private String driver_health;
    private String is_online;
    private String driver_contact_number;
    private String driver_email;
    private String driver_address;


    @Id
    @Column(name = "driver_id")
    public String getDriver_id() {
        return driver_id;
    }

    @Column(name = "is_online")
    public String getIs_online() {
        return is_online;
    }

    @Column(name = "driver_address")
    public String getDriver_address() {
        return driver_address;
    }

    @Column(name = "driver_age")
    public String getDriver_age() {
        return driver_age;
    }

    @Column(name = "driver_company")
    public String getDriver_company() {
        return driver_company;
    }

    @Column(name = "driver_contact_number")
    public String getDriver_contact_number() {
        return driver_contact_number;
    }

    @Column(name = "driver_email")
    public String getDriver_email() {
        return driver_email;
    }

    @Column(name = "driver_health")
    public String getDriver_health() {
        return driver_health;
    }

    @Column(name = "driver_name")
    public String getDriver_name() {
        return driver_name;
    }

    @Column(name = "driver_sex")
    public String getDriver_sex() {
        return driver_sex;
    }

    public void setIs_online(String is_online) {
        this.is_online = is_online;
    }

    public void setDriver_address(String driver_address) {
        this.driver_address = driver_address;
    }

    public void setDriver_age(String driver_age) {
        this.driver_age = driver_age;
    }

    public void setDriver_company(String driver_company) {
        this.driver_company = driver_company;
    }

    public void setDriver_contact_number(String driver_contact_number) {
        this.driver_contact_number = driver_contact_number;
    }

    public void setDriver_email(String driver_email) {
        this.driver_email = driver_email;
    }

    public void setDriver_health(String driver_health) {
        this.driver_health = driver_health;
    }

    public void setDriver_id(String driver_id) {
        this.driver_id = driver_id;
    }

    public void setDriver_name(String driver_name) {
        this.driver_name = driver_name;
    }

    public void setDriver_sex(String driver_sex) {
        this.driver_sex = driver_sex;
    }
}
