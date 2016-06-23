package com.walden.implement.select;

import com.walden.dao.server.RoleDao;
import com.walden.service.database.ISelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by walden on 16/6/16.
 */
@Service
public class RoleSelectServiceImpl<RoleEntity> implements ISelectService<RoleEntity> {

    @Autowired
    private RoleDao roleDao;

    public List<RoleEntity> selectAll() {
        return (List<RoleEntity>) roleDao.selectRoles();
    }

    public List<RoleEntity> selectBy(String condition) {
        return null;
    }
}
