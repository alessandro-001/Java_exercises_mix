package Zoo;

import java.util.Random;

// Run this file

public class Randomiser {
	public static void main(String[] args) {
		Animal[] zoo = new Animal[10];
		Random random = new Random();
		
		for (int i = 0; i < zoo.length; i++){
			switch(random.nextInt(3)){
				case 0:
					zoo[i] = new Dog();
					break;
				case 1: 
					zoo[i] = new Cat();
					break;
				case 2:
					zoo[i] = new Cow();	
					break;
				
			}
		}
		
        for (Animal animal : zoo) {
            animal.speak();
        }
        
		for (int i = 0; i < zoo.length; i++){
			  int r = random.nextInt(zoo.length);
		      zoo[r].message(r + 1);
		}
	}
}
