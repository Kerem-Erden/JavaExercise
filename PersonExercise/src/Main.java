
public class Main {
	public static void main(String[] args) {
		Person personObject1 = new Person("John", 44);
		Person personObject2 = new Person("Donalt", 67);
		
		//print name and age
		System.out.println("Name: " + personObject1.getName() + "\nAge: " + personObject1.getAge());
		System.out.println("Name: " + personObject2.getName() + "\nAge: " + personObject2.getAge());
		
		//modify the age and name
		personObject1.setAge(22);
		personObject1.setName("Trump");
		
		//print the new name and age
		System.out.println("New name and age:");
		System.out.println("Name: " + personObject1.getName() + "\nAge: " + personObject1.getAge());
	}
	
	
}
