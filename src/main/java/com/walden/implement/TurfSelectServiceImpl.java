package com.walden.implement;

import com.walden.dao.TurfDao;
import com.walden.service.ISelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by walden on 16/6/15.
 */
@Service
public class TurfSelectServiceImpl<TurfEntity> implements ISelectService<TurfEntity> {

    @Autowired
    private TurfDao turfDao;

    public List<TurfEntity> selectAll() {
        return (List<TurfEntity>) turfDao.selectAll();
    }

    public List<TurfEntity> selectBy(String condition) {
        return null;
    }
}
