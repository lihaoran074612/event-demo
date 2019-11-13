package com.srm.event.demo.handle;

import com.srm.starter.handle.BaseHandle;
import com.srm.starter.handle.EventHandle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@EventHandle(taskCode = "Email_APPROVE", order = 2)
public class EmailHandle2 implements BaseHandle {

    Logger logger = LoggerFactory.getLogger(EmailHandle2.class);

    @Override
    public void handle(Object obj) {
        logger.info("当前线程:"+Thread.currentThread().getName()+"  邮件2后续流程执行: "+obj);
    }
}
