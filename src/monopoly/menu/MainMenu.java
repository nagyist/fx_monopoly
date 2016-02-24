package monopoly.menu;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import monopoly.Board;

public final class MainMenu extends Application
{
	private double x = 0;
	private double y = 0;
	
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
		
		VBox centerVerticalBox = new VBox(15);
		centerVerticalBox.setAlignment(Pos.CENTER);
		
		// Contents of the main menu
		Text title = new Text("Monopoly");
		title.setFont(Font.font("Verdana", FontWeight.BOLD, 45));
		title.setStroke(Color.WHITE);
		
		Button startGameBtn = new Button("Start Game");
		Button settingsBtn = new Button("Settings");
		Button exitGameBtn = new Button("Exit");
		
		// Add to the layout-panels(VBox/BorderPane).
		centerVerticalBox.getChildren().addAll(title, new Text(""), new Text(""), startGameBtn, settingsBtn, exitGameBtn);
		mainMenu.setCenter(centerVerticalBox);
		
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
		
		// Event handlers for pressing the buttons.
		startGameBtn.setOnAction(e->{
			gameBoard.toFront();
		});
		
		settingsBtn.setOnAction(e->{
			options.toFront();
		});
		
		exitGameBtn.setOnAction(e->{
			Platform.exit();
		});
		
		// Event handlers for changing the cursor
		startGameBtn.setOnMouseEntered(e->{
			scene.setCursor(Cursor.HAND);
		});
		
		settingsBtn.setOnMouseEntered(e->{
			scene.setCursor(Cursor.HAND);
		});
		
		exitGameBtn.setOnMouseEntered(e->{
			scene.setCursor(Cursor.HAND);
		});
		
		startGameBtn.setOnMouseExited(e->{
			scene.setCursor(Cursor.DEFAULT);
		});
		
		settingsBtn.setOnMouseExited(e->{
			scene.setCursor(Cursor.DEFAULT);
		});
		
		exitGameBtn.setOnMouseExited(e->{
			scene.setCursor(Cursor.DEFAULT);
		});
		
		// Event handlers for moving the window.
		stackOfStages.setOnMousePressed(event->{
			x = primaryStage.getX() - event.getScreenX();
			y = primaryStage.getY() - event.getScreenY();
		});
				
		stackOfStages.setOnMouseDragged(event->{
			scene.setCursor(Cursor.MOVE);
			primaryStage.setX(event.getScreenX() + x);
			primaryStage.setY(event.getScreenY() + y);
		});
		
		stackOfStages.setOnMouseReleased(event->{
			scene.setCursor(Cursor.DEFAULT);
		});
		
	}
	
	public static void main(String[]args){
		launch(args);
	}
}
