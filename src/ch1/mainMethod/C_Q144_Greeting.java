package ch1.mainMethod;


public class C_Q144_Greeting {  //public class Greeting
	
	public static void main(String[]args) {
		System.out.println("Hello " + args[0]);

		
	}
}


/*
Which set of commands prints Hello Duke in the console?
		
A)	javac Greeting				>>missing extension (.java)  
	java Greeting Duke

B)	javac Greeting.java Duke	>>compiling without arguments
	java Greeting 
	
C)	javac Greeting.java			>> OK
	java Greeting Duke Ahmet
	
C)	javac Greeting.java			
	java Greeting.class Duke	>> running without extension (.class)

*/