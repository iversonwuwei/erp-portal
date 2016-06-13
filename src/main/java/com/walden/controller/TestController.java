package com.walden.controller;

import com.walden.dao.SexDao;
import com.walden.entity.SexEntity;
import com.walden.service.ISelectService;
import org.springframework.beans.factory.annotation.Autowired;
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
    private ISelectService selectService;

    @RequestMapping("/test")
    @ResponseBody
    public List<SexEntity> test(){

        return selectService.selectAll();
    }

    @RequestMapping("t2")
    @ResponseBody
    public SexEntity t2(@WebParam(name = "type")String type){
        return (SexEntity) selectService.selectBy(type);
    }
}
