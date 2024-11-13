package Intro_FileIO;
import java.io.FileWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		  System.out.println("Hello");
		  FileWriter out = new FileWriter("myfile.txt");
		  
		  //print out
		  out.write("Today is gonna be the day");
		  out.write(System.lineSeparator());
		  out.write("That they're gonna throw it back to you");
		  out.write(System.lineSeparator());
		  out.write("By now you should've somehow");
		  out.write(System.lineSeparator());
		  out.write("Realized what you gotta do");
		  out.write(System.lineSeparator());
		  out.write("I don't believe that anybody");
		  out.write(System.lineSeparator());
		  out.write("Feels the way I do about you now");
		  out.write(System.lineSeparator());
		  //out.close();
		  
		  //print out name in ascii
		  out.write(65);
		  out.write(108);
		  out.write(101);
		  out.write(115);
		  out.write(115);
		  out.write(97);
		  out.write(110);
		  out.write(100);
		  out.write(114);
		  out.write(111);
		  out.close();
		}

}
