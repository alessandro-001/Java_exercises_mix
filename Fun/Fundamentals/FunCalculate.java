package Fundamentals;
import java.util.Scanner;


public class FunCalculate {
	//task1 squared
		static int square(int x) {
			return x *= x;
		}
		
		//task2 adding 5
		static int add5(int x) {
			return x += 5;
		}
		
		//task3 triple
		static int triple(int x) {
			return x *= 3;
		}
		
		//task4 booleans
		static boolean smaller100(int x) {
			if (x < 100) {
				return true;
			} else {
				return false;
			}
		}
		
		//task5 max of 2 integrals
		static int maximus(int x, int y) {
			return Math.max(x, y);
		}
		
		//task6 convert to upper-case
		static String shout(String message) {
			return message.toUpperCase();
		}
		
		//task7 return longest
		static String longest(String msg1, String msg2) {
			if (msg1.length() >= msg2.length()) {
				return msg1;
			} else {
				return msg2;
			}
		}
		
		//task8 longest to upper-case
		static String longestShout(String msg1, String msg2) {
			if (msg1.length() >= msg2.length()) {
				return msg1.toUpperCase();
			} else {
				return msg2.toUpperCase();
			}
		}
		
		
		//task11 Fibonacci
		public static int fibonacci (int n){
		    if(n == 1 || n == 0){
		      return n;
		    } 
		      return fibonacci(n-1) + fibonacci(n-2);
		 }
		
		
		//main
		public static void main(String[] args) {
			
			System.out.println(fibonacci(9));
		}
}
