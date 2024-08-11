package Modun_Strategy;

public class CovertToBin extends Covert {

	@Override
	public Object converTo(int input) {
		String result = Integer.toBinaryString(input);
		
		return result;
	}
	
	
	

}
