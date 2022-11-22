package com.aabs.quickfixapi.controllers;

import com.aabs.quickfixapi.models.ServiceRequest;
import com.aabs.quickfixapi.models.WorkOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WorkOrderController {

    @GetMapping("/workOrders")
    public List<WorkOrder> Get(){
        List<WorkOrder> items = new ArrayList<>();
        items.add(new WorkOrder(1,"I am a Work Order"));

        return items;

    }
}
