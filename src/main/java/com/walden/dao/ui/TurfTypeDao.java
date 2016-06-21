package com.walden.dao.ui;

import com.walden.entity.TurfEntity;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by walden on 16/6/16.
 */
@Component
public interface TurfTypeDao {

    @Select("SELECT * FROM goTurf.turf")
    List<TurfEntity> selectAllTurfs();
}
