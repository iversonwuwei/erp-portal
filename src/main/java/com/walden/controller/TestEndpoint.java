package com.walden.controller;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by walden on 16/5/31.
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface TestEndpoint {

    String test(String testString);
}
