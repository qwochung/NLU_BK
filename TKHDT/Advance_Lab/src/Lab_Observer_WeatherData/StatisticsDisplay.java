package Lab_Observer_WeatherData;

public class StatisticsDisplay implements Observer , Display{

	int minTemp = 30;
	int maxTemp=30;
	int tempSum= 30;
	int countTemp = 1;
	Subject weatherData;
	
	
	public StatisticsDisplay(Subject weatherData) {
		super();
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}




	@Override
	public void update(int temperature, int humidity, int pressure) {
		tempSum+= temperature;
		countTemp++;
		
		if (minTemp >temperature ) {
			minTemp = temperature;
		}
		if (maxTemp < temperature) {
			maxTemp = temperature;
		}
		
		
		display();
		
	}
	
	
	@Override
	public void display() {
		System.out.println("=============================== Nhiệt độ trung bình ===============================");
		System.out.println(" Nhiệt độ trung bình : " + tempSum/countTemp + " , Nhiệt độ cao nhất : " + maxTemp 
				+" , Nhiệt độ thấp nhất : " + minTemp);
		
		
	}
	
	
}
