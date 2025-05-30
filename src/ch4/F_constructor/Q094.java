package ch4.F_constructor;



public class Q094 {

}
class Person {
	String name;
	int age = 25;

	Person(String name){    // line n1
		setName(name);
	}

	public Person(String name, int age){    // line n2
	//	Person(name);
		setAge(age);
	
	}


	// setter and getter methods go here
	public void setName(String name){
		this.name=name;
	}

	public void setAge(int age){
		this.age=age;
	}

	public String show(){
		return name + " " + age;
	}

	public static void main(String[] args) {
		Person p1 = new Person("Jesse");
		Person p2 = new Person("Walter",52);
	//	p1.Person(null);
		System.out.println(p1.show());
		System.out.println(p2.show());
	}

}

/* What is the result?
A. Compilation fails at both line n1 and line n2. 
B. Compilation fails only at line n2. 					>>OK
C. Compilation fails only at line n1. 
D. Jesse 25Walter 52
 */

