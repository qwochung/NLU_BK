package Lab_Observer_WeatherData;

public interface Subject {

	public void registerObserver(Observer observer);
	public void removeobserver(Observer observer);
	public void notifyObserrver();
	
}
