package com.srm.event.demo.observers;

import com.srm.starter.EventPublishUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author haoran
 */
@Component
public class EventRunner implements ApplicationRunner {

    @Autowired
    EventPublishUtil eventPublishUtil;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Map<String, String> source = new HashMap<>();
        source.put("loginName", "haoran");
        //eventPublishUtil.publishEvent(new LoginEvent(source));
        //eventPublishUtil.publishEvent(new BaseEvent(source));
    }
}
