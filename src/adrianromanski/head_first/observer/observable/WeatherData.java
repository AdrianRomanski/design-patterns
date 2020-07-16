package adrianromanski.head_first.observer.observable;

import adrianromanski.head_first.observer.interfaces.Observer;
import adrianromanski.head_first.observer.interfaces.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private float temp;
    private float humidity;
    float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObservers(Observer o) {
        observers.add(o);
    }

    @Override
    public void deleteObservers(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o: observers) {
            o.actualization(temp, humidity, pressure);
        }
    }

    public void setWeatherReadings(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
