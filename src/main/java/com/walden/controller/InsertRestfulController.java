package com.walden.controller;

import com.walden.entity.OrderEntity;
import com.walden.service.IInsertService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by walden on 16/6/14.
 */
@Controller
@Path("/insert")
public class InsertRestfulController {

    @Autowired
    private IInsertService iInsertService;

    @POST
    @Path(value = "/order")
    @Produces(MediaType.APPLICATION_JSON)
    @ResponseBody
    public String insert(String data) {
        try {
            OrderEntity orderEntity = (OrderEntity) JSONObject.toBean(JSONObject.fromObject(data), OrderEntity.class);
            iInsertService.insert(orderEntity);
        } catch (Exception e) {
            e.getMessage();
        } finally {
            return "Complete";
        }
    }
}
