package monopoly.menu;

import javafx.scene.layout.Pane;

public class GameMenu extends Pane
{
	private boolean paused;
	
	// Pause the game, by dragging the menu towards the user.
	public void pause(){
		paused=true;
		this.toFront();
	}
	
	// Resume the game, by dragging the menu away from the user.
	public void resume(){
		paused=false;
		this.toBack();
	}
		
	public void exitGame(){
		System.exit(0);
	}

}
