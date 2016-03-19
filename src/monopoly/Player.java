package monopoly;

import java.util.ArrayList;

public final class Player
{
	private String name;
	private int cash;
	private ArrayList<Property> properties;
	private Token token;
		
	public Player(){
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public int  getCash()
	{
		return cash;
	}
	
	public void addCash(int value){
		cash += value;
	}
	
	public void setCashAmount(int amount){
		cash = amount;
	}
	
	public ArrayList<Property> getProperties()
	{
		return properties;
	}
	
	public Token getToken() //?
	{
		return token;
	}
	
	public void throwDices()
	{
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
	}

}
