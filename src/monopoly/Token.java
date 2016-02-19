package monopoly;

import javax.swing.text.html.ImageView;

public class Token
{
	
	private String name;
	private ImageView tokenImage;
	private Player player;
	
	public Token()
	{
		
	}
	
	public ImageView getImage()
	{
		return tokenImage;
	}
	
	public String getName(){
		return name;
	}
	
	public Player getPlayer()
	{
		return player;
	}

}
