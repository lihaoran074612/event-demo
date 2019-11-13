package com.srm.event.demo.observers;

/**
 * 显示当前天气情况
 */
public class InternetWeather {

    private float temperature;
    private float pressure;
    private float humidity;

    /**
     * 更新天气情况
     * @param temperature
     * @param pressure
     * @param humidity
     */
    public void updata(float temperature,float pressure,float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    /**
     * 显示天气情况
     */
    public void display(){
        System.out.println("today temperature: "+temperature+"***");
        System.out.println("today pressure: "+pressure+"***");
        System.out.println("today humidity: "+humidity+"***");
    }

}
