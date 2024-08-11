package vehicle_Abstract;

public class car extends avehicle {
	int nPassenger;

	public car(double fuelTankVolume, double averageMilePerGallon, int nPassenger) {
		
		super(fuelTankVolume, averageMilePerGallon);
		this.nPassenger = nPassenger;
	}
	

	/**
	 * 
	 */
	
	public double fuelConsumption() {
		return this.averageMilePerGallon *(1 - 0.1*this.nPassenger);
	}
	
}
