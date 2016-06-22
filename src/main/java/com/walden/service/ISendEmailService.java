package com.walden.service;

import org.springframework.stereotype.Service;

import com.walden.entity.CompanyEntity;
import com.walden.entity.TurfMail;


/**
 * Created by
 */
@Service
public interface ISendEmailService {

    void send(String customer_email) ;
}
