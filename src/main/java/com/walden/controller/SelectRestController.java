package com.walden.controller;

import com.sun.tools.corba.se.idl.StringGen;
import com.walden.common.database.Test;
import com.walden.entity.*;
import com.walden.service.ISaveAsDraft;
import com.walden.service.ISelectAllDraftFile;
import com.walden.service.database.ISelectService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.File;
import java.util.List;

/**
 * Created by walden on 16/6/15.
 */
@Controller
@Path("/select")
public class SelectRestController {

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
    private ISaveAsDraft saveAsDraft;

    @Autowired
    private ISelectAllDraftFile selectAllDraftFile;

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

    @POST
    @Path("/saveasdraft")
    @Produces(MediaType.APPLICATION_JSON)
    public void saveAsDraft(String data){
        FileEntity fileEntity = new FileEntity();
        fileEntity.setJsonStringBuffer(data);
        fileEntity.setSavePath("/Users/walden/Desktop/save/");
        saveAsDraft.saveAsDraft(fileEntity);
        System.out.println(data);
    }

    @POST
    @Path("/recoverFromJson")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String recoverFromDraft(@QueryParam(value = "draftid")String draftid){
        File file = new File("/Users/walden/Desktop/save/"+draftid+".json");
        String jsonString = saveAsDraft.recoverFromDraft(file);
        return jsonString;
    }

    @GET
    @Path("/alldraftfiles")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String getAllDraftFile(){
        String jsonString = selectAllDraftFile.selectAll();
        return jsonString;
    }
}
