package com.walden.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by walden on 16/6/16.
 */
@Entity
@Table(name = "layer", schema = "goTurf")
public class LayerEntity {

    private String layer_id;
    private String layer_name;
    private String layer_company;
    private String layer_sex;
    private String layer_age;
    private String layer_health;
    private String layer_contact_number;
    private String layer_email;
    private String layer_address;
    private String is_online;

    @Id
    @Column(name = "layer_id")
    public String getLayer_id() {
        return layer_id;
    }

    @Column(name = "is_online")
    public String getIs_online() {
        return is_online;
    }

    @Column(name = "layer_address")
    public String getLayer_address() {
        return layer_address;
    }

    @Column(name = "layer_age")
    public String getLayer_age() {
        return layer_age;
    }

    @Column(name = "layer_company")
    public String getLayer_company() {
        return layer_company;
    }

    @Column(name = "layer_contact_number")
    public String getLayer_contact_number() {
        return layer_contact_number;
    }

    @Column(name = "layer_email")
    public String getLayer_email() {
        return layer_email;
    }

    @Column(name = "layer_health")
    public String getLayer_health() {
        return layer_health;
    }

    @Column(name = "layer_name")
    public String getLayer_name() {
        return layer_name;
    }

    @Column(name = "layer_sex")
    public String getLayer_sex() {
        return layer_sex;
    }

    public void setIs_online(String is_online) {
        this.is_online = is_online;
    }

    public void setLayer_address(String layer_address) {
        this.layer_address = layer_address;
    }

    public void setLayer_age(String layer_age) {
        this.layer_age = layer_age;
    }

    public void setLayer_company(String layer_company) {
        this.layer_company = layer_company;
    }

    public void setLayer_contact_number(String layer_contact_number) {
        this.layer_contact_number = layer_contact_number;
    }

    public void setLayer_email(String layer_email) {
        this.layer_email = layer_email;
    }

    public void setLayer_health(String layer_health) {
        this.layer_health = layer_health;
    }

    public void setLayer_id(String layer_id) {
        this.layer_id = layer_id;
    }

    public void setLayer_name(String layer_name) {
        this.layer_name = layer_name;
    }

    public void setLayer_sex(String layer_sex) {
        this.layer_sex = layer_sex;
    }
}
