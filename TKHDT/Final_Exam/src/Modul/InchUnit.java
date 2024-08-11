package Modul;

public class InchUnit implements IUnit{
	@Override
	public double converTo(int meters) {
		return meters/0.0254;
	}

}
