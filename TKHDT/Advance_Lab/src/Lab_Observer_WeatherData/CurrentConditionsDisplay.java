package Lab_Observer_WeatherData;


public class CurrentConditionsDisplay implements Observer, Display{
	int temperature;
	int humidity;
	int pressureint ;
	Subject weatherData ;
	
	
	public CurrentConditionsDisplay(Subject weatherData) {
		super();
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}


	@Override
	public void update(int temperature, int humidity, int pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressureint = pressure;
		
		display();
		
	}


	int getTemperature() {
		return temperature;
	}


	void setTemperature(int temperature) {
		this.temperature = temperature;
	}


	int getHumidity() {
		return humidity;
	}


	void setHumidity(int humidity) {
		this.humidity = humidity;
	}


	int getPressureint() {
		return pressureint;
	}


	void setPressureint(int pressureint) {
		this.pressureint = pressureint;
	}


	@Override
	public void display() {
		System.out.println("===================== Dữ liệu thời tiết hiện tại =========================");
		System.out.println("Nhiệt độ : " + getTemperature() + "C ,   Độ ẩm : " +getHumidity() + " Áp suất " + getPressureint()	);
		
	}
	
	
	
	
	
	
	
}
