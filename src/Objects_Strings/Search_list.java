package Objects_Strings;

import java.util.ArrayList;

public class Search_list {
	 void searchList(){
			ArrayList<String> list = new ArrayList<>();
			
		    list.add("A");
		    list.add("B");
		    list.add("aaa");
		    list.add("BBB");
		    list.add("bbb");
		    list.add("ccc");

		    String find="bBb";

		    boolean found=false;
		    
		    for(String s : list){
		      if(s.equalsIgnoreCase(find)){
		        found = true;
		        break;
		      }
		    }

		    if(found){
		      System.out.println("The string was found.");
		    
		    }else{
		      System.out.println("The string not was found.");
		    }
		    
		  }
		  public static void main(String[] args) {
			  Search_list main = new Search_list();
		    main.searchList();
		  }
}
