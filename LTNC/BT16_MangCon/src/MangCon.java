

public class MangCon {
	public static boolean contain(int[] arr1, int[] arr2) {
		// mặc định mảng arr1 là mãng con

		for (int i = 0; i < arr2.length - arr1.length ; i++) {
			int[] subArr = new int[arr1.length];
			
			for (int j = 0; j < subArr.length; j++) {
				subArr[j] = arr2[i + j];

			}
			if (soSanhArr(arr1, subArr) == true) {
				return true;
			}
			
		}
			return false;

	}

	private static boolean soSanhArr(int[] arr1, int[] subArr) {
		for (int i = 0; i < subArr.length; i++) {
			if (arr1[i] == subArr[i]) {
				continue;
			
			}
			else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr2 = { 1, 2, 3, 4, 5, 6 };
		int[] arr1 = { 2, 3, 4 };

		System.out.println(contain(arr1, arr2));
	}
}
