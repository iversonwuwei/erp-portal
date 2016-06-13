package com.walden.entity;

import javax.persistence.*;

/**
 * Created by walden on 16/6/13.
 */
@Entity
@Table(name = "status", schema = "goTurf", catalog = "")
public class StatusEntity {
    private int statusId;
    private String statusType;

    @Id
    @Column(name = "status_id")
    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    @Basic
    @Column(name = "status_type")
    public String getStatusType() {
        return statusType;
    }

    public void setStatusType(String statusType) {
        this.statusType = statusType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StatusEntity that = (StatusEntity) o;

        if (statusId != that.statusId) return false;
        if (statusType != null ? !statusType.equals(that.statusType) : that.statusType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = statusId;
        result = 31 * result + (statusType != null ? statusType.hashCode() : 0);
        return result;
    }
}
