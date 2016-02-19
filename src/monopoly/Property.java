package monopoly;

public class Property 
{
	private String name;
	private int value;
	private int rent;
	private Player player;
	private boolean buildable;
	private Color color;
	
	public Property(){}
	
	public String getName()
	{
		return name;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public int getRent()
	{
		return rent;
	}
	
	public Player getOwner()
	{
		return player;
	}
	
	public boolean isBuildable()
	{
		return buildable;
	}
	
	public Color getColor()
	{
		return color;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setValue(int value)
	{
		this.value = value;
	}
	
	public void setRent(int rent)
	{
		this.rent = rent;
	}
	
	public void setOwner(Player player)
	{
		this.player = player;
	}
	
	public void setBuildable(boolean bool)
	{
		this.buildable = bool;
	}
	
	public void setColor(Color color)
	{
		this.color = color;
	}
}
