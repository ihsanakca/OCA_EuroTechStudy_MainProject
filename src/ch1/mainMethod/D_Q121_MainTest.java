package ch1.mainMethod;

public class D_Q121_MainTest { //public class MainTest

	public static void main(int[] args) {
		System.out.println("int main " + args[0]);
	}
	public static void main(Object[] args) {
		System.out.println("Object main " + args[0]);
	}
	public static void main(String[] args) {
		System.out.println("String main " + args[0]);
	}
}

/*
and commands:
javac MainTest.java
java Maintest 1 2 3

What is the result?
A. int main 1
B. Object main 1
C. String main 1		>> correct gateway main with arguments (String[] args)
D. Compilation fails
E. An exception is thrown at runtime 

*/