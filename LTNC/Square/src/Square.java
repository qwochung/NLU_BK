
public class Square {
	
	public static void main(String[] args) {
		printSquare(5);
		
	}

	public static void printSquare ( int size ) {
		for (int i = 0; i < size; i++) {
			
			for (int j = 0; j < size; j++) {
				
				if ( i ==0 || j == 0 || i == size-1 || j == size-1) {
					System.out.print( " * ");
					
				}
				
				else {
					System.out.print("   ");
					
				}
			
			}
			System.out.println("");
			
		}
	}
}
