package monopoly;

public class Dice 
{
	private int value;
	
	public Dice(){
		
	}
	
	public int throwDice(Dice _dice)
	{
		value = (int)(Math.random()*6)+1;
		return value;
	}
}
