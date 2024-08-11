package Cau1;

import java.util.Scanner;

public class Cau1 {
	
	 
	private static Scanner scanner;

	public static	void find( int[] list, int x) {
		boolean result = false;
		for (int i = 0; i < list.length; i++) {
			
			for (int j = 1; j < list.length -1; j++) {
				
				if (i + j == x) {
					System.out.println( "2 số cần tìm là : " + i +" và "+j);
					result = true;
				}
			}
			
		}
		if ( result == false) {
			System.out.println("Không có cặp số nào thỏa mãn");
		}
		
		
	}
	
	public static void main(String[] args) {
		int [] list = { 1,2,34,45,5,6,3,7,8,3,2,4,6,5,2,1,4,2453,7,452,32,235,63,234,53,2,3,5643,21,23,4};
		scanner = new Scanner(System.in);
		System.out.println("Nhập số nguyên X :");
		int sc = scanner.nextInt();
		find(list, sc);
		
	}

}
