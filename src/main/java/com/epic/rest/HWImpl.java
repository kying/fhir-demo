package com.epic.rest;

import javax.jws.WebService;

/**
 * Created by yingk1 on 9/23/2015.
 */
@WebService(endpointInterface = "com.epic.rest.HelloWorld")
public class HWImpl implements HelloWorld {

    public String sayHello(){
        return "Hello";
    }
}
