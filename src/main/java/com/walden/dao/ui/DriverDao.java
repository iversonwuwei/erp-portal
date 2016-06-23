package com.walden.dao.ui;

import com.walden.entity.DriverEntity;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by walden on 16/6/16.
 */
@Component
public interface DriverDao {

    @Select("SELECT * FROM goTurf.driver")
    List<DriverEntity> getAllDrivers();
}
