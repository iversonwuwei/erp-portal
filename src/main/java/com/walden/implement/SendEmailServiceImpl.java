package com.walden.implement;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.springframework.stereotype.Service;

import com.walden.entity.TurfMail;
import com.walden.service.ISendEmailService;



/**
 * Created by
 */

@Service
public class SendEmailServiceImpl implements ISendEmailService{


    public void send(TurfMail mail)  {
    	 HtmlEmail email = new HtmlEmail();
	     try {
	    	 email.setHostName(mail.getHost());
		     email.setCharset(mail.ENCODEING);
		     email.addTo(mail.getReceiver());
			 email.setFrom(mail.getSender(), mail.getName());
			 email.setAuthentication(mail.getUsername(), mail.getPassword());
			 email.setSubject(mail.getSubject()  );
			 email.setMsg(mail.getMessage());
			 email.send();
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			 e.printStackTrace();
		}
	
    	
    }
}
