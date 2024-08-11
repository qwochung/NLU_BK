package Controller;

import Modul.IUnit;

public class Control_Unit {
	IUnit unit;
	
	
	
	 public IUnit getUnit() {
		return unit;
	}



	 public void setUnit(IUnit unit) {
		this.unit = unit;
	}



	public double change( int meter) {
		return unit.converTo(meter);
	}

}
