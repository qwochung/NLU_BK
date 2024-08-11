
public class Matran {
	/**
	 * { 1,5,3,7} 
	 * 1 0 3 0 
	 * 0 5 0 1 
	 * 3 0 3 0 
	 * 0 1 0 7
	 */

	// tạo hàm in ma trận :

	public static void printMaTran(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print( arr[i][j] + " ");

			}
			System.out.println();
		}

	}

	public static int[][] fill(int[] arr) {
		int[][] fill = new int[arr.length][arr.length];
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) { // vòng lặp này để điền các phần tử trong mảng vào đường chéo cửa ma trận
			fill[i][count] = arr[count++];}
		
		
		for ( int i = 1; i < arr.length; i++) {
			
			for ( int j =1 ; j < arr.length-1 ;j++) {
				if ( i==j) {
					int a =i;
					int b =j;
					int soLanLap = 1; // 
					
					while ( ++a >=0 && --b>=0 ) {
						if ( a >= arr.length )
							break;
						else {
//						a= a+1;
//						b = b-1;
							fill [a][b] = fill[i][i] -2*soLanLap; 
							fill [ b ][ a] = fill [i][i] -2*soLanLap++;
							
							}
						}
						
					
				}
			}
		}
		return fill;

	}
	
	public static void dequi (int [][] fill) {
		
		
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 3, 7 ,9,8};
		printMaTran(fill(arr));
	}

}
