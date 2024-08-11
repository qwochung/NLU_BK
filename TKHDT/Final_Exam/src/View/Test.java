package View;

import Controller.Control_Unit;
import Modul.FeetUnit;

public class Test {
	public static void main(String[] args) {
		Control_Unit controlUnit = new Control_Unit();
		
		controlUnit.setUnit(new FeetUnit());
	
		System.out.println(controlUnit.change(10));
	}
}
