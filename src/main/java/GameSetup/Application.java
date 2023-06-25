package GameSetup;

/*
 * 
 * @author MohammedAjmal
 * 
 */

public class Application {

	public static void main(String[] args) {
		
		GameStart NewGame = new GameStart();
		UserWelcome UserLogin = new UserWelcome();
		
		/* calling the start game method from 
		  another class */
		UserLogin.main();
		NewGame.begin();
		
	}
}
