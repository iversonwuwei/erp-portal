package com.walden.entity;

import javax.persistence.*;

/**
 * Created by walden on 16/6/13.
 */
@Entity
@Table(name = "layer", schema = "goTurf", catalog = "")
public class LayerEntity {
    private int layerId;
    private String layerName;
    private String layerCompany;
    private String layerSex;
    private String layerAge;
    private String layerHealth;
    private String layerContactNumber;
    private String layerEmail;
    private String layerAddress;
    private String isOnline;

    @Id
    @Column(name = "layer_id")
    public int getLayerId() {
        return layerId;
    }

    public void setLayerId(int layerId) {
        this.layerId = layerId;
    }

    @Basic
    @Column(name = "layer_name")
    public String getLayerName() {
        return layerName;
    }

    public void setLayerName(String layerName) {
        this.layerName = layerName;
    }

    @Basic
    @Column(name = "layer_company")
    public String getLayerCompany() {
        return layerCompany;
    }

    public void setLayerCompany(String layerCompany) {
        this.layerCompany = layerCompany;
    }

    @Basic
    @Column(name = "layer_sex")
    public String getLayerSex() {
        return layerSex;
    }

    public void setLayerSex(String layerSex) {
        this.layerSex = layerSex;
    }

    @Basic
    @Column(name = "layer_age")
    public String getLayerAge() {
        return layerAge;
    }

    public void setLayerAge(String layerAge) {
        this.layerAge = layerAge;
    }

    @Basic
    @Column(name = "layer_health")
    public String getLayerHealth() {
        return layerHealth;
    }

    public void setLayerHealth(String layerHealth) {
        this.layerHealth = layerHealth;
    }

    @Basic
    @Column(name = "layer_contact_number")
    public String getLayerContactNumber() {
        return layerContactNumber;
    }

    public void setLayerContactNumber(String layerContactNumber) {
        this.layerContactNumber = layerContactNumber;
    }

    @Basic
    @Column(name = "layer_email")
    public String getLayerEmail() {
        return layerEmail;
    }

    public void setLayerEmail(String layerEmail) {
        this.layerEmail = layerEmail;
    }

    @Basic
    @Column(name = "layer_address")
    public String getLayerAddress() {
        return layerAddress;
    }

    public void setLayerAddress(String layerAddress) {
        this.layerAddress = layerAddress;
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

        LayerEntity that = (LayerEntity) o;

        if (layerId != that.layerId) return false;
        if (layerName != null ? !layerName.equals(that.layerName) : that.layerName != null) return false;
        if (layerCompany != null ? !layerCompany.equals(that.layerCompany) : that.layerCompany != null) return false;
        if (layerSex != null ? !layerSex.equals(that.layerSex) : that.layerSex != null) return false;
        if (layerAge != null ? !layerAge.equals(that.layerAge) : that.layerAge != null) return false;
        if (layerHealth != null ? !layerHealth.equals(that.layerHealth) : that.layerHealth != null) return false;
        if (layerContactNumber != null ? !layerContactNumber.equals(that.layerContactNumber) : that.layerContactNumber != null)
            return false;
        if (layerEmail != null ? !layerEmail.equals(that.layerEmail) : that.layerEmail != null) return false;
        if (layerAddress != null ? !layerAddress.equals(that.layerAddress) : that.layerAddress != null) return false;
        if (isOnline != null ? !isOnline.equals(that.isOnline) : that.isOnline != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = layerId;
        result = 31 * result + (layerName != null ? layerName.hashCode() : 0);
        result = 31 * result + (layerCompany != null ? layerCompany.hashCode() : 0);
        result = 31 * result + (layerSex != null ? layerSex.hashCode() : 0);
        result = 31 * result + (layerAge != null ? layerAge.hashCode() : 0);
        result = 31 * result + (layerHealth != null ? layerHealth.hashCode() : 0);
        result = 31 * result + (layerContactNumber != null ? layerContactNumber.hashCode() : 0);
        result = 31 * result + (layerEmail != null ? layerEmail.hashCode() : 0);
        result = 31 * result + (layerAddress != null ? layerAddress.hashCode() : 0);
        result = 31 * result + (isOnline != null ? isOnline.hashCode() : 0);
        return result;
    }
}
