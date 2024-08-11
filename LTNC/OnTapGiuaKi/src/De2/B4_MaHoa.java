package De2;


public class B4_MaHoa {
	public static String MaHoa( String s , int key) {
		String result = "";
		int leng = 'z' - 'a' +1 ;
		System.out.println( leng);
		if (key > leng) {
			key = key - leng;
		}
		
		// ktra có phải chuỗi trống
		if (s.trim().equals("")) {
			return result;
		}
		for (int i = 0; i < s.length(); i++) {
			
			int ch = s.charAt(i);
			
			// trong khoản từ a - z
			if (ch >= 'a' && ch <= 'z') {
				result += (char) (( ch - 'a' + key ) % leng + 'a');
			}
			
			// trong khoản từ A - Z
			if (ch >= 'A' && ch <= 'Z') {
				result += (char) (( ch - 'A' + key ) % leng + 'A');
			}
			
			// trong khoảng từ 0 - 9
			if (ch >= '0' && ch <= '9') {
				result += (char) (( ch - '0' + key ) % ('9'-'0' +1) + '0');
			}
			
			else {
				result += (char) ch;
			}
			
			
		}
		
		return result;
	}
	

	
	public static void main(String[] args) {
		for (int i = 'a'; i <= 'z'; i++) {
			System.out.print(i + " ");
		}
		System.out.println("");
		for (int i = '0'; i <= '9'; i++) {
			System.out.print(i + " ");
			
		}
		String testString = "2/''";
		String test1 = MaHoa(testString, 2);
		System.out.println( "\nChuỗi đã cho là  : " + testString);
		System.out.println("Chuỗi đã mã hóa là : "+test1);
	}
}
