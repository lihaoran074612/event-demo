package com.srm.event.demo.handle;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.srm.event.handle.BaseHandle;
import org.srm.event.handle.EventHandle;

@EventHandle(taskCode = "Order_IMPROVE",order = 2)
public class OrderHandle2 implements BaseHandle {

    Logger logger = LoggerFactory.getLogger(OrderHandle2.class);
    @Override
    public void handle(Object obj) {
        logger.info("当前线程: " +Thread.currentThread().getName()+" 执行了订单2事件:  "+obj);
    }
}
