package Enums;

public enum Enum_Color {
	RED(2000), WHITE(4000), BLACK(3000), GOLD(8000);
	
	private double price;
	public Enum_Color(int price)
	{
		this.price = (double)price;
	}
	
	public double getPrice()
	{
		return this.price;
	}
}
