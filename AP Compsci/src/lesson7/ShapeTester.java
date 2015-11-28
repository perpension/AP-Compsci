package lesson7;
import java.util.Scanner;

public class ShapeTester{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("Please enter three side of the triangle separated by spaces.");
		String sides = input.nextLine();
		String[] sideArray = sides.split(" ");
		double[] conv = new double[sideArray.length];
		for(int i = 0 ; i < sideArray.length ; i++){
			conv[i] = Double.parseDouble(sideArray[i]);
		}
		Triangle t1 = new Triangle(conv[0], conv[1], conv[2]);
		System.out.println(t1);
		System.out.println(t1.getArea());
		System.out.println("Please enter enter the edge length of the tetrahedron.");
		sides = input.nextLine();
		double s1 = Double.parseDouble(sides);
		Tetrahedron te1 = new Tetrahedron(s1);
		System.out.println(te1);
		System.out.println(te1.getSA());
		System.out.println(te1.getVolume());
	}
}
class GeometricObject {
	protected String color;
	protected boolean fill;
	public GeometricObject(){
		this.color = "w";
		this.fill = false;
	}
	public GeometricObject(String color, boolean fill){
		this.color = color;
		this.fill = fill;
	}
	public void setColor(String color){
		this.color = color;
	}
	public void setFill(boolean fill){
		this.fill = fill;
	}
	public String getColor(){
		return this.color;
	}
	public boolean getFill(){
		return fill;
	}
}
class Triangle extends GeometricObject{
	protected double side1;
	protected double side2;
	protected double side3;
	public Triangle(){
		super();
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	public Triangle(double side1, double side2, double side3){
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public double getSide1(){
		return side1;
	}
	public double getSide2(){
		return side2;
	}
	public double getSide3(){
		return side3;
	}
	public double getArea(){
		double s = (side1+side2+side3)/2;
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}
	public String toString(){
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}
class Tetrahedron extends Triangle{
	protected double volume;
	protected double SA;
	public Tetrahedron(){
		super(1.0, 1.0, 1.0);
	}
	public Tetrahedron(double s1){
		super(s1, s1, s1);
		this.side1 = s1;
		evalVolume();
		evalSA();
	}
	private void evalVolume(){
		double temp = Math.pow(this.side1, 3);
		this.volume = temp/(6*Math.sqrt(2));
	}
	private void evalSA(){
		this.SA = getArea()*4;
	}
	public double getVolume(){
		return volume;
	}
	public double getSA(){
		return SA;
	}
	public String toString(){
		return "Tetrahedron: edge length = " + side1;
	}
}
