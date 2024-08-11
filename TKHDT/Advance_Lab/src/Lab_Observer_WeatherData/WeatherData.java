package Lab_Observer_WeatherData;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
	
	private int temperature;
	private int humidity;
	private int pressure;	
	private List<Observer> listRegister;
	
	


	public WeatherData() {
		super();
		listRegister= new ArrayList<Observer>();
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


	int getPressure() {
		return pressure;
	}


	void setPressure(int pressure) {
		this.pressure = pressure;
	}


	


	 


	@Override
	public void registerObserver(Observer observer) {
		listRegister.add(observer);
		
	}


	@Override
	public void removeobserver(Observer observer) {
		listRegister.remove(observer);
	}


	@Override
	public void notifyObserrver() {
		for (Observer observer : listRegister) {
			observer.update(this.getTemperature(), this.getHumidity(), this.getPressure());
		}
		
	}
	
	
	
	public void setMeasurements(int temperature, int humidity, int pressure) {
		 this.temperature = temperature;
		 this.humidity = humidity;
		 this.pressure = pressure;
		 notifyObserrver();
		 }



	
	 
	 

}
