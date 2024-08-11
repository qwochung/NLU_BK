package lab_1_MyArrays;

public class test {
	
	
	public static void swap(int i , int [] arr) {
		i = 100;
		arr[0]= 200000;
	}
	
	public static void main(String[] args) {
		int i = 1;

		int [] arr = new int [] {1,2,3,4};
		int [] arr2 = arr.clone();
		
		Object x[] = new Integer[3];
		x[0] = 'x';
//		String yString = (String) x[0];
		
		swap(i, arr);
		
		System.out.println(x[0]);
		System.out.println(arr[0]);
	}
}
