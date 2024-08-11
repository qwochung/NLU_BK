import java.util.Random;
import java.util.Scanner;

public class GameTaiXiu {
	public static void main(String[] args) {
		System.out.println("-------------Chào Mừng Đến Với Game Tài Xỉu Offline-----------");
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Qui tắc:\n +chọn (1) để đặt TÀI. \n +Chọn (2) để đặt SỈU. \n +Chọn (0) để thoát chương trình");
		System.out.println("Mời bạn lựa chọn: ");
		while (true) {
			int luachon = sc.nextInt();
			if (luachon == 0) {
				System.err.println("Đã thoát khỏi chương trình.!!");
				break;
			}
			if (luachon == 1 || luachon == 2) {
//				System.out.println("lua chọn đúng");
				int tong = ThayXucXac();
				if ( (tong < 11 && luachon ==1 ) || ( tong > 11 && luachon ==2)	) {
					System.out.println("Chiến thắng");}
					
				else {
						System.out.println(" Bạn đã thua");
					}
				
				
				

			} else {
				System.out.println("Bạn đã nhập sai, xin mời nhập lại");
			}

		}
		sc.close();
	}
	
	
	public static int  ThayXucXac() {
		Random xucXac1 = new Random()	;
		Random xucXac2 = new Random()	;
		Random xucXac3 = new Random()	;
		int xx1 = xucXac1.nextInt(5)+1	;
		int xx2 = xucXac2.nextInt(5)+1	;
		int xx3 = xucXac3.nextInt(5)+1	;
		System.out.println( "Các Xúc Xắc là:  " + xx1 +" "+ " "+ xx2 +" "+ xx3);
		int tong = xx1 + xx2 + xx3 ;
		return tong;
		
		

		
		
	}
}
