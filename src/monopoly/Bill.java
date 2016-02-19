package monopoly;

public final class Bill 
{
	
	private int value;
	private String billName;
	private Player player;
	
	public Bill(){}
	
	public Player getOwner()
	{
		return player;
	}
	
	public int getValueOfBill()
	{
		return value;
	}
	
	public String getName()
	{
		return billName;
	}

}
