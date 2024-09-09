package day4;

public class Animal {
	private String animalName;
	private String sound;

	public Animal() {
		super();
	}

	public Animal(String animalName, String sound) {
		super();
		this.animalName = animalName;
		this.sound = sound;
	}
	public void makeSound() {
		System.out.println("Animal:"+animalName+"\nSound"+sound);
	}
	

}
