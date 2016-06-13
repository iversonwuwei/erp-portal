package com.walden.controller;

import com.walden.dao.SexDao;
import com.walden.entity.OrderEntity;
import com.walden.entity.SexEntity;
import com.walden.service.IInsertService;
import com.walden.service.ISelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jws.WebParam;
import java.util.List;

/**
 * Created by walden on 16/5/30.
 */
@Controller
@RequestMapping("/first")
public class TestController {
    @Autowired
    @Qualifier("sexSelectService")
    private ISelectService selectService;

    @Autowired
    @Qualifier("testSelectService")
    private ISelectService testSelectService;

    @Qualifier("insertServiceImpl")
    @Autowired
    private IInsertService iInsertService;


    @RequestMapping("/test")
    @ResponseBody
    public List<SexEntity> test(){

        return selectService.selectAll();
    }

    @RequestMapping("t2")
    @ResponseBody
    public SexEntity t2(@WebParam(name = "type")String type){
        return (SexEntity) testSelectService.selectBy(type);
    }

    @RequestMapping("/insert")
    @ResponseBody
    public String insert(){
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setCutter("Wwu");
        orderEntity.setAddress_detail("asdasd");
        orderEntity.setCustomer_contact("sdsdsd");
        orderEntity.setCustomer_email("ffffff");
        orderEntity.setCustomer_name("eeerrr");
        orderEntity.setDelivery_date_time("asdsad");
        orderEntity.setDriver("dsdsd");
        orderEntity.setLayer("erer");
        orderEntity.setOrder_status("asds");
        orderEntity.setOwner("rrrr");
        orderEntity.setSubmitted_date_time("tttttt");
        orderEntity.setTotal_price("123");
        orderEntity.setTurf_quanutity("45");
        orderEntity.setTurf_varity("34");
        iInsertService.insert(orderEntity);
        return "Insert Completed!";
    }
}
