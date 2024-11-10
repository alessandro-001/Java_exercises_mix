package Random_kata1;

public class VowelsCount {
	public static void main(String[] args) {
		String paragraph = "We choose to go to the MOON. We choose to go to the MOON... We choose to go to the Moon in this decade and do the other things, not because they are easy, but because they are hard; because that goal will serve to organize and measure the best of our energies and skills, because that challenge is one that we are willing to accept, one we are unwilling to postpone, and one we intend to win, and the others, too.";
		
		String newParagraph = String.join("", paragraph.split(" "));
		System.out.println("Total length of paragraph: " + newParagraph.length());
		
		int vowelsCount = 0;
		
		for (char vowel : newParagraph.toUpperCase().toCharArray()) {
			if (vowel == 'A' || vowel == 'E' || vowel == 'I' || vowel == 'O' || vowel == 'U') {
				vowelsCount += 1;
			}
		}
		System.out.println("The total number of vowels is: " + vowelsCount);
	}
}
