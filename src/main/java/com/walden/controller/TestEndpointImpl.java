package com.walden.controller;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by walden on 16/5/31.
 */
@WebService(endpointInterface = "com.walden.controller.TestEndpoint", serviceName = "testService")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class TestEndpointImpl implements TestEndpoint {
    public String test(String testString) {

        System.out.println(testString);

        return testString;
    }
}
