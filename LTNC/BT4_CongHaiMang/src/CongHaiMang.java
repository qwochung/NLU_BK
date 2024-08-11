import java.util.Arrays;

public class CongHaiMang {

	
	// tạo hàm tính tổng 2 mảng
	
	public static int[] arrayPlus (int[] a, int[] b ) {
		int alen = a.length; // lấy độ dài mảng a
		int blen = b.length;  // lấy độ dài mảng b
		
		int[] result = new  int[ alen + blen];  // độ dài mảng kết quả = độ tổng độ dài 2 mảng con 
		
		System.arraycopy(a, 0, result, 0, alen); 
		System.arraycopy(b, 0, result, alen, blen);
		
		System.out.println( Arrays.toString(result));
		return result;
		
		
		
		
	}

	
	/**
	 * tính tổng 2 mảng theo vị trí. Ví dụ :
	 * 
	 * int [] a = { 1,2,3}
	 * int [] b = { 1,2,4,5,6}
	 *
	 *==> int []result = {2,4,7,5,6}
	 *
	 * 
	 * @param args
	 */
	public static int [] Tong2Mang (int[] a, int[] b ) {
		
		if (a.length >= b.length) {
			for (int i =0; i<b.length;i++)
				a[i]=a[i]	+b[i];
		}
		
		if (a.length < b.length) {
			for (int i =0; i<a.length;i++)
				b[i]= b[i]+ a[i];
		}
	
		return a.length > b.length  ? a:b;
		
	}
	
	
	// hàm in
	public static void display (int[] a) {
		for (int i =0; i< a.length; i++) {
			System.out.print(a[i]+ " ");
		}
	}
	
	
	
	public static void main(String[] args) {
		int [] a = { 1,2,4,5};
		int [] b = { 2,5,6,7,8} ;
		display(Tong2Mang(a, b));

		
	}

	
	
	



	
}
