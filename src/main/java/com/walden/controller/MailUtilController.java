package com.walden.controller;

import org.apache.commons.mail.EmailException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.walden.entity.TurfMail;
import com.walden.service.ISendEmailService;

public class MailUtilController {

	 protected final Logger logger = Logger.getLogger(getClass());  
	 
	    @Qualifier("SendEmailServiceImpl")
	    @Autowired
	    private ISendEmailService iSendEmailService;
	 
	 @RequestMapping("/send")
	 @ResponseBody
	 public boolean send(TurfMail mail) throws EmailException{
		 
		iSendEmailService.send(mail);
		return true;
	 }
}

