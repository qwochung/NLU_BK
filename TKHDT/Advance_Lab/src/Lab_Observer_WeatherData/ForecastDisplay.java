package Lab_Observer_WeatherData;

public class ForecastDisplay implements Observer, Display{
	int lastPressure ;
	int currentPressure = 29;
	Subject weatherData;

	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	
	
	
	int getLastPressure() {
		return lastPressure;
	}




	void setLastPressure(int lastPressure) {
		this.lastPressure = lastPressure;
	}




	int getCurrentPressure() {
		return currentPressure;
	}




	void setCurrentPressure(int currentPressure) {
		this.currentPressure = currentPressure;
	}




	@Override
	public void update(int temperature, int humidity, int pressure) {
		setLastPressure(currentPressure);
		setCurrentPressure(pressure);
		display();
		
	}

	@Override
	public void display() {
		System.out.println("============================== Dự báo thơi tiết sắp tới ===============================");
		System.out.print("Forecast: ");
		 if (currentPressure > lastPressure) {
		 System.out.println("Improving weather on the way!");
		 } else if (currentPressure == lastPressure) {
		 System.out.println("More of the same");
		 } else if (currentPressure < lastPressure) {
		 System.out.println("Watch out for cooler, rainy weather");
		 }
		
	}
	
	

}
