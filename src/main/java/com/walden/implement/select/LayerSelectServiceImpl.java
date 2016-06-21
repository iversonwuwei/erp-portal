package com.walden.implement.select;

import com.walden.dao.ui.LayerDao;
import com.walden.service.database.ISelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by walden on 16/6/16.
 */
@Service
public class LayerSelectServiceImpl implements ISelectService {

    @Autowired
    private LayerDao layerDao;

    public List selectAll() {
        return layerDao.selectAllLayers();
    }

    public List selectBy(String condition) {
        return null;
    }
}
