package com.walden.dao.ui;

import com.walden.entity.TurfEntity;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by walden on 16/6/15.
 */
@Component
@Transactional
public interface TurfDao {

    @Select("SELECT * FROM goTurf.turf")
    List<TurfEntity> selectAll();

}
