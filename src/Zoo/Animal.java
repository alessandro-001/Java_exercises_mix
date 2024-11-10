package Zoo;

import java.util.Random;

abstract class Animal {
	
	public String species;
	public String sound;
	public int age;
	public static Random random = new Random();
	
	public Animal(String species, String sound) {
		this.species = species;
		this.sound = sound;
		this.age = random.nextInt(11);
	}
	public abstract void speak();
	public abstract void message(int index);
}


// cat sub
class Cat extends Animal {
	public Cat() {
		super("Cat", "Meow");
	}
	
	@Override
    public void speak() {
        System.out.println("A " + species + " goes " + sound + "!");
    }
	
	@Override
    public void message(int index) {
        System.out.println("The animal at index "+ index + " is a " + species + " goes " + sound + "! and is " + age + " years old.");
    }
}


// dog sub
class Dog extends Animal {
	public Dog() {
		super("Dog", "Woof");
	}
	
	@Override
    public void speak() {
        System.out.println(species + "s go " + sound + "!");
    }
	
	@Override
    public void message(int index) {
		System.out.println("The animal at index "+ index + " is a " + species + " goes " + sound + "! and is " + age + " years old.");
    }
}


// cow sub
class Cow extends Animal {
	public Cow() {
		super("Cow", "Moo");
	}
	
	@Override
    public void speak() {
        System.out.println("A moo-" + species + " goes " + sound + "!");
    }
	
	@Override
    public void message(int index) {
		System.out.println("The animal at index "+ index + " is a " + species + " goes " + sound + "! and is " + age + " years old.");
    }
}

	


