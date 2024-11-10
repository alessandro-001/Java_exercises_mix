package Random_kata1;
import java.util.Scanner;


public class Palindrome1 {
	public static void main(String[] args) {
		System.out.println("Type any word to see if is a palindrome!");
		
		Scanner ska = new Scanner(System.in);		
		String word = ska.nextLine();
		String isPalindrome = "";
		
		for (int i = 0; i < word.length(); i++) {
			isPalindrome = word.charAt(i) + isPalindrome;
			}
		
		if(word.equalsIgnoreCase(isPalindrome)) {
			System.out.println("Is a palindrome!");
		} else {
			System.out.println("Is Not a palindrome!");
		}
		
	}
}
