package com.walden.implement.select;

import com.walden.dao.ui.DriverDao;
import com.walden.service.database.ISelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by walden on 16/6/16.
 */
@Service
public class DriverSelectServiceImpl<DriverEntity> implements ISelectService<DriverEntity> {

    @Autowired
    private DriverDao driverDao;

    public List<DriverEntity> selectAll() {
        return (List<DriverEntity>) driverDao.getAllDrivers();
    }

    public List<DriverEntity> selectBy(String condition) {
        return null;
    }
}
