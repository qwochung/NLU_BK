import java.util.Scanner;

public class SoChuSo {

	// tạo hàm 
	public static int countDigit(int num) {
		 int dem = 1;
		 while ( num > 10) {
			 dem ++;
			 num = num / 10; 
			 
		 }
		return dem; 
		 
		 
		 
	}
	
	
	public static void main(String[] args) {
		System.out.println( " Nhập số nguyên :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		int kq = countDigit ( num);
		System.out.println( " Số chữ số là : " + kq );

	}

	
	// PASSED
	
}
