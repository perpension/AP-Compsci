package lesson7;

public class Seating {
	public double volume;
	public String color;
	public String material;
}

class Chair extends Seating {
	public int height;
	public boolean reclining;
	public boolean upright;	
}

class Bench extends Seating {
	protected int length;
	protected int numberOfSeats;
	
	public Bench (int length, int numberOfSeats){
		this.length = length;
		this.numberOfSeats = numberOfSeats;
	}
}

class Miscellaneous extends Seating {
	protected String purpose;
	
	public Miscellaneous (String purpose){
		this.purpose = purpose;
	}
}

class Brand extends Chair{
	protected double price;
	protected String name;
	protected int reputation;
	
	public Brand (double price, String name, int reputation){
		this.price = price;
		this.name = name;
		this.reputation = reputation;
	}
}