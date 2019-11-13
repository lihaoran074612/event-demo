package com.srm.event.demo.handle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.srm.event.handle.BaseHandle;
import org.srm.event.handle.EventHandle;

@EventHandle(taskCode = "PO_APPROVE", order = 2)
public class PoApproveHandle2 implements BaseHandle {

    Logger logger = LoggerFactory.getLogger(PoApproveHandle2.class);

    @Override
    public void handle(Object obj){
        logger.info("当前线程:"+Thread.currentThread().getName()+"  订单2后续流程执行:  "+obj);
    }
}
