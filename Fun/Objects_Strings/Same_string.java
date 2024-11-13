package Objects_Strings;
import java.util.Scanner;

public class Same_string {
	public static void main(String[] args) {
	    System.out.println("Hello! type a 'hello' in the console: ");
	    Scanner ska = new Scanner(System.in);
	    

	    String str1 = "HELLO";
	    String str2 = new String("HELLO");
	    //String str2 = "hello".toUpperCase();
	    String str3 = ska.nextLine();

	    System.out.println("str1 = " + str1);
	    System.out.println("str3 = " + str3);

	    System.out.print("using ==       ->  ");

	    if (str1 == str3){
	      System.out.println("Strings are equal");
	    } else{
	      System.out.println("Strings are not equal");
	    }

	    System.out.print("using .equals  ->   ");

	    if (str1.equalsIgnoreCase(str3)){
	      System.out.println("Strings are equal");
	    } else{
	      System.out.println("Strings are not equal");
	    }

	  }
}
