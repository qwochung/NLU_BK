package vehicle_Abstract;

public class bus extends avehicle {
	int nPassenger;

	/**
	 * @param fuelTankVolume
	 * @param averageMilePerGallon
	 * @param nPassenger
	 */
	public bus(double fuelTankVolume, double averageMilePerGallon, int nPassenger) {
		super(fuelTankVolume, averageMilePerGallon);
		this.nPassenger = nPassenger;
	}

	
	/**
	 * 
	 */
	
	public double fuelConsumption() {
		return this.averageMilePerGallon 
				*(1 - 0.01*this.nPassenger);
	}



}
