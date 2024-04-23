package ch3.a_string;

public class StringPool  
{  
	public static void main(String args[])   
	{

		String name = "\t\t\tAli       dfgdfgdf     gdgfdg    Aycan\t";
		System.out.println("name = " + name);
		System.out.println("name.trim() = " + name.trim().toUpperCase());
		System.out.println("name = " + name);
		name = name.trim().toUpperCase();
		System.out.println("name = " + name);
		//it will store in the string pool      
		String str1 = "Python";  
		String str2 = "Data Science";  
		String str20 = "Data ";
		String str21 = "Science";
		String str22 = str20.concat(str21);
		String str23 = str20+str21;
		String str24 = "Data "+"Science";


		System.out.println("----------------------");

		System.out.println(str2 == "Data Science");
		System.out.println(str2 == (str20+str21));
		System.out.println(str2 == str22);
		System.out.println(str2 == str23);
		System.out.println(str2 == str24);
		System.out.println(str2 == "Data "+"Science");
		System.out.println(str2 == "Data ".concat("Science"));

		System.out.println("----------------------");

		//it returns the reference of the pooled instance i.e. str1
		//it will not take place in the string pool  
		String str3 = "Python"; 
		System.out.println((str1 == str3));
		str1="Py";
		System.out.println((str1 == str3));
		String str4 = "C";  
		//store in Java heap  
		String str5 = new String ("Java");  
		//store in Java heap  
		String str6 = new String ("C++");  
		//store in Java heap  
		String str7 = new String ("Data Science");  
		//it will not take place in Java heap  
		//it will store in string pool  
		String str8 = new String ("C").intern();  
		//returns false  
		System.out.println((str1 == str5)+", Strings are not equal.");  
		//returns false because str2 occupies space in string pool and str7 occupies space in Java heap  
		System.out.println((str2 == str7)+", Strings are not equal.");   
		//it returns true because we have invoked the intern() method and the String C is already present in the string pool  
		System.out.println((str4 == str8)+", Strings are equal.");   
	}  
}  


/*** Look at the ids in debug mode, variables window 
 * https://i.stack.imgur.com/71l1O.jpg
 * https://stackoverflow.com/questions/3052442/what-is-the-difference-between-text-and-new-stringtext
 * **/
