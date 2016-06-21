package com.walden.controller;

import com.walden.entity.OrderEntity;
import com.walden.service.database.IUpdateService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by walden on 16/6/17.
 */
@Controller
@Path("/update")
public class UpdateRestController {

    @Autowired
    private IUpdateService orderUpdateService;
    private JSONObject jsonObject;


    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateOrder(String data){
        try{
            jsonObject = JSONObject.fromObject(data);
        }catch (Exception e){
            e.getMessage();
        }finally {
            orderUpdateService.update(JSONObject.toBean(jsonObject, OrderEntity.class));
        }
    }
}
