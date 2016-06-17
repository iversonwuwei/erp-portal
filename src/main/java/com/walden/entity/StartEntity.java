package com.walden.entity;

import com.sun.xml.txw2.annotation.XmlElement;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by walden on 16/6/15.
 */
@XmlRootElement
public class StartEntity {

    private List<TurfEntity> turfEntities;

    @XmlElement
    public List<TurfEntity> getTurfEntities() {
        return turfEntities;
    }

    public void setTurfEntities(List<TurfEntity> turfEntities) {
        this.turfEntities = turfEntities;
    }
}
