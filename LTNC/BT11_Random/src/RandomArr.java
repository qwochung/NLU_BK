
import java.util.Arrays;
import java.util.Random;

public class RandomArr {

	public static int[] arr (int[] mang, int qty) {
		int[] result = new int[qty];
		Random rd1 = new Random();
		Random rd2 = new Random();
		
		for (int i = 0; i < mang.length-1; i++) {

			int a = rd1.nextInt(mang.length-1);
			int b = rd2.nextInt( mang.length-1);
			
			if ( a!=b) {
				swap(mang, a, b);
			}
			if (a ==b) {
				i--;
			}
		}
		
		for (int i = 0; i < qty-1; i++) {
			result [i] = mang[i];
			
		}
		
		

		return result;
	}

	// tạo hàm hoán đổi vị trí

	public static void swap(int[] arr, int a, int b) {
		arr[a] += arr[b];
		arr[b] = arr[a] - arr[b];
		arr[a] = arr[a] - arr[b];

	}
	public static void main(String[] args) {
		int [] mang = { 1,4,6,1,3,6,7,4,8,9};
		int qty = 5;
		int[] result = arr(mang, qty);
		System.out.println(Arrays.toString(result));
	}
}

