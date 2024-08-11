package Modun_Strategy;

public abstract class  Covert {
	public static final int BIN = 1;
	public static final int OCT = 2;
	public static final int HEX = 3;
	Covert covert;
	
	public  abstract  Object converTo(int input);
	
	
	public  Object converTo( int input, int type) {
		switch (type) {
		case BIN: {
			covert = new CovertToBin();
			return covert.converTo(input);
		}
		case OCT: {
			covert = new CovertToOct();
			return covert.converTo(input);
		}
		case HEX: {
			covert = new CovertToHex();
			return covert.converTo(input);
		}
		
		
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
			
		}
		
		
		
		
	};
	

}
