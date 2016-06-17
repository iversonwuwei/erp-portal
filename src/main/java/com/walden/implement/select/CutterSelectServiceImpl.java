package com.walden.implement.select;

import com.walden.dao.CutterDao;
import com.walden.service.ISelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by walden on 16/6/16.
 */
@Service
public class CutterSelectServiceImpl<CutterEntity> implements ISelectService<CutterEntity> {

    @Autowired
    private CutterDao cutterDao;

    public List<CutterEntity> selectAll() {
        return (List<CutterEntity>) cutterDao.selectAllCutters();
    }

    public List<CutterEntity> selectBy(String condition) {
        return null;
    }
}
