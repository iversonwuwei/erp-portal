package com.walden.common.database;

import com.walden.service.database.ISelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by walden on 16/6/16.
 */
@Component
public class Test {

    public static final String DRIVERS = "drivers";
    public static final String LAYERS = "layers";
    public static final String CUTTERS = "cutters";
    public static final String TURF = "turf";
    @Qualifier("driverSelectServiceImpl")
    @Autowired
    private ISelectService driverSelectService;

    @Qualifier("layerSelectServiceImpl")
    @Autowired
    private ISelectService layerSelectService;

    @Qualifier("cutterSelectServiceImpl")
    @Autowired
    private ISelectService cutterSelectService;

    @Qualifier("turfSelectServiceImpl")
    @Autowired
    private ISelectService turfSelectService;

    private Map<String, List> maps;

    public Map<String, List> getMap(){
        maps = new HashMap<>();
        maps.put(DRIVERS, driverSelectService.selectAll());
        maps.put(CUTTERS, cutterSelectService.selectAll());
        maps.put(LAYERS, layerSelectService.selectAll());
        maps.put(TURF, turfSelectService.selectAll());
        return maps;
    }
}
