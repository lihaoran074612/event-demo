package com.srm.event.demo.controller;

import com.srm.starter.EventPublishUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {
    @Autowired
    EventPublishUtil eventPublishUtil;

    @GetMapping("/event/{obj}/{code}")
    public String eventTest(@PathVariable String code,@PathVariable String obj){
        eventPublishUtil.publishEvent(obj,code);
        return code;
    }
}
