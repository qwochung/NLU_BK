package Modun_Strategy;

public class CovertToHex extends Covert {

	@Override
	public Object converTo(int input) {
		String result = Integer.toHexString(input);
		
		return result;
	}
	
	
	

}
