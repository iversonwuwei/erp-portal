package com.walden.controller;

import com.walden.common.database.Test;
import com.walden.entity.CutterEntity;
import com.walden.entity.DriverEntity;
import com.walden.entity.LayerEntity;
import com.walden.entity.TurfEntity;
import com.walden.service.database.ISelectService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by walden on 16/6/15.
 */
@Controller
@Path("/select")
public class SelectRestfulController {

    @Qualifier("turfSelectServiceImpl")
    @Autowired
    private ISelectService turfSelectService;

    @Qualifier("cutterSelectServiceImpl")
    @Autowired
    private ISelectService cutterSelectService;

    @Qualifier("driverSelectServiceImpl")
    @Autowired
    private ISelectService driverSelectService;

    @Qualifier("layerSelectServiceImpl")
    @Autowired
    private ISelectService layerSelectService;

    @Autowired
    private Test test;

    @GET
    @Path("/turf")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<TurfEntity> getAllTurfs(){
        return turfSelectService.selectAll();
    }


    @GET
    @Path("/cutter")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<CutterEntity> getAllRoles(){
        return  cutterSelectService.selectAll();
    }

    @GET
    @Path("/driver")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<DriverEntity> getAllDrivers(){
        return driverSelectService.selectAll();
    }

    @GET
    @Path("/layer")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<LayerEntity> getAllLayers(){
        return layerSelectService.selectAll();
    }

    @GET
    @Path("/test")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String getJsonString(){
        return JSONArray.fromObject(test.getMap()).toString();
    }
}
