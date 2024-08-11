package Modul;

public class YardUnit implements IUnit {
	@Override
	public double converTo(int meter) {
		return meter/0.9144;
	}

}
