package com.srm.event.demo.handle;

import com.srm.event.demo.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.srm.event.handle.BaseHandle;
import org.srm.event.handle.EventHandle;

@EventHandle(taskCode = "Email_APPROVE", order = 2)
public class EmailHandle2 implements BaseHandle {

    Logger logger = LoggerFactory.getLogger(EmailHandle2.class);

    @Override
    public void handle(Object obj) {
        User user = (User)obj;
        //todo执行业务逻辑
        //userService.insert(user);
        logger.info("当前线程:"+Thread.currentThread().getName()+"  邮件2后续流程执行: "+obj);
    }
}
