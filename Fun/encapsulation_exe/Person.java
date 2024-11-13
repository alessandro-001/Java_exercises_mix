package encapsulation_exe;

public class Person {

	  String name = "";
	  String job = "";
	  int age = 0;

	  public Person(String name, String job, int age) {
		  this.name = name;
		  this.job = job;
		  this.age = age;
	  }

	  public void introduction() {
	    System.out.println("Hello, my name is " + name + " , I am " + age + " years old, and I am a " + job);
	  }
}
