package com.walden.controller;

import com.walden.entity.SexEntity;
import com.walden.service.ISelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.jws.WebParam;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by walden on 16/6/12.
 */
@Controller
@Path(value = "/rest")
public class RestfulController {

    @Autowired
    @Qualifier("sexSelectService")
    private ISelectService selectService;

    @GET
    @Path(value = "/test")
    @Produces(value = MediaType.APPLICATION_JSON)
    public String getRestString(){
        return "Hello World";
    }


    @GET
    @Path(value = "/select")
    @Produces(value = MediaType.APPLICATION_JSON)
    @Consumes(value = MediaType.APPLICATION_JSON)
    public List<SexEntity> getSexs(){
        return selectService.selectAll();
    }

    @POST
    @Path("/selectByType/{selectByType}")
    @Produces(value = MediaType.APPLICATION_JSON)
    public SexEntity getSexes(@PathParam(value = "selectByType") String type){
        return (SexEntity) selectService.selectBy(type);
    }
}
