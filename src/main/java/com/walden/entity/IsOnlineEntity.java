package com.walden.entity;

import javax.persistence.*;

/**
 * Created by walden on 16/6/13.
 */
@Entity
@Table(name = "is_online", schema = "goTurf", catalog = "")
public class IsOnlineEntity {
    private int isOnlineId;
    private String isOnlineType;

    @Id
    @Column(name = "is_online_id")
    public int getIsOnlineId() {
        return isOnlineId;
    }

    public void setIsOnlineId(int isOnlineId) {
        this.isOnlineId = isOnlineId;
    }

    @Basic
    @Column(name = "is_online_type")
    public String getIsOnlineType() {
        return isOnlineType;
    }

    public void setIsOnlineType(String isOnlineType) {
        this.isOnlineType = isOnlineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IsOnlineEntity that = (IsOnlineEntity) o;

        if (isOnlineId != that.isOnlineId) return false;
        if (isOnlineType != null ? !isOnlineType.equals(that.isOnlineType) : that.isOnlineType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = isOnlineId;
        result = 31 * result + (isOnlineType != null ? isOnlineType.hashCode() : 0);
        return result;
    }
}
