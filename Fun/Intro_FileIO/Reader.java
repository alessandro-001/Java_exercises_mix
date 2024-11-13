package Intro_FileIO;

import java.io.BufferedReader; 
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

public class Reader {
	
	public static void main(String[] args) {
		try {
		    System.out.println("Program Output: \n");
		    BufferedReader in = new BufferedReader(new FileReader("myfile.txt"));
		    ArrayList<String> data = new ArrayList(); 
		    
		    String line = null;
	   
		    while ((line = in.readLine()) != null) {
		    	//System.out.println(line);
		    	data.add(line);
		    }
		    
		    System.out.println("DATA tot size:" + data.size() + " " + data + "\n");
		    
		    //print every other lines in reverse order
		    for (int i = data.size() - 1; i >= 0; i -= 1) {
		    	System.out.println("Index: " + i + " " + data.get(i));
		    }
		    in.close();
		    
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		    
	  }
}
