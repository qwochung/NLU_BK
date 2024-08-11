import java.util.Scanner;

public class LamTron {
	
	public static void main(String[] args) {
		while ( true ) {
		System.out.println(" Nhập số cần làm tròn : ");
		Scanner sc = new Scanner(System.in);
		double number = sc.nextDouble();
		
		if (number == -1.0 )
			break ;
		
		sc.close();
		int roundNumber = roundNumber(number);
	
		System.out.println( (roundNumber) );
		}
	}

	// tạo hàm làm tròn
	public static int roundNumber (double number) {
		double  phanDu = number % 1;
		if ( phanDu  >= 0.5 )
			return (int) number / 1 +1;
		
		return (int) number / 1;
	}
}
// PASSED