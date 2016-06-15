package com.walden.controller;

import com.walden.entity.TurfEntity;
import com.walden.implement.TurfSelectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private TurfSelectServiceImpl turfSelectService;

    @GET
    @Path("/turf")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<TurfEntity> getAllTurfs(){
        return turfSelectService.selectAll();
    }
}
