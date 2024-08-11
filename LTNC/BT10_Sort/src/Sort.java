import java.util.Arrays;

public class Sort {

	public static void sort(int[] arr) {
		for (int j = 0; j < arr.length; j++) {

			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {				
				
					arr[i]+= arr[i+1]; // 3 + 8 = 12
					arr [i+1] = arr[i] - arr[i+1]; // 12 - 8 = 3 
					arr[i]= arr [i] - arr [i+1];//  12 - 3 = 8
					
				}

			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 8, 3, 6, 1 ,5,3,7,2,1,7,4,3,7,2,3};
		sort(arr);

		System.out.println(Arrays.toString(arr));
	}
}
