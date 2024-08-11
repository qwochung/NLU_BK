package Lab_Observer_WeatherData;

public class TestWeather {
	
	public static void main(String[] args) {
		
		WeatherData weatherData = new WeatherData();
		
		Observer currentCondition = new CurrentConditionsDisplay(weatherData);
		Observer forecast = new ForecastDisplay(weatherData);
		Observer statistics = new StatisticsDisplay (weatherData);
		
		
		weatherData.setMeasurements(32, 75, 34);
		
	}

}
