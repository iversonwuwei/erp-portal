package com.walden.dao;

import com.walden.entity.LayerEntity;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by walden on 16/6/16.
 */
@Component
public interface LayerDao {

    @Select("SELECT * FROM goTurf.layer")
    List<LayerEntity> selectAllLayers();
}
