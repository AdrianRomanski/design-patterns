package adrianromanski.head_first.adapter.observers;

import adrianromanski.head_first.adapter.interfaces.Display;
import adrianromanski.head_first.adapter.interfaces.Observer;
import adrianromanski.head_first.adapter.interfaces.Subject;

import java.util.ArrayList;


/**
 * My own implementation of Observer
 */
public class ShowStatistics implements Observer, Display {

    private ArrayList<Float> temperatureList = new ArrayList<>();
    private ArrayList<Float> humidityList = new ArrayList<>();
    private ArrayList<Float> pressureList = new ArrayList<>();
    private Subject WeatherData;

    public ShowStatistics(Subject WeatherData) {
        this.WeatherData = WeatherData;
        WeatherData.registerObservers(this);
    }

    @Override
    public void actualization(float temp, float humidity, float pressure) {
        this.temperatureList.add(temp);
        this.humidityList.add(humidity);
        this.pressureList.add(pressure);
        display();
    }

    @Override
    public void display() {
        System.out.print("[Max temperature registered] = " + countMax(this.temperatureList));
        System.out.println(" [Min temperature registered] = " + countMin(this.temperatureList));
        System.out.print("[Max pressure registered] = " + countMax(this.pressureList));
        System.out.println(" [Min pressure registered] = " + countMin(this.pressureList));
        System.out.print("[Max humidity registered] = " + countMax(this.humidityList));
        System.out.println(" [Min humidity registered] = " + countMin(this.humidityList));
    }


    public Float countMax(ArrayList<Float> list) {
        return list.stream()
                .max(Float::compareTo)
                .orElseThrow(() -> new RuntimeException("Empty list"));
    }

    public Float countMin(ArrayList<Float> list) {
        return list.stream()
                .min(Float::compareTo)
                .orElseThrow(() -> new RuntimeException("Empty list"));
    }
}
