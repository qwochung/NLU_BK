package vehicle_Abstract;

public abstract class avehicle implements ivehicle {
	
	double fuelTankVolume, averageMilePerGallon;

	public avehicle(double fuelTankVolume, double averageMilePerGallon) {
	
		this.fuelTankVolume = fuelTankVolume;
		this.averageMilePerGallon = averageMilePerGallon;
	}

	/**
	 * 
	 * @param costPerGalon
	 * @return
	 */
	public  double refuelCost(double costPerGalon) 	{
		return this.fuelTankVolume * costPerGalon;
	}
		
	
	
	/**
	 * 
	 */
	public abstract double fuelConsumption ();

}
