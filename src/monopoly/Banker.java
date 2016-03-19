package monopoly;

import java.util.ArrayList;

public final class Banker {
	
	private final static int PAYMENT_FOR_JAIL = 1000;
	private final ArrayList<Property> bankProperties;
	private final Player[] players;
	
	public Banker(int nrOfPlayers){
			players = new Player[nrOfPlayers];
			bankProperties = new ArrayList<>();
			
			initialize();
	}
	
	private void initialize(){
		// Create the properties. (Name, Value, Rent and Color)
		Property brownOne = new Property("Västerlånggatan", 1200 , 0, Color.BROWN);
		Property brownTwo = new Property("Hornsgatan", 1200 , 0, Color.BROWN);
		
		Property lightBlueOne = new Property("Folkkungagatan", 2000 , 0, Color.LIGHTBLUE);
		Property lightBlueTwo = new Property("Görgatan", 2000 , 0, Color.LIGHTBLUE);
		Property lightBlueThree = new Property("Ringvägen", 2400 , 0, Color.LIGHTBLUE);
		
		Property pinkOne = new Property("S:t Eriksgatan", 2800 , 0, Color.PINK);
		Property pinkTwo = new Property("Odengatan", 2800 , 0, Color.PINK);
		Property pinkThree = new Property("Valhallavägen", 3200 , 0, Color.PINK);
		
		Property orangeOne = new Property("Sturegatan", 3600 , 0, Color.ORANGE);
		Property orangeTwo = new Property("Karlavägen", 3600 , 0, Color.ORANGE);
		Property orangeThree = new Property("Narvavägen", 4000 , 0, Color.ORANGE);
		
		Property redOne = new Property("Strandvägen", 4400 , 0, Color.RED);
		Property redTwo = new Property("Kungsträdsgårdsgatan", 4400 , 0, Color.RED);
		Property redThree = new Property("Hamngatan", 4800 , 0, Color.RED);
		
		Property yellowOne = new Property("Vasagatan", 5200 , 0, Color.YELLOW);
		Property yellowTwo = new Property("Kungsgatan", 5200 , 0, Color.YELLOW);
		Property yellowThree = new Property("Stureplan", 5600 , 0, Color.YELLOW);
		
		Property greenOne = new Property("Gustav Adolfs torg", 6000 , 0, Color.GREEN);
		Property greenTwo = new Property("Drottningsgatan", 6000 , 0, Color.GREEN);
		Property greenThree = new Property("Diplomatstaden", 6400 , 0, Color.GREEN);
		
		Property darkBlueOne = new Property("Centrum", 7000, 0, Color.DARKBLUE);
		Property darkBlueTwo = new Property("Norrmalmstorg", 8000, 0, Color.DARKBLUE);
		
		Property transportOne = new Property("Södra station", 4000, 0);
		Property transportTwo = new Property("Östra station", 4000, 0);
		Property transportThree = new Property("Centralstation", 4000, 0);
		Property transportFour = new Property("Norra station", 4000, 0);
		
		Property plantsOne = new Property("Elverket", 3000, 0);
		Property plantsTwo = new Property("Vattenledningsverket", 3000, 0);
		
		// Add all properties to the collection.
		bankProperties.add(brownOne);
		bankProperties.add(brownTwo);
		
		bankProperties.add(lightBlueOne);
		bankProperties.add(lightBlueTwo);
		bankProperties.add(lightBlueThree);
		
		bankProperties.add(pinkOne);
		bankProperties.add(pinkTwo);
		bankProperties.add(pinkThree);
		
		bankProperties.add(orangeOne);
		bankProperties.add(orangeTwo);
		bankProperties.add(orangeThree);
		
		bankProperties.add(redOne);
		bankProperties.add(redTwo);
		bankProperties.add(redThree);
		
		bankProperties.add(yellowOne);
		bankProperties.add(yellowTwo);
		bankProperties.add(yellowThree);
		
		bankProperties.add(greenOne);
		bankProperties.add(greenTwo);
		bankProperties.add(greenThree);
		
		bankProperties.add(darkBlueOne);
		bankProperties.add(darkBlueTwo);
		
		bankProperties.add(transportOne);
		bankProperties.add(transportTwo);
		bankProperties.add(transportThree);
		bankProperties.add(transportFour);
		
		bankProperties.add(plantsOne);
		bankProperties.add(plantsTwo);
		
		// Initialize the players.
		
		
		// Set players starting capital.
		for(Player player : players){
			player.setCashAmount(28000);
		}
		
		shuffleCards();
		
		
	}
	
	// Give the specified player 4 000.
	public void passGO(Player player){
		player.addCash(4000);
	}
	
	// Method for shuffling cards.
	public void shuffleCards(){
		// Shuffle the chance and allmäning cards.
	}
	
}
