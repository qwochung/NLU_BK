/**
 * viết chương trình mã hóa kĩ tự bằng cách dịch sang phải bit
 * 
 * @author ADMIN
 *
 */
public class MaHoa {
 
	public static void main(String[] args) {
		System.out.println(maHoa("hello", (byte)2 ));
		System.out.println(maHoaDichBit("ABC", (byte) 3));
	}

	// mã hóa bằng phương thức XOR
	private static String maHoa(String text, byte key) {
		String result = "";
		for (int j = 0; j < text.length(); j++) {
			char ch = text.charAt(j);
			result += Character.valueOf((char) (ch ^ key));
			
		}
		
		return result;
		
	}

	// mã hóa bằng dịch bit >>
	
	public static String maHoaDichBit( String textString , byte key) {
		String result = "";
		for (int i = 0; i < textString.length()	; i++){
			char ch = textString.charAt(i) ;
			result +=  Character.valueOf((char) (ch >> key));
			
			
		}
		
		return result;
		
	}
}
