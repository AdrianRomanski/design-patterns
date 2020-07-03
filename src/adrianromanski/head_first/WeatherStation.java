package adrianromanski.head_first;

import adrianromanski.head_first.adapter.observable.WeatherData;
import adrianromanski.head_first.adapter.observers.ShowStatistics;
import adrianromanski.head_first.adapter.observers.ViewCurrentConditions;

public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        ViewCurrentConditions currentConditions = new ViewCurrentConditions(weatherData);
        ShowStatistics showStatistics = new ShowStatistics(weatherData);

        weatherData.setWeatherReadings(22f, 44f, 32f);
        weatherData.setWeatherReadings(28f, 12f, 18f);
        weatherData.setWeatherReadings(42f, 18f, 56f);
    }
}
