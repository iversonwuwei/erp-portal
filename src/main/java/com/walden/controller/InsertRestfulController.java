package com.walden.controller;

import com.alibaba.fastjson.JSON;
import com.walden.entity.OrderEntity;
import com.walden.service.IInsertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by walden on 16/6/14.
 */
@Controller
@Path("/insert")
public class InsertRestfulController {

    @Autowired
    private IInsertService iInsertService;

    @GET
    @Path(value = "/{orderentity}")
    @Produces(value = MediaType.APPLICATION_JSON)
    public String insert(@PathParam(value = "orderentity")String orderEntity){
        OrderEntity orderEntity1 = JSON.parseObject(orderEntity, OrderEntity.class);
        iInsertService.insert(orderEntity1);
        return "Insert Completed!";
    }
}
