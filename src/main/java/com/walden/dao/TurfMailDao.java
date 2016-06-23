package com.walden.dao;

import com.walden.entity.TurfMail;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;


/**
 * Created by 
 */
@Component

public interface TurfMailDao {

    @Select("SELECT * FROM goTurf.mail")
    TurfMail selectAllMail();
}
