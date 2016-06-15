package com.walden.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by walden on 16/6/15.
 */
@Entity
@Table(name = "turf", schema = "goTurf")
public class TurfEntity {

    private String turf_id;
    private String turf_type;
    private String turf_price;
    private String turf_supplier;

    @Id
    @Column(name = "turf_id")
    public String getTurf_id() {
        return turf_id;
    }

    @Column(name = "turf_price")
    public String getTurf_price() {
        return turf_price;
    }

    @Column(name = "turf_supplier")
    public String getTurf_supplier() {
        return turf_supplier;
    }

    @Column(name = "turf_type")
    public String getTurf_type() {
        return turf_type;
    }

    public void setTurf_id(String turf_id) {
        this.turf_id = turf_id;
    }

    public void setTurf_price(String turf_price) {
        this.turf_price = turf_price;
    }

    public void setTurf_supplier(String turf_supplier) {
        this.turf_supplier = turf_supplier;
    }

    public void setTurf_type(String turf_type) {
        this.turf_type = turf_type;
    }
}
