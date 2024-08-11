
public class MaHoa2 {
//Dùng xor để mã hóa và giải mã chuỗi bất kỳ với password là 1 byte. Mở rộng
	//cho password là chuỗi bất kỳ (kỹ năng tiền xử lý dữ liệu)
	
	public static String maHoa(String s, Byte key) {
		String result= "";
		for (int i = 0; i < s.length(); i++) {
			
			char ch = (char) (s.charAt(i) ^ key);
			result += ch;

			
		}
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		String string = "hello";
		System.out.println(maHoa(string , (byte) 2 ));
		System.out.println(maHoa(maHoa(string , (byte) 2 ), (byte)2));
	}
}
