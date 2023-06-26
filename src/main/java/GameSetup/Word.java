package GameSetup;

import java.security.SecureRandom;

public class Word {

	public static int count = 0;

	String[] randomWords = {"rapple", "banana", "cat", 
			"dog", "elephant","flower", "guitar", 
			"house", "ice cream", "jungle", "kiwi", 
			"lemon", "mountain", "nest", "orange", 
			"pineapple", "queen", "river", "sun",
			"tree","apple", "banana", "cat", "dog", 
			"elephant", "flower", "guitar", "house",
			"ice cream", "jungle","kiwi", "lemon",
			"mountain", "nest", "orange", "pineapple",
			"queen", "river", "sun", "tree",
		    "umbrella", "violin", "watermelon",
		    "xylophone", "yoga", "zebra", "bird",
		    "car", "desk", "eagle",
		    "fish", "grape", "hat", "island",
		    "jacket", "koala", "lamp", "moon",
		    "noodle", "ocean", "piano",
		    "quilt", "rainbow", "snake", "tiger", 
		    "unicorn", "volcano", "whale", "xylophone",
		    "yacht"};
	
	private String selectedWords;
	
	private SecureRandom random = new SecureRandom();
	
	private char[] letters;
	
	public Word() {
		selectedWords = randomWords[random.nextInt(randomWords.length)];
		letters = new char[selectedWords.length()];
	}

	public String toString() {
		
		StringBuilder text = new StringBuilder();
		
		for(char letter : letters) {
		text.append(letter == '\u0000' ? "-" : letter);
		text.append(" ");
		}
		return text.toString();
	}
	
//	public static int count = 0; 

	public void guess(char charAt) {
		do {
			for(int i=0;i<selectedWords.length();i++) {
				if(charAt == selectedWords.charAt(i)) {
					letters[i] = charAt;
					count--;
				}
		   }
			count++;
			System.out.println("You have " + (10 - count) + " tries Left ");
			if( count == 10 ) {
				System.out.println(" ");
		        System.out.println("Alas! You Lost Your 10 Trials");
		        System.out.println("Better Luck Next Time! You Lose the Game");
		        System.exit(0);
			}
		} while(count == 10);
	}

	public boolean isWordGuessed() {
		for(char letter : letters) {
			if( letter == '\u0000') {
				return false;
			}
		}
		return true;
	}
	
}
