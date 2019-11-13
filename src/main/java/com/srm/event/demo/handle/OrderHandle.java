package com.srm.event.demo.handle;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.srm.event.handle.BaseHandle;
import org.srm.event.handle.EventHandle;

@EventHandle(taskCode = "Order_IMPROVE",order = 1)
public class OrderHandle implements BaseHandle {

    Logger logger = LoggerFactory.getLogger(OrderHandle.class);
    @Override
    public void handle(Object obj) {
        logger.info("当前线程: " +Thread.currentThread().getName()+" 执行了订单1事件:  "+obj);
    }
}
