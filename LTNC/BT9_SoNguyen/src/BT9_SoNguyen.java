import java.util.Scanner;

public class BT9_SoNguyen {

	public static String pointNum (int num	) {
		int count = 0;
		String result = "";
		while ( num >0) {
			if ( count == 3	) {
				result = "," + result;
				count = 0;
			}
			result = num % 10 + result;
			num /= 10;
			count++;
						
		}
		return result;
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" nhập số");
		int num = sc.nextInt ();
		System.out.println( pointNum(num));
		sc.close();
	}
}
