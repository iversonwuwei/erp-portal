package com.walden.dao;

import com.walden.entity.SexEntity;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by walden on 16/6/12.
 */
@Component
public interface SexDao {
    @Select("select * from sex")
    List<SexEntity> selectAll();

    @Select("select * from sex where sex_type=#{type}")
    SexEntity getSexByType(String type);
}
