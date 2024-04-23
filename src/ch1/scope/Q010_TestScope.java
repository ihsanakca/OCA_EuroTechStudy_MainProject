package ch1.scope;

import java.util.Arrays;

public class Q010_TestScope {

	public static void main(String[] args) {
		int var1 = 200;
		System.out.print(doCalc(var1)); 
		System.out.print(" " + var1);

		String  str = "Ihsan";
		System.out.println("str.toUpperCase() = " + str.toUpperCase());
		System.out.println("str = " + str);

		int [] arr = {5,20,33};
		System.out.println("arr = " + arr);
		System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
		System.out.println("Arrays.toString(doCalc(arr)) = " + Arrays.toString(doCalc(arr)));
		System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
		System.out.println("arr = " + arr);
	}
	
	static int doCalc(int var1) {
		var1 = var1 * 2;
		return var1;
	}

	static int [] doCalc(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i]*2;
		}
		return arr;
	}
}
/* 10. What is the result?
A.	400 200				>> OK		
B.	200 200 
C.	400 400
D. Compilation fails.
*/









/** NOTES
System.out.print(doCalc(var1)); // prints the returned value of doCalc()
System.out.print(" " + var1);  // prints the local var
*/