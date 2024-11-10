package Array_list;


public class Person {
	String name;
	  int age;

	  public Person(String name, int age) {
	    this.name = name;
	    this.age = age;
	  }

	  public boolean equals(Object o) {
	    if (this == o) {
	      return true;
	    } else if (o instanceof Person) {
	      Person p = (Person) o;
	      return p.name.equalsIgnoreCase(this.name) && p.age == this.age;
	    }
	    return false;
	  }
}
