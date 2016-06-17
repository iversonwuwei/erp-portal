package com.walden.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by walden on 16/6/16.
 */
@Entity
@Table(name = "cutter", schema = "goTurf")
public class CutterEntity {

    private String cutter_id;
    private String cutter_name;
    private String cutter_sex;
    private String cutter_company;
    private String cutter_health;
    private String cutter_age;
    private String cutter_contact_number;
    private String cutter_address;
    private String cutter_email;
    private String is_online;

    @Id
    @Column(name = "cutter_id")
    public String getCutter_id() {
        return cutter_id;
    }

    @Column(name = "cutter_age")
    public String getCutter_age() {
        return cutter_age;
    }

    @Column(name = "cutter_company")
    public String getCutter_company() {
        return cutter_company;
    }

    @Column(name = "cutter_contact_number")
    public String getCutter_contact_number() {
        return cutter_contact_number;
    }

    @Column(name = "cutter_email")
    public String getCutter_email() {
        return cutter_email;
    }

    @Column(name = "cutter_health")
    public String getCutter_health() {
        return cutter_health;
    }

    @Column(name = "cutter_name")
    public String getCutter_name() {
        return cutter_name;
    }

    @Column(name = "cutter_sex")
    public String getCutter_sex() {
        return cutter_sex;
    }

    @Column(name = "is_online")
    public String getIs_online() {
        return is_online;
    }

    @Column(name = "cutter_address")
    public String getCutter_address() {
        return cutter_address;
    }

    public void setCutter_address(String cutter_address) {
        this.cutter_address = cutter_address;
    }

    public void setCutter_age(String cutter_age) {
        this.cutter_age = cutter_age;
    }

    public void setCutter_company(String cutter_company) {
        this.cutter_company = cutter_company;
    }

    public void setCutter_contact_number(String cutter_contact_number) {
        this.cutter_contact_number = cutter_contact_number;
    }

    public void setCutter_email(String cutter_email) {
        this.cutter_email = cutter_email;
    }

    public void setCutter_health(String cutter_health) {
        this.cutter_health = cutter_health;
    }

    public void setCutter_id(String cutter_id) {
        this.cutter_id = cutter_id;
    }

    public void setCutter_name(String cutter_name) {
        this.cutter_name = cutter_name;
    }

    public void setCutter_sex(String cutter_sex) {
        this.cutter_sex = cutter_sex;
    }

    public void setIs_online(String is_online) {
        this.is_online = is_online;
    }
}
