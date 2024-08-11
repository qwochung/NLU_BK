package Nhom9;

public class test {
	int a = 1;
	int b= 2;
	
	test funcTest (test obj1) {
		test obj2 = new test();
		obj2= obj1;
		obj2.a = obj1.a++ + ++obj1.b;
		obj2.b = obj1.b	;
		return obj2;
	}

	
	public static void main(String[] args) {
		test obj1 = new test();
		test obj2 = obj1.funcTest(obj1);
		System.out.println(obj1.a +" "+ obj1.b + " " + obj2.a + " " + obj2.b);
	}
}
