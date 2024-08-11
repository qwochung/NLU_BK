import java.util.Scanner;

public class ChanLe_SoNguyenTo {

	public static void main(String[] args) {

		System.out.println(" Nhập số nguyên : ");

		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		sc.close();
		
		
		System.out.println( chanLe(number));
		System.out.println(SNT(number));
	}

	
	
	
	// tạo hàm chẵn lẻ 
	public static boolean chanLe (int number ) {
		return( number % 2 == 0);
	}
	
	
	// tạo hàm số nguyên tố 
	
	public static boolean SNT (int number ) {
		
		if ( number == 2)
			return true; 
		if ( number < 2 )
			return false ;
		
		for ( int i = 2 ; i  <= Math.sqrt( number);	i++) {
			if (number % i ==0 )
				return false;

		}
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


