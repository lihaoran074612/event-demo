package com.srm.event.demo.controller;

import com.srm.event.demo.entity.User;
import com.srm.starter.EventPublishUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class EventController {
    @Autowired
    EventPublishUtil eventPublishUtil;

    @GetMapping("/event/{code}")
    public String eventTest(@PathVariable String code){
        User user = new User(18,"小小二","武汉大学",new Date());
        eventPublishUtil.publishEvent(user,code);
        return code;
    }
}
