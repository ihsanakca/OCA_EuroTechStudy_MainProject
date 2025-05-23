package ch1.type_wrapper;

public class Q012_SumTest { //public class  SumTest
	public static void doSum(Integer x, Integer y) {
		System.out.println("Integer sum is " + (x + y));
	}
	
	public static void doSum(double x, double y) {   //bunu kapatırsak hangisine gider
		System.out.println("double sum is " + (x + y));
	}
	
	public static void doSum(float x, float y) {
		System.out.println("float sum is " + (x + y));
	}


	
	public static void doSum(int x, int y) {   //bunu kapatırsak hangisine gider
		System.out.println("int sum is " + (x + y));
	}
	
	public static void main(String[] args) {
		doSum(10,  20);
		doSum(10.0,  20.0);
	}
}
/* What is the result?  (same 145-219)
 A. int sum is 30
 	float sum is 30.0
 	
 B. int sum is 30				>> OK
 	double sum is 30.0
 	
C. Integer sum is 30
 	double sum is 30.0
 	
A. Integer sum is 30
 	float sum is 30.0
 	
 */


// int --> float --> double --> Integer
// if it was written as doSum(10.0f,  20.0f); it would go to float