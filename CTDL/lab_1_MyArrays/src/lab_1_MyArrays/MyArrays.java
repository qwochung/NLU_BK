package lab_1_MyArrays;

import java.util.Arrays;


public class MyArrays {
	private int [] array;

	public MyArrays(int[] array) {
		super();
		this.array = array;
	}
	
	
	
	//Method mirror that outputs the contents of an array in a
	//reverse order like a mirror
	//Example: input [1, 2, 3] ==> output: [1, 2, 3, 3, 2, 1]

	
	public   int [] mirror( ) {
		int [] result = new int [array.length *2];
		for (int i = 0; i < array.length; i++) {
			result [i] =  array [i];
			result [result.length -1 -i ] = array [i];
		}
		
		return result;
		  
		
		
	}
	
	
	
	// removes all duplicate elements from an array and returns a
	// new array
	//Input: 1 3 5 1 3 7 9 8
	//Output: 1 3 5 7 9 8

	public int [] removeDuplicates() {
		int lengt = array.length;
		
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				
				
				if ((array[j] == array[i] )&& (i!=j)) {
					lengt -=1;
				}
			}
			
		}
		
		int [] result = new int [lengt];
		int posRe = 1;
		
		for (int i = 1; i < array.length; i++) {
			result[0]= array [0];
			boolean contain = false;
			if (posRe == lengt) {
				break;
			}
			for (int j = 0; j < result.length; j++) {
				
				if ((array[i] == result[j]) )  {
					contain = true;
					break;
				}
			}
			if (contain == false) {
				result [posRe++] = array[i];
				
			}
			
			
			}
			
			
			return result;
		}
		
		
		
		
		
	// Input: 10 11 12 13 14 16 17 19 20
	// Output: 15 18
	public int[] getMissingValues() {
		int len =0;
		for (int i = array[0]; i < array[array.length-1]; i++) {
			for (int j = 0; j < array.length; j++) {
				
				if (array[j] == i ) {
					break;
				}
				if (j == (array.length -1)) {
					len +=1;
				}
			}
			
		}
		
		int [] result = new int [len];
		int position = 0;
		for (int i = array[0]; i < array[array.length-1]; i++) {
			for (int j = 0; j < array.length; j++) {
				
				if (array[j] == i ) {
					break;
				}
				if (j == (array.length -1)) {
					result[position++] = i;
					
				}
			}
			
		}
		
		
		
		
		
		return result;
		}

	
	
	
	// Input: 10 11 12 -1 14 10 17 19 20
	// Output(k=3): 10 11 12 12 14 10 17 19 20
	public int[] fillMissingValues(int k) {
		int[] result =new int[array.length];
		
		for (int i = 0; i < array.length; i++) {
			int j = array[i];
			
			if (j == -1 ) {
				if (i==0 ) {
					result[i]= (array[i+1]+ array[i+2] + array[i+3])/3;
					continue;
				}
				if (i == array.length -1) {
					result[i]= (array[i-1]+ array[i-2] + array[i-3])/3;
					continue;
				}
				else {
					result[i]= findMinNumber(i ,k);
					
					continue;
				}
			}
			
			result[i] = j;
		}
		
		
		return result;
	}
	
	
	public int findMinNumber(int i, int k) {
		if (i-(k-1)<0) {
			for (int j = 0; j < array.length; j++) {
				
			}
			return (array[i-1]+ array[i+1] + array[i+2])/3;
		}
		
		if (i + 2 > array.length-1) {
			return (array[i-1]+ array[i-2] + array[i+1])/3;
		}
		else {
			double a = ((array[i-1]+ array[i-2] + array[i+1])/3.0);
			double b = ((array[i-1]+ array[i+1] + array[i+2])/3.0);
			System.out.println( a);
			System.out.println( b);
			if (a > b) {
				return (int)b;
				}
			else {
				return (int)a;
			}
		}
		
		
		
		
	}
	



	public static void main(String[] args) {
		
		//test mirror
		MyArrays myArrays = new MyArrays(new int [] {1,2,3});
		System.out.println(Arrays.toString(myArrays.mirror()));
		
		
		// test removeDuplicates
		MyArrays test1 = new MyArrays( new int []{1,2,3,1,2,0,0,3,5});
		int [] result = test1.removeDuplicates();
		System.out.println(Arrays.toString(result));
		
		// test getMissingValues
		
		MyArrays test2 = new MyArrays( new int []{10, 11 ,12 ,13 ,14 ,16 ,17, 19 ,20});
		System.out.println(Arrays.toString(test2.getMissingValues()));
		
		
		
		MyArrays test3 = new MyArrays( new int []{10, 11, 12 ,-1 ,14 ,10 ,17 ,19 ,20});
		System.out.println(Arrays.toString(test3.fillMissingValues(3)));
		
		
		
	}
}
