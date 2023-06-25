package GameSetup;

import java.util.Scanner;
import GameSetup.Word;

public class GameStart {

	private static boolean play = true;
	private Word randomWords = new Word();
	private Scanner userInput = new Scanner(System.in);
	
	//method to start a game
	public void begin() {
		
		do {
			showWord();
			getInput();
			checkInput();
		} while (play);
		
	}
	
	void showWord() {
		System.out.println(randomWords);
	}
	
	void getInput() {
		
		System.out.println("Enter The Word Guessed By You: ");
		String Input = userInput.nextLine();
		randomWords.guess(Input.charAt(0));
	}
	
	void checkInput() {
		if(randomWords.isWordGuessed()) {
			   System.out.println(" ");
	           System.out.println("Congrats! You Won the Game");
	           System.out.println("The Word is: " + randomWords);
	           play = false;
		}
	}
	
}
