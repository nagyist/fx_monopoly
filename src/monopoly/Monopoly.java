package monopoly;

import monopoly.menu.MainMenu;
import javafx.application.*;
import javafx.stage.Stage;
/**
 * The main class used to start the whole program.
 * @author robin
 *
 */
public class Monopoly  extends Application{

	public static void main(String[]args){
		Monopoly monopoly = new Monopoly();
		monopoly.start();
	}
	
	public void start()
	{
		MainMenu menu = new MainMenu();
		menu.show();
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
