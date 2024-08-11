package MaTranTamGiac;



public class MaTranTamGiac {
	// in ma trận
	public static void inMaTran(int[][] maTran) {
		for (int[] is : maTran) {
			for (int is2 : is) {
				System.out.print(is2 + " ");

			}
			System.out.println();
		}
	}

	// kiểm tra có phải là ma trận tam giác trên
	public static boolean tamGiacTren(int[][] matran) {

		for (int i = 1; i < matran.length; ) {
			if (matran.length != matran[i].length) { // kiểm tra có phải là ma trận vuông
				return false;
			}

			for (int j = 0; j < matran[i].length; j++) {
				if (i == j) {
					break;
				}
				if (matran[i][j] != 0) {
					System.out.println("Không phải ma trận tam giác! 12 ");
					return false;
				}

			}
			System.out.println("Ma trận tam giác TRÊN! ");
			return true;

		}
		System.out.println("Không phải ma trận tam giác! 1 ");
		return false;
	}

	
	
	
	
	
	public static void main(String[] args) {
		int[][] maTran1 = { { 1, 2, 4, 5, 6 }, { 0, 5, 3, 5, 6 }, { 0, 0, 2, 4, 6 }, { 0, 0, 0, 1, 2 },{ 0, 0, 0, 0, 2 } };
		
		
		int[][] maTran2 = { { 1, 0, 0, 0, 0 }, { 1, 0, 0, 0, 0 }, { 6, 2, 0, 0, 0 }, { 6, 3, 7, 0, 0 },{ 0, 4, 3, 1, 0 } };
		System.out.println();
		inMaTran(maTran1);
		tamGiacDuoi(maTran2);
		tamGiacTren(maTran1);

	}

	public static boolean tamGiacDuoi(int[][] matran) {
		for (int i = matran.length -1; i >=0; i--) {
			
			if (matran.length != matran[i].length) { // kiểm tra có phải là ma trận vuông
				return false;
			}
	
			for (int j =matran.length -1 ; j >= 0; j--) {
				
				if (i == j) {
					break;
				}
				if (matran[i][j] != 0) {
					System.out.println("Không phải ma trận tam giác! 12 ");
					return false;
				}
	
			}
			System.out.println("Ma trận tam giác DƯỚI! ");
			return true;
	
		}
		System.out.println("Không phải ma trận tam giác! 1 ");
		return false;
	
	}
}
