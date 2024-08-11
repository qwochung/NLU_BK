import java.util.Scanner;

public class SoNguyenTo {

	// tạo hàm kiểm tra số nguyên tố
	public static boolean SNT(int number) {
		if (number == 2)
			return true;
		if (number < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0)
				return false;

		}
		return true;

	}

	// hàm để thực thi theo yêu cầu đề bài

	public static void result(int a, int b) {
		int dem = 0;
		while (dem != b) {

			if (SNT(++a) == true) {
				System.out.println(a);
				dem += 1;

			}

		}
	}

	public static void main(String[] args) {
		System.out.println(" nhập số a");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		System.out.println(" nhập số b");
		int b = sc.nextInt();
		sc.close();

		result(a, b);

	}

} // PASSED
