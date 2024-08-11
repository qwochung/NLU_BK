package NhanMaTran;

import java.util.Arrays;

public class NhanMaTran {
	// kiểm tra 2 MT có nhân được với nhau ko?

	public static String checkType(int[][] arr1, int[][] arr2) {

		if (arr1[0].length == arr2.length) {
			return "A";
		}
		if (arr2[0].length == arr1.length) {
			return "B";
		}

		return "Không nhân được";
	}

	/**
	 * 1 2 3 6 2 4 4 5 6 5 X 6 8 2 4 6 9 9 2 3 5
	 * 
	 * ( 3x4 ) ( 4x2 ) ===> ( 3x2 )
	 * 
	 * x x x x x x
	 * 
	 * @param arr1
	 * @param arr2
	 * @return
	 */

	// tạo method cộng 2 mãng 1 chiều
	public static int plus(int[] arr1, int[] arr2) {
		int result = 0;

		for (int i = 0; i < arr2.length; i++) {
			result += arr1[i] + arr2[i];

		}

		return result;
	}

	// tạo menthod lấy cột
	public static int[] getCol(int[][] arr, int j) {

		int[] result = new int[arr.length];
		for (int i1 = 0; i1 < arr.length; i1++) {
			result[i1] = arr[i1][j];

		}

		return result;
	}
	
	
	// in ma trận 
	public static void print(int[][] arr) {
		for (int[] is : arr) {
			for (int is2 : is) {
				System.out.print(is2 + " ");
			}
			System.out.println();
		}

	}

	public static int[][] nhanMaTran(int[][] arr1, int[][] arr2) {
		int[][] result = new int[arr1.length][arr2[0].length];

		if (checkType(arr1, arr2).equals("A")) {
			for (int i = 0; i < result.length; i++) { // i = 2

				for (int j = 0; j < result[i].length; j++) {
					int[] getCol = getCol(arr2, j);
					result[i][j] = plus(arr1[i], getCol);
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[][] arr1 = { { 5, 7, 3, 1 }, { 5, 7, 3, 1 }, { 5, 7, 3, 1 } };
		int[][] arr2 = { { 2, 1 }, { 5, 2 }, { 5, 3 }, { 7, 4 } };
		System.out.println(checkType(arr1, arr2));
		System.out.println(getCol(arr2, 0));
		System.out.println(Arrays.toString(getCol(arr2, 1)));
		print(nhanMaTran(arr1, arr2));

	}

	
	
	

}
