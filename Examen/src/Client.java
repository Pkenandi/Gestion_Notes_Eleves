import java.time.LocalTime;
import java.util.List;
import java.util.Map;

interface Item
{
	public Integer getPrice();
	
	public String toString();
	
}

public class Client 
{
	private String name;
	
	public String getname()
	{
		return name;
	}
	
	public Client(String n)
	{
		name = n;
	}
	
	public String toString()
	{
		return name;
	}
	
}

class Dish implements Item
{
	private String name;
	private Integer prix;
	
	public Dish()
	{
		
	}
	
	public Dish(String n, Integer p)
	{
		this.name = n;
		this.prix = p;
	}

	@Override
	public Integer getPrice() {
		return this.prix;
	}
	
	public String toString()
	{
		return " Nom du plat : "+ this.name + " Prix : "+this.prix;
	}
}

class Table
{
	private Integer totalNumberOfTables = 0;
	private Integer id = 0;
	private Integer Capacity;
	
	public Table(Integer cap)
	{
		this.totalNumberOfTables++;
		this.id ++;
		this.Capacity = cap;
	}
	
	public Integer getCapacity()
	{
		return this.Capacity;
	}
	
	public String toSTring()
	{
		return " Table [" + this.id+"] nombre des place : " + this.Capacity;
	}
}

class Booking 
{
	private LocalTime arrivalTime;
	private Client client;
	private Integer numberOfPeople;
	private List<Item>orderedItems;
	
	public Integer getnumberOfPeople()
	{
		return this.numberOfPeople;
	}
	
	public Booking ()
	{
		
	}
	
	public Booking (LocalTime at, Client c, Integer nop)
	{
		this.arrivalTime = at;
		this.client = c;
		this.numberOfPeople = nop;
		
	}
	
	public void addOrder(Item item)
	{
		orderedItems.add((Item) new Booking(arrivalTime,client,numberOfPeople));
	}
	
	public int BillAmount()
	{
		
		int prix = new Dish().getPrice();
		int number = orderedItems.size();
		
		
		return (number * prix);
	}
	
}

class Restaurant
{
	private List<Table>tables;
	private Map<Table, Booking> bookedTables;
	
	
	public Restaurant()
	{
		
	}
	
	public void addTable(Integer capacity)
	{
		tables.add(new Table(capacity));
	}
	
	public boolean tableIsBooked(Table table)
	{
		return table.getCapacity() == new Booking().getnumberOfPeople();
	}
	
	private Table findAppropriateTable(int numberOfPeople)
	{
		for( int i = 0; i < tables.size(); i++)
		{
			int Size = tables.get(i).getCapacity();
			
			if(Size < numberOfPeople)
			{
				return tables.get(i);
			}
		}
		
		return null;
	}
	
	public Table book( Client client,int numberOfSeats, LocalTime arrivalTime)
	{
		if(this.findAppropriateTable(numberOfSeats) != null)
		{
			return new Table(numberOfSeats);
		}
		return null;
	}	
}