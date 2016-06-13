package com.walden.implement;

import com.walden.dao.SexDao;
import com.walden.service.ISelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static javafx.scene.input.KeyCode.T;

/**
 * Created by walden on 16/6/13.
 */
@Service
public class SelectServiceImpl<SexEntity> implements ISelectService<SexEntity> {

    @Autowired
    private SexDao sexDao;

    public List<SexEntity> selectAll() {
        return (List<SexEntity>) sexDao.selectAll();
    }

    public SexEntity selectBy(String t) {
        return (SexEntity) sexDao.getSexByType(t);
    }
}
