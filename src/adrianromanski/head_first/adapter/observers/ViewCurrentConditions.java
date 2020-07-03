package adrianromanski.head_first.adapter.observers;

import adrianromanski.head_first.adapter.interfaces.Display;
import adrianromanski.head_first.adapter.interfaces.Observer;
import adrianromanski.head_first.adapter.interfaces.Subject;

public class ViewCurrentConditions implements Observer, Display {

    private float temp;
    private float humidity;
    private float pressure;
    private Subject WeatherData;

    public ViewCurrentConditions(Subject WeatherData) {
        this.WeatherData = WeatherData;
        WeatherData.registerObservers(this);
    }

    @Override
    public void actualization(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }


    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "ViewCurrentConditions{" +
                "temp=" + temp +
                ", humidity=" + humidity +
                ", pressure=" + pressure;
    }
}
