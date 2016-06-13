package com.walden.controller;

import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by walden on 16/6/12.
 */
@Controller
@Path(value = "/rest")
public class RestfulController {

    @GET
    @Path(value = "/test")
    @Produces(value = MediaType.APPLICATION_JSON)
    public String getRestString(){
        return "Hello World";
    }
}
