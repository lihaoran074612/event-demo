package com.srm.event.demo.observers;

public class TestWeather {

    public static void me(String[] args) {
        //1.创建接入方Observer
        CurrentConditions currentConditions1 = new CurrentConditions();
        BaiduObserver baiduObserver = new BaiduObserver();

        //2.创建subject类
        WeatherData weatherData = new WeatherData();

        //3.把观察者注入subject类
        weatherData.registerObservers(currentConditions1);
        weatherData.registerObservers(baiduObserver);

        //4.设置天气
        weatherData.setData(30,160,10);

        System.out.println("天气情况发生变化");
        weatherData.remove(currentConditions1);
        //5.更新天气
        weatherData.setData(35,165,15);
    }
}
