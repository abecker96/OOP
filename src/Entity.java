
public class Entity 
{
	private String name;
	private Room place;
	
	public Entity(String name, Room place)
	{
		this.name = name;
		this.place = place;
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getLocation()
	{
		return place.getNum();
	}
}
