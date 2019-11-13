package com.srm.event.demo.controller;

import com.srm.event.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.srm.event.EventPublishUtil;

import java.util.Date;

/**
 * @author haoran
 */
@RestController
public class EventController {

    @Autowired
    EventPublishUtil eventPublishUtil;

    @GetMapping("/event/{code}")
    public String eventTest(@PathVariable String code){
        User user = new User(18,"小小二","武汉大学",new Date());
        eventPublishUtil.publishEvent(user,code);
        return user.toString();
    }
}
