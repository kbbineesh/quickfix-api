package com.aabs.quickfixapi.controllers;


import com.aabs.quickfixapi.models.ServiceRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class ServiceRequestController {

    @GetMapping("/serviceRequests")
    public List<ServiceRequest> Get(){
       List<ServiceRequest> items = new ArrayList<>();
       items.add(new ServiceRequest(1,"I am a Service Request test CI/CD"));

       return items;

    }
}
