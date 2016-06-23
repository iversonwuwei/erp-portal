package com.walden.entity;

import javax.persistence.*;

/**
 * Created by walden on 16/6/13.
 */
@Entity
@Table(name = "order", schema = "goTurf")
public class OrderEntity {

    private String order_id;
    private String owner;
    private String customer_name;
    private String customer_contact;
    private String turf_varity;
    private int turf_quanutity;
    private String cutter;
    private String layer;
    private String driver;
    private float total_price;
    private String address_detail;
    private String delivery_date_time;
    private String submitted_date_time;
    private String order_status;
    private String customer_email;
    private String last_modified;
    private String modifier;
    private String turf_type;
    private String is_delete;

    public OrderEntity(){

    }

    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    @Column(name = "address_detail")
    public String getAddress_detail() {
        return address_detail;
    }

    @Column(name = "customer_contact")
    public String getCustomer_contact() {
        return customer_contact;
    }

    @Column(name = "customer_email")
    public String getCustomer_email() {
        return customer_email;
    }

    @Column(name = "customer_name")
    public String getCustomer_name() {
        return customer_name;
    }

    @Column(name = "cutter")
    public String getCutter() {
        return cutter;
    }

    @Column(name = "delivery_date_time")
    public String getDelivery_date_time() {
        return delivery_date_time;
    }

    @Column(name = "driver")
    public String getDriver() {
        return driver;
    }

    @Column(name = "layer")
    public String getLayer() {
        return layer;
    }

    @Column(name = "order_status")
    public String getOrder_status() {
        return order_status;
    }

    @Column(name = "owner")
    public String getOwner() {
        return owner;
    }

    @Column(name = "submitted_date_time")
    public String getSubmitted_date_time() {
        return submitted_date_time;
    }

    @Column(name = "total_price")
    public float getTotal_price() {
        return total_price;
    }

    @Column(name = "turf_quanutity")
    public int getTurf_quanutity() {
        return turf_quanutity;
    }

    @Column(name = "turf_varity")
    public String getTurf_varity() {
        return turf_varity;
    }

    @Column(name = "last_modified")
    public String getLast_modified() {
        return last_modified;
    }

    @Column(name = "modifier")
    public String getModifier() {
        return modifier;
    }

    @Column(name = "turf_type")
    public String getTurf_type() {
        return turf_type;
    }

    @Column(name = "is_delete")
    public String getIs_delete() {
        return is_delete;
    }

    public void setAddress_detail(String address_detail) {
        this.address_detail = address_detail;
    }

    public void setCustomer_contact(String customer_contact) {
        this.customer_contact = customer_contact;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public void setCutter(String cutter) {
        this.cutter = cutter;
    }

    public void setDelivery_date_time(String delivery_date_time) {
        this.delivery_date_time = delivery_date_time;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setLayer(String layer) {
        this.layer = layer;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setSubmitted_date_time(String submitted_date_time) {
        this.submitted_date_time = submitted_date_time;
    }

    public void setTotal_price(float total_price) {
        this.total_price = total_price;
    }

    public void setTurf_quanutity(int turf_quanutity) {
        this.turf_quanutity = turf_quanutity;
    }

    public void setTurf_varity(String turf_varity) {
        this.turf_varity = turf_varity;
    }

    public void setTurf_type(String turf_type) {
        this.turf_type = turf_type;
    }

    public void setLast_modified(String last_modified) {
        this.last_modified = last_modified;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public void setIs_delete(String is_delete) {
        this.is_delete = is_delete;
    }
}
