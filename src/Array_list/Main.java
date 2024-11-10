package Array_list;

import java.util.ArrayList;
import java.util.List;

public class Main {
	void search(){
	    Person alf = new Person("Alf", 33);
	    Person bernie = new Person("Bernie", 23);
	    Person mary = new Person("MAry", 43);
	    
	    List<Person> list = new ArrayList<>();
	    
	    list.add(alf);
	    list.add(bernie);
	    list.add(mary);
	    Person find = new Person("Mary", 43);
	    boolean found = false;
	    for(Person p:list){
	      if(find.equals(p)){
	         found = true; 
	      }
	    }
	    if(found){
	      System.out.println("The person was found");
	    }else{
	      System.out.println("The person was not found");
	    }
	  }
	  public static void main(String[] args) {
	    
	    Main main = new Main();
	    main.search();

	    
	    
	  }
}
