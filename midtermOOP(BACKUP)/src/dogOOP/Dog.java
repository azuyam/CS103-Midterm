package dogOOP;

public class Dog {
	
	// Attributes
	
	private String name, breed;
	
	Dog(String name, String breed) {
	
		this.name = name;
		this.breed = breed;
		}
	
	void setName(String name) {
		
		this.name = name;
		
			System.out.println("Name: "	+ name); 
		}
	
	void setBreed(String breed) {
		
		this.name = breed;
		
			System.out.println("Breed: " + breed);
		}
	
	String getName() {
		
		return name;
		}
	
	String getBreed() {
		
		return breed;
	}
}

