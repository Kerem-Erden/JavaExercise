package DogExercise;

public class Main {
	public static void main(String[] args) {
		//create the objects
		Dog dog1 = new Dog("Alfred", "Terier");
		Dog dog2 = new Dog("Comar", "Kangal");
		
		//print the names and breeds
		dog1.ShowDetails(dog1.getName(), dog1.getBreed());
		dog2.ShowDetails(dog2.getName(), dog2.getBreed());
		
		//modify the names and breeds
		dog1.setBreed("Bulldog");
		dog2.setName("Lucy");
		
		//print the after modifying
		System.out.println("After modifying");
		dog1.ShowDetails(dog1.getName(), dog1.getBreed());
		dog2.ShowDetails(dog2.getName(), dog2.getBreed());
	}
	
}
