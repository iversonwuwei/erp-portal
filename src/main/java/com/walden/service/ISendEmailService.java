package com.walden.service;

import com.walden.entity.CompanyEntity;
import com.walden.entity.TurfMail;


/**
 * Created by
 */
public interface ISendEmailService {

    void send(TurfMail mail,CompanyEntity company) ;
}
