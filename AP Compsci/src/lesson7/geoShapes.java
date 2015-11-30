package lesson7;

import java.util.Scanner;
//super
public class geoShapes{
	double side = 1;
	
	//default inherited values
	public double getCirc(){
		return 0;
	}
	public double getSA(){
		return 0;
	}
	public double getVolume(){
		return 0;
	}
}
//sphere
class Sphere extends geoShapes{
	public Sphere(double side){
		super();
		this.side = side;
	}
	
	public double getSide(){
		return side;
	}
	public void setSide(double side){
		this.side = side;
	}
	
	@Override
	public double getCirc(){
		double circ = side*2*Math.PI;
		return circ;
	}
	@Override
	public double getSA(){
		double SA = 4*Math.PI*side*side;
		return SA;
	}
	@Override
	public double getVolume(){
		double Volume = 4*(Math.PI)*side*side*side/3;
		return Volume;
	}
	@Override
	public String toString(){
		return "Sphere \nCircumference: " + String.format("%.2f", getCirc())+ "\nSurface Area: " + String.format("%.2f", getSA()) + "\nVolume: " + String.format("%.2f", getVolume());
	}
}
//tetra
class Tetra extends geoShapes{
	public Tetra(double side){
		super();
		this.side = side;
	}
	
	public double getSide(){
		return side;
	}
	public void setSide(){
	}
	
	@Override
	public double getCirc(){
		double perimeter = side*6;
		return perimeter;
	}
	@Override
	public double getSA(){
		double SA = Math.sqrt(3)*side*side;
		return SA;
	}
	@Override
	public double getVolume(){
		double Volume = (side*side*side)/(Math.sqrt(2)*6);
		return Volume;
	}
	@Override 
	public String toString(){
		return "Tetrahedron \nPerimeter: " + String.format("%.2f", getCirc()) + "\nSurface Area: " + String.format("%.2f", getSA()) + "\nVolume: " + String.format("%.2f", getVolume());
	}
}
//cube
class Cube extends geoShapes{
	public Cube(double side){
		super();
		this.side = side;
	}
	
	public double getSide(){
		return side;
	}
	public void setSide(){
	}
	
	@Override
	public double getCirc(){
		double perimeter = side*12;
		return perimeter;
	}
	@Override
	public double getSA(){
		double SA = side*side*6;
		return SA;
	}
	@Override
	public double getVolume(){
		double Volume = side*side*side;
		return Volume;
	}
	@Override
	public String toString(){
		return "Cube \nPerimeter: " + String.format("%.2f", getCirc()) + "\nSurface Area: " + String.format("%.2f", getSA()) + "\nVolume: " + String.format("%.2f", getVolume());
	}
}
//driver
class geoShapesTest{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the length of the side/radius of your shape.");
		double side = in.nextDouble();
		in.close();
		
		Sphere s = new Sphere(side);
		Tetra t = new Tetra(side);
		Cube c = new Cube(side);
		
		System.out.println(s+"\n");
		System.out.println(t+"\n");
		System.out.println(c+"\n");
	}
}