package monopoly;

import java.util.ArrayList;

public final class Player
{
	private String name;
	private ArrayList<Bill> cash;
	private ArrayList<Property> properties;
	private Token token;
	
	
	public Player(){
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public ArrayList<Bill> getCash()
	{
		return cash;
	}
	
	public ArrayList<Property> getProperties()
	{
		return properties;
	}
	
	public Token getToken()
	{
		return token;
	}
	
	public void throwDices()
	{
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
	}

}
