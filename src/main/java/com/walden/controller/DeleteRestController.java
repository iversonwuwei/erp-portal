package com.walden.controller;

import com.walden.service.database.IDeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by walden on 16/6/15.
 */
@Controller
@Path("/delete")
public class DeleteRestController {

    @Qualifier("deleteServiceImpl")
    @Autowired
    IDeleteService deleteService;

    @GET
    @Path("/order/{orderid}")
    @Produces(MediaType.APPLICATION_JSON)
    public String deleteOrderBy(@PathParam(value = "orderid") String orderid){
        deleteService.deleteby(orderid);
        return "Completed Delete!";
    }

}
