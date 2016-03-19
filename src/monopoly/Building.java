package monopoly;

public class Building 
{
	private String name;
	private Property property;
	
	public Building(String kindOfBuilding, Property  property){
		this.name = kindOfBuilding;
		this.property = property;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Property getProperty()
	{
		return property;
	}

}
