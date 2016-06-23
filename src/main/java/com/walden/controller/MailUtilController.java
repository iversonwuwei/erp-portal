package com.walden.controller;

import java.util.List;

import javax.jws.WebParam;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import net.sf.json.JSONObject;

import org.apache.commons.mail.EmailException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.walden.entity.CompanyEntity;
import com.walden.entity.JsonEntity;
import com.walden.entity.OrderEntity;
import com.walden.entity.SexEntity;
import com.walden.entity.TurfMail;
import com.walden.service.ISendEmailService;

@Controller
@RequestMapping("/first")
public class MailUtilController {

	 protected final Logger logger = Logger.getLogger(getClass());  
	 
	 @Autowired
	 @Qualifier("mailService")
	 private ISendEmailService iSendEmailService;
	 private JsonEntity jsonEntity;
	 
	 @POST
	 @RequestMapping("/send")
	 @Produces(MediaType.APPLICATION_JSON)
	 @ResponseBody
	 public boolean send(@WebParam(name="customer_email") String customer_email) throws EmailException{
		iSendEmailService.send(customer_email);
		return true;
	 }
	 
	    @RequestMapping("/test1")
	    @ResponseBody
	    public List<TurfMail> test(){

	    	System.out.println("33");
	        return null;
	    }
}

