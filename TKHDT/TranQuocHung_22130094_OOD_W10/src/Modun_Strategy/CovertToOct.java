package Modun_Strategy;

public class CovertToOct extends Covert {

	@Override
	public Object converTo(int input) {
		String result = Integer.toOctalString(input);
		
		return result;
	}
	
	
	

}
