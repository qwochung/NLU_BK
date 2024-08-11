package vehicle_Abstract;

public class truck extends avehicle {
	int loadInTon;

	/**
	 * @param fuelTankVolume
	 * @param averageMilePerGallon
	 * @param loadInTon
	 */
	public truck(double fuelTankVolume, double averageMilePerGallon, int loadInTon) {
		super(fuelTankVolume, averageMilePerGallon);
		this.loadInTon = loadInTon;
	}
	
	/**
	 * 
	 * 
	 */
	public double fuelConsumption() {
		return this.averageMilePerGallon 
				*(1 - 0.5*this.loadInTon);
	}


	

}
