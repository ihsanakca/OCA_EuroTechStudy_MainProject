package ch5.interfaces.q071;

class C2 {
	public void displayC2() {
		System.out.println("C2");
	}
}
interface I {
	public void displayI ();
}

class C1 extends C2 implements I {
	public void displayI() {
		System.out.println("C1");

	}
}

public class Q071{
	public static void main (String[]args){

		// And given the code fragment:
		C2 obj1 = new C1();
		I obj2 = new C1();
		
		C2 s = (C2) obj2;
		I t = (I) obj1;
//
		t.displayI();s.displayC2();

	}
}
/*What is the result? (Same 66)
A. C2C2
B. C1C2
C. C1C1
D. Compilation fails		>> OK
*/

/** 
!! Check if there is any unimplemented method
!! Attention to casting and the type of reference and object
 */
