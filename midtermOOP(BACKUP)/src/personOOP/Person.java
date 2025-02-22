package personOOP;

public class Person {
	
	// Attributes
	
	String name, address;
	int age;
	
	Person(String name, String address, int age) {
		
	this.name = name;
	this.address = address;
	this.age = age;
	
	System.out.println("Name: "	+ name);
	System.out.println("Age: "	+ age);
	
	}
	
}

