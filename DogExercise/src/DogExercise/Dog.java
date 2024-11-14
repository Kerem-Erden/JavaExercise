package DogExercise;

public class Dog {
	
	//create the attributes
	private String name;
	private String breed;
	
	//create constructor
	public Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	
	//get-set methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	//create a print method
	public void ShowDetails(String dogName, String dogBreed) {
		System.out.println("Breed of the " + dogName + " is " + dogBreed + "\n");
	}
	
	
}
