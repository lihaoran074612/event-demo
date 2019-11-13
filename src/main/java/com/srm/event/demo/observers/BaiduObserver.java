package com.srm.event.demo.observers;

import com.srm.event.demo.observers.improve.Observer;

public class BaiduObserver implements Observer {

    private float temperature;
    private float pressure;
    private float humidity;

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

    @Override
    public void update(float temperature, float pressure, float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("百度显示today temperature: "+temperature+"***");
        System.out.println("百度显示today pressure: "+pressure+"***");
        System.out.println("百度显示today humidity: "+humidity+"***");
    }
}
