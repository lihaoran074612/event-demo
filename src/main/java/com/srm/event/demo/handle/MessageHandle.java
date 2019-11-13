package com.srm.event.demo.handle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.srm.event.handle.BaseHandle;
import org.srm.event.handle.EventHandle;

@EventHandle(taskCode = "Message_APPROVE", order = 1)
public class MessageHandle implements BaseHandle {

    Logger logger = LoggerFactory.getLogger(PoApproveHandle.class);

    @Override
    public void handle(Object obj) {
        logger.info("当前线程:"+Thread.currentThread().getName()+"  短信1后续流程执行   "+obj);
    }
}
