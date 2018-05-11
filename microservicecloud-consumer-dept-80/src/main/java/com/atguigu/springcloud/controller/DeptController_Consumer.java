package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DeptController_Consumer {

    public static final String REST_URL_PREFIX ="http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;




}
