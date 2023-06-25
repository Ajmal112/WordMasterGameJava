package GameSetup;

import java.time.LocalDateTime;
import java.util.Scanner;

public class UserWelcome {
	
	public static String greeting = "";

	public void main() {
		LocalDateTime today = LocalDateTime.now();
		String[] time = today.toString().split("T");
		String[] timehour = time[1].toString().split(":");
		int number = Integer.parseInt(timehour[0]);
		
		if( number >= 12 && number <= 18) {
			System.out.println("Good AfterNoon User");
		} else if (number >= 18 && number <= 23) {
			System.out.println("Good Evening User");
		} else if (number >= 00 && number <= 11) {
			System.out.println("Good Morning User");
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your NickName: ");
		String name = scan.nextLine();
		
		System.out.println("Welcome to Word Builder! Mr." + name);
	}
}
