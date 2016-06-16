package com.walden.dao;

import com.walden.entity.CutterEntity;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by walden on 16/6/16.
 */
@Component
@Transactional
public interface CutterDao {

    @Select("SELECT * FROM goTurf.cutter")
    List<CutterEntity> selectAllCutters();
}
