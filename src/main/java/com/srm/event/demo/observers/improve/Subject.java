package com.srm.event.demo.observers.improve;

public interface Subject {


    public void notifyObservers();

    public void remove(Observer o);

    public void registerObservers(Observer o);

}
