package Zoo;

public class Main {
	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal dog = new Dog();
		Animal cow = new Cow();
		
		cat.speak();
		dog.speak();
		cow.speak();
		
		cat.message(0);
		dog.message(0);
		cow.message(0);	
	}
}
