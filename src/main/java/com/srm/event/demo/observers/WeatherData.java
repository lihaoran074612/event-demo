package com.srm.event.demo.observers;


import com.srm.event.demo.observers.improve.Observer;
import com.srm.event.demo.observers.improve.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * 类是核心类
 * 1.包含最新天气信息
 * 2.含有观察者集合
 * 3.当数据有更新时，主动调ArrayList<observer>  notifyAll(),通知他们接入方看到最新消息
 *
 */
public class WeatherData implements Subject {

    private float temperature;
    private float pressure;
    private float humidity;

    //观察者集合
    private List<Observer> observers;

    public WeatherData(){
        this.observers = new ArrayList<Observer>();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }



    //当数据有更新时，调用setdata
    public void setData(float temperature,float pressure,float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Observer o: observers){
            o.update(getTemperature(),getPressure(),getHumidity());
        }
    }

    @Override
    public void remove(Observer o) {
        if (observers.contains(o)) {
            observers.remove(o);
        }
    }

    @Override
    public void registerObservers(Observer o) {
        observers.add(o);
    }
}
