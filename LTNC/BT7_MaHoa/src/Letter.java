import java.util.Iterator;

public class Letter {
	public static String mahoa( String s, int key) {
		String resultString ="";
		String Sb = s.substring(0, key);
		String Se = s.substring(key-1, s.length() );
		for (int i =Sb.length()-1; i > 0; i--) {
			
			resultString += Sb.charAt(i);
			
		}
		for (int i =Se.length()-1; i > 0; i--) {
			
			resultString += Se.charAt(i);
			
		}
		
		
		
		
		return resultString;
	}
	
	
	
	
	
	public static void main(String[] args) {
		String string = "programming";
		
		System.out.println(mahoa(string, 7));
	
	}

}
