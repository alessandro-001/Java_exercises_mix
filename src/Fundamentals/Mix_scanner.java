package Fundamentals;
import java.util.ArrayList;

//To comment the tasks to check the results -> select the code block -> CTRL/CMND+SHIFT+7:

public class Mix_scanner {

	public static void main(String[] args) {
		//Task1-2-3
	    double numbers[] = {11.34,20.32,25.23,1.2,23.5};
	    double sum = 0.0;
	    double average = 0.0;
	    for (int i = 0; i < numbers.length; i++){
	      sum = sum + numbers[i];
	      System.out.println("Number " + i + " is " + numbers[i]);
	    }
	    average = sum / numbers.length;
	    System.out.println("The sum of the numbers is " + sum);
	    System.out.println("The average of the numbers is " + average);
	
		
//Task4		
	    
//		 int numbers[] = {10,15,12,18,19,22};
//		    // print the array
//		    for (int i = 0; i < numbers.length; i++){
//		      System.out.println("Number " + i + " is " + numbers[i]);
//		    }
//
//		    // Make some changes to the array
//		    numbers[0] = 100;
//		    numbers[1] = numbers[2] + numbers[3];
//		    numbers[5] = numbers[5] + 100;
//		    System.out.println("After modification");
//		    // print the array
//		    for (int i = 0; i < numbers.length; i++){
//		      System.out.println("Number " + i + " is " + numbers[i]);
//		    }
		
		
//Task5
	    
//		int numbers[] = {10,15,12,18,19,22};
//	    // print the array
//	    for (int i = 0; i < numbers.length; i++){
//	      System.out.println("Number " + i + " is " + numbers[i]);
//	    }
//
//	    // modify each number in the array
//	    for (int i = 0; i < numbers.length; i++){
//	      numbers[i] = numbers[i] * 2; //to double
//	    }
//
//	   System.out.println("After modification");
//	    // print the array
//	    for (int i = 0; i < numbers.length; i++){
//	      System.out.println("Number " + i + " is " + numbers[i]);
//	    }
		
//Task6
	    
//		int numbers[] = {1,14,12,18,19,22,22,34,13,13,121};
//	    // print the array
//	    for (int i = 0; i < numbers.length; i = i +2){
//	      System.out.println("Number " + i + " is " + numbers[i]);
//	    }
	    
	    
//Task7
	    
//		String hendrix[] = {"All", "along", "the", "watchtower"};
//		
//		for(int i = 0; i < hendrix.length; i++) {
//			System.out.println("Word " + i + " is " + hendrix[i]);
//		}
		

//Task8-9
	    
//		Scanner in = new Scanner(System.in);
//
//	    String words[] = new String[5];
//
//	    for ( int i = 0; i < words.length; i++ ){
//	      System.out.println("Please Enter a word");
//	      words[i] = in.nextLine();
//	    }
//
//	    System.out.println("-------");
//
//	     for (int i = words.length -1; i >=0; i--){
//	       System.out.println(words[i].toUpperCase() + "!");
//		}
		

//Task10
	    
//		Scanner input = new Scanner(System.in);
//		int numbers[] = new int[10];
//		ArrayList<Integer> evens = new ArrayList<>();
//		ArrayList<Integer> odds = new ArrayList<>();
//		
//		for (int i = 0; i < numbers.length; i++){
//		      System.out.println("Please Enter a number:");
//		      numbers[i] = input.nextInt(); 
//		    }
//		
//		for (int j = 0; j < numbers.length; j++) {
//			
//			if (numbers[j] % 2 == 0) {
//				evens.add(numbers[j]);
//				//System.out.println("Even: " + numbers[j]);
//			} else {
//				odds.add(numbers[j]);
//				//System.out.println("Odd: " + numbers[j]);
//			}
//			
//		}
//		System.out.println("Evens: " + evens);
//		System.out.println("Odds: " + odds);
		

//ADVANCED Tasks:
		
//Task11-12-13-14 - Match Temperatures and Cities:

	//start		
//		int temps[][] = {{17, 26, 33,28}, {13, 19, 31, 23}, {9,13,25,17} };
//		int temps2[][] = {{15, 28, 34, 25}, {11, 20, 33, 22}, {10,12,28,21} };
//		ArrayList<Integer> temps3 = new ArrayList<>();
//		
//		String[] cities = {"Mannny","Barca","Islama","Wuhan"};
//		String[] months = {"September","October	","November"};
//		
//		System.out.println("Temperatures: ");
//		for(int row = 0; row < months.length; row++) {
//			System.out.print(months[row] + "\t");
//			for(int col = 0; col < cities.length; col++) {
//				System.out.print(temps[row][col] + ",");
//			}
//			System.out.println();
//		}
//		
//		System.out.println("\nHighest temperatures in each month: ");
//		for(int row = 0; row < months.length; row++) {
//			int highTemp = temps[row][0];
//			
//			for (int col = 1; col < cities.length; col++) {
//				if (temps[row][col] > highTemp) {
//					highTemp = temps[row][col];
//				}
//			}
//            System.out.println(months[row] + "\t" + highTemp + "°C");
//		}
//		
//		System.out.println("\nHighest temperatures in each City: ");
//		for(int col = 0; col < cities.length; col++) {
//			
//			int highT = temps[0][col];
//			for(int row = 1; row < temps.length; row++) {
//				if (temps[row][col] > highT) {
//		            highT = temps[row][col];
//		        }
//			}
//			System.out.println(cities[col] + ":" + "\t" + highT + "°C");
//		}
//		
//		System.out.println("\nHighest temperatures for each month for each city from the two tables: ");
//		for (int row = 0; row < months.length; row++) {
//            for (int col = 0; col < cities.length; col++) {
//               
//                int higherTemp = Math.max(temps[row][col], temps2[row][col]);
//                temps3.add(higherTemp);  
//                System.out.println(months[row] + " in " + cities[col] + ": \t" + higherTemp + "°C");
//            }
//        }
	    
	    //end
	}

}
