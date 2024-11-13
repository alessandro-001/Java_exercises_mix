package Hashcode;

public class Student{
	  private String name;
	  private int age;

	  public Student(String name, int age){
	    this.name = name;
	    this.age = age;
	  }

	  public int hashCode(){
	    return name.hashCode();
	  }

	  public boolean equals(Object o){
	    Student s = (Student)o;
	    return s.name.equals(this.name);
	  }
	}
