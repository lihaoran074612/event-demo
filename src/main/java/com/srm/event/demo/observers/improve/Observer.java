package com.srm.event.demo.observers.improve;

/**
 * 观察者接口
 */
public interface Observer {

    public void update(float temperature, float pressure, float humidity);

}
