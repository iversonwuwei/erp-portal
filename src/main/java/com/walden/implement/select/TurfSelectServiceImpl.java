package com.walden.implement.select;

import com.walden.dao.ui.TurfTypeDao;
import com.walden.service.database.ISelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by walden on 16/6/15.
 */
@Service
public class TurfSelectServiceImpl implements ISelectService {

    @Autowired
    private TurfTypeDao turfDao;

    public List selectAll() {
        return turfDao.selectAllTurfs();
    }

    public List selectBy(String condition) {
        return null;
    }
}
