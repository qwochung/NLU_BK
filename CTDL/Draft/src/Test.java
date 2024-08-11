import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	public static void insertSort(int[]a) {
		for (int i = 1; i < a.length; i++) {
			int j = i-1;
			while (j>= 0 && a[j] > a[i]) {
				swap(a, i--, j--);
			
			}
		}
		
	}
	
	
	public static void swap	(int [] a, int i , int j) {
		a[i] += a[j];
		a[j] = a[i] - a[j];
		a[i] = a[i] - a[j];
		
	}
	
	
	public static Collection get() {
		 Collection sorted = new LinkedList();
		 sorted.add("B"); sorted.add("C"); sorted.add("A");
		 return sorted;
		 }
	
	
	
	
public static void main(String[] args) {
	obj o1 = new obj("a");
	obj o2 = new obj("v");
	obj o3 = new obj("n");
	obj o4 = new obj("ư");
	
	obj a[] = {o1,o2,o3,o4};
	obj h[] = a;
	obj []b = a.clone();
	obj []c = new obj[4];
	System.arraycopy(a, 0, c, 0, 4);
	 
	
	 a[0].setaString("asdasdaxc");
	  b[0] = new obj("ađáca");
	 
	 
	 
	 
	 int [] d = {1,2,3,4};
	 int [] e = d;
	 int []f = e.clone();
	
	 int g[] = new int [4];
	  System.arraycopy(d, 0, g, 0, 4);
	  d[0]= 7;
	 
	  System.out.println(Arrays.toString(d));
		 System.out.println(Arrays.toString(e));
		 System.out.println(Arrays.toString(f));
		 System.out.println(Arrays.toString(g));
	  
	  
	  
	  
	 
	 System.out.println(Arrays.toString(a));
	 System.out.println(Arrays.toString(b));
	 System.out.println(Arrays.toString(c));
	 System.out.println(Arrays.toString(h));
	 System.out.println(c[0]);

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
}
