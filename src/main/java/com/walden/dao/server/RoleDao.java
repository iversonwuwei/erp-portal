package com.walden.dao.server;

import com.walden.entity.RoleEntity;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by walden on 16/6/16.
 */
@Component
public interface RoleDao {

    @Select("SELECT * FROM role")
    List<RoleEntity> selectRoles();

}
