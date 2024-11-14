package Intro_FileIO;

import java.io.BufferedReader; 
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Writer {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			FileWriter out = new FileWriter("writerFile.txt");
			BufferedReader in= new BufferedReader(new FileReader("writerFile.txt"));
			ArrayList<String> data = new ArrayList();
			

			System.out.println("Before input: " + data);
			String line = null;
			
			while (true) {
				System.out.println("Please type in some data: ");
				String str = sc.nextLine();

				if (str.equalsIgnoreCase("")) {
					System.out.println("No data entered, exiting...");
					break;  
				} else {
					out.write(str + "\n");
				}
			}
			out.close();

		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}
}
