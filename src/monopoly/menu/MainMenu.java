package monopoly.menu;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import monopoly.Board;

public class MainMenu extends Application
{
	private boolean visible;
	
	public MainMenu(){}
	
	public void startGame()
	{
		
	}
	
	public void showOptions(){}
	
	public void show(){}
	
	public void hide(){}
	
	public void exitMenu(){}

	@Override
	public void start(Stage primaryStage){
		// The stack filled with different stages.
		StackPane stackOfStages = new StackPane();
		
		// The game board stage, options stage and the game menu.
		Board gameBoard = new Board();
		OptionMenu options = new OptionMenu();
		GameMenu gameMenu = new GameMenu();
		
		BorderPane mainMenu = new BorderPane();
		// Set the size of the window indirect against the screen resolution.
		Rectangle2D primaryBounds = Screen.getPrimary().getVisualBounds();
		int screenWidth = (int)(primaryBounds.getWidth() * 0.70);
		int screenHeight = (int)(primaryBounds.getHeight() * 0.80);
		Scene scene = new Scene(stackOfStages, screenWidth, screenHeight);
		
		// Set the window properties
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.setTitle("Monopoly");
		primaryStage.initStyle(StageStyle.UNDECORATED);
		primaryStage.show();

		// Add the stages to the StackPane
		stackOfStages.getChildren().add(gameBoard);
		stackOfStages.getChildren().add(options);
		stackOfStages.getChildren().add(gameMenu);
		stackOfStages.getChildren().add(mainMenu);
		
	}
}
