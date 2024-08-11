

public class TamGiacPascal {

	public static void main(String[] args) {
//		a. viết hàm void printMatrix(int[][] matrix) hiển thị lên console mảng 2 chiều bất kỳ

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		printMatrix(matrix);
		System.out.println("-------------------------");
		printMatrix(createPascalTriangle(7));
		System.out.println( "--------------------------------------");
		int [] diagonalValues = {1, 5, 2, 0};
		createPascalTriangle(diagonalValues);
		System.out.println();
		
		
		
	}

	/**
	 * a. viết hàm void printMatrix(int[][] matrix) hiển thị lên console mảng 2
	 * chiều bất kỳ
	 * 
	 * @param matrix
	 */

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}

			System.out.println();
		}
	}

	/**
	 * viết hàm int[][] createPascalTriangle(int size) tạo ra ma trận số nguyên 2
	 * chiều thể hiện tam giác pascal 1 1 2 1 2 3 1 2 3 4 . . . . .
	 * 
	 */

	public static int[][] createPascalTriangle(int size) {
		int[][] triangle = new int[size][];

		for (int i = 0; i < triangle.length; i++) {

			triangle[i] = new int[i + 1];
			int fill = 1;
			for (int j = 0; j < i + 1; j++) {
				triangle[i][j] = fill++;

			}

		}

		return triangle;

	}
	

/**
 * viết hàm int[][] createPascalTriangle(int[] diagonalValues) nhận vào mảng số nguyên bất kỳ chứa các giá trị
 *  năm trên đường chéo để tạo ra ma trận số nguyên 2 chiều thể hiện tam giác pascal:
 *  - Số dòng = số phần tử trong mảng diagonalValues
 *  - Giá trị các phần tử trong mảng diagonalValues giá trị của các phần tử nằm trên đường chéo của ma trận 
 *  - Trên mỗi dòng giá của 1 cột bằng giá trị cột trước đó - 1
 *  
	Ví dụ:
		input = {1, 5, 2, 0}
		output:
 1
 4  5
 0  1  2
-3 -2 -1 0

 */
	
	
	public static int[][] createPascalTriangle(int[] diagonalValues) {
		int [][]	triangle = new int [diagonalValues.length] []	;
		for ( int i = 0 ; i < triangle.length ; i ++) {
			triangle [i] = new int[i+1];
		}
		
		
		for ( int i = 0 ; i < diagonalValues.length; i++) {
			
			triangle [i][i] = diagonalValues[i];
			
		}
		
		for ( int i = triangle.length -1  ; i >=1; i--) {
			
			for ( int j = triangle[i].length -1 -1 ; j >=0 ; j --) {
				triangle [i] [j] = triangle [i][j+1] -1;
			}
			
		}
		 printMatrix(triangle) ;
		return triangle;
		}
	
	
	
}
