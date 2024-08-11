package Modul;

public class FeetUnit implements IUnit {
	 @Override
	public double converTo(int meters) {
		return meters/0.3048;
	}
}
