package com.walden.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by walden on 16/6/13.
 */
@Entity
@Table(name = "sex",schema = "goTurf")
public class SexEntity {

    private String id;
    private String sex_type;

    @Id
    @Column(name = "id",unique = true, length = 25)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "sex_type")
    public String getSex_type() {
        return sex_type;
    }

    public void setSex_type(String sex_type) {
        this.sex_type = sex_type;
    }
}
